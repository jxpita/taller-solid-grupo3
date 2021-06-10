/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author gabrielaramos
 */
public abstract class Postres {
    private String sabor;
    private ArrayList<Aderezo> aderezos;

    public Postres(String sabor) {
        this.sabor = sabor;

    }

    public String getSabor() {
        return sabor;
    }
    
    
    public ArrayList<Aderezo> getAderezos(){
        return this.aderezos;
    }
   
        
    
}
