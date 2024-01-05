
package visual;
import Logica.*;
import java.awt.Color;

public class Aprobar extends javax.swing.JFrame {

    /**
     * Creates new form Aporbar
     */
    public Aprobar() {
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
        pnlTop = new javax.swing.JPanel();
        elephant = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTicket = new javax.swing.JTable();
        pnlTciket = new javax.swing.JPanel();
        lbtTicket = new javax.swing.JLabel();
        lbtID = new javax.swing.JLabel();
        lbtCantidad = new javax.swing.JLabel();
        lbtFecha = new javax.swing.JLabel();
        lbtHora = new javax.swing.JLabel();
        lbtProcedencia = new javax.swing.JLabel();
        lbtDestino = new javax.swing.JLabel();
        lbtStatus = new javax.swing.JLabel();
        lbtEmpleado = new javax.swing.JLabel();
        pnlDenegar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnlAprobar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbrID = new javax.swing.JLabel();
        lbrTicket = new javax.swing.JLabel();
        lbrCantidad = new javax.swing.JLabel();
        lbrHora = new javax.swing.JLabel();
        lbrFecha = new javax.swing.JLabel();
        lbrDestino = new javax.swing.JLabel();
        lbrPorcedencia = new javax.swing.JLabel();
        lbrStatus = new javax.swing.JLabel();
        lbrEmpleado = new javax.swing.JLabel();
        lbtLocalidadOrigen = new javax.swing.JLabel();
        lbrLocalidadOrigen = new javax.swing.JLabel();
        lbtLocalidadDestino = new javax.swing.JLabel();
        lbrLocalidadDestino = new javax.swing.JLabel();
        lbNticket = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        tfNticket = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();
        pnlConsultar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlSeguimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbMensaje = new javax.swing.JLabel();
        lbMensaje1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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
                .addContainerGap(1202, Short.MAX_VALUE)
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

        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        pnlSideLayout.setVerticalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(479, Short.MAX_VALUE))
        );

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(30, 40, 44));
        pnlCenter.setMinimumSize(new java.awt.Dimension(80, 100));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        pnlTop.setBackground(new java.awt.Color(5, 23, 43));
        pnlTop.setPreferredSize(new java.awt.Dimension(0, 100));
        pnlTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        elephant.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        elephant.setForeground(new java.awt.Color(153, 153, 153));
        elephant.setText("Revision de Requerimientos");
        pnlTop.add(elephant, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        LOGO.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO-Elefante-mini.png"))); // NOI18N
        pnlTop.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 80));

        pnlCenter.add(pnlTop, java.awt.BorderLayout.NORTH);

        jPanel6.setBackground(new java.awt.Color(5, 23, 43));

        tableTicket.setBackground(new java.awt.Color(51, 51, 51));
        tableTicket.setForeground(new java.awt.Color(255, 255, 255));
        tableTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Folio", "ID", "Fecha", "Hora", "Procedencia", "Destino", "Status", "Empleado", "Cantidad Solicitada"
            }
        ));
        tableTicket.setCellSelectionEnabled(true);
        tableTicket.setFillsViewportHeight(true);
        tableTicket.setShowHorizontalLines(true);
        tableTicket.setShowVerticalLines(true);
        tableTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTicketMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTicket);

        pnlTciket.setBackground(new java.awt.Color(21, 25, 28));

        lbtTicket.setForeground(new java.awt.Color(255, 255, 255));
        lbtTicket.setText("Ticket:");

        lbtID.setForeground(new java.awt.Color(255, 255, 255));
        lbtID.setText("ID producto:");

        lbtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lbtCantidad.setText("Cantidad Solicitada:");

        lbtFecha.setForeground(new java.awt.Color(255, 255, 255));
        lbtFecha.setText("Fecha:");

        lbtHora.setForeground(new java.awt.Color(255, 255, 255));
        lbtHora.setText("Hora");

        lbtProcedencia.setForeground(new java.awt.Color(255, 255, 255));
        lbtProcedencia.setText("Procedencia: ");

        lbtDestino.setForeground(new java.awt.Color(255, 255, 255));
        lbtDestino.setText("Destino:");

        lbtStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbtStatus.setText("Status:");

        lbtEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbtEmpleado.setText("ID Empleado");

        pnlDenegar.setBackground(new java.awt.Color(255, 51, 51));
        pnlDenegar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDenegarMouseClicked(evt);
            }
        });
        pnlDenegar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Denegar");
        pnlDenegar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlAprobar.setBackground(new java.awt.Color(0, 204, 102));
        pnlAprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAprobarMouseClicked(evt);
            }
        });
        pnlAprobar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Aprobar");
        pnlAprobar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lbrID.setForeground(new java.awt.Color(255, 255, 255));
        lbrID.setText(" ");

        lbrTicket.setForeground(new java.awt.Color(255, 255, 255));
        lbrTicket.setText(" ");

        lbrCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lbrCantidad.setText(" ");

        lbrHora.setForeground(new java.awt.Color(255, 255, 255));
        lbrHora.setText(" ");

        lbrFecha.setForeground(new java.awt.Color(255, 255, 255));
        lbrFecha.setText(" ");

        lbrDestino.setForeground(new java.awt.Color(255, 255, 255));
        lbrDestino.setText(" ");

        lbrPorcedencia.setForeground(new java.awt.Color(255, 255, 255));
        lbrPorcedencia.setText(" ");

        lbrStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbrStatus.setText(" ");

        lbrEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbrEmpleado.setText(" ");

        lbtLocalidadOrigen.setForeground(new java.awt.Color(255, 255, 255));
        lbtLocalidadOrigen.setText("Localidad");

        lbrLocalidadOrigen.setForeground(new java.awt.Color(255, 255, 255));
        lbrLocalidadOrigen.setText(" ");

        lbtLocalidadDestino.setForeground(new java.awt.Color(255, 255, 255));
        lbtLocalidadDestino.setText("Localidad");

        lbrLocalidadDestino.setForeground(new java.awt.Color(255, 255, 255));
        lbrLocalidadDestino.setText(" ");

        javax.swing.GroupLayout pnlTciketLayout = new javax.swing.GroupLayout(pnlTciket);
        pnlTciket.setLayout(pnlTciketLayout);
        pnlTciketLayout.setHorizontalGroup(
            pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTciketLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(pnlDenegar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(pnlTciketLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTciketLayout.createSequentialGroup()
                        .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTciketLayout.createSequentialGroup()
                                .addComponent(lbtEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(lbrEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTciketLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbtStatus)
                                .addGap(18, 18, 18)
                                .addComponent(lbrStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTciketLayout.createSequentialGroup()
                                    .addComponent(lbtID)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbrID, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTciketLayout.createSequentialGroup()
                                    .addComponent(lbtTicket)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbrTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlTciketLayout.createSequentialGroup()
                                .addComponent(lbtCantidad)
                                .addGap(18, 18, 18)
                                .addComponent(lbrCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlTciketLayout.createSequentialGroup()
                        .addComponent(lbtFecha)
                        .addGap(18, 18, 18)
                        .addComponent(lbrFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbtHora)
                        .addGap(18, 18, 18)
                        .addComponent(lbrHora, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(pnlTciketLayout.createSequentialGroup()
                        .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTciketLayout.createSequentialGroup()
                                .addComponent(lbtLocalidadOrigen)
                                .addGap(18, 18, 18)
                                .addComponent(lbrLocalidadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbtLocalidadDestino)
                                .addGap(18, 18, 18)
                                .addComponent(lbrLocalidadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTciketLayout.createSequentialGroup()
                                .addComponent(lbtProcedencia)
                                .addGap(18, 18, 18)
                                .addComponent(lbrPorcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbtDestino)
                                .addGap(18, 18, 18)
                                .addComponent(lbrDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        pnlTciketLayout.setVerticalGroup(
            pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTciketLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtTicket)
                    .addComponent(lbrTicket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtID)
                    .addComponent(lbrID))
                .addGap(18, 18, 18)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtCantidad)
                    .addComponent(lbrCantidad))
                .addGap(18, 18, 18)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtFecha)
                    .addComponent(lbtHora)
                    .addComponent(lbrFecha)
                    .addComponent(lbrHora))
                .addGap(30, 30, 30)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtProcedencia)
                    .addComponent(lbrPorcedencia)
                    .addComponent(lbtDestino)
                    .addComponent(lbrDestino))
                .addGap(29, 29, 29)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbtLocalidadDestino)
                        .addComponent(lbrLocalidadDestino))
                    .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbtLocalidadOrigen)
                        .addComponent(lbrLocalidadOrigen)))
                .addGap(18, 18, 18)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtStatus)
                    .addComponent(lbrStatus))
                .addGap(29, 29, 29)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtEmpleado)
                    .addComponent(lbrEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(pnlTciketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDenegar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        lbNticket.setForeground(new java.awt.Color(255, 255, 255));
        lbNticket.setText("Buscar no. de Ticket");

        lbStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbStatus.setText("Filtrar Ticket por Status");

        tfNticket.setBackground(new java.awt.Color(14, 32, 65));
        tfNticket.setForeground(new java.awt.Color(255, 255, 255));

        cbStatus.setBackground(new java.awt.Color(14, 32, 65));
        cbStatus.setForeground(new java.awt.Color(255, 255, 255));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pendiente", "Aprobado", "Denegado" }));

        pnlConsultar.setBackground(new java.awt.Color(157, 2, 59));
        pnlConsultar.setForeground(new java.awt.Color(255, 255, 255));
        pnlConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsultarMouseClicked(evt);
            }
        });
        pnlConsultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consultar");
        pnlConsultar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlSeguimiento.setBackground(new java.awt.Color(157, 2, 59));
        pnlSeguimiento.setForeground(new java.awt.Color(255, 255, 255));
        pnlSeguimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSeguimientoMouseClicked(evt);
            }
        });
        pnlSeguimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seguimiento de Folio");
        pnlSeguimiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, -1, 20));

        lbMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lbMensaje.setText(" ");

        lbMensaje1.setForeground(new java.awt.Color(255, 255, 255));
        lbMensaje1.setText(" ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(794, 794, 794)
                        .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(pnlConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(lbStatus)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(21, 21, 21)))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(lbNticket)
                                                .addGap(42, 42, 42)
                                                .addComponent(tfNticket, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47)
                                                .addComponent(pnlSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(pnlTciket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNticket)
                                    .addComponent(tfNticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbStatus))
                        .addGap(51, 51, 51)
                        .addComponent(pnlConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTciket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(lbMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMensaje1)
                .addGap(25, 25, 25))
        );

        pnlCenter.add(jPanel6, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTicketMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_tableTicketMouseClicked

    private void pnlDenegarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDenegarMouseClicked
        SolicitudesAprobadas apro = new SolicitudesAprobadas();

        apro.setStatus(lbrStatus.getText());
        if(apro.getStatus().equals("Pendiente")){
            apro.setStatusNuevo("Denegado");
            apro.setNticket(Integer.parseInt(lbrTicket.getText()));
            lbMensaje1.setText(apro.CambiarStatus());
            lbrStatus.setText(apro.getStatusNuevo());
        }else{lbMensaje.setText("El status de este ticket ya no es valido");
        }// TODO add your handling code here:
    }//GEN-LAST:event_pnlDenegarMouseClicked

    private void pnlAprobarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAprobarMouseClicked
        //try{
            SolicitudesAprobadas apro = new SolicitudesAprobadas();
            Aprobaciones apr = new Aprobaciones();
            apro.setStatus(lbrStatus.getText());
            if(apro.getStatus().equals("Pendiente")){
                apro.setStatusNuevo("Aprobado");
                apro.setCantidadSolicitada(Integer.parseInt(lbrCantidad.getText()));
                apro.setDestino(lbrDestino.getText());
                apro.setProecedencia(lbrPorcedencia.getText());
                apro.setId(Integer.parseInt(lbrID.getText()));
                apro.setNticket(Integer.parseInt(lbrTicket.getText()));
                apro.setLocalidadDestino(lbrLocalidadDestino.getText());
                apro.setLocalidadOrgien(lbrLocalidadOrigen.getText());
                lbMensaje1.setText(apro.ConsultarInventario());
                lbMensaje.setText(apro.InsertarInventario());

                lbMensaje1.setText(apro.CambiarStatus());
                lbrStatus.setText(apro.getStatusNuevo());
            }else{lbMensaje.setText("El status de este ticket ya no es valido");
            }
            //}catch(Exception e){
            //lbMensaje.setText("ERROR " + e.getMessage());
            //}// TODO add your handling code here:
    }//GEN-LAST:event_pnlAprobarMouseClicked

    private void pnlConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsultarMouseClicked
        Aprobaciones aprobar = new Aprobaciones();
        if(!"".equals(tfNticket.getText())){
            aprobar.setNticket(Integer.parseInt(tfNticket.getText()));
            aprobar.setNsentencia(1);
            lbMensaje.setText(aprobar.ConsultarNticket());
            tableTicket.setModel(aprobar.MostrarDatos());
        }else if(!" ".equals(String.valueOf(cbStatus.getSelectedItem()))){
            aprobar.setNsentencia(2);
            aprobar.setStatus(String.valueOf(cbStatus.getSelectedItem()));
            lbMensaje.setText(aprobar.ConsultarNticket());
            tableTicket.setModel(aprobar.MostrarDatos());
        }else{lbMensaje.setText("Campos vacios");}// TODO add your handling code here:
    }//GEN-LAST:event_pnlConsultarMouseClicked

    private void pnlSeguimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSeguimientoMouseClicked
        this.setSize(1330, 630);
        pnlTciket.setVisible(true);
        Aprobaciones apr = new Aprobaciones();
        apr.setNticket(Integer.parseInt(tfNticket.getText()));
        lbMensaje.setText(apr.ConsultarNticket());
        lbrTicket.setText(String.valueOf(apr.getNticket()));
        lbrID.setText(String.valueOf(apr.getId()));
        lbrCantidad.setText(String.valueOf(apr.getCantidad()));
        lbrFecha.setText(apr.getFecha());
        lbrHora.setText(apr.getHora());
        lbrPorcedencia.setText(apr.getProecedencia());
        lbrDestino.setText(apr.getDestino());
        lbrStatus.setText(apr.getStatus());
        lbrEmpleado.setText(String.valueOf(apr.getNomina()));
        lbrLocalidadDestino.setText(apr.getLocalidadDestino());
        lbrLocalidadOrigen.setText(apr.getLocalidadOrgien());
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlSeguimientoMouseClicked

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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         this.setSize(900, 630);
        pnlTciket.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Aprobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aprobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aprobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aprobar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aprobar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel X_CERRAR;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel elephant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbMensaje1;
    private javax.swing.JLabel lbNticket;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbrCantidad;
    private javax.swing.JLabel lbrDestino;
    private javax.swing.JLabel lbrEmpleado;
    private javax.swing.JLabel lbrFecha;
    private javax.swing.JLabel lbrHora;
    private javax.swing.JLabel lbrID;
    private javax.swing.JLabel lbrLocalidadDestino;
    private javax.swing.JLabel lbrLocalidadOrigen;
    private javax.swing.JLabel lbrPorcedencia;
    private javax.swing.JLabel lbrStatus;
    private javax.swing.JLabel lbrTicket;
    private javax.swing.JLabel lbtCantidad;
    private javax.swing.JLabel lbtDestino;
    private javax.swing.JLabel lbtEmpleado;
    private javax.swing.JLabel lbtFecha;
    private javax.swing.JLabel lbtHora;
    private javax.swing.JLabel lbtID;
    private javax.swing.JLabel lbtLocalidadDestino;
    private javax.swing.JLabel lbtLocalidadOrigen;
    private javax.swing.JLabel lbtProcedencia;
    private javax.swing.JLabel lbtStatus;
    private javax.swing.JLabel lbtTicket;
    private javax.swing.JPanel pBarra;
    private javax.swing.JPanel pnlAprobar;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlConsultar;
    private javax.swing.JPanel pnlDenegar;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSeguimiento;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTciket;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTable tableTicket;
    private javax.swing.JTextField tfNticket;
    // End of variables declaration//GEN-END:variables
}
