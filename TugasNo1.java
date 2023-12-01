import java.util.Scanner;
/**
 * TugasNo1
 */
public class TugasNo1 {
    
    // fungsi rekursif
    static void deretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }
    // fungsi iteratif
    static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        System.out.println("Deret Rekursif:");
        deretRekursif(n);

        System.out.println("\nDeret Iteratif:");
        deretIteratif(n);
    }
}
