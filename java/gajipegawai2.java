import java.util.Scanner;

public class gajipegawai2{

    public static void main(String[] args) {
        Pegawai pgw = new Pegawai();
        pgw.bacaData();
        pgw.hitungGaji();
        pgw.tampilkanData();
    }
}

class Pegawai {
    String nip, nama;
    int golongan, hariMasuk;
    double gajiPokok, tunjangan, bonus, gajiTotal;

    // Input data pegawai
    void bacaData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIP       : "); nip = sc.nextLine();
        System.out.print("Input Nama      : "); nama = sc.nextLine();

        // Validasi golongan
        do {
            System.out.print("Input Golongan (1-4): ");
            golongan = sc.nextInt();
        } while (golongan < 1 || golongan > 4);

        System.out.print("Jumlah hari masuk kerja (max 25): ");
        hariMasuk = sc.nextInt();
    }

    // Hitung gaji
    void hitungGaji() {
        int totalHariKerja = 25;
        double persenHadir = (double) hariMasuk / totalHariKerja;

        switch (golongan) {
            case 1: gajiPokok = 3_000_000; break;
            case 2: gajiPokok = 4_000_000; break;
            case 3: gajiPokok = 5_000_000; break;
            case 4: gajiPokok = 6_000_000; break;
        }

        tunjangan = 0.2 * gajiPokok;
        bonus = (persenHadir >= 0.9) ? 0.1 * gajiPokok : 0;
        gajiTotal = gajiPokok + tunjangan + bonus;
    }

    // Tampilkan hasil
    void tampilkanData() {
        System.out.println("\n===== Slip Gaji Pegawai =====");
        System.out.println("NIP        : " + nip);
        System.out.println("Nama       : " + nama);
        System.out.println("Golongan   : " + golongan);
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Tunjangan  : Rp" + tunjangan);
        System.out.println("Bonus      : Rp" + bonus);
        System.out.println("Gaji Total : Rp" + gajiTotal);
        System.out.println("=============================");
    }
}