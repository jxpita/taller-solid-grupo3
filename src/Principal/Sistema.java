/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.*;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
//        LecheEntera leche = new LecheDeslactosada();
//        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
//        
//        // Producir Helado
//        Postre helado_vainilla = new Helado("Vainilla");
//        helado_vainilla.anadirAderezo(new Crema());
//        helado_vainilla.anadirAderezo(new Frutilla());
//        System.out.println(helado_vainilla);
//        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
//        System.out.println(helado_vainilla.showPrecioFinal());
//        
//        // Producir Pastel
//        Postre pastel_chocolate = new Pastel("Chocolate");
//        pastel_chocolate.quitarAderezo(new Crema());
//        pastel_chocolate.anadirAderezo(new Frutilla());
//        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
//        System.out.println(helado_vainilla.showPrecioFinal());


        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada

        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDeslactosada());
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.anadirAderezo(new Crema());
            postre.anadirAderezo(new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
        });        
        

        
        
    }
}
