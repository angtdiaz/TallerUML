/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.historiaclinica;

import java.util.Date;



/**
 *
 * @author Carlos
 */
public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;

    public Cita() {
    }
    
    public void realizarPago(Pago pago){
        
    }
}
