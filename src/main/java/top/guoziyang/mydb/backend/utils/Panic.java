package top.guoziyang.mydb.backend.utils;

/**
 * Panic
 */
public class Panic {
    public static void panic(Exception err) {
        err.printStackTrace();
        System.exit(1);
    }
}
