/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutput2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class InputOutput2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan input (string dan integer), ketik 'selesai' untuk mengakhiri:");

        String[] inputStrings = new String[10];
        int[] inputIntegers = new int[10];
        
        int inputCount = 0; // Menghitung jumlah input yang telah dimasukkan

        while (inputCount < 10) {
            inputStrings[inputCount] = scanner.next();
            
            // Cek jika inputLine adalah 'selesai' untuk mengakhiri input
            if (inputStrings[inputCount].equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                inputIntegers[inputCount] = Integer.parseInt(scanner.next());
                inputCount++;
            } catch (NumberFormatException e) {
                System.out.println("Input integer tidak valid.");
            }
        }

        // Cetak output
        System.out.println("==================");
        for (int i = 0; i < inputCount; i++) {
            System.out.printf("%-15s%03d%n", inputStrings[i], inputIntegers[i]);
        }
        System.out.println("==================");
        scanner.close();
    }
}






