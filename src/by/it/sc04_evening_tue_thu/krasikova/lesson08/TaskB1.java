package by.it.sc04_evening_tue_thu.krasikova.lesson08;

/*

B. (продолжение задач уровня А).

Создайте новый класс DogHelper и в нем два статических метода
void printAllNames(Dog[] dogs){.....}; //должен печатать в консоль через пробел имена всех собак
double averageAge(Dog[] dogs){.....}; //должен вычислять средний возраст переданных ему собак

В классе TaskB1 и его методе main
    Создайте массив из 5 разных собак. Дайте всем клички и укажите возраст.
    Шарик 1 год, Жучка 2 года, Бобик 3 года, Барбос 4 года, Полкан 5 лет

    Напечатайте их имена с помощью метода printAllNames, ожидается
    Шарик Жучка Бобик Барбос Полкан

    Напечатайте с новой строки их средний возраст,
    рассчитанный через метод averageAge, ожидается:
    3.0

Итого, правильный вывод такой:
Шарик Жучка Бобик Барбос Полкан
3.0

*/

public class TaskB1 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        String[] names = "Шарик Жучка Бобик Барбос Полкан".split(" ");
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
            dogs[i].setName(names[i]);
            }
        dogs[0].setAge(1);
        dogs[1].setAge(2);
        dogs[2].setAge(3);
        dogs[3].setAge(4);
        dogs[4].setAge(5);

        DogHelper.printAllNames(dogs);
        System.out.println();
        System.out.println(DogHelper.averageAge(dogs));
        }

    }



