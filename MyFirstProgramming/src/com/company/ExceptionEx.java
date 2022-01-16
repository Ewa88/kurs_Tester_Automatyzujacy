package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe!");
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();
            System.out.println(10 / number);
        } catch (ArithmeticException e) {
            System.out.println("ej nie dziel przez zero ziom!");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("nie ten typ");
            e.printStackTrace();
        } finally {
            System.out.println("test bedzie zawsze");
        }

        printEndOfProgram();

    }

    static void printEndOfProgram() {
        System.out.println("Koniec programu");
    }
}
