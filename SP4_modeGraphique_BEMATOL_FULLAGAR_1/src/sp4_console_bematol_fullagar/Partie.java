/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bematol_fullagar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ilonabematol
 */
public class Partie {
 Joueur ListeJoueurs[]= new Joueur[2];// liste de 2 d'objet joueur à 2 cases
 Joueur joueurCourant;
 Grille grilleJeu = new Grille(); // création de la référence objet grilleJeu
 
 
 Partie(){
   
  
 }
 
 public void initialiserPartie(){
     grilleJeu.viderGrille();// on vide la grille pour recommencer une partie
     // on cherche maintenant a initialiser les deux joueurs
    
     
    //Création des joueurs
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le nom du Joueur 1 : ");
    Joueur Joueur1 = new Joueur(sc.nextLine()); // création des deux objets joueur
    System.out.println("Entrez le nom du Joueur 2 : "); 
    Joueur Joueur2 = new Joueur(sc.nextLine());
        
    ListeJoueurs[0]=Joueur1;
    ListeJoueurs[1]=Joueur2;
    
    
    attribuerCouleursAuxJoueurs();
    
    System.out.println(Joueur1.nom + " possède les jetons de couleur " + Joueur1.couleur);
    System.out.println(Joueur2.nom + " possède les jetons de couleur " + Joueur2.couleur);
    
    
    
    //on donne les jetons aux joueurs
    for(int i=0; i<21 ; i++ ){
        Jeton JetonR = new Jeton("Rouge");// création des 21 jetons 
        ListeJoueurs[0].ajouterJeton(JetonR);// affecte a chaque joueur ses 21 jeotn avce la couleur correspondante
        Jeton JetonJ = new Jeton("Jaune");
        //ListeJoueurs[1].ListeJetons[i]=JetonJ;
        ListeJoueurs[1].ajouterJeton(JetonJ);
    }
    // on cherche mainenant a savoir qui va commencer
    // on assimile les couleurs aléatoirement 
    Random alea = new Random();
    boolean R;
    R= alea.nextBoolean();
    if( R==true ){
        joueurCourant= ListeJoueurs[0];
            System.out.println( Joueur1.nom + " commence");
        }else{
        joueurCourant = ListeJoueurs[1];
            System.out.println( Joueur2.nom + " commence");
    }
    
   
        
    Random position = new Random();

        for (int i = 0; i < 2; i++) {
            int lig = position.nextInt(5);
            int col = position.nextInt(6);
            int k = 0;

            if (grilleJeu.CellulesJeu[lig][col].presenceTrouNoir() == false) {
                grilleJeu.placerDesintegrateur(lig, col);
                grilleJeu.placerTrouNoir(lig, col);

            }
        }

    // on place 3 désintégrateurs aléatoirement
// on génère aléatoirement des coordonnées pour placer les désintégrateurs
        Random position2 = new Random();
        for (int cpt = 0; cpt < 3; cpt++) {
            int L = position2.nextInt(5);
            int C = position2.nextInt(6);

            boolean verifT = grilleJeu.CellulesJeu[L][C].presenceTrouNoir();
            boolean verifD = grilleJeu.CellulesJeu[L][C].presenceDesintegrateur();

            if (verifT == true || verifD == true) {
                cpt--;
            } else {
                grilleJeu.placerDesintegrateur(L, C);

            }

        }
        Random position3 = new Random();
        for (int cpt = 0; cpt < 3; cpt++) {

            int L = position3.nextInt(5);
            int C = position3.nextInt(6);

            boolean verifT = grilleJeu.CellulesJeu[L][C].presenceTrouNoir();
            boolean verifD = grilleJeu.CellulesJeu[L][C].presenceDesintegrateur();

            if (verifT == true || verifD == true) {
                cpt--;
            } else {
                grilleJeu.placerTrouNoir(L, C);

            }

        }
        grilleJeu.afficherGrilleSurConsole();
    }
    
    
   /* //Génération des 5 trous noirs et de 2 désintégrateurs sur les trous noirs
    Random position = new Random();
        int compteur = 0;
        for (int i = 1; i <7 ; i++) {
            int lig = position.nextInt(6);
            int col = position.nextInt(7);
            if (compteur < 2) {
                if (!grilleJeu.placerDesintegrateur(lig, col)) {
                    compteur--;
                }
                compteur++;
            }
            if (!grilleJeu.placerTrouNoir(lig, col)) {
                i--;
            }
        }
        grilleJeu.afficherGrilleSurConsole();
    
   // on place 3 désintégrateurs aléatoirement
    // on génère aléatoirement des coordonnées pour placer les désintégrateurs
 for (int cpt=0; cpt<3; cpt++){
    int i = (int) (Math.random() * 6);// lignes  
    int j = (int)(Math.random() * 7);//colonnes
    if (!grilleJeu.placerDesintegrateur(i, j) || grilleJeu.CellulesJeu[i][j].presenceTrouNoir()) {
                i--;
            }
    
}   */



 public void debuterPartie(){
   
    
     initialiserPartie(); // prepa de la grille

    grilleJeu.etreGagnantePourJoueur(joueurCourant);
    

    while(grilleJeu.etreGagnantePourJoueur(joueurCourant) == false){
        Scanner sc = new Scanner(System.in);
        System.out.println("Actions possibles : ");
        System.out.println("1. Poser un jeton");
        System.out.println("2. Désintégrer un jeton adverse");
        System.out.println("3. Récupérer un jeton");

        int Choix = sc.nextInt();
            switch(Choix){

                case 1: //poser un jeton

        System.out.println("Choisir colonne de 0 a 6");
        int ChoixC = sc.nextInt()-1; //bien repérer sur tableau de 0 à 6 avec 7 cases

        while (ChoixC <0 || ChoixC >6){ // verifie si sort de la grille
            System.out.println("Colonne invalide. Réessayer.");
            ChoixC = sc.nextInt()-1;
        }

        if (grilleJeu.colonneRemplie(ChoixC) == true){ //verifie si tout les espace de jeton sont deja pris
            System.out.println("Colonne remplie. Réessayer.");
            ChoixC = sc.nextInt()-1;
            
    }
      
        
        boolean resultatAction = grilleJeu.ajouterJetonDansColonne(joueurCourant, ChoixC);
        while (!resultatAction){
            System.out.println("La colonne est pleine veuillez : ");
            ChoixC=sc.nextInt()-1;
            resultatAction = grilleJeu.ajouterJetonDansColonne(joueurCourant, ChoixC);
            
        }
        // recupere 1 jeton de sa liste
       
        Jeton Jetonj = joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];
        joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1] = null; // affecte la case du jeton comme utilise
        joueurCourant.nombreJetonsRestants -- ; // desindente le nombre de jeton restant
        grilleJeu.ajouterJetonDansColonne(joueurCourant , ChoixC);
        grilleJeu.afficherGrilleSurConsole();
       
        // gestion des trous noir
       
        /*if(grilleJeu.CellulesJeu[][ChoixC].presenceTrouNoir() ==true);
        
        
        if(grilleJeu.presenceTrouNoir() ==true){
           CellulesJeu.jetonCourant.activerTrouNoir();
           grilleJeu.afficherGrilleSurConsole();
           */
        
        
        
       break;

        case 2:// désintégrer un jeton adverse
            
            System.out.println("Veuillez saisir les coordonnées du jeton a désintégrer :");
            System.out.println("saisir la ligne du jeton a desintegrer");
            int ligne = sc.nextInt()-1; 
            while (ligne > 5 || ligne < 0) {
    System.out.println("Erreur: veuillez saisir une ligne valide:");
    
           }
            System.out.println("saisir la colonne du jeton a desintegrer");
            int colonne = sc.nextInt()-1; 
            while (colonne > 5 || colonne < 0) {
    System.out.println("Erreur: veuillez saisir une ligne valide:");
    
}
if (grilleJeu.CellulesJeu[ligne][colonne].jetonCourant != null && !grilleJeu.CellulesJeu[ligne][colonne].lireCouleurDuJeton().equals(joueurCourant.couleur)) {
            grilleJeu.supprimerJeton(ligne, colonne);
            grilleJeu.recupererJeton(ligne, colonne);
            grilleJeu.tasserGrille();
            
            joueurCourant.utiliserDesintegrateur();
            
            
}
             grilleJeu.afficherGrilleSurConsole();  
           
         break;
            
        case 3:// recuperer un jeton 
        
          
            System.out.println("saisir la ligne du jeton a récuperer");
            int line = sc.nextInt()-1;
             while (line > 5 || line < 0) {
            System.out.println("Erreur : veuillez saisir une ligne valide :");
            line = sc.nextInt()-1;
             }
             
             
            System.out.println("saisir la colonne du jeton a récuperer");
            int colon = sc.nextInt()-1;
            while (colon > 6 || colon < 0) {
            System.out.println("Erreur : veuillez saisir une colonne valide :");
            colon = sc.nextInt()-1 ;
        }
            
            
            
            
            
            if (grilleJeu.CellulesJeu[line][colon].jetonCourant != null && grilleJeu.CellulesJeu[line][colon].lireCouleurDuJeton().equals(joueurCourant.couleur)) {
            grilleJeu.recupererJeton(line, colon);
            joueurCourant.ajouterJeton(grilleJeu.recupererJeton(line, colon));
            grilleJeu.tasserGrille();
            //joueurCourant.ajouterJeton(G.Cellules[line][colon].recupererJeton());
               
            
        } 
            grilleJeu.afficherGrilleSurConsole();
             break;
    }
           


     
            if(joueurCourant == ListeJoueurs[0]){ //gestion des changement de tours
                joueurCourant = ListeJoueurs[1];
                System.out.println(" ");
                System.out.println(" c'est au tour de "+joueurCourant.nom);
            }else{
                System.out.println(" ");
                joueurCourant = ListeJoueurs[0];
                System.out.println(" c'est au tour de "+joueurCourant.nom);
            }
     if (grilleJeu.etreGagnantePourJoueur(joueurCourant) == true){
         System.out.println( "c'est "+ joueurCourant.nom+"qui a gagné");
     }
 }
    
 }    
 
 

 public void attribuerCouleursAuxJoueurs(){
    Random alea = new Random(); // attribution des joueurs au hasard
    boolean ChoixJoueur;// on initialise une variable aléatoire qui va nous aider a déterminer les couelurs des joueurs
    ChoixJoueur = alea.nextBoolean();// on génère un boolean aléatoire
    if (ChoixJoueur == true){
        ListeJoueurs[0].couleur = "Jaune";// le joueur 1 est en jaune 
        ListeJoueurs[1].couleur = "Rouge";// le joueur 2 est en rouge
    }
    else {
        ListeJoueurs[0].couleur = "Rouge";// le joueur 1 est en rouge 
        ListeJoueurs[1].couleur = "Jaune";// le joueur 2 est en jaune 
    }
    
     
 }  
}
 

