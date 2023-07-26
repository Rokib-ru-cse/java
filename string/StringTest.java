package string;

public class StringTest {


    public static void main(String[] args) {

        String s1 = new String("hi");
        String s2 = new String("hi");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "hi";
        String s4 = "hi";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

    }
}
