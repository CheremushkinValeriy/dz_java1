// Реализовать простой калькулятор 
// Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4

package javaprojects;

import java.util.Scanner;

public class Dz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("int a: ");
        int num1 = sc.nextInt();
        System.out.printf("int b: ");
        int num2 = sc.nextInt();
        System.out.printf("int c: | 1-> + | 2-> - | 3-> * | 4-> / | == ");
        int num3 = sc.nextInt();
        if (num3 == 1)
            System.out.printf("sum: %s + %s = %s ", num1, num2, num1 + num2);
        if (num3 == 2)
            System.out.printf("diff: %s - %s = %s ", num1, num2, num1 - num2);
        if (num3 == 3)
            System.out.printf("mult: %s * %s = %s ", num1, num2, num1 * num2);
        if (num3 == 4)
            System.out.printf("div: %s / %s = %s ", num1, num2, num1 / num2);
        sc.close();
    }
}
