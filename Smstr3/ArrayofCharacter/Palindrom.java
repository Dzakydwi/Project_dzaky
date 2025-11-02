package ArrayofCharacter;

import java.util.Scanner;

public class Palindrom {

    // Method cekPalindrom (Sudah benar dan tidak perlu diubah)
    public static boolean cekPalindrom(char[] L, int n) {
        int j = n - 1; 
        for (int i = 0; i < n / 2; i++) {
            if (L[i] != L[j]) {
                return false; 
            }
            j--; 
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kata/frasa: ");
        
        // --- PERBAIKAN PADA BARIS INPUT ---
        // 1. Menggunakan nextLine() agar bisa menerima input berupa kalimat
        String inputAsli = sc.nextLine(); 

        // 2. Memproses string: hapus spasi, ubah ke huruf kecil
        // Regex "\\s+" menghapus semua spasi, tab, newline.
        String kataUntukCek = inputAsli.replaceAll("\\s+", "").toLowerCase();
        
        // -----------------------------------
        
        int n = kataUntukCek.length(); // Ambil panjang dari string yang sudah diproses
        char[] LarikKar = new char[n];

        // Mengisi array LarikKar dari string yang sudah diproses
        for(int i = 0; i < n; i++) {
            LarikKar[i] = kataUntukCek.charAt(i);
        }

        // Memanggil method cekPalindrom
        if (cekPalindrom(LarikKar, n)) {
            // Output menggunakan input asli untuk tampilan yang lebih baik
            System.out.println("Kata/Frasa \"" + inputAsli + "\" adalah Palindrom.");
        } else {
            System.out.println("Kata/Frasa \"" + inputAsli + "\" BUKAN Palindrom.");
        }
        
        sc.close();
    }
}