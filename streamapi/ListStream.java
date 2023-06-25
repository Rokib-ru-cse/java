package streamapi;

import java.util.List;
import java.util.stream.*;

public class ListStream{



    public static void main(String[] args) {
        
        List<Integer> list1 = List.of(2,5,6,7,8,3);
        List<Integer> listEven =  list1.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(listEven);
    }

}
