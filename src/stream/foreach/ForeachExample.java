package stream.foreach;

import stream.StreamExample;
import stream.filter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ForeachExample {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, -2};
//        Arrays.stream(array).forEach(element ->  );


        Arrays.stream(array).forEach(Util::myMethod);  // ссылка на метод // method reference


    }
}

class Util{
    public static void myMethod(int a){
        a = a + 5;
        System.out.println("Element: "+ a);
    }
}
class Example{
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


       Optional<Integer> integer = integers.stream().reduce(Integer::sum);

        System.out.println(integer);

        // 1,2 3, 4, 5, 6, ,7 ,8, 9, 10
        // firstElement = 1 3 6  10 15 21 28  36 45  {55}
        // element =      2 3 4  5  6   7  8  9   10

        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        strings.add("Men");
        strings.add("Baiysh");
        strings.add("Orazaliev");


        Optional<String> reduce = strings2.stream().reduce((x, y) -> x + " " + y);

        System.out.println(strings2);


    }




















}
