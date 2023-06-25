package fundamental;
public class Test {
    int x =10;
    public final void m1(){
        System.out.println("");
    }
    public final void m1(int x){
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println();
        Test obj = new Test();
        System.out.println(obj.toString());
    }
}