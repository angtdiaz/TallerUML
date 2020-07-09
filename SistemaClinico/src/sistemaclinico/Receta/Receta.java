/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.Receta;

import java.util.ArrayList;
import java.util.Date;
import sistemaclinico.Usuarios.Doctor;

/**
 *
 * @author Carlos
 */
public class Receta {
    protected Date fecha;
    protected PlanNutricional plan;
    protected ArrayList<Medicamento> medicamentos;
    protected Doctor doctor;
    
    public Receta() {
    }
    
}
