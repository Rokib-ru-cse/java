package oop;

public class Main {


    public static void main(String[] args) {


        class Child{
            private int age;

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public Child(int age) {
                this.age = age;
            }
        }

        Child child = new Child(23);
        System.out.println(child.getAge());

    }
}
