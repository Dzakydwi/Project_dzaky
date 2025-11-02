package ArrayOfRecord;

import java.util.Scanner;

public class LarikBarang {

   public static void main(String[] args) {
         LarikBarang daftar = new LarikBarang(5);

         // 2. Tambahkan beberapa data barang
         System.out.println("Memasukkan data barang...");
         daftar.tambahBarang("B001", "Pensil", 2500, 100);
         daftar.tambahBarang("B002", "Buku Tulis", 5000, 50);
         daftar.tambahBarang("B003", "Penghapus", 1000, 200);

         // 3. Tampilkan semua barang
         System.out.println("\n--- TAMPILKAN DAFTAR ---");
         daftar.tampilBarang();

         // 4. Cari barang
         System.out.println("\n--- CARI BARANG ---");
         System.out.print("Masukkan kode barang yang dicari: ");
         Scanner sc = new Scanner(System.in);
         String kodeCari = sc.nextLine();
         int index = daftar.cariBarang(kodeCari);

         if (index != -1) {
               System.out.println("Barang dengan kode " + kodeCari + " ditemukan pada indeks: " + index);
         } else {
               System.out.println("Barang dengan kode " + kodeCari + " tidak ditemukan.");
         }
      }


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