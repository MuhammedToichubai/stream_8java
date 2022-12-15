package stream.streammethod2.collect.partitioningBy;

import stream.filter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//партишингбай
public class PartitioningByExample {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
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

        Map<Boolean, List<Student>> listMap = studentList.stream()
                .map(student -> {
                    student.getName().toUpperCase();
                    return student;
                })
                .collect(Collectors.partitioningBy(student -> student.getAge() > 18));

//        for (Map.Entry<Boolean, List<Student>> entry : listMap.entrySet()) {
//            System.out.println("key: "+ entry.getKey() + "Value : "+ entry.getValue());
//        }

        listMap.entrySet().forEach(entry -> System.out.println("Key: "+ entry.getKey() + "Value: "+ entry.getValue()));


    }
}
