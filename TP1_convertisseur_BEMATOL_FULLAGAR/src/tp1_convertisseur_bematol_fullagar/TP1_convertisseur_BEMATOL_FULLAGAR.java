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
        
    //double tempC=0;
    //double tempK=0;
    
    //Scanner sc = new Scanner(System.in);
    //System.out.println( "entrer une temperature en celcius:");
    //tempC= sc.nextDouble();
    //tempK = CelciusVersKelvin(tempC);
    //System.out.println("la temperature en Kelvin est de: "+ tempK);
    
    double Temperature;
    double Val;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Bonjour, saisissez une valeur: ");
    Temperature = sc.nextDouble();
    System.out.println("Saisissez la conversion que vous souhaiter effectuer : 1) De Celcius vers Kelvin\n" +
"2) De Kelvin vers Celcius\n"+ "3) De Farenheit vers Celcius\n"+"4) De Celcius vers Farenheit \n"+ "5) De Kelvin vers Farenheit\n"+ "6) De Farenheit vers Kelvin" );
    Val = sc.nextDouble();
    
    switch (operator) {
            case 1 -> {
                Temperature = CelciusVersKelvin(Temperature);
                System.out.println(Temperature);
            }
            case 2 -> {
                substract = operande1 - operande2;
                System.out.println(substract);
            }
            case 3 -> {
                multiply = operande1*operande2;
                System.out.println(multiply);
            }
            case 4 -> {
                divide =operande1/operande2;
                System.out.println(divide);
            }
            case 5 -> {
                modulo = operande1%operande2; 
                System.out.println(modulo);
            }
            //default -> {
                //System.out.println("erreur"); 
                
            //}




    public static double CelciusVersKelvin ( double tempCelcius){
    double tempKelvin = tempCelcius + 273.15;
    return (double) tempKelvin;}  
    
   public static double KelvinVersCelcius ( double tempKelvin){
    double tempCelcius = tempKelvin - 273.15;
    return (double) tempCelcius;  
}

public static double FarenheitVersCelcius ( double tempFarenheit){
    double tempCelcius = tempFarenheit - 32;
    return (double) tempCelcius; 
}

public static double CelciusVersFarenheit ( double tempCelcius){
    double tempFarenheit = tempCelcius + 32;
    return (double) tempFarenheit; 
}

public static double KelvinVersFarenheit ( double tempKelvin){
    double tempFarenheit = tempKelvin - 459.67;
    return (double) tempFarenheit; 
}
public static double FarenheitVersKelvin ( double tempFarenheit){
    double tempKelvin = tempFarenheit - 459.67;
    return (double) tempKelvin; 
}
}
 

