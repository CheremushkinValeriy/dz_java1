// Вывести все простые числа от 1 до 1000

package javaprojects;

import java.util.ArrayList;

public class Dz02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0
                    && i % 3 != 0
                    && i % 5 != 0
                    && i % 7 != 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
