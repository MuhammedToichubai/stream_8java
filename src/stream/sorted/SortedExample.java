package stream.sorted;

import stream.filter.Student;

import java.util.*;
import java.util.stream.IntStream;

public class SortedExample {
    public static void main(String[] args) {

        int[] array = new int[]{34, 43, 2, 4, 23, -1, 32, 0, 99, 299};
        IntStream sorted = Arrays.stream(array).sorted();
        System.out.println(Arrays.toString(sorted.toArray()));








        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Nurseyit", 17, "Java"),
                        new Student("Saltanat", 18, "JS"),
                        new Student("Nurali", 19, "Java"),
                        new Student("Salymbek", 16, "JS"),
                        new Student("Aynazik", 18, "Java"),
                        new Student("Abu-Ali", 20, "Java")
                )
        );

         students.stream()
                .sorted((s1, s2) -> s1.getAge() - (s2.getAge())).toList().forEach(System.out::println);

         students.stream().sorted(Comparator.comparing(student -> student.getName().compareTo(student.getName()))).forEach(System.out::println);


    }
}
