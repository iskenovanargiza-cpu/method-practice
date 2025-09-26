package com.pluralsight;

public class Format {
    public static void main(String[] args) {
//        result  = formatName("Nargiza" , "Iskenova"); * I couldn't call this line *
        System.out.println(formatName("Nargiza ", "Iskenova"));
    }

    public static String formatName(String first, String last) {
        return last + "," + first;

    }

}
