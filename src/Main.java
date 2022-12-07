import java.util.Scanner;

public class Main {
    static double[] arr2 = {0, 3, 6, 9, 12, 15, 18};

    public static void main(String[] args) {

        //TODO 1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
        int[] arr = new int[20];
        double[] dArr = new double[5];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = i;
        }


        System.out.println(" ");

        System.out.print("Вывод первого массива:");
        printA(arr);
        System.out.println(" ");
        System.out.print("Вывод второго массива:");

        printD(dArr);
        System.out.println(" ");
        System.out.print(" вывод чисел на нечетных позициях:");
        printN(arr);
        System.out.println(" ");



        //todo 2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
        // todo пока не будет дана команда на выход из цикла


        Scanner scanner = new Scanner(System.in);
        char ex;

        int sum = 0;
        int dif = 0;
        for (; ; ) {
            System.out.println("Введите число: ");
            int a = scanner.nextInt();
            System.out.println("Введите число: ");
            int b = scanner.nextInt();
            sum = a + b;
            dif = a - b;
            System.out.println("Raznost: " + dif);
            System.out.println("Сумма: " + sum);

            System.out.println("Выберите операцию: " +
                    "\n c - продолжить " +
                    "\n e - выход");
            ex = scanner.next().charAt(0);

            if (ex == 'e') {
                break;
            }
        }

        //3*) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
        //арифметическое значение

        int[] arr1 = new int[20];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }

        System.out.println("вывод массива со значением кратным 3:");

        print(arr1);

        System.out.println(" ");


        System.out.println("среднее арифметическое");
        System.out.println(Math());

    }


    public static double Math() {
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        return sum / arr2.length;
    }


    //
    public static void print(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 3 == 0) {
                System.out.print(arr1[i] + " ");
            }
        }

    }


    public static void printD(double[] dArr) {              // Создаю универсальный метод, который будет выводить  массив на консоль

        for (int i = 0; i < dArr.length; i++) {
            System.out.print(dArr[i] + " ");
        }

    }

    public static void printA(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
 //4) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
    public static void printN(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}

/*1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
        2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
        пока не будет дана команда на выход из цикла
        3) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
        арифметическое значение
        4) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
        5**) Создать метод, который будет применять строку и выводить из нее только гласные буквы*/
//домашнее задание
        /*String str= "Hello";
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+ "");
        }
        System.out.println();

        System.out.println("длина строки:"+ str.length());

        for (int i = str.length-1; i >=0 ; i--) {
            System.out.print(str.charAt(i)+ "");
        }*/