package edu.alex.java.utils;

public class StringUtils {
    public static String capitalize(String s) {
        String lhs = s.substring(0, 1).toUpperCase();
        String rhs = s.substring(1).toLowerCase();
        return lhs + rhs;
    }
}