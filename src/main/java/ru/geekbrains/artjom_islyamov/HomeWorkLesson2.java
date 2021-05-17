package ru.geekbrains.artjom_islyamov;

public class HomeWorkLesson2 {
    public static void main (String[] args) {
        System.out.println(sumOfTwoNumber(10, 30));
        System.out.println(falseIfNegativeAndTrueIfPositive(-15));
        positiveOrNegativeNumber(-20);
        stringLoopTimes("Java...Rulezzz", 5);
        System.out.println(leapYearsOrNot(2003));
    }

    public static boolean sumOfTwoNumber (int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void positiveOrNegativeNumber (int a) {
        if (a > 0) {
            System.out.println("Положительное");
        } else System.out.println("Отрицательное");
    }

    public static boolean falseIfNegativeAndTrueIfPositive (int a) {
        return a < 0 ? true : false;
    }

    public static void stringLoopTimes (String a, int b) {
        for (int i = 0; i < b; i++)
            System.out.println(a);

    }

    /*  к сожалению я посмотрел последнее задание в интернете
    в моей голове были мысли о создании огромного массива, метода сканер и цикла,
    а всё оказалось элементарно и просто, мозг всё услоднял
      */
    public static boolean leapYearsOrNot (int b) {
        return (b % 4 == 0 && b % 100 != 0 || b % 400 == 0);
    }
}

