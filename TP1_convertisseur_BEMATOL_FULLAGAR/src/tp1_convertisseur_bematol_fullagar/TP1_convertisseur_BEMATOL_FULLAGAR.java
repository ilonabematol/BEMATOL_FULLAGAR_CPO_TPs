/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_bematol_fullagar;

import java.util.Scanner;

/**
 *
 * @author ilonabematol
 *///TP1 Calculator
  //Ilona Bématol Fullagar Scott
  //04/10/2021
        
public class TP1_convertisseur_BEMATOL_FULLAGAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    double tempC=0;
    double tempK=0;
    Scanner sc = new Scanner(System.in);
    System.out.println( "entrer une temperature en celcius:");
    tempC= sc.nextDouble();
    tempK = CelciusVersKelvin(tempC);
    System.out.println("la temperature en Kelvin est de: "+ tempK);

    
    }  

  
}

    public static double CelciusVersKelvin ( double tempCelcius){
    double tempKelvin =0;
    tempKelvin = tempCelcius + 273.15;
    return tempKelvin;   
}