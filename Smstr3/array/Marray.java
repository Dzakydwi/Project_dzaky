package array;

import java.util.Scanner;

public class Marray {
    int N = 5;
    int[] A = new int[N];
    Scanner sc = new Scanner(System.in);

    void Baca() {
        System.out.println("Array A: ");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " Input Bil A: ");
            A[i] = sc.nextInt();
        }
    }

    void Tulis() {
        for (int i = 0; i < N; i++) {
            System.out.println(i + " " + A[i]);
        }
        System.out.println( " ");
    }

    void Total() {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        System.out.println("Total Bil A: " + sum);
        System.out.println("Rata - Rata Bil A: " + (sum / (double) N));
    }

    void NilaiTerkecil() {
        int min = A[0];
        for (int i = 1; i < N; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.println("Nilai terkecil di Array A: " + min);
    }

    
    
    boolean apakahsama(Marray A1, Marray A2) {
        boolean sama = true;
        for (int i = 0; i < N; i++) {
            if (A1.A[i] != A2.A[i]) {
                sama = false;
                break;
            }
        }
        return sama;
    }
    
    void BubbleSortMenurun() {
        // Urut menurun (descending): tukar jika elemen kiri < elemen kanan
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (A[j] < A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
    
    void BubbleSortMenaik() {
        // Urut menaik (ascending): tukar jika elemen kiri > elemen kanan
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Marray am = new Marray();
        am.Baca();
        am.Tulis();
        am.BubbleSortMenaik();
        am.Tulis();
        System.out.println("Setelah diurutkan: ");
        am.Total();
        am.NilaiTerkecil();
        am.apakahsama(am, am);
        System.out.println("Apakah A1 dan A2 sama? " + am.apakahsama(am, am));
        am.sc.close();
    }
}
