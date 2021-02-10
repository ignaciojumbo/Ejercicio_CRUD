/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istl.modelJTable;

import com.istl.modelo.Persona;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IDEAPAD 330
 */
public class ModelTablePersona extends AbstractTableModel {

    public String[] n_colNames = {"CÉDULA", "NOMBRE", "APELLIDO", "DIRECIÓN", "TELÉFONO", "CORREO"};
    public List<Persona> persona;

    public ModelTablePersona(List<Persona> persona){
        this.persona = persona;
        
    }
    @Override
    public int getRowCount() {
        //determina el numero de fila que tengo en mi tabla
        return persona.size();
    }

    @Override
    public int getColumnCount() {
        return n_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = this.persona.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return persona.getCedula();
            case 1:
                return persona.getNombre();
            case 2:
                return persona.getApellido();
            case 3:
                return persona.getDireccion();
            case 4:
                return persona.getTelefono();
            case 5:
                return persona.getCorreo();
                
        }
        return new String();
    }

    public String getColumnName(int column) {
        return n_colNames[column];
    }

}
