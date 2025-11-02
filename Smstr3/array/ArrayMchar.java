package array;
import java.util.Scanner;

class ArrayMChar {
   int N = 5;
   char[] a;

   ArrayMChar() {
      this.a = new char[this.N];
   }

   void Baca() {
      Scanner sc = new Scanner(System.in);

      for(int i = 0; i < this.N; ++i) {
         System.out.println("" + i + " input char ");
         this.a[i] = sc.next().charAt(0);
      }

   }

   void Tulis() {
      for(int i = 0; i < this.N; ++i) {
         System.out.println("" + i + " " + this.a[i]);
      }

   }

   boolean Palindrom() {
      int i = 0;

      int j;
      for(j = this.N - 1; i <= j && this.a[i] == this.a[j]; --j) {
         ++i;
      }

      return i > j;
   }

   void Balikkata() {
      for(int i = 0; i < this.N / 2; ++i) {
         char temp = this.a[i];
         this.a[this.N = i - 1] = temp;
      }

   }

   public static void main(String[] args) {
      new Scanner(System.in);
      ArrayMChar A = new ArrayMChar();
      new ArrayMChar();
      System.out.print("Array A");
      A.Baca();
      A.Tulis();
      boolean Pal = A.Palindrom();
      System.out.print("Kata A adalah palindrom = " + Pal);
   }
}