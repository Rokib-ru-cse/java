package interfaces;

interface CustomInterface {
    void run();
}
class Main{
    public static void main(String[] args) {
        CustomInterface ref=new CustomInterface(){
            public void run() {
                System.out.print("YES");
            }
        };
        ref.run();
    }
}