/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package halloworld;

/**
 *
 * @author EliteBook
 */
public class Tugas3 {
    public static void main(String[] args){
        int gajiAndri = 1000000;
        int gajiBudi = 5000000;
        double pajak, gajiBersih;
        
        if(gajiAndri==1000000){
            pajak = 0.03*gajiAndri;
            gajiBersih = gajiAndri - pajak;
            System.out.println("Gaji bersih Andri = "+gajiBersih);
        }
        
        if(gajiBudi==5000000){
            pajak = 0.02*gajiBudi;
            gajiBersih = gajiBudi - pajak;
            System.out.println("Gaji bersih Budi = "+gajiBersih);
        }
    }
}
