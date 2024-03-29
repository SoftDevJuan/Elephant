/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;
import Logica.*;
import Logica.Funciones;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
/**
 *
 * @author daard
 */
public class Consulta_Id extends javax.swing.JFrame {

    /**
     * Creates new form Consulta_Id
     */
    public Consulta_Id() {
        initComponents();
    }
int ejex, ejey;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jt_Producto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Txt_Id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pBarra = new javax.swing.JPanel();
        X_CERRAR = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();

        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(5, 23, 43));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Detalle por articulo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 220, 40));

        Jt_Producto.setBackground(new java.awt.Color(51, 51, 51));
        Jt_Producto.setForeground(new java.awt.Color(255, 255, 255));
        Jt_Producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Jt_Producto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 780, 90));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCA TU ID DE ARTICULO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 330, 30));

        Txt_Id.setBackground(new java.awt.Color(14, 32, 65));
        Txt_Id.setForeground(new java.awt.Color(255, 255, 255));
        Txt_Id.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));
        Txt_Id.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(Txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 126, 230, 30));

        jLabel5.setText("______________________________________________________________");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 20));

        jPanel3.setBackground(new java.awt.Color(157, 2, 59));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Consultar");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 28));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 110, 30));

        pBarra.setBackground(new java.awt.Color(14, 32, 65));
        pBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pBarraMouseDragged(evt);
            }
        });
        pBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pBarraMousePressed(evt);
            }
        });

        X_CERRAR.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        X_CERRAR.setForeground(new java.awt.Color(255, 255, 255));
        X_CERRAR.setText("X");
        X_CERRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X_CERRARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                X_CERRARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                X_CERRARMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pBarraLayout = new javax.swing.GroupLayout(pBarra);
        pBarra.setLayout(pBarraLayout);
        pBarraLayout.setHorizontalGroup(
            pBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBarraLayout.createSequentialGroup()
                .addContainerGap(758, Short.MAX_VALUE)
                .addComponent(X_CERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pBarraLayout.setVerticalGroup(
            pBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraLayout.createSequentialGroup()
                .addComponent(X_CERRAR)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(pBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 20));

        LOGO.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO-Elefante-mini.png"))); // NOI18N
        jPanel1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        Funciones consultar=new Funciones();
        if (!Txt_Id.getText().equals("")){
            consultar.setId(Txt_Id.getText());
            Jt_Producto.setModel(consultar.ConsultarId());
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void X_CERRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CERRARMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_X_CERRARMouseClicked

    private void X_CERRARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CERRARMouseEntered
        X_CERRAR.setForeground(Color.red);
    }//GEN-LAST:event_X_CERRARMouseEntered

    private void X_CERRARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CERRARMouseExited
        X_CERRAR.setForeground(Color.white);
    }//GEN-LAST:event_X_CERRARMouseExited

    private void pBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- ejex, y - ejey);
    }//GEN-LAST:event_pBarraMouseDragged

    private void pBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBarraMousePressed
        ejex = evt.getX();
        ejey = evt.getY();
    }//GEN-LAST:event_pBarraMousePressed

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
            java.util.logging.Logger.getLogger(Consulta_Id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_Id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Id().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jt_Producto;
    private javax.swing.JLabel LOGO;
    private javax.swing.JTextField Txt_Id;
    private javax.swing.JLabel X_CERRAR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pBarra;
    // End of variables declaration//GEN-END:variables
}
