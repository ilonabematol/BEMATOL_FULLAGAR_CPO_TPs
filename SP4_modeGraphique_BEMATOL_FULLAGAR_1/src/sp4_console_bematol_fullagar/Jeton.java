/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_bematol_fullagar;

/**
 *
 * @author ilonabematol
 */
public class Jeton {
  
    String Couleur;
    


public Jeton(String couleur){
    Couleur = couleur;
}

public String lireCouleur(){
    return Couleur;
}


@Override
public String toString(){
    if ("Rouge".equals(Couleur))
        return "\u001B[31m O";//affiche le jeton en rouge
    return "\u001B[33m O";// l'affiche en jaune 
}
}
