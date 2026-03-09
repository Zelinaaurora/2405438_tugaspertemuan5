/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.method;

/**
 *
 * @author Lenovo
 * 
 * Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, mengulang
menuliskan teks “Saya senang belajar bahasa Java” sebanyak N kali, dengan nilai N yang
akan dibaca dengan perintah inputan menggunakan perulangan for.
 */
import java.util.Scanner;

public class Method1 {
    static void kalimat(int maks){
        for (int i=0 ; i<maks ; i++){
            System.out.println("Saya senang belajar bahasa Java");
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        
        System.out.println("Masukkan n: ");
        int n = myObj.nextInt();
        
        kalimat(n);
        
        myObj.close();
    }
}
