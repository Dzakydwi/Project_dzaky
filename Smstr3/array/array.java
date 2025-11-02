package array;
import java.util.Scanner;

public class  array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 5;
        
        int[] a = {10, 20, 30, 40, 50};
        int[] b = new int[N]; // Array 'b' akan diisi oleh user
        
        int sum;
        double rataRata;
        System.out.println("Array A:");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " = " + a[i] + " | ");
        }
        System.out.println();

        System.out.println("\n// Hitung rata-rata array a");
        sum = 0; // Inisialisasi sum sebelum loop
        for (int i = 0; i < N; i++) {
            sum = sum + a[i];
        }
        rataRata = (double) sum / N;
        System.out.println("Rata-rata array a: " + rataRata);
        System.out.println("\nArray B:");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " input bil: ");
            b[i] = sc.nextInt(); // sc sudah dideklarasikan
        }
        
        System.out.println("\nIsi Array B:");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " = " + b[i] + " | ");
        }
        System.out.println();
        sum = 0; 
        for (int i = 0; i < N; i++) {
            sum = sum + b[i];
        }
        
        rataRata = (double) sum / N; 
        System.out.println("\nRata-rata array b: " + rataRata);
        
        sc.close(); // Tutup scanner
    }
}