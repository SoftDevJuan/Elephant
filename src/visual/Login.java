
package visual;
import Logica.Usuario;
import Logica.CONEXION;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }
    int ejex, ejey;
    Home ho = new Home();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Menu_Login = new javax.swing.JPanel();
        jpIngresar = new javax.swing.JPanel();
        btIngresar = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        lbUser = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        Barra_menu = new javax.swing.JPanel();
        X_CerrarPrograma = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_Login.setBackground(new java.awt.Color(5, 23, 43));

        jpIngresar.setBackground(new java.awt.Color(157, 2, 59));
        jpIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpIngresarMouseExited(evt);
            }
        });

        btIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btIngresar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btIngresar.setText("            Ingresar");
        btIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btIngresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btIngresarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpIngresarLayout = new javax.swing.GroupLayout(jpIngresar);
        jpIngresar.setLayout(jpIngresarLayout);
        jpIngresarLayout.setHorizontalGroup(
            jpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jpIngresarLayout.setVerticalGroup(
            jpIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tfUser.setBackground(new java.awt.Color(5, 23, 43));
        tfUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tfUser.setForeground(new java.awt.Color(153, 153, 153));
        tfUser.setBorder(null);

        lbUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setText("Usuario:");

        lbPass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbPass.setForeground(new java.awt.Color(255, 255, 255));
        lbPass.setText("Contraseña:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        txtPass.setBackground(new java.awt.Color(5, 23, 43));
        txtPass.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setBorder(null);
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_80px.png"))); // NOI18N

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Mostrar");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_LoginLayout = new javax.swing.GroupLayout(Menu_Login);
        Menu_Login.setLayout(Menu_LoginLayout);
        Menu_LoginLayout.setHorizontalGroup(
            Menu_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_LoginLayout.createSequentialGroup()
                .addGroup(Menu_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lbUser)
                        .addGap(26, 26, 26)
                        .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jCheckBox1))
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jpIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(477, 477, 477))
        );
        Menu_LoginLayout.setVerticalGroup(
            Menu_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_LoginLayout.createSequentialGroup()
                .addGroup(Menu_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131)
                        .addGroup(Menu_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(Menu_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUser)))
                    .addGroup(Menu_LoginLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jpIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        Fondo.add(Menu_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 330, 500));

        Barra_menu.setBackground(new java.awt.Color(5, 23, 43));
        Barra_menu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Barra_menuMouseDragged(evt);
            }
        });
        Barra_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Barra_menuMousePressed(evt);
            }
        });

        X_CerrarPrograma.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        X_CerrarPrograma.setForeground(new java.awt.Color(255, 255, 255));
        X_CerrarPrograma.setText("X");
        X_CerrarPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                X_CerrarProgramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                X_CerrarProgramaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                X_CerrarProgramaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Barra_menuLayout = new javax.swing.GroupLayout(Barra_menu);
        Barra_menu.setLayout(Barra_menuLayout);
        Barra_menuLayout.setHorizontalGroup(
            Barra_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_menuLayout.createSequentialGroup()
                .addContainerGap(703, Short.MAX_VALUE)
                .addComponent(X_CerrarPrograma)
                .addContainerGap())
        );
        Barra_menuLayout.setVerticalGroup(
            Barra_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_menuLayout.createSequentialGroup()
                .addComponent(X_CerrarPrograma)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Fondo.add(Barra_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Corvus Electronics S.A.DE.C.V");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 176, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO-ELEPHANT-Recuperadoa.png"))); // NOI18N
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 290, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Fondo-Login4.jpg"))); // NOI18N
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 390, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()==true){
            txtPass.setEchoChar((char)0);

        }else{
            txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void X_CerrarProgramaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CerrarProgramaMousePressed
       System.exit(0);
    }//GEN-LAST:event_X_CerrarProgramaMousePressed

    private void Barra_menuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_menuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- ejex, y - ejey);
    }//GEN-LAST:event_Barra_menuMouseDragged

    private void Barra_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_menuMousePressed
       ejex = evt.getX();
       ejey = evt.getY();
    }//GEN-LAST:event_Barra_menuMousePressed

    private void X_CerrarProgramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CerrarProgramaMouseEntered
        X_CerrarPrograma.setForeground(Color.red);
    }//GEN-LAST:event_X_CerrarProgramaMouseEntered

    private void X_CerrarProgramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CerrarProgramaMouseExited
      X_CerrarPrograma.setForeground(Color.white);
    }//GEN-LAST:event_X_CerrarProgramaMouseExited

    private void btIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIngresarMousePressed
        Usuario usu = new Usuario();
        Home h = new Home();
        HomeAux aux = new HomeAux();
        usu.setUsuarioin(tfUser.getText());
        usu.setPasswordin(txtPass.getText());
        String Mensaje = usu.validacion();
        if(Mensaje.equals("Bienvenido")){
            usu.RegistrarLogin();
            if(usu.getPuesto().equals("Auxiliar")){
            this.setVisible(false);
            aux.setVisible(true);
            }else{
            this.setVisible(false);
            h.setVisible(true);}
        }else{JOptionPane.showMessageDialog(this, Mensaje);}
     
   
    }//GEN-LAST:event_btIngresarMousePressed

    private void jpIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIngresarMouseEntered
        jpIngresar.setBackground(new Color(109,1,41));
    }//GEN-LAST:event_jpIngresarMouseEntered

    private void jpIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIngresarMouseExited
        jpIngresar.setBackground(new Color(157,2,59));
    }//GEN-LAST:event_jpIngresarMouseExited

    private void btIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIngresarMouseEntered
       jpIngresar.setBackground(new Color(109,1,41));
    }//GEN-LAST:event_btIngresarMouseEntered

    private void btIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIngresarMouseExited
         jpIngresar.setBackground(new Color(157,2,59));
    }//GEN-LAST:event_btIngresarMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_menu;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Menu_Login;
    private javax.swing.JLabel X_CerrarPrograma;
    private javax.swing.JLabel btIngresar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpIngresar;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbUser;
    private javax.swing.JTextField tfUser;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
