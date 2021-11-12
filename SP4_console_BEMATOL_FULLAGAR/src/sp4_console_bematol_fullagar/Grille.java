/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bematol_fullagar;

/**
 *
 * @author ilonabematol
 */
public class Grille {
    int CellulesJeu[] []= new int[6][7];
    
    public void Grille(){
        
    }
    public boulean ajouterJetonDansColonne(Jeton, int){
        
        if (CellulesJeu[i][j]!= null){
           return false;  
        }
        
    }
    public boolean etreRemplie(){ // on créer cette méthode pour voir si le tableau est rempli
        for (int i=0; i < CellulesJeu.length; i++ )// on parcourt le tableau 
            if (CellulesJeu[i][j]!= null){
               return true; // la grille est pleine 
            }
          
        
    }
}
