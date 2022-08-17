package sorting;

import files.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Main {
//    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            Random random = new Random();
//            int randomAge = random.nextInt(100);
//            students.add(new Student("name " + randomAge, randomAge)); //Τυχαία Λίστα
//        }
//        System.out.println(students);
//
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return Integer.compare(s1.getAge(),s2.getAge()) * (-1);
//            }
//        });
//
//        System.out.println(students);
//    }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomAge = random.nextInt(100);
            students.add(new Student("name " + randomAge, randomAge)); //Τυχαία Λίστα
        }
        System.out.println(students);

        TreeMap<Integer, Student> studentTreeMap = new TreeMap<>((s1, s2) -> Integer.compare(s1, s2) * (-1));

        for (Student student : students) {
            studentTreeMap.put(student.getAge(), student);
        }
        System.out.println(studentTreeMap);
        System.out.println(Integer.compare(studentTreeMap.size(), students.size()));
    }

//    public static void main(String[] args) {
//
//        ArrayList<Student> students = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            Random random = new Random();
//            int randomAge = random.nextInt(100);
//            students.add(new Student("name " + randomAge, randomAge)); //Τυχαία Λίστα
//        }
//        System.out.println(students);
//
//        TreeSet<Student> studentTreeSet = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return Integer.compare(s1.getAge(), s2.getAge());
//            }
//        });
//        studentTreeSet.addAll(students);
//        System.out.println(studentTreeSet);
//
//        System.out.println(Integer.compare(studentTreeSet.size(),students.size()));
//    }
}
