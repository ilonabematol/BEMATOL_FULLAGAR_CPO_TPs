/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author ilonabematol
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int var1;
        int var2;
        int somme=0;
        Scanner sc = new Scanner( System.in);
        System.out.println( " please enter the the first number:");
        var1= sc.nextInt();
        System.out.println( " please enter the the first number:");
        var2= sc.nextInt();
        somme= var1+var2;
        System.out.println(somme);
        
    }
    
}
