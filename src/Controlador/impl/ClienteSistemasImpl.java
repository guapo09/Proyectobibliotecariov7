/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.impl;

import Clases.ConexionDB;
import Controlador.DAOO.iClienteSistemasDao;
    import Modelo.ClienteSistemas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */
public abstract  class ClienteSistemasImpl implements iClienteSistemasDao{
        public boolean insertarClienteSistema(ClienteSistemas clienteSistema) {

        boolean estado = true;

        try {

            String insertSQL = "insert into clientessistemas(dni, nombre, email, edad, estadocivil, sexo)values(?,?,?,?,?,?)";
            PreparedStatement ps = Util.ConexionDB.getConexionDB().prepareStatement(insertSQL);
            ps.setInt(1, clienteSistema.getDni());
            ps.setString(2, clienteSistema.getNombre());
            ps.setString(3, clienteSistema.getEmail());
            ps.setInt(4, clienteSistema.getEdad());
            ps.setString(5, clienteSistema.getEstadoCivil());
            ps.setString(6, clienteSistema.getSexo());

            ps.execute();
            Util.ConexionDB.getConexionDB().commit();
            estado = false;

        } catch (SQLException ex) {
            try {
                System.out.println(ex.getMessage());
                Util.ConexionDB.getConexionDB().rollback();// deshace lo que intentaste 
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return estado;

    }
        
        
    }


     


