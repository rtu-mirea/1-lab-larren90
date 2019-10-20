package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        MyArray arr = new MyArray();

        while (true) {
            System.out.println("Введите номер желаемой операции => ");
            System.out.println("(0) - Вввести вручную размер массива");
            System.out.println("(1) - Вввести вручную элементы массива");
            System.out.println("(2) - Вывести на экран элементы массива слева-направо");
            System.out.println("(3) - Вывести на экран элементы массива справа-налево");
            System.out.println("(4) - Заполнить массив случайными числами");
            System.out.println("(5) - Поменять местами максимальный и минимальный элементы массива");
            System.out.println("(6) - Удалить из массива элементы, содержащие цифру 7");
            System.out.println("(7) - Конец");
            n = in.nextInt();
            switch (n) {
                case 0:
                    arr.Mas();
                    break;
                case 1:
                    arr.input();
                case 2:
                    arr.output();
                    break;
                case 3:
                    arr.output_inverse();
                    break;
                case 4:
                    arr.random_Math(0,100);
                    break;
                case 5:
                    arr.Change_maxmin();
                    break;
                case 6:
                    arr.Delete_7();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Введен неверный номер операции");
            }
        }
    }
}