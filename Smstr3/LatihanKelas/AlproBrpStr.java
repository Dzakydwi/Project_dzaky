package LatihanKelas;
import java.util.Scanner;

public class AlproBrpStr {
    int N = 5;
    String[] data = new String[N];

    Scanner scanner = new Scanner(System.in);

    public void inputDataArray() {
        System.out.println("Input Data Array String");
        System.out.println("Masukkan " + N + " nilai string untuk elemen array:");
        for (int i = 0; i < N; i++) {
            System.out.print("Data[" + i + "]: ");
            data[i] = scanner.nextLine();
        }
        System.out.println("Input data selesai.");
    }

    public void displayDataArray() {
        System.out.println("\nOutput Data Array String");
        for (int i = 0; i < N; i++) {
            System.out.println("Data[" + i + "]: " + data[i]);
        }
        System.out.println("Output data selesai.");
    }

    public String sequentialSearch() {
        System.out.println("\nPencarian Sekuensial pada Array String");
        System.out.print("Masukkan nilai string yang ingin dicari: ");
        String nilaiCari = scanner.nextLine();
        for (int i = 0; i < N; i++) {
            if (data[i] != null && data[i].equals(nilaiCari)) {
                return "Nilai \"" + nilaiCari + "\"ditemukan pada indeks: " + i + ".";
            }
        }
        return "Nilai \"" + nilaiCari + "\"Tidak ditemukan dalam array.";
    }

    public static void main(String[] args) {
        AlproBrpStr Str = new AlproBrpStr();
        Str.inputDataArray(); 
        Str.displayDataArray();
        String hasilPencarian = Str.sequentialSearch();
        System.out.println(hasilPencarian);
        Str.scanner.close();
    }
};