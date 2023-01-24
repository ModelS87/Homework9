public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        for (int i1 = 0; i1 < arr.length; i1++) {
            summa = summa + arr[i1];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей.");
        System.out.println("Средняя сумма трат за месяц составила " + summa / arr.length + " рублей.");
    }

    public static void task2 () {
        int[] arr = generateRandomArray();
        int minArr = 0;
        int maxArr = 0;
        for (int i2 = 0; i2 < arr.length; i2++) {
            if (arr[i2] > maxArr) {
                maxArr = arr[i2];
            }
            if (arr[i2] < minArr) {
                minArr = arr[i2];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int summa = 0;
        int summaMiddle = 0;
        for (int i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
            summaMiddle = summa / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + summaMiddle + " рублей.");
    }

    public static void task4() {
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length-1; i >-1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
