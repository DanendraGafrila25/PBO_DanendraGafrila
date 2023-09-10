/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gaji_agent;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Gaji_Agent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiPokok = 500000; // Gaji pokok per bulan
        int hargaItem = 50000;  // Harga setiap item
        int jumlahItemTerjual; // Jumlah item yang terjual oleh agen
         
         System.out.println("masukkan item yang terjual");
         jumlahItemTerjual = input.nextInt();

        // Hitung total penjualan
        int totalPenjualan = hargaItem * jumlahItemTerjual;

        // Inisialisasi bonus
        double bonus = 0;

        // Mengecek kondisi penjualan
        if (jumlahItemTerjual >= 15 && jumlahItemTerjual < 40) {
            bonus = 0.10 * totalPenjualan; // Bonus 10% per item
        } else if (jumlahItemTerjual >= 40 && jumlahItemTerjual <= 80) {
            bonus = 0.25 * totalPenjualan; // Bonus 25% jika terjual 40-80 item
        } else if (jumlahItemTerjual > 80) {
            bonus = 0.35 * totalPenjualan; // Bonus 35% jika terjual lebih dari 80 item
        } else if (jumlahItemTerjual < 15) {
            double denda = 0.15 * (totalPenjualan - (15 * hargaItem)); // Denda 15% dari kurangnya penjualan ke 15 item
            bonus = -denda; // Pemotongan gaji pokok
        }

        // Hitung total gaji (gaji pokok + bonus)
        double totalGaji = gajiPokok + bonus;

        // Cetak hasil
        System.out.println("Total Penjualan: Rp. " + totalPenjualan);
        System.out.println("Bonus: Rp. " + bonus);
        System.out.println("Total Gaji: Rp. " + totalGaji);
    }
}
