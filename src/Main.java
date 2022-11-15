public class Main {
    public static void main(String[] args) {
        printNums();
        printMul();
        printTable();
        people();
    }
    public static void printNums() {

        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = i + 1;
        }
        System.out.println("Прямой порядок:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Обратный порядок:");
        int[] numlist = new int[5];
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
            numlist[5 - i] = i;
        }
        System.out.println();



        for (int n : numlist) {
            System.out.print(n + " ");
        }
    }
    public static void printMul() {
        System.out.println();
        System.out.println("Таблица х * 3");
        for (int i = 0; i < 10; i++) {
            System.out.println("3 * " + (i + 1) + " = " + (i + 1) * 3);
        }
    }
    public static void printTable() {
        System.out.println();
        System.out.println("Таблица умножения:");
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                int x = i * j;
                if (x >= 10) {
                    System.out.print(i * j + " ");
                } else {
                    System.out.print(i * j + "  ");
                }
            }
            System.out.println();
        }
    }
    public static void people(){
        long p = 10000000;
        int b = 14;
        int d = 8;
        System.out.println();
        for (int i = 1; i <= 10 ; i++) {
            p = p + b * p / 1000 - d * p / 1000;
        }
        System.out.println("Население через 10 лет: " + p);
    }
}