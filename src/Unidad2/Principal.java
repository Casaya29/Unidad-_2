/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Unidad2;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author ivandy
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("resources/icono.png"));


   return retValue;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEje1 = new javax.swing.JButton();
        BtnEje2 = new javax.swing.JButton();
        BtnEje3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setResizable(false);

        BtnEje1.setText("Ejercicio 1");
        BtnEje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEje1ActionPerformed(evt);
            }
        });

        BtnEje2.setText("Ejercicio 2");
        BtnEje2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEje2ActionPerformed(evt);
            }
        });

        BtnEje3.setText("Ejercicio 3");
        BtnEje3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEje3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEje3)
                    .addComponent(BtnEje2)
                    .addComponent(BtnEje1))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BtnEje1)
                .addGap(56, 56, 56)
                .addComponent(BtnEje2)
                .addGap(60, 60, 60)
                .addComponent(BtnEje3)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEje1ActionPerformed
        TablaMultiplicar tabla = new TablaMultiplicar();
        tabla.setVisible(true);
    }//GEN-LAST:event_BtnEje1ActionPerformed

    private void BtnEje2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEje2ActionPerformed
        Edades edad = new Edades();
        edad.setVisible(true);
    }//GEN-LAST:event_BtnEje2ActionPerformed

    private void BtnEje3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEje3ActionPerformed
        Empleados traba = new Empleados();
        traba.setVisible(true);
    }//GEN-LAST:event_BtnEje3ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEje1;
    private javax.swing.JButton BtnEje2;
    private javax.swing.JButton BtnEje3;
    // End of variables declaration//GEN-END:variables
}
