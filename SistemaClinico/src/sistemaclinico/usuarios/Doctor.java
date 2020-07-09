/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.usuarios;

import java.util.ArrayList;
import sistemaclinico.historiaclinica.Cita;

/**
 *
 * @author Administrator
 */
public class Doctor extends Persona {
    private int regDoctor;
    private String especialidad;
    private ArrayList<Cita> citas;
    
    public void recetar(){}
    public void agregarPlanNut(){}
    public void ImprimirReceta(){}
    public void registrarSecretaria(){}
}
