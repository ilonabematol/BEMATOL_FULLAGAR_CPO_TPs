/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_bematol_fullagar;

import java.util.Random;
import java.util.Scanner;

// TP1
// BEMATOL FULLAGAR
//04//10/2021
public class TP1_guessMyNumber_BEMATOL_FULLAGAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random generateurAleat = new Random();
        
        for (   int n=0 ; n<=5; n++){
            int m = generateurAleat.nextInt(100);
            System.out.println(m);
        }
       
        
        int nbaleaordi= generateurAleat.nextInt(100);
        int niveau;
      
        Scanner sc = new Scanner( System.in);
        
        System.out.println("""
                           choisissez le niveau du jeu :
                            1)facile
                            2)normal
                            3)difficile""");
        niveau = sc.nextInt();
        
        
        switch( niveau ){ 
            case 1 -> {
                System.out.println("saisissez un nombre aleatoire entre 0 et 20");
            int nbaleautilisateur =sc.nextInt();
            while ( nbaleautilisateur< 0|| nbaleautilisateur > 100  ) { 
                System.out.println( " error i need a number between 0 and 20 !");
                System.exit(0);
            }
            //boolean False;
            int compteur=20;

            while ( compteur>0  ){
              if (nbaleaordi < nbaleautilisateur){
                System.out.println("trop grand");
                compteur-=1;

            } else if (nbaleaordi > nbaleautilisateur){
                System.out.println("trop petit");
                compteur-=1;
            } else if (nbaleaordi == nbaleautilisateur){
                System.out.println("gagne, vous avez fait " + compteur + "tentatives");
                System.exit(0);
        }
         
      } 
            }
         case 2 -> {
         System.out.println("saisissez un nombre aleatoire entre 0 et 50 ");
            int nbaleautilisateur =sc.nextInt();
            while ( nbaleautilisateur< 0|| nbaleautilisateur > 50 ) { 
                System.out.println( " error i need a number between 0 and 50 !");
                System.exit(0);
            }
            //boolean False;
            int compteur=10;
           
            while ( compteur > 0 ){
              if (nbaleaordi < nbaleautilisateur){
                  if ( nbaleautilisateur-nbaleaordi > 15){
                    System.out.println("beaucoup trop grand");
                    compteur-=1;  
                  }else{
                      System.out.println(" trop grand");
                    compteur-=1;
                  }
              
     
            }  if (nbaleaordi > nbaleautilisateur){
                if ( 15 <=nbaleaordi - nbaleautilisateur){
                    System.out.println(" beaucoup trop petit");
                    compteur-=1;
                } else {
                    System.out.println(" trop petit");
                    compteur-=1;
                }
                
            }
                
            } if  (nbaleaordi == nbaleautilisateur){
                System.out.println("gagne, vous avez fait " + compteur + "tentatives");
                System.exit(0);
        }
            }   
         }
       case 3 -> {
         System.out.println("saisissez un nombre aleatoire entre 0 et 70");
            int nbaleautilisateur =sc.nextInt();
            while ( nbaleautilisateur< 0|| nbaleautilisateur > 70  ) { 
                System.out.println( " error i need a number between 0 and 70 !");
                System.exit(0);
            }
            //boolean False;
            int compteur=15;

            while ( compteur>0 ){
              if (nbaleaordi < nbaleautilisateur){
                System.out.println("trop grand");
                compteur+=1;

            } else if (nbaleaordi > nbaleautilisateur){
                System.out.println("trop petit");
                compteur+=1;
            } else if (nbaleaordi == nbaleautilisateur){
                System.out.println("gagne, vous avez fait moins de 5 tentatives");
                System.exit(0);
        }
              System.out.println("dommage c'est perdu vous avez dépassez le nombre de tentatives");
            }   
         }  
         
 }
                
            
            
