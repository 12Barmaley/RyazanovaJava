package Task1;

import java.util.Scanner;

/// 1. сравнивает эти два числа и возвращает результат сравнения путем вывода в
// консоль одного из вариантов: "a > b", "a < b" или "a = b";


public class CompareNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {{
            System.out.println("***Задание 1.1 ***");
            System.out.println("введите число а");}
            int a = scanner.nextInt();
            { System.out.println("введите число b");}
            int b = scanner.nextInt();
             if (a > b) {
                System.out.println("a>b");}
            else if (a==b)
                {System.out.println("a=b");}

        else {
                System.out.println("a<b");
                            }}}}


