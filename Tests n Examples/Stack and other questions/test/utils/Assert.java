package test.utils;

public class Assert {
    private static int index = 0;

    public static int getIndex(){
        return index;
    }

    public static boolean assertEqual(int n1, int n2, String title) {
        index++;
        if (n1 != n2) {
            System.out.printf("%d - %s should be %d but it is %d\n", index, title, n1, n2);
            return false;
        }

        return true;
    }

    public static boolean assertNotEqual(int n1, int n2, String title) {
        index++;
        if (n1 == n2) {
            System.out.printf("%d - %s should not be %d but it is %d\n", index, title, n1, n2);
            return false;
        }
        return true;
    }

    public static boolean assertEqual(String n1, String n2, String title) {
        index++;
        if (!n1.equals(n2)) {
            System.out.printf("%d - %s should be '%s' but it is '%s'\n", index, title, n1, n2);
            return false;
        }
        return true;
    }

    public static boolean assertNotEqual(String n1, String n2, String title) {
        index++;
        if (n1.equals(n2)) {
            System.out.printf("%d - %s should not be '%s' but it is '%s'\n", index, title, n1, n2);
            return false;
        }
        return true;
    }

    public static boolean assertEqual(boolean n1, boolean n2, String title) {
        index++;
        if (n1 && !n2) {
            System.out.printf("%d - %s should be %b but it is %b\n", index, title, n1, n2);
            return false;
        }
        return true;
    }

    public static boolean assertNotEqual(boolean n1, boolean n2, String title) {
        index++;
        if (n1 && n2) {
            System.out.printf("%d - %s should not be %b but it is %b\n", title, n1, n2);
            return false;
        }
        return true;
    }

}
