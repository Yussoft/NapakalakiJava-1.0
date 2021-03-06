package GUI;

import NapakalakiGame.Treasure;
import java.awt.Color;

/**
 *
 * @author Diego & Jesus
 */
public class TreasureView extends javax.swing.JPanel {

    private Treasure treasureModel;
    private boolean selected; 

    public void setTreasure(Treasure t) {
        treasureModel = t;
        name.setText(treasureModel.getName());
        coins.setText(Integer.toString(treasureModel.getGoldCoins()));
        minBonus.setText(Integer.toString(treasureModel.getMinBonus()));
        maxBonus.setText(Integer.toString(treasureModel.getMaxBonus()));
        type.setText(treasureModel.getType().toString());
        repaint();
    }
    
    public Treasure getTreasure(){
        return treasureModel;
    }
    
    public Boolean isSelected(){
        return selected;
    }

    public TreasureView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        minBonus = new javax.swing.JLabel();
        maxBonus = new javax.swing.JLabel();
        coins = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        name.setText("Nombre Tesoro");

        minBonus.setText("Min");

        maxBonus.setText("Max");

        coins.setText("Monedas");

        type.setText("Tipo Tesoro");

        jLabel2.setText("/");

        jLabel3.setText("Tipo:");

        jLabel4.setText("monedas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minBonus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxBonus)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coins)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minBonus)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(maxBonus))
                .addGap(1, 1, 1)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(coins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(type))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        setBackground(Color.red);
        if(!selected){
            setOpaque(true);
            selected = true;
        }
        else{
            setOpaque(false);
            selected = false;
        }
        
        repaint();        
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coins;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel maxBonus;
    private javax.swing.JLabel minBonus;
    private javax.swing.JLabel name;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
