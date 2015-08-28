/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandademusica;

/**
 *
 * @author Sebastian
 */
public class integrante {
    instrumentos mi_instrumentos;
    public integrante(instrumentos ins){
        mi_instrumentos = ins;
    }
    public void TocarInstrumento(){
        mi_instrumentos.tocar('C');
    }
    public void CambiarInstrumento(instrumentos ins){
        mi_instrumentos=ins;
    }
}
