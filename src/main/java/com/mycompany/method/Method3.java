/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.method;

/**
 *
 * @author Lenovo
 * 
 *Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menghitung
Pembagi Bersama Terbesar dari dua buah bilangan a dan b yang diinput dari alat
masukan.
 */
import java.util.Scanner;

public class Method3 {

    /**
     * @param args the command line arguments
     */
    static int pbb(int bil1, int bil2){
        int sisa;
        while(bil2 != 0){
            sisa=bil1%bil2;
            bil1=bil2;
            bil2=sisa;    
        }
        return bil1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Masukkan a: ");
        int a = myObj.nextInt();
        System.out.println("masukkan b: ");
        int b = myObj.nextInt();
      
        System.out.println("Pembagi Bersama Terbesar: " + pbb(a,b));
        
        myObj.close();
    }
    
}
