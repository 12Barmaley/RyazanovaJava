package Task1;

import java.util.Scanner;
/* 2 совершает с этими числами операции сложения, вычитания,
деления и умножения и результат выводит в консоль.*/



public class MathOper {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("***Задание 1.2 ***");
        System.out.println("введите число а");

        int a = scanner.nextInt();
        {
            System.out.println("введите число b");
        }
        int b = scanner.nextInt();
        int sum = (a + b);
        int sub = (a - b);
        int mult = (a * b);
        int divi = (a / b);

        {
            System.out.println(sum + "\n" + sub + "\n" + mult + "\n" + divi);
        }

    }}

