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
    // point important : la cellule d'indice [0][0] est située en bas à gauche 
    // sur le plateau réel - par convention 
    
    
    
    public Grille(){
        for (int i=0; i < CellulesJeu.length; i++ ){// 6lignes
            for (int j=0; j < CellulesJeu[i].length; j++ ){// 7colonnes
                CellulesJeu[i][j] = new Cellule();
        }
            }
    }
    public boolean ajouterJetonDansColonne(Jeton jeton , int j){//j correspond au numéro de la colonne
        // le jeton est placé dans la case la plus basse
        if (CellulesJeu[5][j].jetonCourant!= null){ 
           return false;// la colone est pleine  
        }else {
            for(int i=0; i<5 ; i++){ // i=0 pour poser le jeton en bas
                if(CellulesJeu[i][j].jetonCourant == null){// la place libre dans la case la plus basse
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
            System.out.print( "  "+ i + " ");
            for (int j=0; j<=6; j++){// le nombre de colones
                
               if(CellulesJeu[i][j].trouNoir){
                    System.out.print("\u001B[0m T ");
                }
                  else if (CellulesJeu[i][j].desintegrateur ) {
                    System.out.print("\u001B[0m D ");
                }
                
                  else if("Rouge".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                    System.out.print("\u001B[31m R ");
                }
                
                else if ("Jaune".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                    System.out.print("\u001B[33m J ");
                } 
                else if ("Cellule vide".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                    ///System.out.print("- ");
                    System.out.print("\u001B[0m - ");
                }
        }
          System.out.println("  ");
          
        }
        System.out.print("    ");
        for (int j=0; j<=6 ; j++){
            
            System.out.print(" " +j+" ");// on affiche la colonne +1 car en java on commence a 0
        }
        
    }
    
    
    
    
    public boolean celluleOccupee(int i, int j){
        if ( CellulesJeu[i][j].jetonCourant!= null){ // la cellule est occupée par un jeton
            return true ;      
    }
        return false;//la cellule n'est pas occupe par un jeton 
    }
    
    public String  lireCouleurDuJeton(int i, int j ){
        return CellulesJeu[i][j].jetonCourant.Couleur;// renvoie la couleur associée au jeton 
    }
    
public boolean etreGagnantePourJoueur(Joueur joueur){
    // le joueur qui est entrain de jouer
            // le joueur qui est entrain de jouer

        // condition sur les lignes
        for (int i = 0; i <= 5; i++) {// 6lignes (0 a 5)

            for (int j = 0; j <= 3; j++) { // 4 premieres colonnes
               
                //cas des jetons rouges
                if (CellulesJeu[i][j].jetonCourant !=null && "Rouge".equals(CellulesJeu[i][j].jetonCourant.Couleur)) {
                    int cpt = 1;

                    for (int n = 1; n <= 3; n++) { //verifer les 3 cases autour
                        if (CellulesJeu[i][j+n].jetonCourant !=null && "Rouge".equals(CellulesJeu[i][j + n].jetonCourant.Couleur)) {
                            cpt += 1; // indentation n jetons a cote  
                        }
                        if (cpt == 4) { //verifie si gagne
                            return true; // si true alors joueur a gagne
                        }

                    }

                }

                //cas des jetons jaunes;
                if (CellulesJeu[i][j].jetonCourant !=null && "Jaune".equals(CellulesJeu[i][j].jetonCourant.Couleur)) {
                    int cpt = 1;

                    for (int n = 1; n <= 3; n++) { //verifer les 3 cases autour
                        if (CellulesJeu[i][j+n].jetonCourant !=null && "Jaune".equals(CellulesJeu[i][j + n].jetonCourant.Couleur)) {
                            cpt += 1; // indentation n jetons a cote  
                        }
                        if (cpt == 4) { //verifie si gagne
                            return true; // si true alors joueur a gagne
                        }

                    }

                }
            }
        }

        // condition sur les colonnes
        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 6; j++) {
                if (CellulesJeu[i][j].jetonCourant !=null && CellulesJeu[i][j].jetonCourant.Couleur == "Rouge") {
                    int cpt = 1;

                    for (int n = 1; n <= 3; n++) { //verifer les 3 cases autour
                        if (CellulesJeu[i+n][j].jetonCourant !=null && CellulesJeu[i + n][j].jetonCourant.Couleur == "Rouge") {
                            cpt += 1; // indentation n jetons a cote  
                        }
                        if (cpt == 4) { //verifie si gagne
                            return true; // si true alors joueur rouge a gagne
                        }
                    }
                }
                //cas des jetons jaunes;

                if (CellulesJeu[i][j].jetonCourant != null && CellulesJeu[i][j].jetonCourant.Couleur == "Jaune") {
                    int cpt = 1;

                    for (int n = 1; n <= 3; n++) { //verifer les 3 cases autour
                        if (CellulesJeu[i+n][j].jetonCourant !=null && CellulesJeu[i + n][j].jetonCourant.Couleur == "Jaune") {
                            cpt += 1; // indentation n jetons a cote  
                        }
                        if (cpt == 4) { //verifie si gagne
                            return true; // si true alors joueur Jaune a gagne
                        }

                    }

                }

            }

        }

        // condition sur les diagonales montante
       
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                //cas rouge
                if (CellulesJeu[i][j].jetonCourant !=null && CellulesJeu[i][j].jetonCourant.Couleur == "Rouge") {
                    int cpt = 1;
                    for (int n = 1; n <= 3; n++) { //verifer les 3 cases autour
                        if (CellulesJeu[i+n][j+n].jetonCourant !=null && CellulesJeu[i + n][j + n].jetonCourant.Couleur == "Rouge") {
                            cpt += 1; // indentation n jetons a cote  
                        }
                        if (cpt == 4) { //verifie si gagne
                            return true; // si true alors joueur rouge a gagne
                        }
                    }
                }
                //cas jaune
                if (CellulesJeu[i][j].jetonCourant !=null && CellulesJeu[i][j].jetonCourant.Couleur == "Jaune") {
                    int cpt = 1;
                    for (int n = 1; n <= 3; n++) { //verifer les 3 cases autour
                        if (CellulesJeu[i+n][j+n].jetonCourant !=null && CellulesJeu[i + n][j + n].jetonCourant.Couleur == "Jaune") {
                            cpt += 1; // indentation n jetons a cote  
                        }
                        if (cpt == 4) { //verifie si gagne
                            return true; // si true alors joueur rouge a gagne
                        }
                    }
                }
               

            }
           

        }
        for(int i = 3 ; i<=5 ; i++){
            for(int j = 0 ; j<= 3;j++){
                //cas rouge
                if (CellulesJeu[i][j].jetonCourant !=null &&CellulesJeu[i][j].jetonCourant.Couleur == "Rouge") {
                    int cpt = 1;
                    for (int n = 1; n <= 3; n++) { //verifer les 3 cases autour
                        if (CellulesJeu[i-n][j+n].jetonCourant !=null && CellulesJeu[i - n][j + n].jetonCourant.Couleur == "Rouge") {
                            cpt += 1; // indentation n jetons a cote  
                        }
                        if (cpt == 4) { //verifie si gagne
                            return true; // si true alors joueur rouge a gagne
                        }
                    }
                }
                //cas jaune
                if (CellulesJeu[i][j].jetonCourant !=null && CellulesJeu[i][j].jetonCourant.Couleur == "Jaune") {
                    int cpt = 1;
                    for (int n = 1; n <= 3; n++) { //verifer les 3 cases autour
                        if (CellulesJeu[i-n][j+n].jetonCourant !=null && CellulesJeu[i - n][j + n].jetonCourant.Couleur == "Jaune") {
                            cpt += 1; // indentation n jetons a cote  
                        }
                        if (cpt == 4) { //verifie si gagne
                            return true; // si true alors joueur rouge a gagne
                        }
                    }
                }
                     
            }
        }
        return false; // si tout les if ne sont pas rempli alors personne n'a encore gagné
        
       
    }

/*public void tasserGrille( int j){// la colonne correspondante RAJOUTER LE I CORRESPONDANT AUX LIGNES
    //permet de faire descendre d'une ligne lorsque qu'un jeton est impacté par un trou noir ou un désintégrateur 
    for (int i=4; i>0; i--){
         CellulesJeu[i][j].jetonCourant=CellulesJeu[i+1][j].jetonCourant;// chacune des cases prend la valeur de la case d'au dessus 
    }
      int i=5;
            CellulesJeu[i][j].jetonCourant = null; // on est sur la plus haute ligne du tableau, cela ne décale rien. On initialise juste la cellule
        }*/

void tasserGrille() {
        for (int i = 0; i < 7; i++) {
           tasserColonne(i);
        }
    }
    
    
       void tasserColonne(int colonne) {
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                CellulesJeu[i][colonne].jetonCourant = null;
            } else {
                if (CellulesJeu[i][colonne].jetonCourant  == null) {
                  CellulesJeu[i][colonne].jetonCourant = CellulesJeu[i + 1][colonne].jetonCourant;
                  CellulesJeu[i + 1][colonne].jetonCourant=null;
                }
            }

        }
    }

public boolean colonneRemplie( int j ){// correspond à la colonne 
    // renvoie true si la colonne est remplie = on ne peut pas jouer de jeton
    if (CellulesJeu[5][j].recupererJeton() != null ){
       return true; // la colonne est  remplie 
    }
    return false; // la colonne est pas remplie 
}

public boolean placerTrouNoir( int i , int j ){// i = nb de lignes j= nb colonnes 
    // test pour voir s'il n'y pas déja un trou noir a cet emplacement
    if (CellulesJeu[i][j].trouNoir==false){// on vérifie si un trou noir est présent 
    CellulesJeu[i][j].trouNoir=true; //on place le trou noir 
    return true; // le trou noir a été placé
   
}else{
        return false; // il y a déja un trou noir 
    }
}
public boolean placerDesintegrateur( int i , int j ){// i = nb de lignes j= nb colonnes 
    // test pour voir s'il n'y pas déja un désintégrateur a cet emplacement
    if (CellulesJeu[i][j].desintegrateur==false){
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
    Jeton recupJeton = CellulesJeu[i][j].recupererJeton();// on créé une nouvelle variable qui va recuperer les coordonées du jeton à récuperer
    CellulesJeu[i][j].supprimerJeton();// on enleve le jeton en initialisant null
    return recupJeton; // on renvoit les coordonnées du jeton que l'on supprime de la grille 
}
}


    

    
    







