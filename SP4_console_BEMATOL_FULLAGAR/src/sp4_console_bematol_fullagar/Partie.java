/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bematol_fullagar;

import java.util.Scanner;

/**
 *
 * @author ilonabematol
 */
public class Partie {
 Joueur ListeJoueurs[]= new Joueur[2];// liste de 2 d'objet joueur à 2 cases
 Joueur joueurCourant;
 Grille grilleJeu; // création de la référence objet grilleJeu
 
 
 Partie(Joueur j1, Joueur j2){
     
 }
 
 public void initialiserPartie(){
     grilleJeu.viderGrille();// on vide la grille pour recommencer une partie
     // on cherche maintenant a initialiser les deux joueurs
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le nom du Joueur 1 : ");
    Joueur Joueur1 = new Joueur(sc.nextLine()); // création des deux objets joueur
    System.out.println("Entrez le nom du Joueur 2 : "); 
    Joueur Joueur2 = new Joueur(sc.nextLine()); 
    // on affecte les valeurs du tableau a chacun des deux joueurs
    ListeJoueurs[1]=Joueur1;
    ListeJoueurs[2]=Joueur2;
    System.out.println(Joueur1.nom + " possède les jetons de couleur " + Joueur1.couleur);
    System.out.println(Joueur2.nom + " possède les jetons de couleur " + Joueur2.couleur);
    
    
    
    for (int i=0; i<21; i++){ // on crée les jetons et on les affecte dans le tableau en les ajoutant
        Jeton unJeton = new Jeton(Joueur1.couleur);
        Joueur1.ajouterJeton(unJeton);
        Jeton unAutreJeton = new Jeton(Joueur2.couleur);
        Joueur2.ajouterJeton(unAutreJeton);
 }
    
    
    
    
 }
 
 public void debuterPartie(){
   
     
     
 }
 
 
 
 public void attribuerCouleursAuxJoueurs(){
    Random alea = new Random(); // attribution des joueurs au hasard
    boolean ChoixJoueur;// on initialise une variable aléatoire qui va nous aider a déterminer les couelurs des joueurs
    ChoixJoueur = alea.nextBoolean();// on génère un boolean aléatoire
    if (ChoixJoueur == true){
        ListeJoueurs[1].couleur = "Jaune";// le joueur 1 est en jaune 
        ListeJoueurs[2].couleur = "Rouge";// le joueur 2 est en rouge
    }
    else {
        ListeJoueurs[1].couleur = "Rouge";// le joueur 1 est en rouge 
        ListeJoueurs[2].couleur = "Jaune";// le joueur 2 est en jaune 
    }
    
     
     
 }
 
}
