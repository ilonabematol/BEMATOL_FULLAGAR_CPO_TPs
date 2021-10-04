/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint;

import java.util.Scanner;

//TP1 Saisie et manipulation de nombres
        //Ilona Bématol Fullagar Scott
        //04/10/2021
        
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int var1;
        int var2;
        int somme=0;
        int diff =0;
        int produit = 0;
        int quotien = 0;
        int diveucl =0;
        int reste=0;
        Scanner sc = new Scanner(System.in);
        System.out.println( " please enter the the first number:");
        var1= sc.nextInt();
        System.out.println( " please enter the the first number:");
        var2= sc.nextInt();
        somme= var1+var2;
        System.out.println(" le résultat de la somme est " + somme);
        diff = var1 - var2;
        System.out.println(" le résultat de la différence est " + diff);
        produit = var1*var2;
        System.out.println(" le résultat du produit est " + produit);
        quotien = var1/var2;
        System.out.println(" le résultat du quotient est " +quotien);
        reste= var1%var2;
        System.out.println(" le reste du quotient est " + reste);
        
        
        
    }
    
}
