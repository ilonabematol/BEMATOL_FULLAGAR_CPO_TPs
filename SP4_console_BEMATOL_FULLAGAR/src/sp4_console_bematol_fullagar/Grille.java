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
        for (int i=0; i < CellulesJeu.length; i++ ){// 6lignes
            for (int j=0; j < CellulesJeu[i].length; j++ ){// 7colonnes
                CellulesJeu[i][j] = null;
        }
            }
    }
    public boolean ajouterJetonDansColonne(Jeton jeton , int j){//j correspond au numéro de la colonne
        // le jeton est placé dans la case la plus basse
        if (CellulesJeu[5][j]!= null){
           return false;// la colone est pleine  
        }else {
            for(int i=5; i>0 ; i--){
                if(CellulesJeu[i][j].jetonCourant== null){// la place libre dans la case la plus basse
                    CellulesJeu[i][j].affecterJeton(jeton); // le jeton est placé
                    return true; // le jeton a été placé
            }
        }return false;
        
    }
    }
    public boolean etreRemplie(){ 
        // on créer cette méthode pour voir si le tableau est rempli
        for (int i=0; i < CellulesJeu.length; i++ ){// on parcourt les lignes du tableau
            for (int j=0; j < CellulesJeu[i].length; j++ ){// on parcourt ses colonnes 
                if(CellulesJeu[i][j] != null){
                   return true;  // la grille est remplie 
                }
        }
            }
        return false; //toutes les cases ne sont pas pleines
    }
         
    
    public void viderGrille(){
        for (int i=0; i < CellulesJeu.length; i++ ){// 6lignes
            for (int j=0; j < CellulesJeu[i].length; j++ ){// 7colonnes
                CellulesJeu[i][j].jetonCourant = null;// on suppprime les jetons
                CellulesJeu[i][j].trouNoir = false ;// on suppprime les trous noirs
                CellulesJeu[i][j].desintegrateur= false ;// on surprime les désintégrateur
            }
        }
    }   
    public void afficherGrilleSurConsole(){// affiche la grille sur la console 
        for (int i=5; i>=0; i--){// le nombre de lignes 
            
            for (int j=6; j>=0; j--){// le nombre de colones
                System.out.println( i+1 + " ");// on affiche la ligne +1 car en java on commence a 0
                if (CellulesJeu[i][j].trouNoir != false){
                    System.out.println("O");
                }
                if(CellulesJeu[i][j].desintegrateur != false){
                    System.out.println("D");
                }
                
                if(CellulesJeu[i][j].jetonCourant==null){
                    System.out.println("N");
                }
                
                if(CellulesJeu[i][j].jetonCourant.Couleur == "Rouge"){
                    System.out.println("R");
                }
                
                if(CellulesJeu[i][j].jetonCourant.Couleur == "Jaune"){
                    System.out.println("J");
                }  
        }
            
        }
        for (int j=6; j<= 0; j++){
            System.out.println(" " + j+1);// on affiche la colonne +1 car en java on commence a 0
        }
        // on affiche la grille globale 
    }
    
    
    
    
    public boolean celluleOccupee(int i, int j){
        if ( CellulesJeu[i][j]!= null){ // la cellule est occupée par un jeton
            return true ;      
    }
        return false;//la cellule n'est pas occupe par un jeton 
    }
    
    public String  lireCouleurDuJeton(int i, int j ){
        return CellulesJeu[i][j].jetonCourant.Couleur;// renvoie la couleur associée au jeton 
    }
    
public boolean etreGagnantePourJoueur(Joueur joueur){
    // le joueur qui est entrain de jouer
    for (int i=0; i < 4; i++ ){// 6lignes
            //for (int j=0; j < CellulesJeu[i].length; j++ ){// 7colonnes
                //CellulesJeu[i][j].jetonCourant = "Rouge";
                
            }
}
public void tasserGrille(int j){// la colonne correspondante
    //permet de faire descendre d'une ligne lorsque qu'un jeton est impacté par un trou noir ou un désintégrateur 
    for (int i=4; i>0; i--){
         CellulesJeu[i][j].jetonCourant=CellulesJeu[i+1][j].jetonCourant;// chacune des cases prend la valeur de la case d'au dessus 
    }
      int i=5;
            CellulesJeu[i][j].jetonCourant = null; // on est sur la plus haute ligne du tableau, cela ne décale rien. On initialise juste la cellule
        }

public boolean colonneRemplie( int j ){// correspond à la colonne 
    // renvoie true si la colonne est remplie = on ne peut pas jouer de jeton
    if (CellulesJeu[5][j]!= null ){
       return true; // la colonne est remplie 
    }
    return false; // la colonne n'est pas remplie 
}

public boolean placerTrouNoir( int i , int j ){// i = nb de lignes j= nb colonnes 
    // test pour voir s'il n'y pas déja un trou noir a cet emplacement
    if (CellulesJeu[i][j].trouNoir=false){// on vérifie si un trou noir est présent 
    CellulesJeu[i][j].trouNoir=true; //on place le trou noir 
    return true; // le trou noir a été placé
   
}else{
        return false; // il y a déja un trou noir 
    }
}
public boolean placerDesintegrateur( int i , int j ){// i = nb de lignes j= nb colonnes 
    // test pour voir s'il n'y pas déja un désintégrateur a cet emplacement
    if (CellulesJeu[i][j].desintegrateur=false){
        CellulesJeu[i][j].desintegrateur=true; // on place le désintégrateur
        return true; // le désintégrateur a été placé 
    }else {
        return false; // il y a déja un désintégrateur à cet emplacement 
    }
    
}
public boolean supprimerJeton(int i , int j){// i = nb de lignes j= nb colonnes
    if (CellulesJeu[i][j].jetonCourant!=null){// on verifie si la case est vide 
        CellulesJeu[i][j].jetonCourant=null;// on la vide sinon
        return true; // le jeton a bien été supprimé
    }else{
        return false; // il n'y avait pas de jeton 
    }
}
public Jeton recupererJeton(int i, int j ){// i = nb de lignes j= nb colonnes
    Jeton recupJeton = CellulesJeu[i][j].jetonCourant;// on créé une nouvelle variable qui va recuperer les coordonées du jeton à récuperer
    CellulesJeu[i][j].jetonCourant= null;// on enleve le jeton en initialisant null
    return recupJeton; // on renvoit les coordonnées du jeton que l'on supprime de la grille 
}
}


    

    
    







