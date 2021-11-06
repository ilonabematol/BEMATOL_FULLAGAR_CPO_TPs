/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_bematol_fullagar;

import java.util.Scanner;

/**
 *
 * @author ilonabematol
 */
public class TP2_convertisseurObjet_BEMATOL_FULLAGAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Convertisseur conv = new Convertisseur ();
        conv.CelciusVersFarenheit(0);
        conv.CelciusVersKelvin(0);
        conv.KelvinVersCelcius(0);
        System.out.println(conv.toString());
        Convertisseur conv2 = new Convertisseur();
        conv2.KelvinVersFarenheit(0);
        conv2.CelciusVersKelvin(0);
        System.out.println(conv2.toString());*/
        double Temperature;
        int Val;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur: ");
        Temperature = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n "+" 1) De Celcius vers Kelvin\n"
                + "2) De Kelvin vers Celcius\n" + "3) De Farenheit vers Celcius\n" + "4) De Celcius vers Farenheit \n" + "5) De Kelvin vers Farenheit\n" + "6) De Farenheit vers Kelvin");
        Val = sc.nextInt();
        Convertisseur conv = new Convertisseur ();
        switch (Val) {
            case 1 -> {
                conv.CelciusVersKelvin(Temperature);
                System.out.println(" la température est " +conv.CelciusVersKelvin(Temperature) + conv.toString());
            }
            case 2 -> {
               conv.KelvinVersCelcius(Temperature);
                System.out.println(" la température est "+conv.KelvinVersCelcius(Temperature) + conv.toString());
            } 
            case 3 -> {
                conv.FarenheitVersCelcius(Temperature);
                System.out.println(" la température est "+ conv.FarenheitVersCelcius(Temperature) + conv.toString());
            }
            case 4 -> {
              conv.CelciusVersFarenheit(Temperature);
                System.out.println(" la température est "+conv.CelciusVersFarenheit(Temperature) + conv.toString());
            }
            case 5 -> {
                conv.KelvinVersFarenheit(Temperature);
                System.out.println(" la température est "+ conv.KelvinVersFarenheit(Temperature) + conv.toString());
            }
            case 6 -> {
                conv.FarenheitVersKelvin(Temperature);
                System.out.println(" la température est "+ conv.FarenheitVersKelvin(Temperature) + conv.toString());
            }
            default -> {
                System.out.println("erreur");

            }
        
        }
    }
    
    
}
