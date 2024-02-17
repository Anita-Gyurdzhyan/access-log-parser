package homeWork2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Введите первое число: ");
       int number = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число: ");
        int number1 = new Scanner(System.in).nextInt();

        int sum = number + number1;
        int diff = number - number1;
        int mult = number * number1;
        double d = (double) number/number1;

        System.out.println( "Сложение числе " + sum);
        System.out.println("Разность чисел "+ diff);
        System.out.println("Умножение чисел " + mult);
        System.out.println("Деление чисел " + d);




    }
}
