/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO310117119Latihan19SaldoTabungan;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini menghitung jumlah saldo tabungan perbulan
 */
public class PBO310117119Latihan19SaldoTabunga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo,bulan;
        double bunga,bunga1;
        
        saldo = 2500000;
        bulan = 6;
        bunga = 0.15; 
                
        for (int i = 1; i <= bulan; i++) {
            bunga1 = bunga * saldo;
            saldo = (int) (saldo + bunga1);
            
         System.out.println("Saldo di bula ke-"+i+" "+saldo);   
        }
        
        
        
    }
    
}
