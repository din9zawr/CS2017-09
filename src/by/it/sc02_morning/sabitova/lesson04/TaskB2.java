package by.it.sc02_morning.sabitova.lesson04;

import java.util.Scanner;

/*
Lesson 04. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-4.75 -5.25

Ввод:
2 4 2
Вывод:
-1

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    public static double dis(int i, int j, int k) {
        return (double) ((j * j) - 4 * i * k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double D = dis(a, b, c);
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(x1 + " " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else {
            System.out.println("Отрицательный дискриминант");
        }
    }
}
