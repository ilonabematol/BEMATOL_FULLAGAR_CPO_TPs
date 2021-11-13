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
    Cellule CellulesJeu[][]= new Cellule[6][7];// on créé la grille
    
    public Grille(){
        
    }
    public boolean ajouterJetonDansColonne(Jeton jeton , int j){//j correspond au numéro de la colonne
        if (CellulesJeu[5][j]!= null){
           return false;// la colone est pleine  
        }else {
            for(int i=5; i>0 ; i--){
                if(CellulesJeu[i][j]== null){
                    CellulesJeu[i][j] == jeton ; // prend la couleur du jeton de celui qui joue 
            // le jeton est placé dans la case la plus basse 
            }
        }
        
    }
    }
    public boolean etreRemplie(){ 
        // on créer cette méthode pour voir si le tableau est rempli
        for (int j=0; j < CellulesJeu.length; j++ ){
// on parcourt le tableau 
            if (CellulesJeu[5][j]== null){ // correspond à la la ligne la plus haute de la grille 
               return true; // la grille est pleine 
            }
        }
    }
    
    public void viderGrille(){
        for (int i=0; i < CellulesJeu.length; i++ ){// 6lignes
            for (int j=0; j < CellulesJeu[i].length; j++ ){// 7colonnes
                CellulesJeu[i][j].jetonCourant = null;
                
            }
        }
    }   
    public void afficherGrilleSurConsole(){/// affiche la grille sur la console 
        
    }
    public boolean celluleOccupee(int i, int j){
        if ( CellulesJeu[i][j]!= null){ // la cellule est occupée par un jeton
            return true ;      
    }
        return false;//la cellule n'est pas occupe par un jeton 
    }
    
    public String  lireCouleurDuJeton(int i, int j ){
        if (CellulesJeu.lirecouleur ){
            return "Jaune";
            
        }else{
            return "Rouge";
        }
    }
    
public boolean etreGagnantePourJoueur(Joueur joueur){
    // le joueur qui est entrain de jouer
    for (int i=0; i < 4; i++ ){// 6lignes
            //for (int j=0; j < CellulesJeu[i].length; j++ ){// 7colonnes
                CellulesJeu[i][j].jetonCourant = "Rouge";
                
            }
}
    
    
}






