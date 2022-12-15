package stream.filter;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class FilterExample {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>(
                Set.of(
                        new Student("Nurseyit", 17, "Java"),
                        new Student("Saltanat", 18, "JS"),
                        new Student("Nurali", 19, "Java"),
                        new Student("Salymbek", 16, "JS"),
                        new Student("Aynazik", 18, "Java"),
                        new Student("Abu-Ali", 20, "Java")
                )
        );

        System.out.println(studentSet);
        System.out.println("_______________________________________");
        List<Student> students = new ArrayList<>(studentSet);




       students = students.stream()
               .filter(student -> student.getAge() > 17 && student.getCourse().equals("JS")).toList();
        System.out.println(students);


        System.out.println(
                students.stream().
                filter(student -> student.getAge() > 16).count());
//

        int counter = 0;
        for (Student student : students) {
            if (student.getAge() > 16){
                counter++;
            }
        }
        System.out.println(counter);




        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-20, 20);
        }
        System.out.println(Arrays.toString(array));

        long count = Arrays.stream(array).filter(x -> x > 0)
                .count();

        System.out.println("count : "+ count);













    }


}
