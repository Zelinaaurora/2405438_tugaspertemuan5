/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.method;

/**
 *
 * @author Lenovo
 * 
 *Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menampilkan
jumlah deret bilangan genap dari batasAwal dan batasAkhir yang diinput dari alat
masukan.
 */
import java.util.Scanner;

public class Method2 {
    
    static int jumlahDeretGenap(int a, int z){
        int jumlah=0;
        for(int i=a ; i<=z ; i++){
            if(i%2 == 0){
                jumlah += i;
            }    
        }
        return jumlah;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("masukkan batas minimal: ");
        int batasMin = myObj.nextInt();
        System.out.println("masukkan batas maksimal: ");
        int batasMaks = myObj.nextInt();
        
        System.out.println("Jumlah deret bilangan genap: " + jumlahDeretGenap(batasMin,batasMaks));
        
        myObj.close();
    }
    
}
