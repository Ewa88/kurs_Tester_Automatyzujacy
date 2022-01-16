package com.company;

public class JavaParse {
    public static void main(String[] args) {
        int result = 5 + getTextAsNumber();
        System.out.println(result);
        System.out.println(getAgeAsText() );
    }

    public static String getAgeAsText() {
        int age = 18;
        String ageAsText = String.valueOf(age);
        return ageAsText;
    }

    public static int getTextAsNumber() {
        String numberAsText = "7";
        int number = Integer.parseInt(numberAsText);
        return number;
    }
}