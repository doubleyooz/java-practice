package repositories;

import java.util.ArrayList;
import java.util.UUID;

import models.Professor;

public class ProfessorRepository {
    private static ArrayList<Professor> professors = new ArrayList<Professor>();

    public static boolean store(String name) {
        int nameLength = name.length();
        if (nameLength < 3 || nameLength > 20)
            return false;

        professors.add(new Professor(name, UUID.randomUUID()));
        return true;

    }

    public static boolean update(UUID id, String name) {
        for (int i = 0; i < professors.size(); i++) {
            if (professors.get(i).getId() == id) {
                professors.get(i).setName(name);
                return true;
            }
        }

        return false;

    }

    public static Professor findOne(UUID id) {
        for (int i = 0; i < professors.size(); i++) {
            if (professors.get(i).getId() == id) {

                return professors.get(i);
            }
        }

        return null;

    }

    public static void printAll() {
        System.out.println("\n[");
        for (int i = 0; i < professors.size(); i++) {

            System.out.printf("\t%d: {\n", i);
            System.out.printf("\t\tname: %s,\n", professors.get(i).getName());
            System.out.printf("\t\tid: %s,\n", professors.get(i).getId().toString());
            System.out.printf("\t},\n");

        }
        System.out.println("]");
    }

    public static ArrayList<Professor> list(){
        return professors;
    }

    public static boolean delete(UUID id) {
        for (int i = 0; i < professors.size(); i++) {
            if (professors.get(i).getId() == id) {

                professors.remove(professors.get(i));
                return true;
            }
        }

        return false;

    }
}
