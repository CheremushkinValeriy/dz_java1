// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 

package javaprojects;

public class Dz01a {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int prog = i * (i - 1) / 2;
            System.out.println(prog);
        }
    }
}
