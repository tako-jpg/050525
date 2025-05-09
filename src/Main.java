public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int monthlyAccumulation = 29000;
        int totalAccumulation = 0;
        for (int mothOne = 1; mothOne <= 12; mothOne++) {
            totalAccumulation = totalAccumulation + monthlyAccumulation;
            System.out.println("Месяц " + mothOne + " , сумма накоплений равна " + totalAccumulation + " рублей");
        }
        System.out.println("Задача 9");
        int salery = 29000;
        int Accumulation = 0;
        for (int mothOne = 1; mothOne <= 12; mothOne++) {
            Accumulation += salery;
            Accumulation = Accumulation + Accumulation / 100;
            System.out.println("Месяц " + mothOne + " , сумма накоплений равна " + Accumulation + " рублей");
        }
        System.out.println("Задача 10");
        for (int number = 1; number <= 10; number++) {
            System.out.println("2 * " + number + " = " + number * 2);
        }
        System.out.println("Циклы. Урок 2");
        System.out.println("Задача 1");
        for (int number = 1; number <= 10; number++) {
            System.out.println("2 * " + number + " = " + number * 2);
        }
    }
}