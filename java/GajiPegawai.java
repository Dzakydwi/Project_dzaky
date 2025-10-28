import java.util.Scanner;

class GajiPegawai {
    String nip, nama;
    int gol, masuk;
    double gapok, tunjangan, bonus, gatot;

    void Baca() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input nip: ");  nip = sc.nextLine();
        System.out.print("input nama: ");  nama = sc.nextLine();
        System.out.print("input gol: ");
        gol = sc.nextInt();
        while ((gol < 1) || (gol > 4)) {
            System.out.print("input gol");
            gol = sc.nextInt();
        }
        System.out.print("input jumlah hari masuk kerja: "); masuk=sc.nextInt();
    }

    void Tulis() {
        System.out.println("Gaji Pegawai = <"+nip+": "+nama+": "+gol+": "+masuk+": "+gapok+": "+tunjangan+": ");
    }

    void SetNilai() {
        double phadir;
        int hkerja = 25;
        double pbonus;

        phadir = (double) masuk / hkerja * 100;
        if (phadir>=96) 
            pbonus = 1;
        else if (phadir >=70) 
            pbonus = (double)1/2;
        else
            pbonus = 0;
        
            System.out.print("phadir: "+phadir);
            System.out.print("pbonus: " + pbonus);

        switch (gol) {
            case 1:
                gapok = 2000000;
                tunjangan = 0.02 * gapok;
                bonus = 10000;
                break;
            case 2:
                gapok = 2500000;
                tunjangan = 0.02 * gapok;
                bonus = 100000;
                break;
            case 3:
                gapok = 3000000;
                tunjangan = 0.02 * gapok;
                bonus = 200000;
                break;
            case 4:
                gapok = 4000000;
                tunjangan = 0.02 * gapok;
                bonus = 200000;
                break;
        }
    }

    void HtungGajiTotal() {
        gatot = gapok + tunjangan + bonus;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GajiPegawai A = new GajiPegawai();

        System.out.print("input N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            // A=new GajiPegawai();
            A.Baca();
            A.SetNilai();
            A.HtungGajiTotal();
            A.Tulis();
        }

    }
}