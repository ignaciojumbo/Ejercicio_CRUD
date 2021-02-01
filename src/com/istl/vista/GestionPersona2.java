package com.istl.vista;

import com.istl.controlador.Personabd;
import com.istl.modelo.Persona;
import com.istl.utilidad.Utilidad;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestionPersona2 extends javax.swing.JFrame {

    private Utilidad utilidad;
    private Personabd controladorPersona;
    private Persona personaEditar;

    public GestionPersona2() {
        initComponents();
        this.setLocationRelativeTo(null);
        utilidad = new Utilidad();
        controladorPersona = new Personabd();
    }

    private void limpiar() {
        txtcedula.setText(" ");
        txtnombre.setText(" ");
        txtapellido.setText(" ");
        txtdireccion.setText(" ");
        txttelefono.setText(" ");
        txtcorreo.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
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
        bnlimpiar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bnagregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnagregar.setText("Agregar");
        bnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnagregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        bnbuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnbuscar.setText("Buscar");
        bnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbuscarActionPerformed(evt);
            }
        });

        bnbuscarnumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnbuscarnumero.setText("Buscar");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnbuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnbuscarnumero))
                    .addComponent(txtcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 78, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlapellido)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ljdireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ljcorreo)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        bnlimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnlimpiar.setText("Limpiar");
        bnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnagregar)
                        .addGap(18, 18, 18)
                        .addComponent(bneditar)
                        .addGap(28, 28, 28)
                        .addComponent(bneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(bnregistro)
                        .addGap(18, 18, 18)
                        .addComponent(bnlimpiar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bneliminar)
                    .addComponent(bneditar)
                    .addComponent(bnagregar)
                    .addComponent(bnregistro)
                    .addComponent(bnlimpiar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneditarActionPerformed
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            try {
                if (controladorPersona.editar(personaEditarLocal)) {
                    JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                    limpiar();
                    personaEditar = null;

                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede editar persona", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } catch (HeadlessException | SQLException e) {
            }

        }
    }//GEN-LAST:event_bneditarActionPerformed

    private void bnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnagregarActionPerformed
        //metodo para agregar
        if (controladorPersona.buscarPersonas(txtcedula.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, " La persona con ese número de cédula ya se encuentra registrada en el sistema. ");
        } else {
            controladorPersona = new Personabd();

            if (controladorPersona.RegistrarPersona(guardarEditar())) {
                JOptionPane.showMessageDialog(rootPane, "Usuario Guardado", "Guardado", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_bnagregarActionPerformed

    private void bnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnregistroActionPerformed
        ArrayList<Persona> obtenerPersonas = controladorPersona.obtenerPersonas();
        personaEditar = obtenerPersonas.get(obtenerPersonas.size() - 1);
        txtcedula.setText(personaEditar.getCedula());
        txtnombre.setText(personaEditar.getNombre());
        txtapellido.setText(personaEditar.getApellido());
        txtdireccion.setText(personaEditar.getDireccion());
        txttelefono.setText(personaEditar.getTelefono());
        txtcorreo.setText(personaEditar.getCorreo());
    }//GEN-LAST:event_bnregistroActionPerformed

    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            try {
                if (controladorPersona.eliminar(personaEditarLocal)) {
                    JOptionPane.showMessageDialog(rootPane, "Persona eliminadad con exito del sitema.");
                    limpiar();
                    personaEditar = null;

                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede eliminar persona", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } catch (HeadlessException e) {
            }

        }
    }//GEN-LAST:event_bneliminarActionPerformed

    private void bnbuscarnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbuscarnumeroActionPerformed
        Persona persona = controladorPersona.buscarPersonasNumero(txttelefono.getText());
        personaEditar = persona;

        if (persona != null) {
            personaEditar = persona;
            txtcedula.setText(persona.getCedula());
            txtnombre.setText(persona.getNombre());
            txtapellido.setText(persona.getApellido());
            txtdireccion.setText(persona.getDireccion());
            txttelefono.setText(persona.getTelefono());
            txtcorreo.setText(persona.getCorreo());

        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txttelefono.setText("");
            txttelefono.requestFocus();
        }
    }//GEN-LAST:event_bnbuscarnumeroActionPerformed

    private void bnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbuscarActionPerformed
         Persona persona = controladorPersona.buscarPersonas(txtcedula.getText());
         persona = personaEditar;

        if (persona != null) {
            personaEditar = persona;
            txtcedula.setText(persona.getCedula());
            txtnombre.setText(persona.getNombre());
            txtapellido.setText(persona.getApellido());
            txtdireccion.setText(persona.getDireccion());
            txttelefono.setText(persona.getTelefono());
            txtcorreo.setText(persona.getCorreo());

        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcedula.setText("");
            txtcedula.requestFocus();
        }
    }//GEN-LAST:event_bnbuscarActionPerformed

    private void bnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_bnlimpiarActionPerformed

    public Persona guardarEditar() {
        Persona p = new Persona();
        if (txtcedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "LLene los campos de nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcedula.requestFocus();
            return null;
        }
        if (!utilidad.validadorDeCedula(txtcedula.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Error de cedula", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcedula.requestFocus();
            return null;

        }
        if (txtnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del nombre");
            txtnombre.requestFocus();
            return null;
        }
        if (txtapellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del apellido");
            txtapellido.requestFocus();
            return null;
        }
        if (txtdireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "LLene los campos de direccion", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtdireccion.requestFocus();// sirve para ubicar el cursor en el campo vacio
            return null;
        }

        if (txtcorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del correo");
            txtcorreo.requestFocus();
            return null;
        }
        if (!utilidad.validarCorreo(txtcorreo.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Error Correo", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcorreo.requestFocus();
            return null;
        }
        if (txttelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del correo");
            txttelefono.requestFocus();
            return null;
        }
        if (!utilidad.validarNumero(txttelefono.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Error numero", "ERROR", JOptionPane.ERROR_MESSAGE);
            txttelefono.requestFocus();
            return null;

        }
        p.setCedula(txtcedula.getText());
        p.setNombre(txtnombre.getText());
        p.setApellido(txtapellido.getText());
        p.setDireccion(txtdireccion.getText());
        p.setCorreo(txtcorreo.getText());
        p.setTelefono(txttelefono.getText());
        return p;

    }

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
            java.util.logging.Logger.getLogger(GestionPersona2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPersona2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPersona2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPersona2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPersona2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnagregar;
    private javax.swing.JButton bnbuscar;
    private javax.swing.JButton bnbuscarnumero;
    private javax.swing.JButton bneditar;
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton bnlimpiar;
    private javax.swing.JButton bnregistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlapellido;
    private javax.swing.JLabel jlcedula;
    private javax.swing.JLabel jlcorreo;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel ljcorreo;
    private javax.swing.JLabel ljdireccion;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
