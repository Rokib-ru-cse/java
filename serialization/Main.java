package serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog();
//        FileOutputStream fileOutputStream = new FileOutputStream("./serialization/dog.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(dog);

        FileInputStream fileInputStream = new FileInputStream("./serialization/dog.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Dog dog1 = (Dog) objectInputStream.readObject();
        System.out.println(dog1.j);
    }
}
