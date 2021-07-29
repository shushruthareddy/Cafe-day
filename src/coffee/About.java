package coffee;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * 
 */
public class About extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form About
     */
    public About() {
        super("About");
        initComponents();
        conn = dbconnect.connectdb();
        FrameInit();

    }

    private void FrameInit() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim);             ///This will let frame initialise in full screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        imagePanel1 = new coffee.ImagePanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        imagePanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                imagePanel1ComponentResized(evt);
            }
        });
        imagePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Great  Ideas Start With Coffee....");
        imagePanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 326, 513, 52));

        jLabel6.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("A Yawn Is A Silent Stream For Coffee...");
        imagePanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 232, 533, 76));

        jLabel7.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Start Your Day With Smile And Coffee....");
        imagePanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 493, 345, 67));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("WELCOME");
        imagePanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Great  Ideas Start With Coffee....");
        imagePanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 1663, 0));

        jLabel4.setFont(new java.awt.Font("Papyrus", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Good Ideas Start With Brainstroming.......");
        imagePanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 408, 577, 67));

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 3, 80)); // NOI18N
        jLabel3.setText("CUP OF JOY");
        imagePanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 550, 90));

        btnhome.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconandpictures/home.png"))); // NOI18N
        btnhome.setText("HOME");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        imagePanel1.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(911, 127, 142, 49));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        setVisible(false);
        HomePage ob = new HomePage();
        ob.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        URL resource = getClass().getResource("/iconandpictures/aboutpage2.jpeg");

        try {
          //  System.out.println(Paths.get(resource.toURI()).toFile().getAbsolutePath());
            imagePanel1.setImage(new ImageIcon(resource).getImage(),
                    this.getWidth(), this.getHeight());
        } catch (Exception ex) {
            Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formComponentResized

    private void imagePanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_imagePanel1ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_imagePanel1ComponentResized

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new About().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhome;
    private coffee.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
