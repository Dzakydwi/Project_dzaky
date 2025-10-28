package array;
import java.util.Scanner;

class LarikBarangV2 {
    int N=3;
    Barang[] a=new Barang[N];

    void Baca() {
        // Scanner sc = new Scanner(System.in);
        Barang x;

        for (int i=0; i<N; i++) {
            x=new Barang();
            System.out.println(i+" input Barang: "); x.Baca();
            a[i]=x;
        }
    }

    void Tulis() {
        for (int i=0; i<N; i++) {
            System.out.print(i + "); ");
            a[i].Tulis();
        }
    }

    void CariBarangByKode(String kode) {
        boolean ditemukan = false;
        
        for (int i = 0; i < N; i++) {
            if (a[i] != null && String.valueOf(a[i].kodebrg).equalsIgnoreCase(kode)) {
                System.out.println("Barang ditemukan di index:" + i);
                System.out.println("");
                a[i].Tulis();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
        }
    }

    public static void main (String[] args) {
        LarikBarangV2 A=new LarikBarangV2();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Array A");
            A.Baca();
            A.Tulis();
            
            System.out.print("Masukkan kode barang yang ingin dicari: ");
            String kodeCari = sc.nextLine();
            A.CariBarangByKode(kodeCari);
        }
    }
}