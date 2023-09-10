/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutput;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan sebuah inputan ");
        String inputline = input.nextLine();
        String[] Array = inputline.split("[ !,?._'@]");
        
        System.out.println(Array.length);
        for ( int i = 0; i < Array.length ; i++){
            System.out.println(Array[i]);
        }
    }
    
}
