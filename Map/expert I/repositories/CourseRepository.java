package repositories;

import java.util.ArrayList;
import java.util.UUID;

import models.Course;

public class CourseRepository {
    private static ArrayList<Course> courses = new ArrayList<Course>();

    private static boolean isValidName(String name) {
        int nameLength = name.length();
        if (nameLength < 3 || nameLength > 20)
            return false;
        return true;
    }

    private static boolean isValidTimeTable(String timetable) {
        int timeTable = timetable.length();
        if (timeTable < 10 || timeTable > 50)
            return false;
        return true;
    }

    public static boolean store(String name, String timetable) {
        if (!isValidName(name) || !isValidTimeTable(timetable))
            return false;
        // timetable validation

        courses.add(new Course(name, timetable, UUID.randomUUID()));
        return true;

    }

    public static boolean update(UUID id, String name, String timetable) {
        if (!isValidName(name) && !isValidTimeTable(timetable))
            return false;

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == id) {
                if(isValidName(name))
                    courses.get(i).setName(name);
                if(isValidTimeTable(timetable))
                    courses.get(i).setTimetable(timetable);
                return true;
            }
        }

        return false;

    }

    public static Course findOne(UUID id) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == id) {
                return courses.get(i);
            }
        }

        return null;

    }

    public static ArrayList<Course> list() {
        return courses;
    }

    public static void printAll() {
        System.out.println("\n[");
        for (int i = 0; i < courses.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", courses.get(i).getName());
            System.out.printf("\t\ttimetable: %s,\n", courses.get(i).getTimetable());
            System.out.printf("\t\tid: %s,\n", courses.get(i).getId().toString());
            String professorName = "null";
            if(courses.get(i).getProfessor() != null)
                professorName = courses.get(i).getProfessor().getName();

            System.out.printf("\t\tprofessor: %s,\n", professorName);
            System.out.printf("\t\tstudents: {\n");
            for(int k = 0; k < courses.get(i).getStudents().size(); k++){
                System.out.printf("\t\t\t\tname: %s,\n", courses.get(i).getStudents().get(k).getName());
                System.out.printf("\t\t\t\tage: %d,\n", courses.get(i).getStudents().get(k).getAge());
            }
            
            System.out.printf("\t\t},\n");
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

    public static boolean delete(UUID id) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == id) {

                courses.remove(courses.get(i));
                return true;
            }
        }

        return false;

    }
}
