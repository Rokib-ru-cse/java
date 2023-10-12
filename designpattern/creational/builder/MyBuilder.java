package designpattern.creational.builder;

public class MyBuilder {

    private String name;
    private String email;
    private String age;
    private String roll;
    private String classs;

    public MyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MyBuilder setRoll(String roll) {
        this.roll = roll;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRoll() {
        return roll;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
}


class HisBuilder {

    public static void main(String[] args) {
        MyBuilder myBuilder = new MyBuilder().setName("shahed").setRoll("rrr");
        System.out.println(myBuilder.getName());
        System.out.println(myBuilder.getRoll());


    }


}
