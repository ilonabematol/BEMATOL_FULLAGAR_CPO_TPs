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
                System.out.println("saisissez un nombre aleatoire entre 0 et 100");
            int nbaleautilisateur =sc.nextInt();
            while ( nbaleautilisateur< 0|| nbaleautilisateur > 100  ) { 
                System.out.println( " error i need a number between 0 and 100 !");
                System.exit(0);
            }
            boolean False;
            int compteur=0;

            while ( False ){
              if (nbaleaordi < nbaleautilisateur){
                System.out.println("trop grand");
                compteur+=1;

            } else if (nbaleaordi > nbaleautilisateur){
                System.out.println("trop petit");
                compteur+=1;
            } else if (nbaleaordi == nbaleautilisateur){
                System.out.println("gagne, vous avez fait " + compteur + "tentatives");
        }
         
      } 
            }
         case 2 -> {
         System.out.println("saisissez un nombre aleatoire entre 0 et 100");
            int nbaleautilisateur =sc.nextInt();
            while ( nbaleautilisateur< 0|| nbaleautilisateur > 100  ) { 
                System.out.println( " error i need a number between 0 and 100 !");
                System.exit(0);
            }
            //boolean False;
            int compteur=0;
           
            while ( compteur < 10 ){
              if (nbaleaordi < nbaleautilisateur){
                  if ( nbaleautilisateur-nbaleaordi > 30){
                    System.out.println("beaucoup trop grand");
                    compteur+=1;  
                  }else{
                      System.out.println(" trop grand");
                    compteur+=1;
                  }
              
     
            }  if (nbaleaordi > nbaleautilisateur){
                if ( nbaleaordi - nbaleautilisateur >30){
                    System.out.println(" beaucoup trop petit");
                    compteur+=1;
                } else {
                    System.out.println(" trop petit");
                    compteur+=1;
                }
                
            }
                
            } if  (nbaleaordi == nbaleautilisateur){
                System.out.println("gagne, vous avez fait " + compteur + "tentatives");
        }
            }   
         }
       case 3 -> {
         System.out.println("saisissez un nombre aleatoire entre 0 et 100");
            int nbaleautilisateur =sc.nextInt();
            while ( nbaleautilisateur< 0|| nbaleautilisateur > 100  ) { 
                System.out.println( " error i need a number between 0 and 100 !");
                System.exit(0);
            }
            //boolean False;
            int compteur=0;

            while ( compteur<5 ){
              if (nbaleaordi < nbaleautilisateur){
                System.out.println("trop grand");
                compteur+=1;

            } else if (nbaleaordi > nbaleautilisateur){
                System.out.println("trop petit");
                compteur+=1;
            } else if (nbaleaordi == nbaleautilisateur){
                System.out.println("gagne, vous avez fait moins de 5 tentatives");
        }
              System.out.println("dommage c'est perdu vous avez dépassez le nombre de tentatives");
            }   
         }  
         
 }
                
            
            
