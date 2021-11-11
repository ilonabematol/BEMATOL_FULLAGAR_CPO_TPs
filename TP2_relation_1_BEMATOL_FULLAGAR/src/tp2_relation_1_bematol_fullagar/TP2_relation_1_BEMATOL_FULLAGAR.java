/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_bematol_fullagar;

/**
 *
 * @author ilonabematol
 */
public class TP2_relation_1_BEMATOL_FULLAGAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
 Voiture uneClio = new Voiture ("Renault", "Clio", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Renault", "Clio", 5 ) ;
        Voiture une2008 = new Voiture ("Peugeot", "2008", 6 ) ;
        Voiture uneMicra = new Voiture ("Nissan", "Micra", 4 ) ;
Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");
System.out.println("liste des voitures disponibles "+ uneClio +
"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;


bob.liste_voitures[0] = uneClio ;
bob.nbVoitures = 1 ;
uneClio.Proprietaire = bob ;
System.out.println("la premiere voiture de Bob est " +
bob.liste_voitures[0] ) ;

//ajoute voiture pour bob
Voiture audi = new Voiture ("audi", "RS3", 8 ) ;
bob.nbVoitures += 1 ;
bob.liste_voitures[0] = audi;
System.out.println("la deuxieme voiture de Bob est " +
bob.liste_voitures[0] ) ;
//ajoute voiture pour Reno
Voiture merco = new Voiture ("Merco", "C63", 15 ) ;
reno.nbVoitures = 1 ;
reno.liste_voitures[0] = merco;
System.out.println("la premiere voiture de reno est " +
reno.liste_voitures[0] ) ;

//2eme voiture

Voiture tesla = new Voiture ("tesla", "modeleS", 9 ) ;
reno.nbVoitures += 1 ;
reno.liste_voitures[1] = tesla;
System.out.println("la deuxieme voiture de reno est " +
reno.liste_voitures[1] ) ;
     


// test pour ajouter une voiture via la methode
Voiture Twingo = new Voiture ("Renault", "Twingo", 2 ) ;
bob.ajouter_voiture(Twingo);
System.out.println("Nouvelle voiture: " + bob.liste_voitures[2] ) ;

    }
   
}
        
        

    
    

