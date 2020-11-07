/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan38.objorientedperhitunganlingkaran;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class Lingkaran {
    public double dia,rad,area,cir;
    public double PHI=3.14159;
    
    public void getDia(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai diameter Lingkaran: ");
        
        while (!scanner.hasNextDouble()){
            System.out.println("Nilai diameter tidak sesuai\n");
            System.out.print("Masukan Nilai diameter Lingkaran: ");
            scanner.next();
        }
        dia = scanner.nextDouble();
    }
    
    public double hasilLingkaran(double parDia){
        System.out.println("\n=======Hasil Perhitungan Lingkaran=======");
        rad = dia / 2;
        System.out.println("Jari jari lingkaran: " + rad + " cm");
        
        area = (PHI * Math.pow(rad, 2));
        System.out.println("Luas Lingkaran: " + String.format("%.2f", area)+ " cm");
        
        cir = (2 * PHI * rad);
        System.out.println("Keliling lingkaran: " + String.format("%.2f", cir) + " cm");
        
        return(rad);
    }
    
}
