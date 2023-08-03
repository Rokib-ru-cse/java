package lambda;

public class HelloWorldGreeting implements Greeting {

    @Override
    public int perform(String s) {
        return s.length();
    }
}
