package com.company;

import java.util.Scanner;

public class MyArray {
    private short[] myArray;
    private int size;

//Задается размер массива
    public void Mas() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        size = input.nextInt();
        myArray =new short[size];
    }
//Заполнение массива с клавиатуры
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив: ");
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = input.nextShort();
    }
//Вывод массива слева-направо
    public void output() {
        System.out.print("Вывод слева-направо: ");
        for (int i = 0; i < myArray.length; i++)
            System.out.print(" " + myArray[i]);
        System.out.print("\n");
    }
//Вывод массива справа-налево
    public void output_inverse() {
        System.out.print("Вывод справа-налево: ");
        for (int i = myArray.length - 1; i >= 0; i--)
            System.out.print(" " + myArray[i]);
        System.out.print("\n");
    }
//Заполнение массива случайными числами
    public void random_Math(int min, int max) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (short) (Math.random() * max + min);
        }
    }
//Замена максимального элемента массива на минимальный
    public void Change_maxmin(){
        short Max, Min;
        Min = Max = myArray[0];
        int imax= 0, imin = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > Max) {
                Max = myArray[i];
                imax = i;
            }
            if (myArray[i] < Min) {
                Min = myArray[i];
                imin = i;
            }
        }
        myArray[imin] = Max;
        myArray[imax] = Min;
    }
//Удаление элементов массива, содержащих "7"
    public void Delete_7(){
        for (int i = 0; i < myArray.length; i++) {
            String t = Short.toString(myArray[i]);
            if (t.contains("7")) {
                short[] myArray_2 = new short[myArray.length-1];
                int m = 0;
                for (int j = 0; m < myArray.length; m++)
                    if (i != m){
                        myArray_2[j] = myArray[m];
                        j++;
                    }
                myArray = new short[myArray_2.length];
                    for (m = 0; m< myArray.length; m++)
                        myArray[m] = myArray_2[m];
                    if (i != 0)
                        i--;
            }
        }
        for (int m = 0, i=0; m < myArray.length; m++, i++)
            myArray[i]=myArray[m];
    }
}
