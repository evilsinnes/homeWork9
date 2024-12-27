import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1000;
        arr[1] = 2000;
        arr[2] = 3000;
        arr[3] = 4000;
        arr[4] = 5000;
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("\nЗадача 2");
        int[] orr = new int[5];
        orr[0] = 1000;
        orr[1] = 2000;
        orr[2] = 3000;
        orr[3] = 4000;
        orr[4] = 5000;
        int maxPay = -1;
        int minPay = Integer.MAX_VALUE;
        for (final int current : orr) {
            if (current > maxPay) {
                maxPay = current;
            }

        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxPay + " рублей");
        for (final int current : orr) {
            if (current < minPay) {
                minPay = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей");

        System.out.println("\nЗадача 3");
        double[] irr = new double[5];
        irr[0] = 1;
        irr[1] = 2;
        irr[2] = 3;
        irr[3] = 4;
        irr[4] = 7;
        double middlePay = 0;
        for (int i = 0; i < irr.length; i++) {
            middlePay = (middlePay + irr[i]);
        }
        middlePay = middlePay / irr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middlePay + " рублей");

        System.out.println("\nЗадача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

}