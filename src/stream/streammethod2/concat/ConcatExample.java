package stream.streammethod2.concat;

import java.util.stream.Stream;

public class ConcatExample {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(2, 2, 2, 2, 2, 2, 2, 2, 2);
        Stream<Integer> stream2 = Stream.of(4, 4, 4, 4, 4, 4, 4, 4, 4);
        Stream<Integer> stream3 = Stream.of(6, 6, 6, 6, 6, 6, 6, 6, 6);
        Stream<Integer> stream4 = Stream.concat(stream1, stream2);

        stream4.forEach(System.out::print);
    }
}
