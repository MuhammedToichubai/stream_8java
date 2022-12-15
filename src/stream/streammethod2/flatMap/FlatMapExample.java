package stream.streammethod2.flatMap;

import stream.filter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
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
        School school1 = new School("Peaksoft House");

        School school2 = new School("IT RUN");

        for (int i = 0; i < students.size(); i++) {
            if (i <= students.size()/2){
                school1.addStudentToSchool(students.get(i));
            }else {
                school2.addStudentToSchool(students.get(i));
            }
        }

        List<School> schoolList = new ArrayList<>();
        schoolList.add(school1);
        schoolList.add(school2);

        schoolList.stream()
                .flatMap(school ->
                        school.getStudentsOnSchool().stream())
                .forEach(student -> System.out.println(student.getName()));

    }
}
class School{
    private String schoolName;
    private List<Student> studentsOnSchool;

    public School(String schoolName) {
        this.schoolName = schoolName;
        studentsOnSchool = new ArrayList<>();
    }

    public List<Student> getStudentsOnSchool(){
        return studentsOnSchool;
    }

    public void addStudentToSchool(Student student){
        studentsOnSchool.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\n' +
                ", studentsOnSchool=" + studentsOnSchool +
                '}';
    }
}
