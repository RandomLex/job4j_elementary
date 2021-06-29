package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenFndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return !isEven(num) || !isPositive(num);
    }

    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isPositive(7));
        System.out.println(notEven(4));
        System.out.println(notPositive(3));
        System.out.println(notEvenFndPositive(2));
        System.out.println(evenOrNotPositive(-1));
    }
}
