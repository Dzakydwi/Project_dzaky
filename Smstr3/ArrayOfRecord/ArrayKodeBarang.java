package ArrayOfRecord;

import java.util.Scanner;

public class ArrayKodeBarang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Barang[] daftarBarang = new Barang[] {
            new Barang("001", "Speaker", 100.0, 55),
            new Barang("002", "Keyboard", 150.5, 30),
            new Barang("003", "Mouse", 50.0, 70) 
        };

        System.out.print("Input kode barang yang dicari: ");
        String kodeDicari = input.nextLine();

        cariBarang(daftarBarang, kodeDicari);

        input.close();
    }

    public static void cariBarang(Barang[] daftar, String kode) {
        boolean ditemukan = false;

        int N = daftar.length;

        for (int i = 0; i < N; i++) {

            if (daftar[i].getKode().equalsIgnoreCase(kode)) {

                System.out.println("Barang ditemukan!");

                // Gunakan getter untuk menampilkan data
                System.out.println("Kode \t: " + daftar[i].getKode());
                System.out.println("Nama \t: " + daftar[i].getNama());
                System.out.println("Harga \t: " + daftar[i].getHarga());
                System.out.println("Stok \t: " + daftar[i].getStok());

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    static class Barang {
        private String kode;
        private String nama;
        private double harga;
        private int stok;

        public Barang(String kode, String nama, double harga, int stok) {
            this.kode = kode;
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
        }

        public String getKode() {
            return kode;
        }

        public String getNama() {
            return nama;
        }

        public double getHarga() {
            return harga;
        }

        public int getStok() {
            return stok;
        }
    }
}
