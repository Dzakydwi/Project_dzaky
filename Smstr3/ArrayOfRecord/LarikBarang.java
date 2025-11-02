package ArrayOfRecord;
import java.util.Scanner;

public class LarikBarang {
   String[] kodeBarang;
   String[] namaBarang;
   int[] hargaBarang;
   int[] stokBarang;
   int jumlahBarang;
   int maksBarang;

   public LarikBarang(int ukuran) {
      maksBarang = ukuran;
      kodeBarang = new String[maksBarang];
      namaBarang = new String[maksBarang];
      hargaBarang = new int[maksBarang];
      stokBarang = new int[maksBarang];
      jumlahBarang = 0;
   }

   public void tambahBarang(String kode, String nama, int harga, int stok) {
      if (jumlahBarang < maksBarang) {
         kodeBarang[jumlahBarang] = kode;
         namaBarang[jumlahBarang] = nama;
         hargaBarang[jumlahBarang] = harga;
         stokBarang[jumlahBarang] = stok;
         jumlahBarang++;
      }
   }

   public void tampilBarang() {
      System.out.println("Daftar Barang:");
      System.out.println("Kode\tNama\tHarga\tStok");
      for (int i = 0; i < jumlahBarang; i++) {
         System.out.println(kodeBarang[i] + "\t" + namaBarang[i] + "\t" + hargaBarang[i] + "\t" + stokBarang[i]);
      }
   }

   public int cariBarang(String kode) {
      for (int i = 0; i < jumlahBarang; i++) {
         if (kodeBarang[i].equals(kode)) {
            return i;
         }
      }
      return -1;
   }
}