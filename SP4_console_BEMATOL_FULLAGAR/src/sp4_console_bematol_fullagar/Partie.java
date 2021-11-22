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
   
     // on affecte les valeurs du tableau a chacun des deux joueurs
  
 }
 
 public void initialiserPartie(){
     grilleJeu.viderGrille();// on vide la grille pour recommencer une partie
     // on cherche maintenant a initialiser les deux joueurs
    //grilleJeu[][] grillejeu = new grilleJeu[][];
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
     
        
 
    
    
    
    
    // on place un trou noir 
 // on génère aléatoirement des coordonnées pour placer les trous noirs 

    for (int cmpt=0; cmpt<5; cmpt++){
    int i = (int) (Math.random() * 5);// lignes  
    int j = (int)(Math.random() * 6);//colonnes
    grilleJeu.placerTrouNoir(i,j);
}
    
    
    // on place 3 désintégrateurs aléatoirement
    // on génère aléatoirement des coordonnées pour placer les désintégrateurs
 for (int cpt=0; cpt<3; cpt++){
    int i = (int) (Math.random() * 5);// lignes  
    int j = (int)(Math.random() * 6);//colonnes
    grilleJeu.placerDesintegrateur(i,j);
    
}   
    
 //on place le désintégrateur
int ct=0;

 while (ct<2){

int i = (int) (Math.random() * 5);// lignes  
int j = (int)(Math.random() * 6);//colonnes
if( grilleJeu.CellulesJeu[i][j].trouNoir==true){
       grilleJeu.placerDesintegrateur(i,j);
        ct+=1;
    }
}
}

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

                case 1:

        System.out.println("Choisir colonne de 0 a 6");
        int ChoixC = sc.nextInt(); //bien repérer sur tableau de 0 à 6 avec 7 cases

        while (ChoixC <0 || ChoixC >6){ // verifie si sort de la grille
            System.out.println("Colonne invalide. Réessayer.");
            ChoixC = sc.nextInt();
        }

        if (grilleJeu.colonneRemplie(ChoixC) == true){ //verifie si tout les espace de jeton sont deja pris
            System.out.println("Colonne remplie. Réessayer.");
            ChoixC = sc.nextInt();

    }

        // recupere 1 jeton de sa liste
       
        Jeton Jetonj = joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];
        joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1] = null; // affecte la case du jeton comme utilise
        joueurCourant.nombreJetonsRestants -- ; // desindente le nombre de jeton restant
        grilleJeu.ajouterJetonDansColonne(Jetonj , ChoixC);

        grilleJeu.afficherGrilleSurConsole();
       
        // gestion des trous noir
       
        /*if(grilleJeu.CellulesJeu[][ChoixC].presenceTrouNoir() ==true);
        
        
        if(grilleJeu.presenceTrouNoir() ==true){
           CellulesJeu.jetonCourant.activerTrouNoir();
           grilleJeu.afficherGrilleSurConsole();
           */
        
       

        case 2:
            System.out.println("Veuillez saisir les coordonnées du jeton a désintégrer :");
            System.out.println("saisir la ligne du jeton a desintegrer");
            int ligne = sc.nextInt(); 
            while (ligne > 5 || ligne < 0) {
    System.out.println("Erreur: veuillez saisir une ligne valide:");
    
           }
            System.out.println("saisir la colonne du jeton a desintegrer");
            int colonne = sc.nextInt(); 
            while (colonne > 5 || colonne < 0) {
    System.out.println("Erreur: veuillez saisir une ligne valide:");
    
}

            grilleJeu.supprimerJeton(ligne, colonne);
            grilleJeu.recupererJeton(ligne, colonne);
            grilleJeu.tasserGrille(colonne);
           if(grilleJeu.etreGagnantePourJoueur(joueurCourant) == true){// codition si ca gagne ou pas ?? genre en mode le joueur qui a recup fait un puissance 4 pour adversaire bah il perd
            
           
           }  
               
           
         
            
        case 3:
        //if(joueurCourant.nombreDesintegrateurs==0){
                    //return false;
           //}
           // condition le joueur doit avoir un desintegrateur ya pas de methode qui correspond !!!!!!!!!!!!!!
            System.out.println("saisir la ligne du jeton a récuperer");
            int line = sc.nextInt();
            System.out.println("saisir la colonne du jeton a récuperer");
            int colon = sc.nextInt();
            grilleJeu.supprimerJeton(line, colon);
            //joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants+1];
            
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
 

