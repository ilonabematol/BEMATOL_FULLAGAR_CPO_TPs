/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_bematol_fullagar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ilonabematol
 */
public class fenetreDejeu extends javax.swing.JFrame {

 Joueur ListeJoueurs[]= new Joueur[2];// liste de 2 d'objet joueur à 2 cases
 Joueur joueurCourant;
 Grille grilleJeu = new Grille(); // création de la référence objet grilleJeu
    public fenetreDejeu() {
        
        initComponents();
        
        panneau_infos_joueurs.setVisible(false);
        panneau_infos_partie.setVisible(false);
        
        for(int i=5;i>=0;i-- ){
            for (int j=0 ; j<7 ; j++){
                CelluleGraphique cellgraph= new CelluleGraphique(grilleJeu.CellulesJeu[i][j]);//définissent le bouton
                 cellgraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellgraph.celluleAssociee;// c est la cellule associée au bouton sur lequel on est en train de cliquer 
                        if(c.jetonCourant == null){
                            return;//arret de la méthode
                        }
                        if(c.jetonCourant.Couleur == null ? joueurCourant.couleur == null : c.jetonCourant.Couleur.equals(joueurCourant.couleur)){
                         
                            textemessage.setText("le joueur " + joueurCourant.nom + " récupère un de ses jetons");
                            Jeton j_recup = c.recupererJeton();
                            joueurCourant.ajouterJeton(j_recup);
                            JoueurSuivant();
                            
                        }
                        else{
                            if ( joueurCourant.nombreDesintegrateurs>0){
                                textemessage.setText("le joueur " + joueurCourant.nom + " désintégre un jeton");
                                c.supprimerJeton();
                                joueurCourant.utiliserDesintegrateur();
                                JoueurSuivant();
                            }else return;
                            
                        }
                        grilleJeu.tasserGrille();
                        lbl_j1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs+"");
                        lbl_j2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs+"");


                        boolean vict_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]);
                        boolean vict_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]);

                        if(vict_j1 && !vict_j2) textemessage.setText("Victoire de " + ListeJoueurs[0].nom);
                        if(vict_j2 && !vict_j1) textemessage.setText("Victoire de " + ListeJoueurs[1].nom);

                        if(vict_j2 && vict_j1) {
                            if(joueurCourant == ListeJoueurs[0])textemessage.setText("Victoire de " + ListeJoueurs[1].nom + " (faute de jeu de l'autre joueur)");
                            else textemessage.setText("Victoire de " + ListeJoueurs[0].nom + " (faute de jeu de l'autre joueur)");

                        }
                                    }
            });
                
                panneau_grille.add(cellgraph);
                
                
            }
        }
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_infos_partie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        textemessage = new javax.swing.JTextArea();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_infos_joueurs = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panneau_infos_joueurs1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panneau_infos_joueurs2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panneau_infos_joueurs3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btn_col_6 = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 672, 576));

        panneau_infos_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_infos_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("infos jeu ");
        panneau_infos_partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        lbl_jcourant.setText("nomJoueur");
        panneau_infos_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, 20));

        jLabel39.setText("joueurCourant");
        panneau_infos_partie.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        textemessage.setColumns(20);
        textemessage.setRows(5);
        message.setViewportView(textemessage);

        panneau_infos_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 80));

        getContentPane().add(panneau_infos_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 240, 210));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2:");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setText("Nom Joueur 1:");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, -1));

        nom_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur2ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, -1));

        btn_start.setText("Démarrer partie ");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 240, 100));

        panneau_infos_joueurs.setBackground(new java.awt.Color(204, 255, 204));
        panneau_infos_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("désintégrateurs:");
        panneau_infos_joueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lbl_j2_desint.setText("nbdesintjoueur2");
        panneau_infos_joueurs.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel6.setText("couleur:");
        panneau_infos_joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel7.setText("joueur 2:");
        panneau_infos_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        lbl_j2_nom.setText("nomJoueur2");
        panneau_infos_joueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        lbl_j2_couleur.setText("CouleurJoueur2");
        panneau_infos_joueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 20));
        panneau_infos_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, -1));

        panneau_infos_joueurs1.setBackground(new java.awt.Color(204, 255, 204));
        panneau_infos_joueurs1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("infos joueur");
        panneau_infos_joueurs1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel11.setText("désintégrateurs:");
        panneau_infos_joueurs1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel12.setText("nbdesintjoueur1");
        panneau_infos_joueurs1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel13.setText("couleur:");
        panneau_infos_joueurs1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel14.setText("joueur 1:");
        panneau_infos_joueurs1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel15.setText("nomJoueur1");
        panneau_infos_joueurs1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel16.setText("CouleurJoueur1");
        panneau_infos_joueurs1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));
        panneau_infos_joueurs1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, -1));

        panneau_infos_joueurs.add(panneau_infos_joueurs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 240, 180));

        panneau_infos_joueurs2.setBackground(new java.awt.Color(204, 255, 204));
        panneau_infos_joueurs2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel17.setText("infos joueur");
        panneau_infos_joueurs2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel18.setText("désintégrateurs:");
        panneau_infos_joueurs2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel19.setText("nbdesintjoueur1");
        panneau_infos_joueurs2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel20.setText("couleur:");
        panneau_infos_joueurs2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel21.setText("joueur 1:");
        panneau_infos_joueurs2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel22.setText("nomJoueur1");
        panneau_infos_joueurs2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel23.setText("CouleurJoueur1");
        panneau_infos_joueurs2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));
        panneau_infos_joueurs2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, -1));

        panneau_infos_joueurs3.setBackground(new java.awt.Color(204, 255, 204));
        panneau_infos_joueurs3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel24.setText("infos joueur");
        panneau_infos_joueurs3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel25.setText("désintégrateurs:");
        panneau_infos_joueurs3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel26.setText("nbdesintjoueur1");
        panneau_infos_joueurs3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel27.setText("couleur:");
        panneau_infos_joueurs3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel28.setText("joueur 1:");
        panneau_infos_joueurs3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel29.setText("nomJoueur1");
        panneau_infos_joueurs3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel30.setText("CouleurJoueur1");
        panneau_infos_joueurs3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));
        panneau_infos_joueurs3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, -1));

        panneau_infos_joueurs2.add(panneau_infos_joueurs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 240, 180));

        panneau_infos_joueurs.add(panneau_infos_joueurs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 240, 180));

        jLabel31.setText("joueur 1:");
        panneau_infos_joueurs.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        jLabel32.setText("couleur:");
        panneau_infos_joueurs.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel33.setText("désintégrateurs:");
        panneau_infos_joueurs.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lbl_j1_nom.setText("nomJoueur1");
        panneau_infos_joueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        lbl_j1_couleur.setText("CouleurJoueur1");
        panneau_infos_joueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 20));

        lbl_j1_desint.setText("nbdesintjoueur1");
        panneau_infos_joueurs.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel38.setText("infos joueur");
        panneau_infos_joueurs.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        getContentPane().add(panneau_infos_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 240, 180));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 10, -1, -1));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 10, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 10, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 10, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 10, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        setBounds(0, 0, 1039, 692);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur2ActionPerformed
 
    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_infos_joueurs.setVisible(true);
        panneau_infos_partie.setVisible(true);
        initialiserPartie();
        
        panneau_grille.repaint();// on rafraichis la grille afin que les images s'affiche dès le debut 
        btn_start.setEnabled(false);//pour ne pas que l'on recommence toujours une partie - désactive le bouton
        
        
        
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(1);
        if(grilleJeu.colonneRemplie(1) == true){
            btn_col_0.setEnabled(false);
            
        }
        JoueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(2);
        if(grilleJeu.colonneRemplie(2) == true){
            btn_col_1.setEnabled(false);
            
        }
        JoueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(3);
        if(grilleJeu.colonneRemplie(3) == true){
            btn_col_2.setEnabled(false);
            
        }
        JoueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(4);
        if(grilleJeu.colonneRemplie(4) == true){
            btn_col_3.setEnabled(false);
            
        }
        JoueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(5);
        if(grilleJeu.colonneRemplie(5) == true){
            btn_col_4.setEnabled(false);
            
        }
        JoueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(6);
        if(grilleJeu.colonneRemplie(6) == true){
            btn_col_5.setEnabled(false);
            
        }
        JoueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(7);
        if(grilleJeu.colonneRemplie(7) == true){
            btn_col_6.setEnabled(false);
            
        }
        JoueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed
    public void JoueurSuivant(){
        if(joueurCourant == ListeJoueurs [0]){
            joueurCourant= ListeJoueurs [1];
            
        }else{
            joueurCourant= ListeJoueurs [0];
            
            
        }
        lbl_jcourant.setText(joueurCourant.nom);
    }
    
    public boolean jouerDansColonne( int indice_colonne){
      
      
        boolean resultatAction = grilleJeu.ajouterJetonDansColonne(joueurCourant, indice_colonne);
        panneau_grille.repaint();
        lbl_j1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs+"");
        lbl_j2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs+"");
        
        
        boolean vict_j1 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]);
        boolean vict_j2 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]);
        
        if(vict_j1 && !vict_j2) textemessage.setText("Victoire de " + ListeJoueurs[0].nom);
        if(vict_j2 && !vict_j1) textemessage.setText("Victoire de " + ListeJoueurs[1].nom);
        
        if(vict_j2 && vict_j1) {
            if(joueurCourant == ListeJoueurs[0])textemessage.setText("Victoire de " + ListeJoueurs[1].nom + " (faute de jeu de l'autre joueur)");
            else textemessage.setText("Victoire de " + ListeJoueurs[0].nom + " (faute de jeu de l'autre joueur)");
            
        }
        if (resultatAction==true) return true;
        else return false;

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDejeu().setVisible(true);
                
        }});
     }
  
    
    public void initialiserPartie(){
     grilleJeu.viderGrille();// on vide la grille pour recommencer une partie
     // on cherche maintenant a initialiser les deux joueurs
    //grilleJeu[][] grillejeu = new grilleJeu[][];
    String nomJoueur1=nom_joueur1.getText();
    Joueur Joueur1 = new Joueur(nomJoueur1); // création des deux objets joueur
    String nomJoueur2=nom_joueur2.getText();
    Joueur Joueur2 = new Joueur(nomJoueur2);
        
    ListeJoueurs[0]=Joueur1;
    ListeJoueurs[1]=Joueur2;
    
    
    attribuerCouleursAuxJoueurs();
    
    System.out.println(Joueur1.nom + " possède les jetons de couleur " + Joueur1.couleur);
    System.out.println(Joueur2.nom + " possède les jetons de couleur " + Joueur2.couleur);
    
    lbl_j1_nom.setText(nomJoueur1);
    lbl_j2_nom.setText(nomJoueur2);
    lbl_j1_couleur.setText(Joueur1.couleur);
    lbl_j2_couleur.setText(Joueur2.couleur);
    lbl_j1_desint.setText(Joueur1.nombreDesintegrateurs+"");
    lbl_j2_desint.setText(Joueur2.nombreDesintegrateurs+"");
            
            
    //on donne les 21 jetons aux joueurs
    for(int i=0; i<21 ; i++ ){
        Jeton JetonR = new Jeton("Rouge");// création des 21 jetons 
        ListeJoueurs[0].ajouterJeton(JetonR);// affecte a chaque joueur ses 21 jeotn avce la couleur correspondante
        Jeton JetonJ = new Jeton("Jaune");
        //ListeJoueurs[1].ListeJetons[i]=JetonJ;
        ListeJoueurs[1].ajouterJeton(JetonJ);
    }
    
    
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
    
   lbl_jcourant.setText(joueurCourant.nom);

    
    
    // on place 3 désintégrateurs aléatoirement
    // on génère aléatoirement des coordonnées pour placer les désintégrateurs
 for (int cpt=0; cpt<3; cpt++){
    int i = (int) (Math.random() * 6);// lignes  
    int j = (int)(Math.random() * 7);//colonnes
    if (!grilleJeu.placerDesintegrateur(i, j) || grilleJeu.CellulesJeu[i][j].presenceTrouNoir()) {
                i--;
            }
    
}   
    
 //Génération des 5 trous noirs et de 2 désintégrateurs sur les trous noirs
 Random position = new Random();
        int compteur = 0;
        for (int i = 0; i < 5; i++) {
            int lig = position.nextInt(6);
            int col = position.nextInt(7);
            if (compteur < 2) {
                if (!grilleJeu.placerDesintegrateur(lig, col)) {
                    compteur--;
                }
                compteur++;
            }
            if (!grilleJeu.placerTrouNoir(lig, col)) {
                i--;
            }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_infos_joueurs;
    private javax.swing.JPanel panneau_infos_joueurs1;
    private javax.swing.JPanel panneau_infos_joueurs2;
    private javax.swing.JPanel panneau_infos_joueurs3;
    private javax.swing.JPanel panneau_infos_partie;
    private javax.swing.JTextArea textemessage;
    // End of variables declaration//GEN-END:variables
}
