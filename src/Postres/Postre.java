package Postres;
import Adicionales.Aderezo;
import java.util.ArrayList;

import Adicionales.Aderezo;

public abstract class Postre {
	private String sabor;
    private ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor) {
    	this.sabor= sabor;
    }
    
    public String getSabor() {
    	return this.sabor;
    }
    
    public ArrayList<Aderezo> getAderezos(){
    	return this.aderezos;
    }
    
    public void anadirAderezo(Aderezo aderezo){
        aderezos.add(aderezo);
    }
    
    public void quitarAderezo(Aderezo aderezo){
        aderezos.remove(aderezo);
    }
    
    
}
