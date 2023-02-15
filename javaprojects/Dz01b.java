// Вычислить 
// n! (произведение чисел от 1 до n)

package javaprojects;

public class Dz01b { 
    public static void main(String[] args) {
        int n = 5;
        int prog = 1;
        for (int i = 1; i <= n; i++) {
            prog = prog * i;
            System.out.println(prog);
        }
    }
}
