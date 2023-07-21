package com.qa.demo;


public class Runner {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        byte b = 122;
        short s = 300;
//        s = "test";
        int i = 2_000_000_000;
        long l = 999_999_999_999L;

        float f = 44.94F;
        double d = 999.999;

        char c = 'j';

        boolean bool = true;

        String str = "Jordan";

        System.out.println(str + " Harrison");
        System.out.println(c + 'h');

        int num1 = 12;
        int num2 = 12;

        System.out.println(12 == 12);
        System.out.println(num1 == num1);
        System.out.println(num1 == num2);

        System.out.println("Strings: " + ("Jordan" == "Jordan"));
        String name1 = "Jordan";
        String name2 = "Jordan";
        System.out.println("Strings: " + (name1 == name2));

        System.out.println("Strings: " + (new String("Jordan") == "Jordan"));

        System.out.println(new String("Jordan").equals("Jordan"));

        System.out.println("Jordan" == "Jordan");
        System.out.println("JORDAN" == "jordan".toUpperCase());
    }
}
