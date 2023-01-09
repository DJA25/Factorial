public class Main {
    public static void main(String[] args) {
        int n = 10;
        int x = factorial(n);
        System.out.println(n+ "th factorial: " + x);
        n = 20;
        int y = fibonnaci(n);
        System.out.println(n + "th fibonnaci number: " + y);
        System.out.println("All 3x3 boards: ");
        genAll2(new int[3], 0);
    }
    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
    public static int fibonnaci(int n) {
        if(n<=2) return 1;
        return fibonnaci(n-2) + fibonnaci(n-1);
    }
    public static void genAll2(int[] board, int index) {
        if (index >= 3) {
            printArray(board);
            return;
        }
        int max;
        if (index == 0) max = 3;
        else max = board[index - 1];
        int min = 0;
        if (index == 0) min++;
        for (int i = min; i <= max; i++) {
            board[index] = i;
            genAll2(board, index + 1);
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}