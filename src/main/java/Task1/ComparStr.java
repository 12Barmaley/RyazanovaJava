package Task1;

import java.util.Scanner;
// Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в
// консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
public class ComparStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Задание 2***");
        System.out.println("введите строку а");
        String a = scanner.next();
        System.out.println("введите строку b");
        String b = scanner.next();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");

        } else {
            System.out.println("Строки неидентичны");
        }

    }
}