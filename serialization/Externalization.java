package serialization;

import java.io.*;

public class Externalization implements Externalizable {

    String str;
    int i, j;

    public Externalization() {
    }

    public Externalization(String str, int i, int j) {
        this.str = str;
        this.i = i;
        this.j = j;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(str);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        str = (String) in.readObject();
        i = in.readInt();
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Externalization externalization = new Externalization("rokib", 2, 3);
        FileOutputStream fileOutputStream = new FileOutputStream("./serialization/externalization.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(externalization);


        FileInputStream fileInputStream = new FileInputStream("./serialization/externalization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Externalization externalization1 = (Externalization) objectInputStream.readObject();
        System.out.println(externalization1);
    }

    @Override
    public String toString() {
        return "Externalization{" +
                "str='" + str + '\'' +
                ", i=" + i +
                ", j=" + j +
                '}';
    }
}
