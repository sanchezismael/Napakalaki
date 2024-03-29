/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import napakalaki.Monster;

/**
 *
 * @author juanmfajardo
 */
public class MonsterView extends javax.swing.JPanel {

    private Monster monsterModel;
    
    /**
     * Creates new form MonsterView
     */
    public MonsterView() {
        initComponents();
    }

    public void setMonster(Monster m){
        
        monsterModel = m;
        
//        LabelCombatLevel.setText(Integer.toString(monsterModel.getCombatLevelAgainstCultistPlayer()));
//        LabelName.setText(monsterModel.getName());
//        badConsequenceView1.setBadConsequence(monsterModel.getBadConsequence());
//        prizeView1.setPrize(monsterModel.getPrize());
        String iconName = "/GUI/Imagenes/"+monsterModel.getName()+".jpg";
        System.out.println(iconName);
        Icon icono = new ImageIcon(MonsterView.class.getResource(iconName));
        imagen.setIcon(icono);
        
        repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        imagen.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    // End of variables declaration//GEN-END:variables
}
