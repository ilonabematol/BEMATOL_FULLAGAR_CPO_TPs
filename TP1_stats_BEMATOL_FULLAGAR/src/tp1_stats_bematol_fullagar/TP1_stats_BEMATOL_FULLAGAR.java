/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_bematol_fullagar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ilonabematol
 */
public class TP1_stats_BEMATOL_FULLAGAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
    Random generateurAleat = new Random();
    float Tab[]= new float[6];
    Scanner sc = new Scanner( System.in);
    System.out.println("saisissez un nombre entier: ");
    int m = sc.nextInt();
    
        for (int i=0;i<=m;i++){
            int nbaleat = generateurAleat.nextInt(6);
            Tab[nbaleat]+=1.;
        }
        
        for (int i=0;i<6;i++){
            System.out.print("le nb "+i+" a ete tire a "+Tab[i]*100/m+" pourcent \n");
        }
    }
}
        
