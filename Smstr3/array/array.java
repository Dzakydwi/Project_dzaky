package array;
import java.util.Scanner; // Tambahkan import ini di awal file

public class  array {
    public static void main(String[] args) {
        
        // --- PERBAIKAN 1: DEKLARASI VARIABEL KUNCI ---
        
        // 1. Inisialisasi Scanner untuk input
        Scanner sc = new Scanner(System.in);
        
        // 2. Deklarasi dan inisialisasi ukuran array. 
        // Saya asumsikan Anda ingin array berukuran 5.
        final int N = 5; 
        
        // 3. Deklarasi dan inisialisasi array 'a' dan 'b'
        int[] a = {10, 20, 30, 40, 50}; // Contoh inisialisasi untuk array 'a'
        int[] b = new int[N]; // Array 'b' akan diisi oleh user
        
        // 4. Deklarasi variabel hitungan
        int sum;
        double rataRata;
        
        // ... kode selanjutnya ...

        // --- Perbaikan Logika: Tampilkan Array 'a' (Sudah Benar) ---
        System.out.println("Array A:");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " = " + a[i] + " | ");
        }
        System.out.println();

        // --- Perbaikan Logika: Hitung Rata-rata Array 'a' ---
        System.out.println("\n// Hitung rata-rata array a");
        sum = 0; // Inisialisasi sum sebelum loop
        for (int i = 0; i < N; i++) {
            sum = sum + a[i];
        }
        rataRata = (double) sum / N;
        System.out.println("Rata-rata array a: " + rataRata);
        // Catatan: Baris 28 dan 29 pada kode asli Anda redundan, saya gabungkan.
        
        // --- Perbaikan Logika: Input dan Tampilkan Array 'b' ---
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
        
        // --- Perbaikan Logika: Hitung Rata-rata Array 'b' ---
        
        // PERBAIKAN 3: RESET 'sum'
        sum = 0; 
        for (int i = 0; i < N; i++) {
            sum = sum + b[i]; // Ganti 'sum = b[i]' menjadi 'sum = sum + b[i]'
        }
        
        rataRata = (double) sum / N; 
        System.out.println("\nRata-rata array b: " + rataRata);
        
        sc.close(); // Tutup scanner
    }
}