package LatihanKelas;

import java.util.Scanner;

public class barangku {
    int kodeBrg;
    String namaBrg;
    double hargaBrg;
    int stokBrg;

    void bacaData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kode Barang: ");
        kodeBrg = sc.nextInt();
        sc.nextLine(); // membersihkan newline
        System.out.print("Masukkan Nama Barang: ");
        namaBrg = sc.nextLine();
        System.out.print("Masukkan Harga Barang: ");
        hargaBrg = sc.nextDouble();
        System.out.print("Masukkan Stok Barang: ");
        stokBrg = sc.nextInt();
    }

    void TulisData() {
        System.out.println("Kode Barang: " + kodeBrg);
        System.out.println("Nama Barang: " + namaBrg);
        System.out.println("Harga Barang: " + hargaBrg);
        System.out.println("Stok Barang: " + stokBrg);
    }
    
    public static void main(String[] args) {
        barangku barang = new barangku();
        barang.bacaData();
        System.out.println("\nData Barang yang Dimasukkan:");
        barang.TulisData();
    }
};

