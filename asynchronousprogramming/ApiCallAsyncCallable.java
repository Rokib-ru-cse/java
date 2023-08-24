package asynchronousprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ApiCallAsyncCallable {

    private static void getComment2() throws IOException, URISyntaxException {
        URI uri = new URI("https://jsonplaceholder.typicode.com/comments");
        URL url = uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            // Get the response body
            String responseBody = null;
            try (InputStream inputStream = connection.getInputStream(); Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
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

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        Instant startInstant = Instant.now();
        int loopCount = 40;
        int dataGotPerCall = 500;
        int totalDataCount = loopCount * dataGotPerCall * 2;

        ExecutorService executor = Executors.newFixedThreadPool(loopCount * 2);
        List<Callable<Void>> tasks = new ArrayList<>();

        for (int i = 0; i < loopCount; i++) {
            Callable<Void> task1 = new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    getComment1();
                    return null;
                }
            };
            Callable<Void> task2 = new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    getComment2();
                    return null;
                }
            };
            tasks.add(task1);
            tasks.add(task2);
        }
        System.out.println("totalDataCount " + totalDataCount);


//        List<Future<Void>> futures = new ArrayList<>();
//        // execution wait here until completion
//        for (Callable<Void> task:tasks) {
//            Future<Void> future = executor.submit(task); // submit does not wait for completion
//            futures.add(future);
      //  }

        List<Future<Void>> futures = executor.invokeAll(tasks);
        System.out.println("All tasks have completed.");
        executor.shutdown();

        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);
        long seconds = duration.getSeconds();
        long milliseconds = duration.toMillis();
        System.out.println("Elapsed time in seconds: " + seconds);
        System.out.println("Elapsed time in milliseconds: " + milliseconds);
    }
}

