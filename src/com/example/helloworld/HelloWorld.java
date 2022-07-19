package com.example.helloworld;
import java.util.Scanner;

public class HelloWorld {
    private static String name;
    private static int age;

    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Scanner in = new Scanner(System.in);
        System.out.print("What's your name? Type here: ");
        name = in.nextLine();
        System.out.printf("Hello, %s \n", name);

        System.out.print("How old are you? Type here: ");
        age=in.nextInt();
        System.out.printf("You're %d years old!\n", age);

        in.close();

    }
}
