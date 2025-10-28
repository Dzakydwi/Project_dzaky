package array;

import java.util.Scanner;

public class Arrayofrecord {
    int N;
    int[] A = new int[N];
    // double HargaBrg;

    // void Baca() {
    //     // Use try-with-resources to ensure Scanner is closed
    //     try (Scanner sc = new Scanner(System.in)) {
    //         System.out.print("Input Kode Barang: ");
    //         KodeBrg = sc.nextInt();
    //         System.out.print("Input Harga Barang: ");
    //         HargaBrg = sc.nextDouble();
    //     }
    // }
    
    // void Tulis() {
    //     System.out.println("Kode Barang: " + KodeBrg);
    //     System.out.println("Harga Barang: " + HargaBrg);
    // }

    
    void BubbleSortMenurun() {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    // Tukar A[j] dan A[j+1]
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
    
    void BubbleSortMenaik() {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (A[j] < A[j + 1]) {
                    // Tukar A[j] dan A[j+1]
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Arrayofrecord A = new Arrayofrecord();
        System.out.println("Data Barang: ");
        A.Baca();
        A.Tulis();
    }
}
