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
 Grille grilleJeu; // création de la référence objet grilleJeu
 
 
 Partie(Joueur Joueur1, Joueur Joueur2){
   
     // on affecte les valeurs du tableau a chacun des deux joueurs
    ListeJoueurs[0]=Joueur1;
    ListeJoueurs[1]=Joueur2;
     
 }
 
 public void initialiserPartie(){
     grilleJeu.viderGrille();// on vide la grille pour recommencer une partie
     // on cherche maintenant a initialiser les deux joueurs
    Grille[][] grillejeu = new Grille[][];
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le nom du Joueur 1 : ");
    Joueur Joueur1 = new Joueur(sc.nextLine()); // création des deux objets joueur
    System.out.println("Entrez le nom du Joueur 2 : "); 
    Joueur Joueur2 = new Joueur(sc.nextLine()); 
 
    attribuerCouleursAuxJoueurs();
    
    System.out.println(Joueur1.nom + " possède les jetons de couleur " + Joueur1.couleur);
    System.out.println(Joueur2.nom + " possède les jetons de couleur " + Joueur2.couleur);
    
    // on cherche mainenant a savoir qui va commencer
    // on assimile les couleurs aléatoirement 
    Random alea = new Random();
    boolean R;
    R= alea.nextBoolean();
    if( R==true ){
        if (Joueur1.couleur=="Rouge"){
            
        }else{
            System.out.println( Joueur2.couleur + " commence");
        }
     
        }
    
    /*for (int i=0; i<21; i++){ // on crée les jetons et on les affecte dans le tableau en les ajoutant
        Jeton Jeton1 = new Jeton(Joueur1.couleur);
        Joueur1.ajouterJeton(Jeton1);
        Jeton Jeton2 = new Jeton(Joueur2.couleur);
        Joueur2.ajouterJeton(Jeton2);*/
    
    
    
    
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
    
 // on place le désintégrateur 
 // 
for ( int cptd =0; cptd<2; cptd++) {
    int i = (int) (Math.random() * 5);// lignes  
    int j = (int)(Math.random() * 6);//colonnes
    
    if( grilleJeu.CellulesJeu[i][j].trouNoir==true){
        grilleJeu.placerDesintegrateur(i,j);
    }
}
 
    
 }

 
   
   
    
 
 
 public void debuterPartie(){
   
    
     
     
     
     
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
