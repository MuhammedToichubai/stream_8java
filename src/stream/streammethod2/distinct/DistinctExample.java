package stream.streammethod2.distinct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(
                1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 7
        ));

        integers.stream().distinct().forEach(System.out::println);
    }
}
