/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Juan Xavier Pita
 */
public class Crema extends Aderezo{

    public Crema(String nombre) {
        super(nombre);
    }
    
    @Override
    public void setNombre() {
        this.nombre = "CREMA";
    }

}
