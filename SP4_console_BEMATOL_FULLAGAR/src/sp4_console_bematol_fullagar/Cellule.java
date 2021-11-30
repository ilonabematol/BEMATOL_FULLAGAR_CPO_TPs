/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bematol_fullagar;

/**
 *
 * @author ilonabematol
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule(){
        
            jetonCourant= null;// reference vers sun jeton qui occupe la cellule
            trouNoir = false ;
            desintegrateur = false ;
            
    }
    public boolean affecterJeton(Jeton unJeton){
         // renvoie true si le jeton a bien été affecte au joueur, false sinon
         if (jetonCourant == null){ // vérifie que case soit vide
            jetonCourant = unJeton;
            activerTrouNoir();
            
            return true;
        }
         if(presenceDesintegrateur()== true){
             recupererDesintegrateur();
             
         }
        else {
          System.out.println("Un jeton est déjà présent"); 
          return false;
        }
        return false;
    }
    
    public Jeton recupererJeton(){
        Jeton jetonRetour = jetonCourant; // on détermine quel jeton on veut récupérer
        jetonCourant = null; // on réintialise la vide, maintenant vide puisque jeton récupéré
            return jetonRetour ; // on renvoie le jeton récupéré
    }
    public boolean supprimerJeton(){
         // renvoie false si la case est déjà vide, true sinon(le jeton aura bien été suprimé)
         if (jetonCourant== null){// pas de jeton 
           return false;  
         }else{
             jetonCourant=null;// le jeton est supprimé 
             return true;
         }
         
     }
    public boolean placerTrouNoir(){
      //ajouter un trou noir
      if (trouNoir==false){// pas de trou noir on peut le placer
          trouNoir = true;// on place le trou noir 
          //System.out.println("Ajout de Trou Noir effectué");
          return true;
      }else{
          return false;// il y a deja un trou noir
      }
      
    }
    public boolean placerDesintegrateur(){
        if ( desintegrateur==false){// pas de désintégrateur la place est libre 
            desintegrateur=true;//on place le désintégrateur 
            return true;
        }else{
            return false; // il y avait déjà un désintégrateur 
        } 
        
    }
    
    public boolean presenceTrouNoir(){
      return trouNoir;// renvoi true ou false suivant la valeur du désintégrateur 
    }
    public boolean presenceDesintegrateur(){
        return desintegrateur; // renvoie true ou false suivant la valeur du désintégrateur
    }
    
    public String lireCouleurDuJeton(){
        if(jetonCourant != null ){
            return jetonCourant.Couleur;// renvoie la couleur du jeton
            
        }else {
            return "Cellule vide";//pas de couleur dans la case 
        }
        
        
    }
    public boolean recupererDesintegrateur (){
        // si il y a un desintegrateur, le supprime et renvoie true, sinon renvoie false et ne fait rien
        if(desintegrateur =! false){// il y a un désintégrateur
        desintegrateur = false;//on enlève le désintégrateur
        System.out.println("desintegrateur recupere");
        return true;  //le désintégrateur a été enelevé
    }else{
         return false;// il n'y avait pas de désintégrateur 
    }
    }
    
    public boolean activerTrouNoir(){
        // si il y a un trou noir alors vide la cellule et fait disparaitre le trou noir, sinon ne fait rien
       if(presenceTrouNoir() == true){ // présence d'un trou noir 
           trouNoir = false; // disparition du Trou Noir
        jetonCourant=null; // on enlève le jeton
       
        System.out.println("votre pion s'est aspirer dans le trou noir ");
        return true;  
    }else{
        return false;
    } 
    }
            
}
