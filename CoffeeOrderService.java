package tugas3.sesudah;

/**
 * Kelas layanan (Service) untuk mengelola logika bisnis pemesanan kopi, 
 * termasuk perhitungan subtotal, pajak, total harga, dan pencetakan struk.
 * 
 * @author Agung Fitra
 * @version 2.0
 */
public class CoffeeOrderService {
    /** Tarif pajak pertambahan nilai sebesar 11% */
    private static final double TAX_RATE = 0.11;

    /** Objek item pesanan yang akan diproses */
    private OrderItem item;

    /**
     * Menginisialisasi layanan pemesanan dengan data item pesanan tertentu.
     * 
     * @param item objek OrderItem yang berisi detail pesanan pelanggan
     */
    public CoffeeOrderService(OrderItem item) {
        this.item = item;
    }

    /**
     * Menghitung subtotal harga pesanan (harga satuan dikali jumlah).
     * 
     * @return nilai subtotal dalam bentuk double
     */
    public double calculateSubtotal() {
        return item.getPrice() * item.getQuantity();
    }

    /**
     * Menghitung besar nominal pajak berdasarkan subtotal dan tarif pajak.
     * 
     * @return nilai nominal pajak dalam bentuk double
     */
    public double calculateTax() {
        return calculateSubtotal() * TAX_RATE;
    }

    /**
     * Menghitung total akhir pembayaran (subtotal ditambah pajak).
     * 
     * @return nilai total bayar keseluruhan dalam bentuk double
     */
    public double calculateTotalPrice() {
        return calculateSubtotal() + calculateTax();
    }

    /**
     * Mencetak struk atau nota pembayaran pesanan kopi secara terformat ke konsol.
     */
    public void printOrderReceipt() {
        System.out.println("===== STRUK PEMESANAN KOPI =====");
        System.out.println("Nama Pelanggan : " + item.getCustomerName());
        System.out.println("Menu Kopi      : " + item.getMenuName());
        System.out.println("Jumlah         : " + item.getQuantity());
        System.out.println("Subtotal       : Rp " + calculateSubtotal());
        System.out.println("Pajak (11%)    : Rp " + calculateTax());
        System.out.println("Total Bayar    : Rp " + calculateTotalPrice());
        System.out.println("================================");
    }
}