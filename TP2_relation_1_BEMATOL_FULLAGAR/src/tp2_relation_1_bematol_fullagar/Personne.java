/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bematol_fullagar;

/**
 *
 * @author ilonabematol
 */
public class Personne {
    String nom; 
    String prenom; 
    int nbVoitures ; 
    Voiture [] liste_voitures ; 
     Personne(String Lenom,String Leprenom){ 
        nom = Lenom; 
        prenom = Leprenom;  
        liste_voitures = new Voiture [3] ;
        nbVoitures=0; 
     
}
     public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
 // ... a completer
 if (voiture_a_ajouter.Proprietaire!=null){
     return false;
     
 }
 if (nbVoitures == 3){
     return false;
     
 }else{
    liste_voitures[nbVoitures]=voiture_a_ajouter;
    nbVoitures= nbVoitures+1;
    voiture_a_ajouter.Proprietaire = this ;
    return true;
    
     
 }
 
 
}
}
