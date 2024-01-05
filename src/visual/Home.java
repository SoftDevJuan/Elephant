
package visual;
import Logica.CONEXION;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Logica.Usuario;

public class Home extends javax.swing.JFrame {
int ejex, ejey;
String usuario,nombre,puesto,numtienda,pass;
int tickets; 

    public Home() {
        
        initComponents();
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

   


Usuario usu = new Usuario();

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNumtienda() {
        return numtienda;
    }

    public void setNumtienda(String numtienda) {
        this.numtienda = numtienda;
    }

    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FONDO_IMAGEN = new javax.swing.JLabel();
        FONDO = new javax.swing.JPanel();
        pBarra = new javax.swing.JPanel();
        X_CERRAR = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btCerrar_Sesion = new javax.swing.JButton();
        BIENVENIDA = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtMosUsu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMosPuesto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMostNom = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lbClosedtl = new javax.swing.JLabel();
        lbPendingtl = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        pnPedido = new javax.swing.JPanel();
        btPedido = new javax.swing.JLabel();
        pnTransferencia = new javax.swing.JPanel();
        btTransferencia = new javax.swing.JLabel();
        pnModificar = new javax.swing.JPanel();
        btAprobaciones = new javax.swing.JLabel();
        pnConsultar = new javax.swing.JPanel();
        btConsultar = new javax.swing.JLabel();
        pnIngresar = new javax.swing.JPanel();
        btIngresar = new javax.swing.JLabel();
        pnPerf = new javax.swing.JPanel();
        btPerfil = new javax.swing.JLabel();
        BARRA_MENU = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        lbclosedgdl = new javax.swing.JLabel();
        lbpendinggdl = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        lbClosedzp = new javax.swing.JLabel();
        lbPendingzp = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        FONDO.setBackground(new java.awt.Color(5, 23, 43));
        FONDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(978, Short.MAX_VALUE)
                .addComponent(X_CERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pBarraLayout.setVerticalGroup(
            pBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraLayout.createSequentialGroup()
                .addComponent(X_CERRAR)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        FONDO.add(pBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 20));

        LOGO.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO-Elefante-mini.png"))); // NOI18N
        FONDO.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 120));
        FONDO.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 180, 10));

        btCerrar_Sesion.setBackground(new java.awt.Color(5, 24, 58));
        btCerrar_Sesion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btCerrar_Sesion.setForeground(new java.awt.Color(255, 255, 255));
        btCerrar_Sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir-alt_1.png"))); // NOI18N
        btCerrar_Sesion.setText("  Cerrar sesion");
        btCerrar_Sesion.setBorderPainted(false);
        btCerrar_Sesion.setContentAreaFilled(false);
        btCerrar_Sesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salirRojo-alt.png"))); // NOI18N
        btCerrar_Sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCerrar_SesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCerrar_SesionMouseExited(evt);
            }
        });
        btCerrar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrar_SesionActionPerformed(evt);
            }
        });
        FONDO.add(btCerrar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 160, 30));

        BIENVENIDA.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        BIENVENIDA.setForeground(new java.awt.Color(204, 204, 204));
        BIENVENIDA.setText("¡Bienvenido al sistema Elephant!");
        FONDO.add(BIENVENIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 360, 30));

        jPanel1.setBackground(new java.awt.Color(157, 2, 59));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtMosUsu.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMosUsu.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Puesto:");

        txtMosPuesto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMosPuesto.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        txtMostNom.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMostNom.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMostNom, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMosUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMosPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtMosUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMostNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMosPuesto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FONDO.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 440, 80));

        jPanel14.setBackground(new java.awt.Color(157, 2, 59));
        jPanel14.setForeground(new java.awt.Color(153, 153, 153));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Tlaquepaque");
        jPanel14.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel43.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Cerrados");
        jPanel14.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 1));

        jPanel16.setBackground(new java.awt.Color(109, 1, 41));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_location_30px.png"))); // NOI18N
        jPanel16.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel45.setBackground(new java.awt.Color(40, 52, 58));
        jLabel45.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Constitucion 3876,  El Tapatio");
        jPanel14.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 20));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Gerente");
        jPanel14.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Edgar Jair L. Gonzalez");
        jPanel14.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        lbClosedtl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbClosedtl.setForeground(new java.awt.Color(255, 204, 204));
        lbClosedtl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClosedtl.setText("1");
        jPanel14.add(lbClosedtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 20, 20));

        lbPendingtl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbPendingtl.setForeground(new java.awt.Color(255, 204, 204));
        lbPendingtl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPendingtl.setText("1");
        jPanel14.add(lbPendingtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 40, 20));

        jLabel48.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Pendientes");
        jPanel14.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        FONDO.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 230, 250));

        pnPedido.setBackground(new java.awt.Color(4, 23, 51));
        pnPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnPedidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnPedidoMouseExited(evt);
            }
        });

        btPedido.setBackground(new java.awt.Color(4, 23, 51));
        btPedido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btPedido.setForeground(new java.awt.Color(255, 255, 255));
        btPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/capa-mas.png"))); // NOI18N
        btPedido.setText("  Pedido");
        btPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btPedidoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btPedidoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnPedidoLayout = new javax.swing.GroupLayout(pnPedido);
        pnPedido.setLayout(pnPedidoLayout);
        pnPedidoLayout.setHorizontalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnPedidoLayout.setVerticalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        FONDO.add(pnPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 50));

        pnTransferencia.setBackground(new java.awt.Color(4, 23, 51));
        pnTransferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnTransferenciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnTransferenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnTransferenciaMouseExited(evt);
            }
        });

        btTransferencia.setBackground(new java.awt.Color(4, 23, 51));
        btTransferencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btTransferencia.setForeground(new java.awt.Color(255, 255, 255));
        btTransferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/carga-de-camiones.png"))); // NOI18N
        btTransferencia.setText("  Transferencia");
        btTransferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btTransferenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btTransferenciaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnTransferenciaLayout = new javax.swing.GroupLayout(pnTransferencia);
        pnTransferencia.setLayout(pnTransferenciaLayout);
        pnTransferenciaLayout.setHorizontalGroup(
            pnTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTransferenciaLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(btTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        pnTransferenciaLayout.setVerticalGroup(
            pnTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTransferenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        FONDO.add(pnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, 50));

        pnModificar.setBackground(new java.awt.Color(4, 23, 51));
        pnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnModificarMouseExited(evt);
            }
        });

        btAprobaciones.setBackground(new java.awt.Color(4, 23, 51));
        btAprobaciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btAprobaciones.setForeground(new java.awt.Color(255, 255, 255));
        btAprobaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btAprobaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/varita-magica.png"))); // NOI18N
        btAprobaciones.setText("Aprobaciones");

        javax.swing.GroupLayout pnModificarLayout = new javax.swing.GroupLayout(pnModificar);
        pnModificar.setLayout(pnModificarLayout);
        pnModificarLayout.setHorizontalGroup(
            pnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnModificarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btAprobaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnModificarLayout.setVerticalGroup(
            pnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnModificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAprobaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        FONDO.add(pnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 50));

        pnConsultar.setBackground(new java.awt.Color(4, 23, 51));
        pnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnConsultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnConsultarMouseExited(evt);
            }
        });

        btConsultar.setBackground(new java.awt.Color(4, 23, 51));
        btConsultar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar-alt.png"))); // NOI18N
        btConsultar.setText("  Consultar");

        javax.swing.GroupLayout pnConsultarLayout = new javax.swing.GroupLayout(pnConsultar);
        pnConsultar.setLayout(pnConsultarLayout);
        pnConsultarLayout.setHorizontalGroup(
            pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnConsultarLayout.setVerticalGroup(
            pnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConsultarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        FONDO.add(pnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 50));

        pnIngresar.setBackground(new java.awt.Color(4, 23, 51));
        pnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnIngresarMouseExited(evt);
            }
        });

        btIngresar.setBackground(new java.awt.Color(4, 23, 51));
        btIngresar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enter (1).png"))); // NOI18N
        btIngresar.setText("Ingreso Nuevo");

        javax.swing.GroupLayout pnIngresarLayout = new javax.swing.GroupLayout(pnIngresar);
        pnIngresar.setLayout(pnIngresarLayout);
        pnIngresarLayout.setHorizontalGroup(
            pnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIngresarLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        pnIngresarLayout.setVerticalGroup(
            pnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        FONDO.add(pnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 50));

        pnPerf.setBackground(new java.awt.Color(4, 23, 51));
        pnPerf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnPerfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnPerfMouseExited(evt);
            }
        });

        btPerfil.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_male_user_25px.png"))); // NOI18N
        btPerfil.setText("  Perfil");
        btPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btPerfilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btPerfilMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnPerfLayout = new javax.swing.GroupLayout(pnPerf);
        pnPerf.setLayout(pnPerfLayout);
        pnPerfLayout.setHorizontalGroup(
            pnPerfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPerfLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(btPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        pnPerfLayout.setVerticalGroup(
            pnPerfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPerfLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        FONDO.add(pnPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 200, 40));

        BARRA_MENU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BARRA-MENU-4.png"))); // NOI18N
        FONDO.add(BARRA_MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 460));

        jPanel17.setBackground(new java.awt.Color(157, 2, 59));
        jPanel17.setForeground(new java.awt.Color(153, 153, 153));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Guadalajara");
        jPanel17.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel49.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Cerrados");
        jPanel17.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 1));

        jPanel19.setBackground(new java.awt.Color(109, 1, 41));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_location_30px.png"))); // NOI18N
        jPanel19.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel51.setBackground(new java.awt.Color(40, 52, 58));
        jLabel51.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Arquitectura 380, Miravalle");
        jPanel17.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 20));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Gerente");
        jPanel17.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Diego Angel Rodriguez");
        jPanel17.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        lbclosedgdl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbclosedgdl.setForeground(new java.awt.Color(255, 204, 204));
        lbclosedgdl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbclosedgdl.setText("1");
        jPanel17.add(lbclosedgdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 20, 20));

        lbpendinggdl.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbpendinggdl.setForeground(new java.awt.Color(255, 204, 204));
        lbpendinggdl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbpendinggdl.setText("1");
        jPanel17.add(lbpendinggdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 40, 20));

        jLabel54.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Pendientes");
        jPanel17.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        FONDO.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 230, 250));

        jPanel20.setBackground(new java.awt.Color(157, 2, 59));
        jPanel20.setForeground(new java.awt.Color(153, 153, 153));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Zapopan");
        jPanel20.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel55.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Cerrados");
        jPanel20.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, 1));

        jPanel22.setBackground(new java.awt.Color(109, 1, 41));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_location_30px.png"))); // NOI18N
        jPanel22.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel20.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel57.setBackground(new java.awt.Color(40, 52, 58));
        jLabel57.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Cordileras 4818, Prados ");
        jPanel20.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 20));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Gerente");
        jPanel20.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Juan Carlos Gonzalez R.");
        jPanel20.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        lbClosedzp.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbClosedzp.setForeground(new java.awt.Color(255, 204, 204));
        lbClosedzp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClosedzp.setText("1");
        jPanel20.add(lbClosedzp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 60, 20));

        lbPendingzp.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbPendingzp.setForeground(new java.awt.Color(255, 204, 204));
        lbPendingzp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPendingzp.setText("1");
        jPanel20.add(lbPendingzp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 40, 20));

        jLabel60.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Pendientes");
        jPanel20.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        FONDO.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 230, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FONDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FONDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        usu.ValidarLgin();
        txtMosUsu.setText(usu.getUsuarioout());
        txtMostNom.setText(usu.getNombre()+" "+usu.getApellidos());
        txtMosPuesto.setText(usu.getPuesto());
        
        //lbClosedtl.setText(contarTickets());
    }//GEN-LAST:event_formWindowOpened

    private void pnPerfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPerfMouseExited
        pnPerf.setBackground(new Color(4,23,51));
    }//GEN-LAST:event_pnPerfMouseExited

    private void pnPerfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPerfMouseEntered
        pnPerf.setBackground(new Color(3,19,44));

    }//GEN-LAST:event_pnPerfMouseEntered

    private void btPerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPerfilMousePressed
        Perf perf = new Perf();
        perf.setVisible(true);
        perf.setUsuario(this.getUsuario());
        perf.setPassword(this.getPass());

    }//GEN-LAST:event_btPerfilMousePressed

    private void btPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPerfilMouseExited
        pnPerf.setBackground(new Color(4,23,51));
    }//GEN-LAST:event_btPerfilMouseExited

    private void btPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPerfilMouseEntered
        pnPerf.setBackground(new Color(3,19,44));
    }//GEN-LAST:event_btPerfilMouseEntered

    private void pnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnIngresarMouseExited
        pnIngresar.setBackground(new Color(4,23,51));
    }//GEN-LAST:event_pnIngresarMouseExited

    private void pnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnIngresarMouseEntered
        pnIngresar.setBackground(new Color(109,1,41));
    }//GEN-LAST:event_pnIngresarMouseEntered

    private void pnConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnConsultarMouseExited
        pnConsultar.setBackground(new Color(4,23,51));
    }//GEN-LAST:event_pnConsultarMouseExited

    private void pnConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnConsultarMouseEntered
        pnConsultar.setBackground(new Color(109,1,41));
    }//GEN-LAST:event_pnConsultarMouseEntered

    private void pnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnModificarMouseExited
        pnModificar.setBackground(new Color(4,23,51));
    }//GEN-LAST:event_pnModificarMouseExited

    private void pnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnModificarMouseEntered
        pnModificar.setBackground(new Color(109,1,41));
    }//GEN-LAST:event_pnModificarMouseEntered

    private void pnTransferenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTransferenciaMouseExited
        pnTransferencia.setBackground(new Color(4,23,51));
    }//GEN-LAST:event_pnTransferenciaMouseExited

    private void pnTransferenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTransferenciaMouseEntered
        pnTransferencia.setBackground(new Color(109,1,41));
    }//GEN-LAST:event_pnTransferenciaMouseEntered

    private void btTransferenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTransferenciaMouseExited
        pnTransferencia.setBackground(new Color(4,23,51));
    }//GEN-LAST:event_btTransferenciaMouseExited

    private void btTransferenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTransferenciaMouseEntered
        pnTransferencia.setBackground(new Color(109,1,41));
    }//GEN-LAST:event_btTransferenciaMouseEntered

    private void pnPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPedidoMouseExited
        pnPedido.setBackground(new Color(4,23,51));
    }//GEN-LAST:event_pnPedidoMouseExited

    private void pnPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPedidoMouseEntered
        pnPedido.setBackground(new Color(109,1,41));
        
    }//GEN-LAST:event_pnPedidoMouseEntered

    private void btPedidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPedidoMousePressed
        //Requerir req = new Requerir();
        //req.setVisible(true);
    }//GEN-LAST:event_btPedidoMousePressed

    private void btPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPedidoMouseExited
        pnPedido.setBackground(new Color(4,23,51));
    }//GEN-LAST:event_btPedidoMouseExited

    private void btPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPedidoMouseEntered
        pnPedido.setBackground(new Color(109,1,41));
    }//GEN-LAST:event_btPedidoMouseEntered

    private void btCerrar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrar_SesionActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btCerrar_SesionActionPerformed

    private void btCerrar_SesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrar_SesionMouseExited
        btCerrar_Sesion.setForeground(Color.white);
        btCerrar_Sesion.setBackground(new Color(5, 24, 58));
    }//GEN-LAST:event_btCerrar_SesionMouseExited

    private void btCerrar_SesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrar_SesionMouseEntered
        btCerrar_Sesion.setForeground(Color.red);
        btCerrar_Sesion.setBackground(Color.white);

    }//GEN-LAST:event_btCerrar_SesionMouseEntered

    private void pBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBarraMousePressed
        ejex = evt.getX();
        ejey = evt.getY();
    }//GEN-LAST:event_pBarraMousePressed

    private void pBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- ejex, y - ejey);
    }//GEN-LAST:event_pBarraMouseDragged

    private void X_CERRARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CERRARMouseExited
        X_CERRAR.setForeground(Color.white);
    }//GEN-LAST:event_X_CERRARMouseExited

    private void X_CERRARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CERRARMouseEntered
        X_CERRAR.setForeground(Color.red);
    }//GEN-LAST:event_X_CERRARMouseEntered

    private void X_CERRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_CERRARMouseClicked
        ConfirmacionLogOut logout = new ConfirmacionLogOut();
        logout.setVisible(true);

    }//GEN-LAST:event_X_CERRARMouseClicked

    private void pnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnConsultarMouseClicked
        Consultar_new consulta = new Consultar_new();
        consulta.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_pnConsultarMouseClicked

    private void pnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnModificarMouseClicked
        Aprobar aprobar = new Aprobar();
        aprobar.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_pnModificarMouseClicked

    private void pnTransferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTransferenciaMouseClicked
        Transferir transfer = new Transferir();
        transfer.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_pnTransferenciaMouseClicked

    private void pnPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnPedidoMouseClicked
        Requerir requi = new Requerir();
        requi.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_pnPedidoMouseClicked

    private void pnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnIngresarMouseClicked
        Registrar_new registrar = new Registrar_new();
        registrar.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_pnIngresarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Usuario user = new Usuario();
        user.ValidarLgin();
        lbpendinggdl.setText(contarTicketsGDL());
        lbPendingzp.setText(contarTicketsZP());
        lbPendingtl.setText(contarTicketsTL());
        lbClosedtl.setText(contarTicketsTLC());
        lbClosedzp.setText(contarTicketsZPC());
        lbclosedgdl.setText(contarTicketsGDLC());
        txtMosUsu.setText(usu.getUsuarioout());
        txtMostNom.setText(usu.getNombre()+" "+usu.getApellidos());
        txtMosPuesto.setText(usu.getPuesto());//aqui el codigo de las label// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated



public String contarTicketsGDL(){
    String Mensaje="";   
    CONEXION conexion = new CONEXION();
    Mensaje= conexion.Conectar();
    if(conexion.getConex() != null){
        try{
          String sentenciaSQL = "select count(status) from movimientos where status='Pendiente' and destino='Guadalajara'";  
          PreparedStatement ps = conexion.getConex().prepareStatement(sentenciaSQL);
          
          ResultSet resultado=ps.executeQuery();
          if(resultado.next()){
              setTickets(resultado.getInt(1));
              
              
           Mensaje=String.valueOf(getTickets());  
           conexion.desconectar();   
          }
          
          
         
          
        }catch(SQLException ex){
            Mensaje="Fallo"+ex.getMessage();
        }
    }
    return Mensaje;    
    }



public String contarTicketsZP(){
    String Mensaje="";   
    CONEXION conexion = new CONEXION();
    Mensaje= conexion.Conectar();
    if(conexion.getConex() != null){
        try{
          String sentenciaSQL = "select count(status) from movimientos where status='Pendiente' and destino='Zapopan'";  
          PreparedStatement ps = conexion.getConex().prepareStatement(sentenciaSQL);
          
          ResultSet resultado=ps.executeQuery();
          if(resultado.next()){
              setTickets(resultado.getInt(1));
              
              
           Mensaje=String.valueOf(getTickets());  
           conexion.desconectar();   
          }
          
          
         
          
        }catch(SQLException ex){
            Mensaje="Fallo"+ex.getMessage();
        }
    }
    return Mensaje;    
    }



    public String contarTicketsTL(){
    String Mensaje="";   
    CONEXION conexion = new CONEXION();
    Mensaje= conexion.Conectar();
    if(conexion.getConex() != null){
        try{
          String sentenciaSQL = "select count(status) from movimientos where status='Pendiente' and destino='Tlaquepaque'";  
          PreparedStatement ps = conexion.getConex().prepareStatement(sentenciaSQL);
          
          ResultSet resultado=ps.executeQuery();
          if(resultado.next()){
              setTickets(resultado.getInt(1));
              
              
           Mensaje=String.valueOf(getTickets());  
           conexion.desconectar();   
          }
          
          
         
          
        }catch(SQLException ex){
            Mensaje="Fallo"+ex.getMessage();
        }
    }
    return Mensaje;    
    }


    public String contarTicketsGDLC(){
    String Mensaje="";   
    CONEXION conexion = new CONEXION();
    Mensaje= conexion.Conectar();
    if(conexion.getConex() != null){
        try{
          String sentenciaSQL = "select count(status) from movimientos where status='Aprobado' and destino='Guadalajara'";  
          PreparedStatement ps = conexion.getConex().prepareStatement(sentenciaSQL);
          
          ResultSet resultado=ps.executeQuery();
          if(resultado.next()){
              setTickets(resultado.getInt(1));
              
              
           Mensaje=String.valueOf(getTickets());  
           conexion.desconectar();   
          }
          
          
         
          
        }catch(SQLException ex){
            Mensaje="Fallo"+ex.getMessage();
        }
    }
    return Mensaje;    
    }



public String contarTicketsZPC(){
    String Mensaje="";   
    CONEXION conexion = new CONEXION();
    Mensaje= conexion.Conectar();
    if(conexion.getConex() != null){
        try{
          String sentenciaSQL = "select count(status) from movimientos where status='Aprobado' and destino='Zapopan'";  
          PreparedStatement ps = conexion.getConex().prepareStatement(sentenciaSQL);
          
          ResultSet resultado=ps.executeQuery();
          if(resultado.next()){
              setTickets(resultado.getInt(1));
              
              
           Mensaje=String.valueOf(getTickets());  
           conexion.desconectar();   
          }
          
          
         
          
        }catch(SQLException ex){
            Mensaje="Fallo"+ex.getMessage();
        }
    }
    return Mensaje;    
    }



    public String contarTicketsTLC(){
    String Mensaje="";   
    CONEXION conexion = new CONEXION();
    Mensaje= conexion.Conectar();
    if(conexion.getConex() != null){
        try{
          String sentenciaSQL = "select count(status) from movimientos where status='Aprobado' and destino='Tlaquepaque'";  
          PreparedStatement ps = conexion.getConex().prepareStatement(sentenciaSQL);
          
          ResultSet resultado=ps.executeQuery();
          if(resultado.next()){
              setTickets(resultado.getInt(1));
              
              
           Mensaje=String.valueOf(getTickets());  
           conexion.desconectar();   
          }
          
          
         
          
        }catch(SQLException ex){
            Mensaje="Fallo"+ex.getMessage();
        }
    }
    return Mensaje;    
    }

    
              
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
    private javax.swing.JLabel BARRA_MENU;
    private javax.swing.JLabel BIENVENIDA;
    private javax.swing.JPanel FONDO;
    private javax.swing.JLabel FONDO_IMAGEN;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel X_CERRAR;
    private javax.swing.JLabel btAprobaciones;
    private javax.swing.JButton btCerrar_Sesion;
    private javax.swing.JLabel btConsultar;
    private javax.swing.JLabel btIngresar;
    private javax.swing.JLabel btPedido;
    private javax.swing.JLabel btPerfil;
    private javax.swing.JLabel btTransferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbClosedtl;
    private javax.swing.JLabel lbClosedzp;
    private javax.swing.JLabel lbPendingtl;
    private javax.swing.JLabel lbPendingzp;
    private javax.swing.JLabel lbclosedgdl;
    private javax.swing.JLabel lbpendinggdl;
    private javax.swing.JPanel pBarra;
    private javax.swing.JPanel pnConsultar;
    private javax.swing.JPanel pnIngresar;
    private javax.swing.JPanel pnModificar;
    private javax.swing.JPanel pnPedido;
    private javax.swing.JPanel pnPerf;
    private javax.swing.JPanel pnTransferencia;
    private javax.swing.JLabel txtMosPuesto;
    private javax.swing.JLabel txtMosUsu;
    private javax.swing.JLabel txtMostNom;
    // End of variables declaration//GEN-END:variables
}
