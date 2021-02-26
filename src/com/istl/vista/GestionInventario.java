package com.istl.vista;

import com.istl.modelo.Inventario;
import com.istl.utilidad.UtilidadInventario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GestionInventario {

    private JTextField txtcodigo_pro;
    private JTextField txtdescripción;
    private JTextField txtprecios_compra;
    private JTextField txtprecio_venta;
    private JTextField txtcan_productos;
    private JFrame frame;
    

    public GestionInventario(JTextField txtcodigo_pro, JTextField txtdescripción, JTextField txtprecios_compra, JTextField txtprecio_venta, JTextField txtcan_productos, JFrame frame) {
        this.txtcodigo_pro = txtcodigo_pro;
        this.txtdescripción = txtdescripción;
        this.txtprecios_compra = txtprecios_compra;
        this.txtprecio_venta = txtprecio_venta;
        this.txtcan_productos = txtcan_productos;
        this.frame = frame;
    }

    public JTextField getTxtcodigo_pro() {
        return txtcodigo_pro;
    }

    public void setTxtcodigo_pro(JTextField txtcodigo_pro) {
        this.txtcodigo_pro = txtcodigo_pro;
    }

    public JTextField getTxtdescripción() {
        return txtdescripción;
    }

    public void setTxtdescripción(JTextField txtdescripción) {
        this.txtdescripción = txtdescripción;
    }

    public JTextField getTxtprecios_compra() {
        return txtprecios_compra;
    }

    public void setTxtprecios_compra(JTextField txtprecios_compra) {
        this.txtprecios_compra = txtprecios_compra;
    }

    public JTextField getTxtprecio_venta() {
        return txtprecio_venta;
    }

    public void setTxtprecio_venta(JTextField txtprecio_venta) {
        this.txtprecio_venta = txtprecio_venta;
    }

    public JTextField getTxtcan_productos() {
        return txtcan_productos;
    }

    public void setTxtcan_productos(JTextField txtcan_productos) {
        this.txtcan_productos = txtcan_productos;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void limpiar() {
        txtcodigo_pro.setText("");
        txtdescripción.setText("");
        txtprecios_compra.setText("");
        txtprecio_venta.setText("");
        txtcan_productos.setText("");

    }

    public Inventario guardarEditar() {
        Inventario p = new Inventario();
        if (txtcodigo_pro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "LLene los campos del codigo", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcodigo_pro.requestFocus();
            return null;
        }
       
        if (txtdescripción.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del nombre de la descripcion");
            txtdescripción.requestFocus();
            return null;
        }
        if (txtprecio_venta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "LLene los campos del precio de la venta");
            txtprecio_venta.requestFocus();
            return null;
        }
        if (txtprecios_compra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "LLene los campos del precio de la venta", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtprecio_venta.requestFocus();// sirve para ubicar el cursor en el campo vacio
            return null;
        }

        if (txtcan_productos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "LLene los campos de la cantidad de la cantidad de productos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcan_productos.requestFocus();
            return null;
        }

        p.setCodigo_pro(txtcodigo_pro.getText());
        p.setDescripción(txtdescripción.getText());
        p.setPrecio_venta(txtprecio_venta.getText());
        p.setPrecios_compra(txtprecios_compra.getText());
        p.setCan_productos(Integer.valueOf(txtcan_productos.getText()));

        return p;

    }

}
