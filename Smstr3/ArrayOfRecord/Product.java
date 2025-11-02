package ArrayOfRecord;
import java.util.Scanner;

public class Product {
    private String productCode;
    private double sellingPrice;

    // Method untuk membaca input data Product
    public void Baca() {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("  Input Kode Produk: ");
        this.productCode = sc.nextLine();
        
        System.out.print("  Input Harga Jual: ");
        try {
            // Menggunakan nextLine() lalu konversi untuk menghindari masalah Scanner
            this.sellingPrice = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("  [Peringatan] Input harga tidak valid, disetel ke 0.0");
            this.sellingPrice = 0.0;
        }
    }

    // Method untuk menampilkan data Product
    public void Tulis() {
        System.out.println("Kode: " + this.productCode + ", Harga: " + this.sellingPrice);
    }
}