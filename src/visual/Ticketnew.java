
package visual;

import Logica.Requerimientos;
import java.awt.Color;


public class Ticketnew extends javax.swing.JFrame {

    
    public Ticketnew() {
        initComponents();
    }
    int ejey, ejex;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlTicketData = new javax.swing.JPanel();
        lbtTicket = new javax.swing.JLabel();
        lbtID = new javax.swing.JLabel();
        lbtCantidad = new javax.swing.JLabel();
        lbtFecha = new javax.swing.JLabel();
        lbtHora = new javax.swing.JLabel();
        lbtProcedencia = new javax.swing.JLabel();
        lbtDestino = new javax.swing.JLabel();
        lbtStatus = new javax.swing.JLabel();
        lbtEmpleado = new javax.swing.JLabel();
        lbrTicket = new javax.swing.JLabel();
        lbrCantidad = new javax.swing.JLabel();
        lbrID = new javax.swing.JLabel();
        lbrHora = new javax.swing.JLabel();
        lbrFecha = new javax.swing.JLabel();
        lbrOrigen = new javax.swing.JLabel();
        lbrDestino = new javax.swing.JLabel();
        lbrStatus = new javax.swing.JLabel();
        lbrGerente = new javax.swing.JLabel();
        lbrEmpleado = new javax.swing.JLabel();
        lbtLocOrigen = new javax.swing.JLabel();
        lbrLocOrigen = new javax.swing.JLabel();
        lbtLocDestino = new javax.swing.JLabel();
        lbrLocDestino = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        pBarra = new javax.swing.JPanel();
        X_CERRAR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(5, 23, 43));

        pnlTicketData.setBackground(new java.awt.Color(5, 23, 43));
        pnlTicketData.setForeground(new java.awt.Color(0, 0, 0));
        pnlTicketData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbtTicket.setForeground(new java.awt.Color(255, 255, 255));
        lbtTicket.setText("Ticket:");
        pnlTicketData.add(lbtTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 50, -1, -1));

        lbtID.setForeground(new java.awt.Color(255, 255, 255));
        lbtID.setText("ID producto:");
        pnlTicketData.add(lbtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 100, -1, -1));

        lbtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lbtCantidad.setText("Cantidad Solicitada:");
        pnlTicketData.add(lbtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 134, -1, -1));

        lbtFecha.setForeground(new java.awt.Color(255, 255, 255));
        lbtFecha.setText("Fecha:");
        pnlTicketData.add(lbtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 168, -1, -1));

        lbtHora.setForeground(new java.awt.Color(255, 255, 255));
        lbtHora.setText("Hora");
        pnlTicketData.add(lbtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 168, -1, -1));

        lbtProcedencia.setForeground(new java.awt.Color(255, 255, 255));
        lbtProcedencia.setText("Procedencia: ");
        pnlTicketData.add(lbtProcedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 214, -1, -1));

        lbtDestino.setForeground(new java.awt.Color(255, 255, 255));
        lbtDestino.setText("Destino:");
        pnlTicketData.add(lbtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 214, -1, -1));

        lbtStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbtStatus.setText("Status:");
        pnlTicketData.add(lbtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 316, -1, -1));

        lbtEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbtEmpleado.setText("ID Empleado");
        pnlTicketData.add(lbtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 370, -1, -1));

        lbrTicket.setForeground(new java.awt.Color(255, 255, 255));
        lbrTicket.setText(" ");
        pnlTicketData.add(lbrTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 50, 128, -1));

        lbrCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lbrCantidad.setText(" ");
        pnlTicketData.add(lbrCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 134, 121, -1));

        lbrID.setForeground(new java.awt.Color(255, 255, 255));
        lbrID.setText(" ");
        pnlTicketData.add(lbrID, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 100, 145, -1));

        lbrHora.setForeground(new java.awt.Color(255, 255, 255));
        lbrHora.setText(" ");
        pnlTicketData.add(lbrHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 168, 141, -1));

        lbrFecha.setForeground(new java.awt.Color(255, 255, 255));
        lbrFecha.setText(" ");
        pnlTicketData.add(lbrFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 168, 143, -1));

        lbrOrigen.setForeground(new java.awt.Color(255, 255, 255));
        lbrOrigen.setText(" ");
        pnlTicketData.add(lbrOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 214, 115, -1));

        lbrDestino.setForeground(new java.awt.Color(255, 255, 255));
        lbrDestino.setText(" ");
        pnlTicketData.add(lbrDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 214, 124, -1));

        lbrStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbrStatus.setText(" ");
        pnlTicketData.add(lbrStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 316, 107, -1));

        lbrGerente.setForeground(new java.awt.Color(255, 255, 255));
        lbrGerente.setText(" ");
        pnlTicketData.add(lbrGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 404, 172, -1));

        lbrEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbrEmpleado.setText(" ");
        pnlTicketData.add(lbrEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 370, 176, -1));

        lbtLocOrigen.setForeground(new java.awt.Color(255, 255, 255));
        lbtLocOrigen.setText("Loc. Origen");
        pnlTicketData.add(lbtLocOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 256, -1, -1));

        lbrLocOrigen.setForeground(new java.awt.Color(255, 255, 255));
        lbrLocOrigen.setText(" ");
        pnlTicketData.add(lbrLocOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 256, 125, -1));

        lbtLocDestino.setForeground(new java.awt.Color(255, 255, 255));
        lbtLocDestino.setText("Loc. Destino");
        pnlTicketData.add(lbtLocDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 256, -1, -1));

        lbrLocDestino.setForeground(new java.awt.Color(255, 255, 255));
        lbrLocDestino.setText(" ");
        pnlTicketData.add(lbrLocDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 256, 128, -1));

        LOGO.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO-Elefante-mini.png"))); // NOI18N
        pnlTicketData.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 220, 80));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(X_CERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pBarraLayout.setVerticalGroup(
            pBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraLayout.createSequentialGroup()
                .addComponent(X_CERRAR)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTicketData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTicketData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Requerimientos requi = new Requerimientos();
        requi.TicketNuevo();
            lbrTicket.setText(String.valueOf(requi.getTicket()));
            lbrID.setText(String.valueOf(requi.getIdProducto()));
            lbrCantidad.setText(String.valueOf(requi.getCantidad()));
            lbrFecha.setText(requi.getFecha());
            lbrHora.setText(requi.getHora());
            lbrStatus.setText(requi.getStatus());
            lbrEmpleado.setText(String.valueOf(requi.getNomina()));
            lbrOrigen.setText(requi.getSucursalOrigen());
            lbrDestino.setText(requi.getSucursalDestino());
            lbrLocOrigen.setText(requi.getLocOrigen());
            lbrLocDestino.setText(requi.getLocDestino());// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Ticketnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticketnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticketnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticketnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticketnew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel X_CERRAR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbrCantidad;
    private javax.swing.JLabel lbrDestino;
    private javax.swing.JLabel lbrEmpleado;
    private javax.swing.JLabel lbrFecha;
    private javax.swing.JLabel lbrGerente;
    private javax.swing.JLabel lbrHora;
    private javax.swing.JLabel lbrID;
    private javax.swing.JLabel lbrLocDestino;
    private javax.swing.JLabel lbrLocOrigen;
    private javax.swing.JLabel lbrOrigen;
    private javax.swing.JLabel lbrStatus;
    private javax.swing.JLabel lbrTicket;
    private javax.swing.JLabel lbtCantidad;
    private javax.swing.JLabel lbtDestino;
    private javax.swing.JLabel lbtEmpleado;
    private javax.swing.JLabel lbtFecha;
    private javax.swing.JLabel lbtHora;
    private javax.swing.JLabel lbtID;
    private javax.swing.JLabel lbtLocDestino;
    private javax.swing.JLabel lbtLocOrigen;
    private javax.swing.JLabel lbtProcedencia;
    private javax.swing.JLabel lbtStatus;
    private javax.swing.JLabel lbtTicket;
    private javax.swing.JPanel pBarra;
    private javax.swing.JPanel pnlTicketData;
    // End of variables declaration//GEN-END:variables
}
