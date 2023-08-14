package optional;

import java.util.Optional;

public class Main {


    public static void main(String[] args) {

        Optional<Cat> cat1 = findCatByNameOptional("mini");


        int age = cat1.map(Cat::getAge).orElse(0);
        System.out.println("age "+age);
        Cat otherCat = cat1.orElse(new Cat(0, "Mini"));

        System.out.println(otherCat.getAge());

        Cat cat2 = findCatByName("mini");
        System.out.println(cat2.getName());


        System.out.println(cat1.get().getName());

        if (cat1.isPresent()) {
            System.out.println(cat1.get().getName());
        } else {
            System.out.println(0);
        }


    }

    private static Cat findCatByName(String name) {
//        return new Cat(4,name);
        return null;
    }

    private static Optional<Cat> findCatByNameOptional(String name) {
        return Optional.ofNullable(null);
//        return Optional.ofNullable(new Cat(4, name));
    }
}

class Cat {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
