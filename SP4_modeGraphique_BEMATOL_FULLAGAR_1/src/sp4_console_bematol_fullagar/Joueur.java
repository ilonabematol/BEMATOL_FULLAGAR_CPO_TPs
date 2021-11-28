/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bematol_fullagar;

/**
 *
 * @author ilonabematol
 */
public class Joueur {
   String nom;
   String couleur;
   Jeton ListeJetons []= new Jeton[21] ;
    int nombreJetonsRestants;
    int nombreDesintegrateurs;
public Joueur(String nomJoueur) {
    nom=nomJoueur;
    
    // dans le main
    //Scanner scanner = new Scanner(System.in);
    //System.out.println("Entrer votre nom: ");
    //String nom = Scanner.nextString();
    //System.out.println(nom);

}

    public void affecterCouleur(String couleurJoueur){
        couleurJoueur=couleur;
    }
    public boolean ajouterJeton(Jeton ajoutJeton){
        for(int i=0; i<21; i++ ){ //Parcours la site pour voir si un jeton est deja placé
            if(ListeJetons [i] == null){
                ListeJetons [i] = ajoutJeton;
                nombreJetonsRestants++;
                return true;// le jeton a été placé
  
    } 
    }   
       return false;
    }   
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs +=1;
    }

    public boolean utiliserDesintegrateur(){

        if (nombreDesintegrateurs == 0){
            return false; // retourne faux si ya plus de desintegrateur
        }else{
               nombreDesintegrateurs -= 1;
        }
        return true; //confirme l'utilisation

    }
    Jeton retirerJeton(){
        nombreJetonsRestants = nombreJetonsRestants-1;
        return ListeJetons[nombreJetonsRestants];
    }

}

