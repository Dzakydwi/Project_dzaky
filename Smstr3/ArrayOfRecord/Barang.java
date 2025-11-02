package ArrayOfRecord;

import java.util.Scanner;

public class Barang {
    private String nama;
    private int harga;

    public void Baca(Scanner sc) {
        System.out.print("Masukkan nama barang: ");
        nama = sc.nextLine();
        System.out.print("Masukkan harga barang: ");
        harga = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    public void Tulis() {
        System.out.println("Kde: " + nama + ", Harga: " + harga);
    }

    public static void main(String[] args) {
        int Nmaks = 3;
        Barang[] a = new Barang[Nmaks];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Nmaks; i++) {
            System.out.println("Input Data Barang ke-" + (i + 1) + ": ");
            Barang x = new Barang();
            x.Baca(sc);
            a[i] = x;
        }

        System.out.println("\nData Barang:");
        for (int i = 0; i < Nmaks; i++) {
            System.out.print((i + 1) + ". ");
            a[i].Tulis();
        }
    }
}