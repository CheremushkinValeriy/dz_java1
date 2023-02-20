/*Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл.*/


package javaprojects;
import java.util.logging.*;
import java.util.Arrays;

public class Dz06 {
    private static Logger logger = Logger.getLogger(Dz06.class.getName());
    public static void main(String[] args) {
        int [] mas = {11, 3, 14, 16, 7};
        System.out.println(Arrays.toString(mas)); //массив до сортировки
        bubbleSort(mas);
        System.out.println(Arrays.toString(mas)); //массив после сортировки
    }

    private static void bubbleSort (int [] mas){    
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false; //пока есть элементы к перестановке, флаг- лож
    
                    buf = mas[i];  //производим перестановку элементов
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    logger.log (Level.INFO, String.format ("%d <-> %d, %s", //выводим информацию в лог
                    mas[i], mas[i + 1], Arrays.toString(mas)));
                }
            }
        }
    }
}




