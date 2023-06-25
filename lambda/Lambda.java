package lambda;


public class Lambda {

    public static void main(String[] args) {
        MyInter i = new MyInter(){
            @Override
          public void print(){
              System.out.println("hi");
          }
        };
        i.print();

        MyInter i2 = new MyInter(){
            @Override
            public void print(){
                System.out.println("ssssssssssssss");
            }
        };
        i2.print();

        //lambda
        MyInter i3 = ()->{
                System.out.println("hkhkhkh");
        };
        i3.print();


        MyInter i4 = ()->System.out.println("zzzzzzzzzzzzzzz");
        i4.print();

        // MyInter j5 = MyInter::print("sssssssssssss");
        
    }
}