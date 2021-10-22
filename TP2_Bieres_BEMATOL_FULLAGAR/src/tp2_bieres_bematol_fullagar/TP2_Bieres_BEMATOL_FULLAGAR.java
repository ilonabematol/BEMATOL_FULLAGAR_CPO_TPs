/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bematol_fullagar;

/**
 *
 * @author ilonabematol
 */
public class TP2_Bieres_BEMATOL_FULLAGAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere= new BouteilleBiere();   
    uneBiere.nom= "Skoll";
    uneBiere.degreAlcool = 5.6 ;
    uneBiere.brasserie= "Trois Brasseurs";
    uneBiere.ouverte= false ; 
    
System.out.println("Bouteille de " + uneBiere.nom +" (" + uneBiere.degreAlcool + " degres) \nBrasserie : " + uneBiere.brasserie ) ;
        // TODO code application logic here
    }
    
}
