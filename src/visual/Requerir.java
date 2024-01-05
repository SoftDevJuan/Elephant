/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visual;
import Logica.Requerimientos;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.time.*;
/**
 *
 * @author damnl
 */
public class Requerir extends javax.swing.JFrame {

    /**
     * Creates new form Aprobar1
     */
    public Requerir() {
        initComponents();
    }

    int ejex, ejey;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBarra = new javax.swing.JPanel();
        X_CERRAR = new javax.swing.JLabel();
        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        pnlGenerarPedido = new javax.swing.JPanel();
        lbGenerarPedido = new javax.swing.JLabel();
        lbFrom = new javax.swing.JLabel();
        lbTo = new javax.swing.JLabel();
        cbTo = new javax.swing.JComboBox<>();
        cbFrom = new javax.swing.JComboBox<>();
        lbLocalidadDestino = new javax.swing.JLabel();
        tfLocDestino = new javax.swing.JTextField();
        tfLocOrigen = new javax.swing.JTextField();
        lbLocalidadOrigen = new javax.swing.JLabel();
        pnlTop = new javax.swing.JPanel();
        tfProducto = new javax.swing.JTextField();
        lbCantidad = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        tfCantidad = new javax.swing.JTextField();
        lbEmpleado = new javax.swing.JLabel();
        tfEmpleado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(837, 555));

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
                .addContainerGap(821, Short.MAX_VALUE)
                .addComponent(X_CERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pBarraLayout.setVerticalGroup(
            pBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraLayout.createSequentialGroup()
                .addComponent(X_CERRAR)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pBarra, java.awt.BorderLayout.PAGE_START);

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(5, 23, 43));
        pnlSide.setPreferredSize(new java.awt.Dimension(60, 100));

        jPanel1.setBackground(new java.awt.Color(5, 23, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 150));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));
        pnlSide.add(jPanel1);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(5, 23, 43));
        pnlCenter.setMinimumSize(new java.awt.Dimension(80, 100));

        pnlGenerarPedido.setBackground(new java.awt.Color(157, 2, 59));
        pnlGenerarPedido.setForeground(new java.awt.Color(255, 255, 255));
        pnlGenerarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGenerarPedidoMouseClicked(evt);
            }
        });
        pnlGenerarPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbGenerarPedido.setForeground(new java.awt.Color(255, 255, 255));
        lbGenerarPedido.setText("Generar Pedido");
        lbGenerarPedido.setAlignmentX(2.0F);
        lbGenerarPedido.setAlignmentY(2.0F);
        pnlGenerarPedido.add(lbGenerarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 50));

        lbFrom.setForeground(new java.awt.Color(255, 255, 255));
        lbFrom.setText("Pedir A");

        lbTo.setForeground(new java.awt.Color(255, 255, 255));
        lbTo.setText("Entregar A");

        cbTo.setBackground(new java.awt.Color(14, 32, 65));
        cbTo.setForeground(new java.awt.Color(255, 255, 255));
        cbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDIS", "Guadalajara", "Zapopan", "Tlaquepaque", " " }));

        cbFrom.setBackground(new java.awt.Color(14, 32, 65));
        cbFrom.setForeground(new java.awt.Color(255, 255, 255));
        cbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDIS", "Guadalajara", "Zapopan", "Tlaquepaque", " " }));

        lbLocalidadDestino.setForeground(new java.awt.Color(255, 255, 255));
        lbLocalidadDestino.setText("Localidad Destino");

        tfLocDestino.setBackground(new java.awt.Color(14, 32, 65));
        tfLocDestino.setForeground(new java.awt.Color(255, 255, 255));

        tfLocOrigen.setBackground(new java.awt.Color(14, 32, 65));
        tfLocOrigen.setForeground(new java.awt.Color(255, 255, 255));

        lbLocalidadOrigen.setForeground(new java.awt.Color(255, 255, 255));
        lbLocalidadOrigen.setText("Localidad Origen");

        pnlTop.setBackground(new java.awt.Color(5, 23, 43));
        pnlTop.setPreferredSize(new java.awt.Dimension(0, 100));

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tfProducto.setBackground(new java.awt.Color(14, 32, 65));
        tfProducto.setForeground(new java.awt.Color(255, 255, 255));

        lbCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lbCantidad.setText("Cantidad");

        lbID.setForeground(new java.awt.Color(255, 255, 255));
        lbID.setText("ID Producto");

        tfCantidad.setBackground(new java.awt.Color(14, 32, 65));
        tfCantidad.setForeground(new java.awt.Color(255, 255, 255));

        lbEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbEmpleado.setText("Empleado");

        tfEmpleado.setBackground(new java.awt.Color(14, 32, 65));
        tfEmpleado.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Requerimientos");

        LOGO.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO-Elefante-mini.png"))); // NOI18N

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbCantidad))))
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbLocalidadOrigen)
                                    .addComponent(lbFrom)
                                    .addComponent(lbEmpleado))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addComponent(cbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(lbTo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCenterLayout.createSequentialGroup()
                                        .addComponent(tfLocOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbLocalidadDestino)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfLocDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                .addGap(500, 500, 500))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(714, 714, 714))
            .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCenterLayout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(lbID)
                    .addContainerGap(581, Short.MAX_VALUE)))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LOGO)))
                .addGap(55, 55, 55)
                .addComponent(tfProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCantidad)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFrom)
                    .addComponent(lbTo)
                    .addComponent(cbTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocalidadDestino)
                    .addComponent(tfLocDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLocalidadOrigen)
                    .addComponent(tfLocOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmpleado)
                    .addComponent(tfEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(pnlGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCenterLayout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(lbID)
                    .addContainerGap(352, Short.MAX_VALUE)))
        );

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void pnlGenerarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGenerarPedidoMouseClicked
try{
            
            
            Requerimientos requi = new Requerimientos();
            
            requi.setIdProducto(Integer.parseInt(tfProducto.getText()));
            requi.setHora(String.valueOf(LocalTime.now()));
            requi.setFecha(String.valueOf(LocalDate.now()));
            requi.setSucursalOrigen(String.valueOf(cbFrom.getSelectedItem()));
            requi.setSucursalDestino(String.valueOf(cbTo.getSelectedItem()));
            requi.setNomina(Integer.parseInt(tfEmpleado.getText()));
            requi.setCantidad(Integer.parseInt(tfCantidad.getText()));
            requi.setLocDestino(tfLocDestino.getText());
            requi.setLocOrigen(tfLocOrigen.getText());
            requi.setStatus("Pendiente");


            JOptionPane.showMessageDialog(null,requi.GenerarPedido());
            Ticketnew vis = new Ticketnew();
            vis.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR " + e.getMessage());
        }// TODO add your handling code here:
                                                 

    }//GEN-LAST:event_pnlGenerarPedidoMouseClicked

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
            java.util.logging.Logger.getLogger(Requerir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requerir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requerir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requerir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requerir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel X_CERRAR;
    private javax.swing.JComboBox<String> cbFrom;
    private javax.swing.JComboBox<String> cbTo;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbEmpleado;
    private javax.swing.JLabel lbFrom;
    private javax.swing.JLabel lbGenerarPedido;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLocalidadDestino;
    private javax.swing.JLabel lbLocalidadOrigen;
    private javax.swing.JLabel lbTo;
    private javax.swing.JPanel pBarra;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlGenerarPedido;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfEmpleado;
    private javax.swing.JTextField tfLocDestino;
    private javax.swing.JTextField tfLocOrigen;
    private javax.swing.JTextField tfProducto;
    // End of variables declaration//GEN-END:variables
}
