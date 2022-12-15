package stream.streammethod2.peek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// peek promujutchnyi operator
public class PeekExample {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>(
                Arrays.asList(
                        'C', 'D', 'I', 'F', 'J', 'F', 'A', 'B' , 'A', 'B'
                )
        );





        long count = list.stream().distinct().sorted()
                .peek(System.out::println)
                .count();

        System.out.println("unique symbol count: " + count);


    }
}
