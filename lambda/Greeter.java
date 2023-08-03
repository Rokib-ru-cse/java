package lambda;

public class Greeter {

    void greeting(Greeting greeting) {
        greeting.perform("aaaaaaaaaaaaa");
    }


    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting s = (String s1) -> {
            return s1.length();
        };
//        System.out.println(s.hashCode());
//        greeter.greeting(s);
        System.out.println(s.perform("Sss"));
        Greeting s1 = new Greeting() {
            @Override
            public int perform(String s) {
                return s.length();
            }
        };
        s1.p();
//        greeter.greeting(()-> System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));
        System.out.println(s.getClass().getName());
        System.out.println(s1.getClass().getName());
    }
}
