/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bematol_fullagar;



/**
 *
 * @author ilonabematol
 */
public class Voiture {
   
    String marque; 
    String modele;
    int PuissanceCV;
    int nombre; 
    Personne Proprietaire ;
    public  Voiture(String Lamarque,String Lemodele,int nb){ 
        marque = Lamarque; 
        modele = Lemodele; 
        nombre = nb; 
        Personne Proprietaire = null ;
        
    } 
   
    public String toString () { 
    return "la marque "+ marque + " le modele " + modele + " Puissance en CV " +nombre ; 
} 
     
} 

