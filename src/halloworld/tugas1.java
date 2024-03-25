/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package halloworld;

/**
 *
 * @author EliteBook
 */
public class tugas1 {
    public static void main(String[] args){
        
        int i,j,k;
        
        
        for(i=0;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
            System.out.print(" ");
            }
        
        for(k=0;k<=i;k++){
            
            if(i==0){
                System.out.print(" *");
            }
            if(j%2==1){
            System.out.print(" *");
        }
           
            
        }System.out.println("");
        
        }
        
        
    }
}
