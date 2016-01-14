/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import napakalaki.Player;

/**
 *
 * @author juanmfajardo
 */
public class PlayerView extends javax.swing.JPanel {
    private Player playerModel;
    /**
     * Creates new form PlayerView
     */
    public PlayerView() {
        initComponents();
    }
    
    private void setPlayer(Player unPlayer){
        playerModel = unPlayer;
        
        LabelName.setText(playerModel.getName());
        LabelLevel.setText(Integer.toString(playerModel.getLevels()));
        LabelDead.setText(Boolean.toString(playerModel.isDead()));
        LabelCanISteal.setText(Boolean.toString(playerModel.canISteal()));
        //Hemos cambiado protected a public -> player linea 65
        LabelEnemy.setText(playerModel.getEnemy().getName());
        
        //LabelPendingBadConsequence.setText();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelName = new javax.swing.JLabel();
        LabelLevel = new javax.swing.JLabel();
        LabelDead = new javax.swing.JLabel();
        LabelCanISteal = new javax.swing.JLabel();
        LabelEnemy = new javax.swing.JLabel();
        LabelPendingBadConsequence = new javax.swing.JLabel();
        LabelSectario = new javax.swing.JLabel();
        hiddenTreasures = new javax.swing.JPanel();
        visibleTreasures = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        LabelName.setText("Name");

        LabelLevel.setText("Level");

        LabelDead.setText("Dead");

        LabelCanISteal.setText("CanISteal");

        LabelEnemy.setText("Enemy");

        LabelPendingBadConsequence.setText("PendingBadConsequence");

        LabelSectario.setText("Sectario");

        hiddenTreasures.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 102)));

        visibleTreasures.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hiddenTreasures, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelPendingBadConsequence)
                                .addComponent(LabelEnemy)
                                .addComponent(LabelCanISteal)
                                .addComponent(LabelDead)
                                .addComponent(LabelLevel)
                                .addComponent(LabelName)))
                        .addContainerGap(212, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSectario))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelDead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelCanISteal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelEnemy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelPendingBadConsequence)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelSectario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hiddenTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(visibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCanISteal;
    private javax.swing.JLabel LabelDead;
    private javax.swing.JLabel LabelEnemy;
    private javax.swing.JLabel LabelLevel;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelPendingBadConsequence;
    private javax.swing.JLabel LabelSectario;
    private javax.swing.JPanel hiddenTreasures;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel visibleTreasures;
    // End of variables declaration//GEN-END:variables
}
