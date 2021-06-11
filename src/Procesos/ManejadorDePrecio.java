package Procesos;

import Postres.Postre;

public abstract class ManejadorDePrecio {

    public static double calcularPrecioFinal(Postre postre){

        return (postre.getPrecioFinal()+(postre.getPrecioFinal()*0.12)) + postre.getAderezos().size()*0.50;       
    }
	public abstract String showPrecioFinal();

    
    public static String showPrecioFinal(Postre postre){
        return "Precio Final: $ " + calcularPrecioFinal(postre);
    }        
        
}
