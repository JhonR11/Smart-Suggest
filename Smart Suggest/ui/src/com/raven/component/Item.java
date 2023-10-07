
package com.raven.component;

import com.raven.model.ModelItem;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Item extends javax.swing.JPanel {

   private boolean selected;

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
  
    public Item() {
        initComponents();
        setOpaque(false);
    }

    private ModelItem data;
    public void setData(ModelItem data){
        this.data=data;
    }
    
    public void paint (Graphics grphcs){
         Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color (242,242,242));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        g2.dispose();
        super.paint(grphcs);   
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDescripcion = new javax.swing.JLabel();
        lbItemName = new javax.swing.JLabel();
        pic = new com.raven.swing.PictureBox();
        lbBrand = new javax.swing.JLabel();
        lbPrice1 = new javax.swing.JLabel();

        lbDescripcion.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        lbDescripcion.setForeground(new java.awt.Color(125, 125, 125));
        lbDescripcion.setText("Nombre Item");

        lbItemName.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lbItemName.setText("Nombre Item");

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/raven/images/4080.png"))); // NOI18N

        lbBrand.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        lbBrand.setForeground(new java.awt.Color(108, 108, 108));
        lbBrand.setText("Brand");

        lbPrice1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lbPrice1.setText("$0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbItemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbBrand;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbItemName;
    private javax.swing.JLabel lbPrice1;
    private com.raven.swing.PictureBox pic;
    // End of variables declaration//GEN-END:variables
}
