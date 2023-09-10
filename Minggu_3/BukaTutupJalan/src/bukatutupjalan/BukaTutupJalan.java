/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bukatutupjalan;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class BukaTutupJalan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan empat angka 4-digit yang dipisahkan oleh spasi:");
        String inputLine = input.nextLine();

        // Menghapus spasi dan menggabungkan empat angka
        String[] angkaArray = inputLine.split(" ");
        String gabunganAngka = String.join("", angkaArray);

        // Memeriksa apakah input memiliki lebih dari 200 digit
        if (gabunganAngka.length() > 200) {
            System.out.println("Input memiliki lebih dari 200 digit.");
            return;
        }

        // Menghitung hasil pengurangan dengan 999999
        long hasilPengurangan = Long.parseLong(gabunganAngka) - 999999;

        // Memeriksa apakah hasil pengurangan dibagi 5 dengan sisa 0
        if (hasilPengurangan % 5 == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}



