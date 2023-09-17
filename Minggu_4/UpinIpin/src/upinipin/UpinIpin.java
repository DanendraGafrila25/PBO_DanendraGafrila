/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upinipin;

/**
 *
 * @author ASUS
 */
public class UpinIpin {

    public static void main(String[] args) { 
        Item name = new Item("upin");
    }
}

class Item {
    private String name;

    private Item() {
        name = "Ipin";
    }


    public Item(String name) { 
        this(); // Inisialisasi atribut name dengan nilai dari parameter
        System.out.println(this.name);
    }
}

