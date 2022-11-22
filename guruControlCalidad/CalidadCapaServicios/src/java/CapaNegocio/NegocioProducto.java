/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.ConexionMySQL;
import CapaDTO.Producto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x
 */
public class NegocioProducto {
     private ConexionMySQL conec1;

    /**
     * @return the conec1
     */
    public ConexionMySQL getConec1() {
        return conec1;
    }

    /**
     * @param conec1 the conec1 to set
     */
    public void setConec1(ConexionMySQL conec1) {
        this.conec1 = conec1;
    }
    
    
    public void configurarConexion()
    {
         this.setConec1( new ConexionMySQL());
         this.getConec1().setNombreBaseDatos("jdbc:mysql://localhost/calidad");
         this.getConec1().setNombreTabla("producto");
         this.getConec1().setCadenaConexion("com.mysql.cj.jdbc.Driver");
         this.getConec1().setUsuario("root");
         this.getConec1().setPass("");

    }
    
    //Insertar en tabla
    public void insertarTransaccion(Producto producto)
    {


        this.configurarConexion();
        this.getConec1().setCadenaSQL("INSERT INTO " + this.getConec1().getNombreTabla()
                                      + " (num_captura, fecha )"
                                      + " VALUES"
                                      + " ('"+producto.getNum_captura()+ "','"
                                      +producto.getFecha() +"');");
        this.getConec1().setEsSelect(false);
        this.getConec1().conectar();
    
    } //Fin insertar

    
    } //Fin insertar
    
   
    

