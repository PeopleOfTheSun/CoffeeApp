# Aplikasi Pemesanan Kopi (Coffee Order System - Refactored)

Proyek ini merupakan hasil perbaikan (*refactoring*) dari kode pada Modul 2 dan dikembangkan untuk memenuhi **Tugas 2 Modul 3 Praktikum Pemrograman Lanjut** mengenai *Documentation Style* dan dokumentasi **JavaDoc**[cite: 36, 40].

## ☕ Deskripsi Program
Aplikasi berbasis konsol ini dirancang dengan menerapkan prinsip *Clean Code*, pemisahan tugas (*separation of concerns*), dan dokumentasi kode sumber yang terstandarisasi untuk mengelola transaksi pemesanan kopi di sebuah kedai.

## 🚀 Fitur & Struktur Kelas
1. **`OrderItem.java`**: Berfungsi sebagai kelas model untuk menyimpan atribut data pemesan, menu kopi, harga, dan jumlah pesanan dengan teknik enkapsulasi.
2. **`CoffeeOrderService.java`**: Mengelola logika bisnis aplikasi (seperti perhitungan subtotal, pajak 11% menggunakan *Symbolic Constant*, perhitungan total, hingga pencetakan struk dengan method yang telah di-refactoring)[cite: 43].
3. **`CoffeeApp.java`**: Kelas utama pengeksekusi program (*Entry Point*)[cite: 42].

## 📦 Dokumentasi JavaDoc
Seluruh kelas, constructor, dan method di atas telah dilengkapi dengan komentar dokumentasi standar **JavaDoc** (`@author`, `@version`, `@param`, `@return`)[cite: 36] sehingga memudahkan pemahaman dan pemeliharaan kode sumber di masa depan[cite: 12].

## 🛠️ Cara Menjalankan
1. Clone repositori ini atau buka folder proyek di IDE Java pilihan Anda (seperti IntelliJ IDEA atau VS Code)[cite: 4].
2. Kompilasi paket kelas di dalam direktori `tugas3.sesudah`.
3. Jalankan file `CoffeeApp.java` untuk melihat hasil keluaran struk pemesanan kopi di terminal[cite: 42].