/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package berhitung;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Berhitung {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan operasi perhitungan (contoh: 10 / 5):");

        String inputLine = input.nextLine();

        // Memisahkan input menjadi komponen angka1, operator, dan angka2
        String[] components = inputLine.split(" ");
        if (components.length != 3) {
            System.out.println("Format input tidak valid.");
            return;
        }

        int angka1;
        int angka2;
        try {
            angka1 = Integer.parseInt(components[0]);
            angka2 = Integer.parseInt(components[2]);
        } catch (NumberFormatException e) {
            System.out.println("Input angka tidak valid.");
            return;
        }

        String operator = components[1];

        // Memeriksa apakah operator adalah pembagian (/) dan apakah angka2 bukan nol
        if (operator.equals("/") && angka2 == 0) {
            System.out.println("Pembagian oleh nol tidak diizinkan.");
            return;
        }

        // Memeriksa apakah angka1 habis dibagi angka2 dalam operasi pembagian
        if (operator.equals("/") && angka1 % angka2 != 0) {
            System.out.println("Hasil pembagian tidak valid.");
            return;
        }

        // Melakukan operasi berdasarkan operator
        int hasil = 0;
        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }

        // Menampilkan hasil perhitungan
        System.out.println("Hasil perhitungan: " + hasil);
    }
}