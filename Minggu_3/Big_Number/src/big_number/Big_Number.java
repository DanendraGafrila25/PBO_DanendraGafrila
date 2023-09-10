/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package big_number;

import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Big_Number {

    /**
     * @param args the command line arguments
     */

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan 2 angka hingga 200 digit:");
        String inputLine1 = input.nextLine();
        String inputLine2 = input.nextLine();

        // Memeriksa panjang input
        if (inputLine1.length() > 200 || inputLine2.length() > 200) {
            System.out.println("Salah satu input memiliki lebih dari 200 digit.");
            return; // Keluar dari program jika salah satu input terlalu panjang
        }

        // Membaca angka dari input sebagai BigInteger
        BigInteger number1 = new BigInteger(inputLine1);
        BigInteger number2 = new BigInteger(inputLine2);

        // Melakukan operasi matematika
        BigInteger hasilTambah = number1.add(number2);
        BigInteger hasilKali = number1.multiply(number2);

        // Menampilkan hasil operasi
        System.out.println("Hasil Penjumlahan: " + hasilTambah);
        System.out.println("Hasil Perkalian: " + hasilKali);
    }
}
