public class Main {
    public static void main(String[] args) {

//  1 задание

        int fullMoney = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            fullMoney = fullMoney + generateRandomArray()[i];
        }

        System.out.println("Сумма трат за месяц составила " + fullMoney + " рублей");

//  2 задание

        int maxMoney = -1;
        int lowMoney = 200_000;

        for (int i = 0; i < generateRandomArray().length; i++) {
            if (generateRandomArray()[i] > maxMoney) {
                maxMoney = generateRandomArray()[i];
            }
        }
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (generateRandomArray()[i] < lowMoney) {
                lowMoney = generateRandomArray()[i];
            }
        }

        System.out.println("Максимальная сумма трат за день составила " + maxMoney + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + lowMoney + " рублей");

//  3 задание

        int extraMoney = 0;
        int endMoney = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            extraMoney = extraMoney + generateRandomArray()[i];
            endMoney = extraMoney / 30;
        }

        System.out.println("Средняя сумма трат за месяц составила " + endMoney + " рублей");

//  4 задание

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print (reverseFullName[i]);

        }



        
    }int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
