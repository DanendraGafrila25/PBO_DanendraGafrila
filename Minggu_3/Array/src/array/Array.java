/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author ASUS
 */
public class Array {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args)
 {
 //One Dimensional Arrays
 int[] fisrtArray = {2, 5, 3}; 
 int[] secondArray = {9, 5, 3}; 
 int[] thirdArray = {2, 4, 9}; 
 int[] fourthArray = {10, 11, 12}; 
 int[] fifthArray = {13, 14, 15}; 
 int[] sixthArray = {16, 17, 18}; 
 int[] seventhArray = {19, 20, 21}; 
 int[] eighthArray = {22, 23, 24}; 
 int[] ninthArray = {25, 26, 27}; 
 //Two Dimensional Arrays
 int[][] twoDimensionalArray1 = {fisrtArray, secondArray, 
thirdArray}; 
 int[][] twoDimensionalArray2 = {fourthArray, fifthArray, 
sixthArray};
 int[][] twoDimensionalArray3 = {seventhArray, eighthArray, 
ninthArray};
 //Three Dimensional Array
 int[][][] threeDimensionalArray = {twoDimensionalArray1, 
twoDimensionalArray2, twoDimensionalArray3};
 
 for (int[][] twoDArray : threeDimensionalArray) {
            System.out.print("{");
            for (int[] oneDArray : twoDArray) {
                System.out.print("{");
                for (int i = 0; i < oneDArray.length; i++) {
                    System.out.print(oneDArray[i]);
                    if (i < oneDArray.length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.print("}");
                if (oneDArray != twoDArray[twoDArray.length - 1]) {
                    System.out.print(" ");
                }
            }
            System.out.println("}");
        }
    }
}

