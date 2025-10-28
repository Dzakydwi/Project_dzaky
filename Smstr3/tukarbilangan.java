package Smstr3;

import java.util.Scanner;

public class tukarbilangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        
        System.out.print("Masukkan nilai a: ");
        a = sc.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = sc.nextInt();
        
        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);
        
        // Menukar nilai a dan b
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Setelah ditukar: a = " + a + ", b = " + b);
    }
}
