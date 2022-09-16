package repositories;

import java.util.ArrayList;
import java.util.UUID;

import models.Student;

public class StudentRepository {
    private static ArrayList<Student> students = new ArrayList<Student>();

    public static boolean store(String name, int age) {
        int nameLength = name.length();
        if (nameLength < 3 || nameLength > 20)
            return false;
        if (age < 16 || age > 80)
            return false;

        students.add(new Student(name, age, UUID.randomUUID()));
        return true;

    }

    public static boolean update(UUID id, String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.get(i).setName(name);
                return true;
            }
        }

        return false;

    }

    public static Student findOne(UUID id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }

        return null;

    }

    public static void list() {
        System.out.println("\n[");
        for (int i = 0; i < students.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", students.get(i).getName());
            System.out.printf("\t\tage: %d,\n", students.get(i).getAge());
            System.out.printf("\t\tid: %s,\n", students.get(i).getId().toString());
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

    public static boolean delete(UUID id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {

                students.remove(students.get(i));
                return true;
            }
        }

        return false;

    }
}
