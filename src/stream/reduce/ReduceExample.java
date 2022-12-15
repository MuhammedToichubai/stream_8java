package stream.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(
                Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        List<Integer> list = new ArrayList<>();

         integers.stream()
                .reduce((firstElement, element) -> firstElement + element).get();


        // 1 , 2, 3, 4, 5, 6, 7, 8, 9, 10
        // firstElement = 1 3 6 10 15 21 28 36 45 {55}
        // element =     2 3 4  5  6  7  8  9 10


//        Optional<Integer> optional = list.stream().reduce(Integer::sum);
//        System.out.println(optional);
//
//        Integer integer2 = integers.stream()
//                .reduce(1, (accumulator, element) -> accumulator + element);
//
//        // 1 , 2, 3, 4, 5, 6, 7, 8, 9, 10
//        // accumulator = 1 3 6 10 15 21 28 36 45 {55}
//        // element =     2 3 4  5  6  7  8  9 10
//
//        System.out.println("identity: "+integer2);
//
//        List<String> strings = new ArrayList<>();
//        strings.add("Men");
//        strings.add("Toichubai");
//        strings.add("uulu");
//        strings.add("Mukhammed");
//
//        String str = strings.stream()
//                .reduce((a, e) -> a + " " + e).get();
//
//        System.out.println(str);

    }
}
