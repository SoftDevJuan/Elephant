
package visual;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import Logica.Usuario;

public class Perf extends javax.swing.JFrame {

    public Perf() {
        initComponents();
    }
Usuario log = new Usuario();
    private String usuario,password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
    int ejey, ejex;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        X_Cerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbFoto = new javax.swing.JLabel();
        lbtNombre = new javax.swing.JLabel();
        lbtID = new javax.swing.JLabel();
        lbtSucursal = new javax.swing.JLabel();
        lbtPuesto = new javax.swing.JLabel();
        lbrNombres = new javax.swing.JLabel();
        lbrID = new javax.swing.JLabel();
        lbrSucursal = new javax.swing.JLabel();
        lbrPuesto = new javax.swing.JLabel();
        lbMensaje = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(5, 23, 43));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(14, 32, 65));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        X_Cerrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        X_Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        X_Cerrar.setText("X");
        X_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                X_CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                X_CerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                X_CerrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addComponent(X_Cerrar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(X_Cerrar))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 20));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos Empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jPanel6.setBackground(new java.awt.Color(4, 23, 51));

        lbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_80px.png"))); // NOI18N

        lbtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbtNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbtNombre.setText("Nombre");

        lbtID.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbtID.setForeground(new java.awt.Color(255, 255, 255));
        lbtID.setText("ID empleado");

        lbtSucursal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbtSucursal.setForeground(new java.awt.Color(255, 255, 255));
        lbtSucursal.setText("Sucursal");

        lbtPuesto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbtPuesto.setForeground(new java.awt.Color(255, 255, 255));
        lbtPuesto.setText("Puesto");

        lbrNombres.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbrNombres.setForeground(new java.awt.Color(255, 255, 255));
        lbrNombres.setText(" ");

        lbrID.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbrID.setForeground(new java.awt.Color(255, 255, 255));
        lbrID.setText(" ");

        lbrSucursal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbrSucursal.setForeground(new java.awt.Color(255, 255, 255));
        lbrSucursal.setText(" ");

        lbrPuesto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbrPuesto.setForeground(new java.awt.Color(255, 255, 255));
        lbrPuesto.setText(" ");

        lbMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lbMensaje.setText(" ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbtID)
                        .addGap(18, 18, 18)
                        .addComponent(lbrID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbtSucursal)
                        .addGap(18, 18, 18)
                        .addComponent(lbrSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbtPuesto)
                        .addGap(18, 18, 18)
                        .addComponent(lbrPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbtNombre)
                        .addGap(31, 31, 31)
                        .addComponent(lbrNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtNombre)
                    .addComponent(lbrNombres))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtID)
                    .addComponent(lbrID))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtSucursal)
                    .addComponent(lbrSucursal))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtPuesto)
                    .addComponent(lbrPuesto))
                .addGap(134, 134, 134)
                .addComponent(lbMensaje)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 298));

        LOGO.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO-Elefante-mini.png"))); // NOI18N
        jPanel1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void X_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CerrarMouseEntered
        X_Cerrar.setForeground(Color.red);
    }//GEN-LAST:event_X_CerrarMouseEntered

    private void X_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CerrarMouseExited
        X_Cerrar.setForeground(Color.white);
    }//GEN-LAST:event_X_CerrarMouseExited

    private void X_CerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CerrarMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_X_CerrarMousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- ejex, y - ejey);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        ejex = evt.getX();
        ejey = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lbMensaje.setText(log.ValidarLgin());
        lbrID.setText(String.valueOf(log.getNomina()));
        lbrNombres.setText(log.getNombre() + " " + log.getApellidos());
        lbrSucursal.setText(log.getSucursal());
        lbrPuesto.setText(log.getPuesto());
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Perf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel X_Cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbrID;
    private javax.swing.JLabel lbrNombres;
    private javax.swing.JLabel lbrPuesto;
    private javax.swing.JLabel lbrSucursal;
    private javax.swing.JLabel lbtID;
    private javax.swing.JLabel lbtNombre;
    private javax.swing.JLabel lbtPuesto;
    private javax.swing.JLabel lbtSucursal;
    // End of variables declaration//GEN-END:variables
}
