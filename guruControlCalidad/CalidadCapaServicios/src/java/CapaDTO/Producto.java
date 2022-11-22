/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDTO;

import java.sql.Date;




/**
 *
 * @author x
 */
public class Producto {
     private String num_captura;
     private Date fecha;

    /**
     * @return the num_captura
     */
    public String getNum_captura() {
        return num_captura;
    }

    /**
     * @param num_captura the num_captura to set
     */
    public void setNum_captura(String num_captura) {
        this.num_captura = num_captura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Producto(String num_captura, Date fecha) {
        this.num_captura = num_captura;
        this.fecha = fecha;
    }

    


    /**
     * @return the fecha
     */


    
    
}
