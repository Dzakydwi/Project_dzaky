package LatihanKelas;

public class Arraybarang {
    int N = 3;
    barangku[] daftarBarang = new barangku[N];

    void Baca() {
        for (int i = 0; i < N; i++) {
            System.out.println("\nData Barang ke-" + (i + 1));
            if (daftarBarang[i] != null) {
                daftarBarang[i].TulisData();
            } else {
                System.out.println("Data Kosong.");
            }
        }
    }

    void Tulis() {
        for (int i = 0; i < N; i++) {
            daftarBarang[i] = new barangku();
            System.out.println("\nInput Data Barang ke-" + (i + 1));
            daftarBarang[i].bacaData();
        }
    }

    public static void main(String[] args) {
        Arraybarang arrBrg = new Arraybarang();
        arrBrg.Tulis();
        arrBrg.Baca();
    }
}
