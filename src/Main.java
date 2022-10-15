import java.sql.SQLOutput;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку 10");
        // Задание 1
        System.out.println("Задание 1");
        int[] spending = generateRandomArray();
        int sumSpeding = 0;
        for (int i = 0; i < spending.length; i++) {
            sumSpeding = sumSpeding + spending[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumSpeding + " рублей.");

        // Задание 2
        System.out.println("Задание 2");
        int maxSpeding = spending[0];
        int minSpeding = spending [0];
        for (int i = 1; i < spending.length; i++) {
            if (maxSpeding < spending[i]) {
                maxSpeding = spending[i];
            }
            if (minSpeding > spending[i]) {
                minSpeding = spending[i];
            }
        }
            System.out.println("Минимальная сумма трат за день составила " +
                    minSpeding + " рублей. Максимальная сумма трат за день составила " +
                    + maxSpeding + " рублей.");

        // Задание 3
        System.out.println("Задание 3");
        double averageSpending = sumSpeding / spending.length;
        System.out.println("Средняя сумма трат за месяц равна "
                + averageSpending + " рублей.");

        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[reverseFullName.length - i -1]);
        }

    }
}