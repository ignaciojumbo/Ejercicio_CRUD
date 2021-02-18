package com.istl.vista;

import com.istl.controlador.Personabd;
import com.istl.modelJTable.ComunicacionPersona;
import com.istl.modelJTable.ModelTablePersona;
import com.istl.modelo.Persona;
import com.istl.utilidad.Utilidad;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionContable extends javax.swing.JFrame implements ComunicacionPersona {

    private Utilidad utilidad;
    private Personabd controladorPersona;
    private Persona personaEditar;
    private GestionPersona gestion;
    private ModelTablePersona modelTablePersona;

    public GestionContable() {
        controladorPersona = new Personabd();
        modelTablePersona = new ModelTablePersona(controladorPersona.obtenerPersonas(), this);
        initComponents();
        this.setLocationRelativeTo(null);
        utilidad = new Utilidad();

        gestion = new GestionPersona(txtcedula, txtnombre, txtapellido, txtdireccion, txttelefono, txtcorreo, utilidad, this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        bnlimpiar = new javax.swing.JButton();
        bnagregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlcedula = new javax.swing.JLabel();
        ljdireccion = new javax.swing.JLabel();
        jlapellido = new javax.swing.JLabel();
        jlnombre = new javax.swing.JLabel();
        ljcorreo = new javax.swing.JLabel();
        jlcorreo = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        bnbuscar = new javax.swing.JButton();
        bnbuscarnumero = new javax.swing.JButton();
        bneliminar = new javax.swing.JButton();
        bnregistro = new javax.swing.JButton();
        bneditar = new javax.swing.JButton();
        jlcorreo1 = new javax.swing.JLabel();
        cmbbusqueda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtbuscarparametro = new javax.swing.JTextField();
        bnbuscarpersona = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuarchivo = new javax.swing.JMenu();
        jmenusalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmenuaccionbuscar = new javax.swing.JMenuItem();
        jMenueditar = new javax.swing.JMenuItem();
        jmenueliminar = new javax.swing.JMenuItem();
        jmenuguardar = new javax.swing.JMenuItem();
        menueditar = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        bnlimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnlimpiar.setText("Limpiar");
        bnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnlimpiarActionPerformed(evt);
            }
        });

        bnagregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnagregar.setText("Agregar");
        bnagregar.setToolTipText("Guardar registro");
        bnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnagregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registro de usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");

        jlcedula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcedula.setText("Cédula");

        ljdireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ljdireccion.setText("Dirección");

        jlapellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlapellido.setText("Apellido");

        jlnombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlnombre.setText("Nombre");

        ljcorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ljcorreo.setText("Correo");

        jlcorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo.setText("Teléfono");

        txtcedula.setToolTipText("Ingrese una cedula correcta");

        txtnombre.setToolTipText("Ingrese nombre");

        txtapellido.setToolTipText("Ingrese apellido");

        txtdireccion.setToolTipText("Ingrese una dirección");

        txtcorreo.setToolTipText("Ingrese un correo valido");

        txttelefono.setToolTipText("Ingrse un teléfono correcto");

        bnbuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnbuscar.setText("Buscar");
        bnbuscar.setToolTipText("Buscar por cedula");
        bnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbuscarActionPerformed(evt);
            }
        });

        bnbuscarnumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnbuscarnumero.setText("Buscar");
        bnbuscarnumero.setToolTipText("Buscar por numero");
        bnbuscarnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbuscarnumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ljdireccion)
                    .addComponent(jlapellido)
                    .addComponent(jlnombre)
                    .addComponent(ljcorreo)
                    .addComponent(jlcorreo)
                    .addComponent(jlcedula))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(bnbuscarnumero))
                            .addComponent(txtcorreo)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(bnbuscar)))))
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlcedula))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bnbuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlapellido)
                    .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ljdireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ljcorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcorreo)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnbuscarnumero))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bneliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneliminar.setText("Eliminar");
        bneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneliminarActionPerformed(evt);
            }
        });

        bnregistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnregistro.setText("Ver registro");
        bnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnregistroActionPerformed(evt);
            }
        });

        bneditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneditar.setText("Editar");
        bneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneditarActionPerformed(evt);
            }
        });

        jlcorreo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo1.setText("Buscar cliente");

        cmbbusqueda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbbusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Nombres", "Apellidos", "Telefono", "Correo" }));

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(modelTablePersona);
        jScrollPane1.setViewportView(jTable1);

        txtbuscarparametro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        bnbuscarpersona.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnbuscarpersona.setText("Buscar");
        bnbuscarpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbuscarpersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlcorreo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbuscarparametro, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(bnbuscarpersona))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bnagregar)
                        .addGap(31, 31, 31)
                        .addComponent(bneditar)
                        .addGap(29, 29, 29)
                        .addComponent(bneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(bnregistro)
                        .addGap(18, 18, 18)
                        .addComponent(bnlimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bneliminar)
                    .addComponent(bneditar)
                    .addComponent(bnagregar)
                    .addComponent(bnregistro)
                    .addComponent(bnlimpiar))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlcorreo1)
                            .addComponent(cmbbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbuscarparametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnbuscarpersona))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Clientes", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Proveedores", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Inventario", jPanel2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Venta", jPanel6);

        jMenuBar1.setForeground(new java.awt.Color(102, 255, 102));

        menuarchivo.setText("Archivo");

        jmenusalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenusalir.setText("Salir");
        jmenusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenusalirActionPerformed(evt);
            }
        });
        menuarchivo.add(jmenusalir);

        jMenu3.setText("Accion persona");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jmenuaccionbuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenuaccionbuscar.setText("Buscar");
        jmenuaccionbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuaccionbuscarActionPerformed(evt);
            }
        });
        jMenu3.add(jmenuaccionbuscar);

        jMenueditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenueditar.setText("Editar");
        jMenueditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenueditarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenueditar);

        jmenueliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenueliminar.setText("Eliminar");
        jmenueliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenueliminarActionPerformed(evt);
            }
        });
        jMenu3.add(jmenueliminar);

        jmenuguardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenuguardar.setText("Guardar");
        jmenuguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuguardarActionPerformed(evt);
            }
        });
        jMenu3.add(jmenuguardar);

        menuarchivo.add(jMenu3);

        jMenuBar1.add(menuarchivo);

        menueditar.setText("Editar");
        jMenuBar1.add(menueditar);

        jMenu4.setText("Acerca de ");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void editar() {
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = gestion.guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            try {
                if (controladorPersona.editar(personaEditarLocal)) {
                    JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                    gestion.limpiar();
                    personaEditar = null;

                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede editar persona", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } catch (HeadlessException | SQLException e) {
            }

        }
    }

    public void guardar() {
        //metodo para agregar
        if (controladorPersona.buscarPersonas(txtcedula.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, " La persona con ese número de cédula ya se encuentra registrada en el sistema. ");
        } else {
            controladorPersona = new Personabd();

            if (controladorPersona.RegistrarPersona(gestion.guardarEditar())) {
                JOptionPane.showMessageDialog(rootPane, "Usuario Guardado", "Guardado", JOptionPane.INFORMATION_MESSAGE);
                gestion.limpiar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void buscarcedula() {
        Persona persona = controladorPersona.buscarPersonas(txtcedula.getText());

        if (persona != null) {
            personaEditar = persona;
            txtcedula.setText(persona.getCedula());
            txtnombre.setText(persona.getNombre());
            txtapellido.setText(persona.getApellido());
            txtdireccion.setText(persona.getDireccion());
            txttelefono.setText(persona.getTelefono());
            txtcorreo.setText(persona.getCorreo());
            personaEditar = persona;

        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txttelefono.setText("");
            txttelefono.requestFocus();
        }
    }

    public void eliminar() {
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = gestion.guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            try {
                if (controladorPersona.eliminar(personaEditarLocal)) {
                    JOptionPane.showMessageDialog(rootPane, "Persona eliminadad con exito del sitema.");
                    gestion.limpiar();
                    personaEditar = null;

                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede eliminar persona", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } catch (HeadlessException e) {
            }

        }
    }
    private void jmenusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenusalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmenusalirActionPerformed

    private void jmenuaccionbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuaccionbuscarActionPerformed
        buscarcedula();
    }//GEN-LAST:event_jmenuaccionbuscarActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenueditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenueditarActionPerformed
        editar();
    }//GEN-LAST:event_jMenueditarActionPerformed

    private void jmenueliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenueliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_jmenueliminarActionPerformed

    private void jmenuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuguardarActionPerformed
        guardar();
    }//GEN-LAST:event_jmenuguardarActionPerformed

    private void bneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneditarActionPerformed
        editar();
        tabla();


    }//GEN-LAST:event_bneditarActionPerformed
    void tabla() {
        List<Persona> personasNombre = controladorPersona.buscarPersonasNombre(txtbuscarparametro.getText());
        modelTablePersona.setPersonas(personasNombre);
        modelTablePersona.fireTableDataChanged();

    }
    private void bnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnregistroActionPerformed
        List<Persona> obtenerPersonas = controladorPersona.obtenerPersonas();
        personaEditar = obtenerPersonas.get(obtenerPersonas.size() - 1);
        txtcedula.setText(personaEditar.getCedula());
        txtnombre.setText(personaEditar.getNombre());
        txtapellido.setText(personaEditar.getApellido());
        txtdireccion.setText(personaEditar.getDireccion());
        txttelefono.setText(personaEditar.getTelefono());
        txtcorreo.setText(personaEditar.getCorreo());
    }//GEN-LAST:event_bnregistroActionPerformed

    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
        eliminar();
        tabla();
    }//GEN-LAST:event_bneliminarActionPerformed

    private void bnbuscarnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbuscarnumeroActionPerformed
        Persona persona = controladorPersona.buscarPersonasNumero(txttelefono.getText());

        if (persona != null) {
            personaEditar = persona;
            txtcedula.setText(persona.getCedula());
            txtnombre.setText(persona.getNombre());
            txtapellido.setText(persona.getApellido());
            txtdireccion.setText(persona.getDireccion());
            txttelefono.setText(persona.getTelefono());
            txtcorreo.setText(persona.getCorreo());
            personaEditar = persona;

        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txttelefono.setText("");
            txttelefono.requestFocus();
        }
    }//GEN-LAST:event_bnbuscarnumeroActionPerformed

    private void bnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbuscarActionPerformed
        buscarcedula();
    }//GEN-LAST:event_bnbuscarActionPerformed

    private void bnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnagregarActionPerformed

        guardar();
        tabla();
    }//GEN-LAST:event_bnagregarActionPerformed

    private void bnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnlimpiarActionPerformed
        gestion.limpiar();
    }//GEN-LAST:event_bnlimpiarActionPerformed

    private void bnbuscarpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbuscarpersonaActionPerformed
        if (cmbbusqueda.getSelectedItem().equals("Nombres")) {
            List<Persona> personasNombre = controladorPersona.buscarPersonasNombre(txtbuscarparametro.getText());
            modelTablePersona.setPersonas(personasNombre);
            modelTablePersona.fireTableDataChanged();

        }



    }//GEN-LAST:event_bnbuscarpersonaActionPerformed

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
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnagregar;
    private javax.swing.JButton bnbuscar;
    private javax.swing.JButton bnbuscarnumero;
    private javax.swing.JButton bnbuscarpersona;
    private javax.swing.JButton bneditar;
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton bnlimpiar;
    private javax.swing.JButton bnregistro;
    private javax.swing.JComboBox<String> cmbbusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenueditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlapellido;
    private javax.swing.JLabel jlcedula;
    private javax.swing.JLabel jlcorreo;
    private javax.swing.JLabel jlcorreo1;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JMenuItem jmenuaccionbuscar;
    private javax.swing.JMenuItem jmenueliminar;
    private javax.swing.JMenuItem jmenuguardar;
    private javax.swing.JMenuItem jmenusalir;
    private javax.swing.JLabel ljcorreo;
    private javax.swing.JLabel ljdireccion;
    private javax.swing.JMenu menuarchivo;
    private javax.swing.JMenu menueditar;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscarparametro;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    public void clickPersona(Persona p) {

        System.out.println("Persona" + p.toString());

        txtcedula.setText(p.getCedula());
        txtnombre.setText(p.getNombre());
        txtapellido.setText(p.getApellido());
        txtdireccion.setText(p.getDireccion());
        txttelefono.setText(p.getTelefono());
        txtcorreo.setText(p.getCorreo());
        personaEditar = p;

    }
}
