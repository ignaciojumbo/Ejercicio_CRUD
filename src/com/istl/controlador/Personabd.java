package com.istl.controlador;

import com.istl.conexionbd.Conexion;
import com.istl.modelo.Persona;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;

public class Personabd {

    Statement stm = null;
    Connection con = null;
    Conexion conexion = new Conexion();

    public boolean RegistrarPersona(Persona persona) {
        boolean registrar = false;
        
        String sql = "INSERT INTO `bdejercicio1`.`persona1` (`Cedula`, `Nombre`, `Apellido`, `Direccion`, `Correo`, `Telefono`) "
                + "VALUES ('"+persona.getCedula()+"', '"+persona.getNombre()+"', '"+persona.getApellido()+"', '"+persona.getDireccion()+"', '"+persona.getCorreo()+"', '"+persona.getTelefono()+"')";
        
        try {
            
            con = conexion.getConexion();
            stm = (Statement) con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());

        }

        return registrar;

    }

    public void eliminar(Persona persona) throws SQLException {
        String sql = "delete from persona1 where idpersona1 = 2";
       
        con = conexion.getConexion();
        stm = (Statement) con.createStatement();
        stm.execute(sql);
        stm.close();
        con.close();

    }

    public void editar(Persona persona) throws SQLException {
        String sql = "update persona1 set nombre = 'Juan' where idpersona1 = 2 ";
        con = conexion.getConexion();
        stm = (Statement) con.createStatement();
        stm.execute(sql);
        stm.close();
        con.close();

    }

}
