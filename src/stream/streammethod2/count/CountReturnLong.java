package stream.streammethod2.count;

import stream.filter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountReturnLong {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Nurseyit", 17, "Java"),
                        new Student("Syimyk", 22, "Java"),
                        new Student("Nuradil", 20, "JS"),
                        new Student("Ilim", 19, "Java"),
                        new Student("Kurstan", 21, "JS"),
                        new Student("Yryskeldi", 23, "Java"),
                        new Student("Kanykei", 18, "JS"),
                        new Student("Samira", 18, "Java"),
                        new Student("Dastan", 20, "JS"),
                        new Student("Baytik", 22, "Java"),
                        new Student("Altynbek", 15, "JS"),
                        new Student("Saltanat", 18, "JS"),
                        new Student("Nurali", 19, "Java"),
                        new Student("Salymbek", 16, "JS"),
                        new Student("Aynazik", 18, "Java"),
                        new Student("Abu-Ali", 20, "Java")
                )
        );

        long count = students.stream().count();

        System.out.println(count);


    }
}
