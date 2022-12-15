package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

//
//        //map
//        List<String> listFruit = new ArrayList<>();
//        listFruit.add("apple");
//        listFruit.add("melon");
//        listFruit.add("watermelon");
//        listFruit.add("grape");
//
//        for (int i = 0; i < listFruit.size(); i++) {
//            System.out.println(listFruit.set(i, String.valueOf(listFruit.get(i).length())));
//        }
//        System.out.println(listFruit);
//        System.out.println("____________________________________________________________________");
//
//        List<String> list = new ArrayList<>();
//        list.add("яблоко");
//        list.add("дыня");
//        list.add("арбуз");
//        list.add("виноград");
//
//
//        List<Integer> integers = list.stream().map(String::length).toList();
//        System.out.println(integers);
//        System.out.println("____________________________________________________________________");

        int [] array = new int[]{2, 5, 5, 6, 6, 8, 9};
        System.out.println(Arrays.toString(array));
        int[] ints = Arrays.stream(array).map(element -> {
            if (element % 2 == 0) {
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(ints));







    }

}
