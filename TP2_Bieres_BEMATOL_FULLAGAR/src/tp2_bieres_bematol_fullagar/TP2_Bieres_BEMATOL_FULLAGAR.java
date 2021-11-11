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
        
        // QUESTION 1 a 10
       //BouteilleBiere Biere= new BouteilleBiere();   
    //Biere.nom= "Skoll";
    //Biere.degreAlcool = 5.6 ;
    ///Biere.brasserie= "Trois Brasseurs";
    //Biere.ouverte= false ; 
    
//System.out.println("Bouteille de " + Biere.nom +" (" + Biere.degreAlcool + " degres) \nBrasserie : " + Biere.brasserie ) ;
        
        //BouteilleBiere uneBiere= new BouteilleBiere();
         //uneBiere.nom = "Cuvée des trolls"; 
         //uneBiere.degreAlcool = 7.0 ;
         //uneBiere.brasserie= "Dubuisson";
         //uneBiere.ouverte= false ; 
         
         //uneBiere.lireEtiquette();
        
         
         
         //BouteilleBiere secondeBiere= new BouteilleBiere();
         //secondeBiere.nom = "Leffe"; 
         //secondeBiere.degreAlcool = 6.6 ;
         ///secondeBiere.brasserie= "Abbaye de Leffe";
         //secondeBiere.ouverte= false ; 
         
         //secondeBiere.lireEtiquette();
         
         BouteilleBiere Biere= new BouteilleBiere("Skoll",5.6 , "Trois Brasseurs" );
         Biere.lireEtiquette(); 
         BouteilleBiere uneBiere= new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
         uneBiere.lireEtiquette();
         BouteilleBiere autreBiere= new BouteilleBiere("Leffe", 6.6 , "Abbaye de Leffe");
         autreBiere.lireEtiquette();
         
         BouteilleBiere deuxiemeBiere= new BouteilleBiere("Heineken",7.6 , "Pti Comptoir" );
         //deuxiemeBiere.Decapsuler();
         deuxiemeBiere.lireEtiquette(); 
         BouteilleBiere troisiemeuneBiere= new BouteilleBiere("Delirium Red", 7.0, "Café Jules");
         troisiemeuneBiere.lireEtiquette();
         //troisiemeuneBiere.Decapsuler();
         BouteilleBiere derniereBiere= new BouteilleBiere("Brush", 6.6 , "Abbaye de Leffe");
         //derniereBiere.Decapsuler();
         derniereBiere.lireEtiquette();         
         System.out.println(uneBiere) ;

    }
    
}
