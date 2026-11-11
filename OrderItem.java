package tugas3.sesudah;

/**
 * Kelas entitas (Model) yang merepresentasikan informasi detail dari 
 * item pesanan kopi, seperti nama pelanggan, nama menu, harga, dan kuantitas.
 * 
 * @author Agung Fitra
 * @version 2.0
 */
public class OrderItem {
    private String customerName;
    private String menuName;
    private double price;
    private int quantity;

    /**
     * Constructor untuk membuat objek OrderItem baru.
     * 
     * @param customerName nama pelanggan yang melakukan pemesanan
     * @param menuName nama menu kopi yang dipilih
     * @param price harga satuan kopi
     * @param quantity jumlah cangkir kopi yang dipesan
     */
    public OrderItem(String customerName, String menuName, double price, int quantity) {
        this.customerName = customerName;
        this.menuName = menuName;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Mengambil nama pelanggan yang memesan.
     * 
     * @return nama pelanggan dalam bentuk String
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Mengambil nama menu kopi yang dipesan.
     * 
     * @return nama menu kopi dalam bentuk String
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * Mengambil harga satuan dari menu kopi.
     * 
     * @return harga satuan dalam bentuk double
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mengambil jumlah pesanan (kuantitas) kopi.
     * 
     * @return jumlah cangkir dalam bentuk integer
     */
    public int getQuantity() {
        return quantity;
    }
}