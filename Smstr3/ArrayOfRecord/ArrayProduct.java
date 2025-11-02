package ArrayOfRecord;
import java.util.Scanner;

public class ArrayProduct {
    private String productCode;
    private double sellingPrice;

    public void Baca() {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("  Input Kode Produk: ");
        this.productCode = sc.nextLine(); // Menggunakan nextLine untuk membaca String
        
        System.out.print("  Input Harga Jual: ");
        // Menggunakan nextLine lalu konversi ke Double untuk menghindari masalah Scanner
        try {
            this.sellingPrice = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("  [Peringatan] Input harga tidak valid, disetel ke 0.0");
            this.sellingPrice = 0.0;
        }
    }

    // Method untuk menampilkan data Product
    public void Tulis() {
        System.out.println("  Kode: " + this.productCode + ", Harga: " + this.sellingPrice);
    }
}