import java.util.Scanner;
/**
 * TugasNo4
 */
public class TugasNo4 {

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bulan ke: ");
        int n = sc.nextInt();
        System.out.println("Jumlah Marmot: " + fib(n));
        sc.close();
    }
}