package utils;

public class Constraints {
    public static boolean isValidName(String name) {
        int nameLength = name.length();
        if (nameLength < 3 || nameLength > 20)
            return false;
        return true;
    }

    public static boolean isValidLegalGender(String legalGender){
        return (legalGender.equals("male") || legalGender.equals("female"));
    }

    public static boolean isValidTimetable(String timetable) {
        int timeTable = timetable.length();
        if (timeTable < 10 || timeTable > 50)
            return false;
        return true;
    }

    public static boolean isValidWage(Double wage) {

        return (wage > 2000);
    }

    public static boolean isValidAge(int age) {

        return (age > 1 && age < 120);
    }

    public static boolean isValidTitle(String title) {
        int nameLength = title.length();
        if (nameLength < 4 || nameLength > 20)
            return false;
        return true;
    }
}
