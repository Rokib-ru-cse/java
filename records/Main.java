package records;

public class Main {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem(10,"rokib");
        System.out.println(oldSystem);
        System.out.println(oldSystem.getName());

        MyRecords myRecords = new MyRecords(10,"rokib ru cse");
        System.out.println(myRecords);
        System.out.println(myRecords.name());
        System.out.println(myRecords.nameInUpperCase());
    }
}
