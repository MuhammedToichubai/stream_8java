package stream.methodchaining;

import stream.filter.Student;

import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
             // link ![img_1.png](img_1.png)
             //Цепочка методов
public class MethodChainingExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(34, 43, 23, 45, 23, 13, 53, 23));
        integers.stream()   ///
                .filter(integer -> integer % 2 == 1)
                .map(integer -> {
                    if (integer > 20) {
                        integer = integer + 100;
                    }
                    return integer;
                }).
                reduce(Integer::sum).get();

//        System.out.println(result);

        List<Student> studentList = new ArrayList<>(
                Arrays.asList(
                        new Student("Nurseyit", 17, "Java", 'M'),
                        new Student("Saltanat", 18, "JS", 'F'),
                        new Student("Nurali", 19, "Java", 'M'),
                        new Student("Salymbek", 16, "JS", 'M'),
                        new Student("Aynazik", 18, "Java", 'F'),
                        new Student("Abu-Ali", 20, "Java", 'M')
                )
        );

//        Stream<Student> stream1 = studentList.stream()
//                .filter(student -> student.getGender().equals('M'));
//
//
//         stream1
//                .map(student -> {
//                    int yearOfBirth = 0;
//                    if (student.getAge() >= 17) {
//                       yearOfBirth = Year.now().minus(Period.ofYears(student.getAge())).get(ChronoField.YEAR);
//                    }
//                    return student + student.getName()+"'s birth:"+yearOfBirth ;
//                })
//                 .forEach(System.out::println);

//
//
//
//
        Stream<Integer> stream = Stream.of(3, 45, 4, 3, 3, 53, 23, 43, 22);

        stream.filter((integer -> {
            System.out.println("Java8!");
            return integer % 2 == 0;
        }))
                .toList().forEach(System.out::println);
//

    }
}
