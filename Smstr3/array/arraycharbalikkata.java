package array;

import java.util.Scanner;

public class arraycharbalikkata {
    static int KarkeINt(char x) {
        return x - '0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka (angka): ");
        String s = sc.nextLine();

        int n = 0;
        int pengali = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int digit = KarkeINt(ch);
            n = n + digit * pengali;
            pengali = pengali * 10;
        }

        System.out.println("Hasil konversi: " + n);
        sc.close();
    }
}
