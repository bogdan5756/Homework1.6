public class Main {
    public static void main(String[] args) {
        tusk1();
        tusk2();
        tusk3();
        tusk4();
        tusk5();
        tusk6();
        tusk7();
        tusk8();
        tusk9();
        tusk10();
    }

    public static void tusk1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void tusk2() {
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void tusk3() {
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void tusk4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void tusk5() {
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
    }

    public static void tusk6() {
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void tusk7() {
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void tusk8() {
        System.out.println("Задание 8");
        int money = 29_000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void tusk9() {
        System.out.println("Задание 9");
        int money = 29_000;
        double total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void tusk10() {
        System.out.println("Задание 10");
        int a = 2;
        int b = 2;
        for (int i = 1; i <= 10; i = i + 1) {
            b = i * 2;
            System.out.println(a + " * " + i + " = " + b);
        }
    }
}