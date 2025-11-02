package ArrayOfRecord;

import java.util.Scanner;

public class KonversiStrKeInt {
   public KonversiStrKeInt() {
   }

   public static int konversiStrKeInt(String s) {
      int n = 0;
      int pengali = 1;

      for(int i = s.length() - 1; i >= 0; --i) {
         int angka = karKeInt(s.charAt(i));
         n += angka * pengali;
         pengali *= 10;
      }

      return n;
   }

   public static int karKeInt(char x) {
      return x - 48;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input Angka: ");
      String s = sc.next();
      int hasil = konversiStrKeInt(s);
      System.out.println("Hasil : " + hasil);
      sc.close();
   }
}