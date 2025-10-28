package Smstr3;

import java.util.Scanner;

public class membacabilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, k, luas;
        double phi = 22/7;

        System.out.print("jari-jari:"); r = sc.nextFloat();
        k = 2 * phi * r;
        luas = phi * r * r;
        System.out.println("jarijari= " + r + ", keliling= " + k + ", luas=" + luas);
    }
}
