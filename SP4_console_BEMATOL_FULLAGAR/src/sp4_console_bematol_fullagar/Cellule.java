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
            jetonCourant = unJeton; // pour affecter un jeton
            System.out.println("Jeton affecté");
            return true;
        }
        else {
          System.out.println("Un jeton est déjà présent"); 
          return false;
        }
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
        if (trouNoir == false ){// pas de trou noir 
            //System.out.println("Trou Noir présent");
            return false;
          
      }else {
          //System.out.println("Trou Noir absent");  
          return true;// il y aun trou noir 
      }
    }
    public boolean presenceDesintegrateur(){
        if (desintegrateur==true){ //il y a un désintégrateur 
            return true; 
        }else{
            return false; // pas de désintégrateur 
        }
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
        return true;  //le désintégrateur a été enelevé
    }else{
         return false;// il n'y avait pas de désintégrateur 
    }
    }
    
    public boolean activerTrouNoir(){
        // si il y a un trou noir alors vide la cellule et fait disparaitre le trou noir, sinon ne fait rien
       if(trouNoir = true){ // présence d'un trou noir 
        jetonCourant=null; // on enlève le jeton
        trouNoir = false; // disparition du Trou Noir
        return true;  
    }else{
        return false;
    } 
    }
            
}
