package repositories;

import java.util.ArrayList;
import java.util.UUID;

import models.Course;

public class CourseRepository {
    private static ArrayList<Course> courses = new ArrayList<Course>();

    private static boolean isValidName(String name){
        int nameLength = name.length();
        if (nameLength < 3 || nameLength > 20)
            return false;
        return true;
    }

    public static boolean store(String name, String timetable) {
        if(!isValidName(name)) return false;
        //timetable validation

        courses.add(new Course(name, timetable, UUID.randomUUID()));
        return true;

    }

    public static boolean update(UUID id, String name, String timetable) {
        if(!isValidName(name)) return false;
        
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == id) {
                courses.get(i).setName(name);
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

    public static void list() {
        System.out.println("\n[");
        for (int i = 0; i < courses.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", courses.get(i).getName());
            System.out.printf("\t\ttimetable: %d,\n", courses.get(i).getTimetable());
            System.out.printf("\t\tid: %s,\n", courses.get(i).getId().toString());
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
