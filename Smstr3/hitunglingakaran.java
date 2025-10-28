package Smstr3;

import java.util.Scanner;

public class hitunglingakaran {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		float r,k, luas;
		float phi=(float) 22/7;
		
	//	System.out.println("1.jarijari= "+r); //
		r=0;
		System.out.println("Phi=  "+phi);
		System.out.println("1.jarijari= "+r);
		System.out.print("jari-jari: "); r=sc.nextFloat();
		k= 2* phi*r;
		luas= phi*r*r;
		System.out.println("2. jarijari= "+r+ ",keliling= "  +k+ ",  luas="+luas);
	
		
	}
}