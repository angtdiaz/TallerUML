/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.HistoriaClinica;

import java.util.Date;
import sistemaclinico.Pago.Pago;
import sistemaclinico.Usuarios.Doctor;
import sistemaclinico.Usuarios.Paciente;



/**
 *
 * @author Carlos
 */
public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente paciente;
    protected Doctor doctor;

    public Cita() {
    }
    
    public void realizarPago(Pago pago){
        
    }
}
