package by.it.sc02_morning.menchytsky.lesson06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Новый способ ввода данных + поиск минимума

Текущая реализация:
Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.

Новая задача:
Программа вводит пять чисел с клавиатуры (через Enter) и выводит минимальное из них на экран.

Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить строку, которая начинается на "Minimum = ".
3. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

public class TaskB2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }

    private static int min(int a, int b, int c, int d, int e) {
       int g=0;
        if(a<=b && a<=c && a<=d && a<=e)
            g=a;
        else if(b<=a && b<=c && b<=d && b<=e)
            g= b;
        else if(c<=a && c<=b && c<=d && c<=e)
            g =c;
        else if(d<=a && d<=b && d<=c && d<=e)
            g = d;
        else if(e<=a && e<=b && e<=c && e<=d)
            g = e;

        return g;

    }
}
