package com.raven.main;

import com.raven.event.EventItem;
import com.raven.form.FormHome;
import com.raven.model.ModelItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

public class Main extends javax.swing.JFrame {

    private FormHome home;
    private Animator animator;
    private Point animatePoint;
    private ModelItem itemSelected;

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        init();
        //  Animator start form animatePoint to TagetPoint
        animator = PropertySetter.createAnimator(500, mainPanel, "imageLocation", animatePoint, mainPanel.getTargetLocation());
        animator.addTarget(new PropertySetter(mainPanel, "imageSize", new Dimension(180, 130), mainPanel.getTargetSize()));
        animator.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel.setImageOld(null);
            }
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
    }

    private void init() {
        home = new FormHome();
        winButton.initEvent(this, background1);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(home);
        testData();
    }

    private void testData() {
        home.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (itemSelected != null) {
                    mainPanel.setImageOld(itemSelected.getImage());
                }
                if (itemSelected != item) {
                    if (!animator.isRunning()) {
                        itemSelected = item;
                        animatePoint = getLocationOf(com);
                        mainPanel.setImage(item.getImage());
                        mainPanel.setImageLocation(animatePoint);
                        mainPanel.setImageSize(new Dimension(170, 130));
                        mainPanel.repaint();
                        home.setSelected(com);
                        home.showItem(item);
                        animator.start();
                    }
                }
            }
        });
        int ID = 1;
        for (int i = 0; i <= 5; i++) {
            home.addItem(new ModelItem(ID++, "RTX 4090", "RTX 4090 12GB RAM GDDR6", 1600, "MSI", new ImageIcon(getClass().getResource("/com/raven/image/img1.png"))));
            home.addItem(new ModelItem(ID++, "RTX 4080", "RTX 4080 16GB RAM GDDR6", 1200, "MSI", new ImageIcon(getClass().getResource("/com/raven/image/img2.png"))));
            home.addItem(new ModelItem(ID++, "RTX 3080", "RTX 3080 12GB RAM GDDR5", 1000, "AORUS", new ImageIcon(getClass().getResource("/com/raven/image/img3.png"))));
            home.addItem(new ModelItem(ID++, "GT 1030", "PODEROSA 1030, UNA BESTIA TAN BUENA COMO FEROZ, TAN AMOROSA COMO INSASIABLE DE PODER", 60, "GIGABYTE", new ImageIcon(getClass().getResource("/com/raven/image/img4.png"))));
            home.addItem(new ModelItem(ID++, "RTX 2060", "RTX 2060 12GB RAM GDDR5", 800, "PNY", new ImageIcon(getClass().getResource("/com/raven/image/img5.png"))));
            home.addItem(new ModelItem(ID++, "GTX 1060", "GTX 1060 6GB RAM GDDR5", 700, "GIGABYTE", new ImageIcon(getClass().getResource("/com/raven/image/img6.png"))));
             home.addItem(new ModelItem(ID++, "GTX 1080 FE", "GTX 1080 FOUNDERS EDITION 8GB RAM GDDR5", 750, "GIGABYTE", new ImageIcon(getClass().getResource("/com/raven/image/img7.png"))));
             home.addItem(new ModelItem(ID++, "RTX 2070 SP", "RTX 2070 SUPER 8GB RAM GDDR 6", 800, "GIGABYTE", new ImageIcon(getClass().getResource("/com/raven/image/img8.png"))));
             home.addItem(new ModelItem(ID++, "RTX 2080", "RTX 2080 8GB RAM GDDR6", 700, "MSI", new ImageIcon(getClass().getResource("/com/raven/image/img9.png"))));
             home.addItem(new ModelItem(ID++, "RTX 3090", "RTX 3090 24GB RAM GDDR6X", 1100, "GIGABYTE", new ImageIcon(getClass().getResource("/com/raven/image/img10.png"))));
             
             
             
        }
    }

    private Point getLocationOf(Component com) {
        Point p = home.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 30;
        return new Point(x + itemX + left, y + itemY + top);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new com.raven.swing.Background();
        header = new javax.swing.JPanel();
        winButton = new com.raven.swing.win_button.WinButton();
        mainPanel = new com.raven.swing.MainPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        header.setOpaque(false);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(1193, Short.MAX_VALUE)
                .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Background background1;
    private javax.swing.JPanel header;
    private com.raven.swing.MainPanel mainPanel;
    private com.raven.swing.win_button.WinButton winButton;
    // End of variables declaration//GEN-END:variables
}
