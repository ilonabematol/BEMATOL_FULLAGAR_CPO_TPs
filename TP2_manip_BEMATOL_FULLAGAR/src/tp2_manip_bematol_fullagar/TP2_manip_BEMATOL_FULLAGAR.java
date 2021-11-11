/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_bematol_fullagar;

import java.util.Arrays;

/**
 *
 * @author ilonabematol
 */
public class TP2_manip_BEMATOL_FULLAGAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2 ;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        /* Q4) seules 2 tartiflettes on ete crees car assiete 1 et 2 référencent la meme tartiflette
        en effet en incrementant l'assiette 2 on remaque que les calories sont les memes dans les 2 tartiflettes*/
       
        /* Q6)une référence objet qui annonce référencer un type d’objet
peut-elle en référencer un autre qui n’a aucun rapport ? */
       
        //Moussaka assiette666 = assiette1 ; // une tartiflette ne peut se transformer en moussaka
        // les elements d'une classe ne peuvent s'interchanger
       
        /*Moussaka assiette667 = new Tartiflette() ;
        System.out.println("nb de calories de Assiette666 : " +
        assiette667.nbCalories) ;
       
     
       
       Une référence objet qui annonce référencer un type d’objet ne peut en référencer un autre qui n’a aucun rapport ? mieux repondre !!!*/
       
        //Q7)
        Moussaka[]TabMouss = new Moussaka[10]; //creation du tableau moussaka
   
        for (int i=0; i<10;i++){
            TabMouss[i]= new Moussaka(i);
           
        }
       
        System.out.println("TabMouss" + Arrays.toString(TabMouss)); //affiche le tableau Arrays permet de convertir le tableau pour pouvoir l'afficher
       
    }
   
    }
    

