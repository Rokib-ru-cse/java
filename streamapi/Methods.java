package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {



    public static void main(String[] args) {
        
        List<Integer> lists = List.of(12,3,4,5,6,7,8,9,66,55,44);

        List<Integer> listFilter = lists.stream().filter(c->c%2==0).collect(Collectors.toList());
        System.out.println(listFilter);
                List<Integer> listMap = lists.stream().map(c->c*c).collect(Collectors.toList());
        System.out.println(listMap);
        lists.stream().sorted().forEach(System.out::println);
    }
    
}
