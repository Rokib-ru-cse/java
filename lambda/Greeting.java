package lambda;

@FunctionalInterface
public interface Greeting {
    int perform(String s);

      default void p(){
        System.out.println("sssssssssss");
    }

}
