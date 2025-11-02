package ArrayLatihan;
import java.util.Scanner;

public class arrayM {
    int[] A; 
    double[] HargaArray; 
    int N; 
    
    Scanner sc = new Scanner(System.in); 

    void Baca() {
        System.out.print("Input Jumlah Barang (N): ");
        // Ambil N sebagai ukuran array
        N = sc.nextInt(); 
        
        A = new int[N];
        HargaArray = new double[N];

        System.out.println("--- Input Data " + N + " Barang ---");
        for (int i = 0; i < N; i++) {
            System.out.print("Input Kode Barang ke-" + (i + 1) + ": ");
            A[i] = sc.nextInt();
            
            System.out.print("Input Harga Barang ke-" + (i + 1) + ": ");
            HargaArray[i] = sc.nextDouble(); 
        }
    }

    void Tulis() {
        // PERBAIKAN: Hanya satu method Tulis() yang benar
        System.out.println("-------------------------");
        for (int i = 0; i < N; i++) {
            System.out.println("Barang ke-" + (i + 1) + ": Kode=" + A[i] + ", Harga=" + HargaArray[i]);
        }
        System.out.println("-------------------------");
    }

    void BubbleSortMenurun() {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (A[j] < A[j + 1]) { 
                    // Tukar Kode (A)
                    int tempA = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tempA;
                    
                    // Tukar Harga (HargaArray) agar tetap berpasangan
                    double tempHarga = HargaArray[j];
                    HargaArray[j] = HargaArray[j + 1];
                    HargaArray[j + 1] = tempHarga;
                }
            }
        }
    }
    
    void BubbleSortMenaik() {
        for (int i = 0; i < N - 1; i++) { 
            for (int j = 0; j < N - 1 - i; j++) {
                if (A[j] > A[j + 1]) { 
                    // Tukar Kode (A)
                    int tempA = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tempA;
                    
                    // Tukar Harga (HargaArray)
                    double tempHarga = HargaArray[j];
                    HargaArray[j] = HargaArray[j + 1];
                    HargaArray[j + 1] = tempHarga;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        arrayM arrayBarang = new arrayM();
        System.out.println("Data Barang: ");
        arrayBarang.Baca();
        
        System.out.println("\n--- Data Awal ---");
        arrayBarang.Tulis();
        
        arrayBarang.BubbleSortMenurun();
        System.out.println("\n--- Data setelah diurut Menurun (Berdasarkan Kode) ---");
        arrayBarang.Tulis();
        
        arrayBarang.BubbleSortMenaik();
        System.out.println("\n--- Data setelah diurut Menaik (Berdasarkan Kode) ---");
        arrayBarang.Tulis();
        
        arrayBarang.sc.close();
    }
}