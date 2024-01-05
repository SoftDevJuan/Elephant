
package visual;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import Logica.*;
import javax.swing.JOptionPane;


public class Transferir extends javax.swing.JFrame {

    
    public Transferir() {
        initComponents();
    JButton [] btns = {};
    for (JButton btn : btns){
        btn.setBackground(new Color(21,25,28));
        btn.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e){
                btn.setBackground(new Color(54,81,207));
            }
            public void mousePressed(MouseEvent e){
                btn.setBackground(new Color(54,81,207));
            }
            public void mouseReleased(MouseEvent e){
                btn.setBackground(new Color(54,81,207));
            }
            public void mouseEntered(MouseEvent e){
                btn.setBackground(new Color(54,81,207));
            }
            public void mouseExited(MouseEvent e){
                btn.setBackground(new Color(21,25,28));
            }

        });
    }

    }

    int ejey, ejex;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbSucursal = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        lbOutput = new javax.swing.JLabel();
        pnlConsultar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMovimientos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfIDProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfDestino = new javax.swing.JTextField();
        tfOrigen = new javax.swing.JTextField();
        tfCantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pBarra = new javax.swing.JPanel();
        X_CERRAR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Elephant Main Menu");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(730, 560));

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlCenter.setBackground(new java.awt.Color(5, 23, 43));
        pnlCenter.setForeground(new java.awt.Color(153, 153, 153));
        pnlCenter.setMinimumSize(new java.awt.Dimension(80, 100));
        pnlCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTop.setBackground(new java.awt.Color(5, 23, 43));
        pnlTop.setPreferredSize(new java.awt.Dimension(0, 100));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Transferencia de Items");

        LOGO.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO-Elefante-mini.png"))); // NOI18N

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(259, 259, 259))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LOGO)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14))
        );

        pnlCenter.add(pnlTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        jPanel1.setBackground(new java.awt.Color(157, 2, 59));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Generar Movimiento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 6, -1, -1));

        pnlCenter.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 169, 31));

        cbSucursal.setBackground(new java.awt.Color(14, 32, 65));
        cbSucursal.setForeground(new java.awt.Color(255, 255, 255));
        cbSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Guadalajara", "Zapopan", "Tlaquepaque", "CEDIS" }));
        cbSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSucursalActionPerformed(evt);
            }
        });
        pnlCenter.add(cbSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 100, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sucursal");
        pnlCenter.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        lbOutput.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lbOutput.setForeground(new java.awt.Color(204, 204, 204));
        pnlCenter.add(lbOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 350, 22));

        pnlConsultar.setBackground(new java.awt.Color(157, 2, 59));
        pnlConsultar.setForeground(new java.awt.Color(255, 255, 255));
        pnlConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsultarMouseClicked(evt);
            }
        });
        pnlConsultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Consultar ID");
        pnlConsultar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        pnlCenter.add(pnlConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 88, -1));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tbMovimientos.setBackground(new java.awt.Color(51, 51, 51));
        tbMovimientos.setForeground(new java.awt.Color(255, 255, 255));
        tbMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Cantidad", "Localidad", "Sucursal"
            }
        ));
        tbMovimientos.setCellSelectionEnabled(true);
        tbMovimientos.setSelectionBackground(new java.awt.Color(51, 0, 51));
        tbMovimientos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbMovimientos.setShowHorizontalLines(true);
        tbMovimientos.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbMovimientos);

        pnlCenter.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 670, 132));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad");
        pnlCenter.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Localidad Destino");
        pnlCenter.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        tfIDProducto.setBackground(new java.awt.Color(14, 32, 65));
        tfIDProducto.setForeground(new java.awt.Color(255, 255, 255));
        tfIDProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlCenter.add(tfIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 172, 257, 25));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID Producto");
        pnlCenter.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        tfDestino.setBackground(new java.awt.Color(14, 32, 65));
        tfDestino.setForeground(new java.awt.Color(255, 255, 255));
        tfDestino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlCenter.add(tfDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 129, 23));

        tfOrigen.setBackground(new java.awt.Color(14, 32, 65));
        tfOrigen.setForeground(new java.awt.Color(255, 255, 255));
        tfOrigen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlCenter.add(tfOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 124, 23));

        tfCantidad.setBackground(new java.awt.Color(14, 32, 65));
        tfCantidad.setForeground(new java.awt.Color(255, 255, 255));
        tfCantidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlCenter.add(tfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 112, 23));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Localidad Origen");
        pnlCenter.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

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
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pnlRoot.add(pBarra, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Transferencia move = new Transferencia();
        try{
            move.setIdProducto(Integer.parseInt(tfIDProducto.getText()));
            move.setCantidadSolicitada(Integer.parseInt(tfCantidad.getText()));
            move.setLocOrigen(tfOrigen.getText());
            move.setLocDestino(tfDestino.getText());
            move.setNtienda(cbSucursal.getSelectedIndex());
            move.setSuctabla(String.valueOf(cbSucursal.getSelectedItem()));
        
            if(move.getNtienda() == 0){
                JOptionPane.showMessageDialog(null, "no se ha seleccionado la sucursal");
            }else if(move.getLocOrigen().equals(move.getLocDestino())){
                JOptionPane.showMessageDialog(null, "no es posible transferir en la misma localidad");
            }
            else{
                if(move.getLocOrigen().endsWith("1") || move.getLocDestino().endsWith("1")){
                    if(!"Guadalajara".equals(move.getSuctabla())){
                    lbOutput.setText("Localidad(es) no existe en " + cbSucursal.getSelectedItem());
                    }else{
                        lbOutput.setText(move.Transferir());
                        this.pnlConsultarMouseClicked(evt);
                    }
                 
                }else if(move.getLocOrigen().endsWith("2") || move.getLocDestino().endsWith("2")){
                    if(!"Zapopan".equals(move.getSuctabla())){
                    lbOutput.setText("Localidad(es) no existe en " + cbSucursal.getSelectedItem());
                    }else{
                        lbOutput.setText(move.Transferir());
                        this.pnlConsultarMouseClicked(evt);
                    }
                }else if(move.getLocOrigen().endsWith("3") || move.getLocDestino().endsWith("3")){
                    if(!"Tlaquepaque".equals(move.getSuctabla())){
                    lbOutput.setText("Localidad(es) no existe en " + cbSucursal.getSelectedItem());
                    }else{
                        lbOutput.setText(move.Transferir());
                        this.pnlConsultarMouseClicked(evt);
                    }
                }else{
                    lbOutput.setText("Error en la(s) localidad(es)");
                    }
                }
                        tfCantidad.setText("");
                        tfOrigen.setText("");
                        tfDestino.setText("");

        }catch(Exception e){
        move.setMensajeEx("ERROR : " + e.getMessage());
        lbOutput.setText(move.getMensajeEx());
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void pnlConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsultarMouseClicked
        try{
        Transferencia movi = new Transferencia();
        movi.setNtienda(cbSucursal.getSelectedIndex());
        movi.setSuctabla(String.valueOf(cbSucursal.getSelectedItem()));
        movi.setIdProducto(Integer.parseInt(tfIDProducto.getText()));
        if(cbSucursal.getSelectedIndex() == 0){
            lbOutput.setText("no se ha seleccionado sucursal");
        }else if(tfIDProducto.getText().equals("")){
            lbOutput.setText("ID no especificado!");
        }else{
        tbMovimientos.setModel(movi.MostrarDatos());
        //lbOutput.setText("hecho!");
        }
        }catch(Exception ex){
            lbOutput.setText("ID esta vacio ");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlConsultarMouseClicked

    private void cbSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSucursalActionPerformed
        if(cbSucursal.getSelectedIndex() != 0){
            lbOutput.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_cbSucursalActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel X_CERRAR;
    private javax.swing.JComboBox<String> cbSucursal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbOutput;
    private javax.swing.JPanel pBarra;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlConsultar;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTable tbMovimientos;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfDestino;
    private javax.swing.JTextField tfIDProducto;
    private javax.swing.JTextField tfOrigen;
    // End of variables declaration//GEN-END:variables
}
