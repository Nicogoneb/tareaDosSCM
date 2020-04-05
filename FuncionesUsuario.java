/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadosigenieriadesoftware;

import tareadosigenieriadesoftware.Usuario;
/**
 *
 * @author Nicolas
 */
public class FuncionesUsuario {
    public int calculoDeImpuestos(){
        int retorno = 0;
        Usuario u = new Usuario();
        
        int edad = u.getEdad();
        int cantidadDeHijos = u.getCantidadDeHijos();
        
        if(edad>65){
            retorno = 2000;
        } else {
            if(edad>=30 && edad<=65){
                retorno = 7000;
            }
            if(edad>=18 && edad<=30){
                retorno = 2000;
            }
            if(edad<18){
                retorno = 0;
            }
        }
        
        if(cantidadDeHijos>0){
            Double temp = retorno*0.03;
            if(temp < retorno/2){
                retorno = retorno + temp.intValue();
            } else {
                retorno = retorno + retorno /2;
            }
        }
        
        return retorno ;
    }
}
