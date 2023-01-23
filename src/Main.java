public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей.");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int minArr = -1;
        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
            }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей.");
    }


    }
