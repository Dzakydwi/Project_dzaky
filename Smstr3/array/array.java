package array;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] a = new int[N];
        int[] b = new int[N];
        int sum = 0;

        System.out.println("array a");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " input bil: ");
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            System.out.println(i + " = " + a[i]);
        }
        
        // Hitung rata-rata array a
        for (int i = 0; i < N; i++) {
            sum =sum+a[i];
            }
            double rataRata = (double) sum / N;
            System.out.println("Rata-rata array a: " + sum);
            System.out.println("Rata-rata array a: " + (double)sum/N);
        }
        
        // System.out.println("Array B");
        // for (int i = 0; i < N; i++) {
        //     System.out.print(i + " input bil: ");
        //     b[i] = sc.nextInt();
        // }
        
        // for(
        // int i = 0;i<N;i++)
        // {
        //     System.out.println(i + " = " + b[i]);
        // }
        
        // for (int i = 0; i < N; i++) {
        //     sum += b[i];
        //     }
        //     double rataRata = (double) sum / N;
        //     System.out.println("Rata-rata array a: " + rataRata);
        // }
    }

