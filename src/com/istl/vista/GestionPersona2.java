package com.istl.vista;

import com.istl.controlador.Personabd;
import com.istl.modelo.Persona;
import com.istl.utilidad.Utilidad;
import javax.swing.JOptionPane;

public class GestionPersona2 extends javax.swing.JFrame {

    Utilidad utilidad;
    Personabd personabd;

    public GestionPersona2() {
        initComponents();
        this.setLocationRelativeTo(null);
        utilidad = new Utilidad();
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
        bneliminar = new javax.swing.JButton();
        bnregistro = new javax.swing.JButton();
        bneditar = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlcedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ljdireccion)
                            .addComponent(jlapellido)
                            .addComponent(jlnombre)
                            .addComponent(ljcorreo)
                            .addComponent(jlcorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtcorreo)
                            .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcedula)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        bneliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneliminar.setText("Eliminar");

        bnregistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnregistro.setText("Ver registro");

        bneditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneditar.setText("Editar");
        bneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(bnagregar)
                        .addGap(43, 43, 43)
                        .addComponent(bneditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(bnregistro)))
                .addContainerGap(30, Short.MAX_VALUE))
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
                    .addComponent(bnregistro))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bneditarActionPerformed

    private void bnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnagregarActionPerformed
        Persona p = new Persona();
        if (txtcedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "LLene los campos de nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcedula.requestFocus();
            return;
        }
        if (!utilidad.validadorDeCedula(txtcedula.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Error de cedula", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcedula.requestFocus();
            return;

        }
        if (txtnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del nombre");
            txtnombre.requestFocus();
            return;
        }
        if (txtapellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del apellido");
            txtapellido.requestFocus();
            return;
        }
        if (txtdireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "LLene los campos de direccion", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtdireccion.requestFocus();// sirve para ubicar el cursor en el campo vacio
            return;
        }

        if (txtcorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del correo");
            txtcorreo.requestFocus();
            return;
        }
        if (!utilidad.validarCorreo(txtcorreo.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Error Correo", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcorreo.requestFocus();
            return;
        }
        if (txttelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del correo");
            txttelefono.requestFocus();
            return;
        }
        if (!utilidad.validarNumero(txttelefono.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Error numero", "ERROR", JOptionPane.ERROR_MESSAGE);
            txttelefono.requestFocus();
            return;

        }
        p.setCedula(txtcedula.getText());
        p.setNombre(txtnombre.getText());
        p.setApellido(txtapellido.getText());
        p.setDireccion(txtdireccion.getText());
        p.setCorreo(txtcorreo.getText());
        p.setTelefono(txttelefono.getText());

        personabd = new Personabd();

        if (personabd.RegistrarPersona(p)) {
            JOptionPane.showMessageDialog(rootPane, "Usuario Guardado", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_bnagregarActionPerformed

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
    private javax.swing.JButton bneditar;
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton bnregistro;
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
