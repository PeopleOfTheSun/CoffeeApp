package tugas3.sesudah;

/**
 * Kelas utama (Entry Point) untuk menjalankan aplikasi sistem pemesanan kopi.
 * Kelas ini menginisialisasi data pesanan pelanggan dan memanggil layanan cetak struk.
 * 
 * @author Agung Fitra
 * @version 2.0
 */
public class CoffeeApp {

    /**
     * Metode utama untuk menjalankan program Java.
     * 
     * @param args argumen baris perintah (command line arguments)
     */
    public static void main(String[] args) {
        OrderItem item = new OrderItem("Budi", "Espresso", 18000, 2);
        CoffeeOrderService orderService = new CoffeeOrderService(item);
        
        orderService.printOrderReceipt();
    }
}