package test.utils;

public class Assert {
    public static boolean assertEqual(int n1, int n2, String title){
        if(n1 != n2){
            System.out.printf("%s should be %d but it is %d\n", title, n1, n2);
            return false;
        }
        return true;
    }

    public static boolean assertNotEqual(int n1, int n2, String title){
        if(n1 == n2){
            System.out.printf("%s should not be %d but it is %d\n", title, n1, n2);
            return false;
        }
        return true;
    }

    public static boolean assertEqual(String n1, String n2, String title){
        if(!n1.equals(n2)){
            System.out.printf("%s should be '%s' but it is '%s'\n", title, n1, n2);
            return false;
        }
        return true;
    }

    public static boolean assertNotEqual(String n1, String n2, String title){
        if(n1.equals(n2)){
            System.out.printf("%s should not be '%s' but it is '%s'\n", title, n1, n2);
            return false;
        }
        return true;
    }


    public static boolean assertEqual(boolean n1, boolean n2, String title){
        if(n1 && !n2){
            System.out.printf("%s should be %b but it is %b\n", title, n1, n2);
            return false;
        }
        return true;
    }

    public static boolean assertNotEqual(boolean n1, boolean n2, String title){
        if(n1 && n2){
            System.out.printf("%s should not be %b but it is %b\n", title, n1, n2);
            return false;
        }
        return true;
    }

}
