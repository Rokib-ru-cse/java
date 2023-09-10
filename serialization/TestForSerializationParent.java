package serialization;

import java.io.*;

public class TestForSerializationParent {

    protected int valueOne = 10;

    public TestForSerializationParent(int valueOne) {
        this.valueOne = valueOne;
    }
    public TestForSerializationParent() {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestForSerializationChild child = new TestForSerializationChild(1);
        child.valueOne = 100;
        child.valueTwo = 200;

        FileOutputStream fileOutputStream =new FileOutputStream("./serialization/test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(child);

        FileInputStream fileInputStream = new FileInputStream("./serialization/test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        TestForSerializationChild child1 = (TestForSerializationChild) objectInputStream.readObject();
        System.out.println(child1);
    }
}
class TestForSerializationChild extends TestForSerializationParent implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int valueTwo = 20;

    public TestForSerializationChild(int valueOne) {
        super(valueOne);
    }

    @Override
    public String toString() {
        return "TestForSerializationChild{" +
                "valueTwo=" + valueTwo +
                ", valueOne=" + valueOne +
                '}';
    }
}
