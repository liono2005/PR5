package org.example;

import java.util.Scanner;

public class Main {
    //5. Методы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double result = triangle(a, b, c);
        System.out.println("Результат: " + result);
    }
    private static double triangle(int a, int b, int c) {
        int p = (a + b + c);
        return p;
    }
    }
