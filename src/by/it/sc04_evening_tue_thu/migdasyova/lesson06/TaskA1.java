package by.it.sc04_evening_tue_thu.migdasyova.lesson06;
/*
Вывести на экран квадрат из 10х10 символов $.
После каждого символа нужно ставить пробел.
Нужно использовать всего ОДИН цикл while.
Разрешается использовать также опреатор if.
Буквы в каждой строке не разделять.

Пример вывода на экран:
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $
$ $ $ $ $ $ $ $ $ $

*/

public class TaskA1 {
    public static void main(String[] args) {
        int m = 1;
        int n = 10;
        while (m <= 10) {
            System.out.print("$ ");
            m++;
            if (m > 10 && n > 1) {
                System.out.println();
                m = 1;
                n--;
            }
        }
    }
}
