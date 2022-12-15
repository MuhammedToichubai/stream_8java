package stream.map;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Great");
        list.add("Best");
        list.add("Good");
        list.add("Cool");
        list.add("Peaksoft");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);


//        System.out.println(list);


//      list.stream().map(s -> s.length()).toList().forEach(System.out::println);


      list.stream().peek(System.out::print)
              .map(String::length).forEach(s -> System.out.println(": "+s+ " tamga\n"));


    }
}
