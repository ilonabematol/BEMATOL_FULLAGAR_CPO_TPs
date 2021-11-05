/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_bematol_fullagar;

/**
 *
 * @author ilonabematol
 */
public class Convertisseur {
    int nbConversions;
    public double Convertisseur (){
        nbConversions=0;
        return 0;
    }
    public  double CelciusVersKelvin (double tempCelcius){
            double tempKelvin = (tempCelcius + 273.15);
            nbConversions=nbConversions+1;
        return (double) tempKelvin;   
    }
 
    public  double KelvinVersCelcius(double tempKelvin) {
        double tempCelcius = tempKelvin - 273.15;
        nbConversions=nbConversions+1;
        return (double) tempCelcius;
    }

    public  double FarenheitVersCelcius(double tempFarenheit) {
        double tempCelcius = tempFarenheit - 32;
        nbConversions=nbConversions+1;
        return (double) tempCelcius;
    }

    public  double CelciusVersFarenheit(double tempCelcius) {
        double tempFarenheit = tempCelcius + 32;
        nbConversions=nbConversions+1;
        return (double) tempFarenheit;
    }

    public double KelvinVersFarenheit(double tempKelvin) {
        double tempFarenheit = tempKelvin - 459.67;
        nbConversions=nbConversions+1;
        return (double) tempFarenheit;
    }

    public  double FarenheitVersKelvin(double tempFarenheit) {
        double tempKelvin = tempFarenheit - 459.67;
        nbConversions=nbConversions+1;
        return (double) tempKelvin;
    }
    public String toString () {
        return "nb de conversions"+ nbConversions;
}
}

