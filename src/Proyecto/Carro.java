/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Carro implements Serializable{
    public static final long SerialVersionUID = 1L;
    private String fecha;
    private String Auto;
    private String ter;

    public Carro(String fecha, String Auto, String ter) {
        this.fecha = fecha;
        this.Auto = Auto;
        this.ter = ter;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAuto() {
        return Auto;
    }

    public void setAuto(String Auto) {
        this.Auto = Auto;
    }

    public String getTer() {
        return ter;
    }

    public void setTer(String ter) {
        this.ter = ter;
    }
    
    
}
