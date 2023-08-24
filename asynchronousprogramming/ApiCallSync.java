package asynchronousprogramming;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ApiCallSync {

    private static void getComment2() throws IOException, URISyntaxException {
        URI uri = new URI("https://jsonplaceholder.typicode.com/comments");
        URL url = uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            // Get the response body
            String responseBody = null;
            try (InputStream inputStream = connection.getInputStream();
                 Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
                responseBody = scanner.useDelimiter("\\A").next();
            }


            // Print the response body
            List<Comment> comments = parseComments(responseBody);
//            PrintList.println(comments);
            System.out.println("Total data got from getComment2 " + comments.size());
//            System.out.println(responseBody.toString());

        } else {
            System.out.println("Error: " + responseCode);
        }
    }

    private static void getComment1() {
        String apiUrl = "https://jsonplaceholder.typicode.com/comments";

        try {
            // Create a URL object with the API URL
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the HTTP request method (GET)
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Read the response content
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Print the response content
            List<Comment> comments = parseComments(response.toString());
//            PrintList.println(comments);
            System.out.println("Total data got from getComment1 " + comments.size());

            // Disconnect the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Comment> parseComments(String json) {
        List<Comment> comments = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\{[^\\}]*\\}");
        Matcher matcher = pattern.matcher(json);

        while (matcher.find()) {
            String match = matcher.group();
            Map<String, String> keyValuePairs = parseKeyValuePairs(match);
            int postId = Integer.parseInt(keyValuePairs.get("postId"));
            int id = Integer.parseInt(keyValuePairs.get("id"));
            String name = keyValuePairs.get("name");
            String email = keyValuePairs.get("email");
            String body = keyValuePairs.get("body");
            Comment comment = new Comment(postId, id, name, email, body);
            comments.add(comment);
        }

        return comments;
    }

    private static Map<String, String> parseKeyValuePairs(String json) {
        Map<String, String> keyValuePairs = new HashMap<>();
        Pattern pattern = Pattern.compile("\"([^\"]+)\":\\s*\"([^\"]+)\"|\"([^\"]+)\":\\s*(\\d+)");
        Matcher matcher = pattern.matcher(json);

        while (matcher.find()) {
            String key = matcher.group(1) != null ? matcher.group(1) : matcher.group(3);
            String value = matcher.group(2) != null ? matcher.group(2) : matcher.group(4);
            keyValuePairs.put(key, value);
        }

        return keyValuePairs;
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        Instant startInstant = Instant.now();
        int loopCount = 40;
        int dataGotPerCall = 500;
        int totalDataCount = loopCount * dataGotPerCall * 2;
        for (int i = 0; i < 40; i++) {
            getComment1();
            getComment2();
        }
        System.out.println("totalDataCount " + totalDataCount);

        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);
        long seconds = duration.getSeconds();
        long milliseconds = duration.toMillis();
        System.out.println("Elapsed time in seconds: " + seconds);
        System.out.println("Elapsed time in milliseconds: " + milliseconds);
    }
}

class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public Comment() {
    }

    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "postId=" + postId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}