package ru.geekbrains.artjom_islyamov;

public class HomeWorkLesson2 {
    public static void main (String[] args) {
        System.out.println(sumOfTwoNumber(10, 30));
        System.out.println(falseIfNegativeAndTrueIfPositive(-15));
        positiveOrNegativeNumber(-20);
        stringLoopTimes("Java...Rulezzz",5);
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
    public static void  stringLoopTimes(String a, int b){
        for (int i = 0; i < b; i++)
        System.out.println(a);

    }

}

