/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.Usuarios;

import sistemaclinico.AreaMedica.AreaMedica;
import java.util.ArrayList;
import sistemaclinico.HistoriaClinica.Cita;
import sistemaclinico.Receta.Receta;

/**
 *
 * @author Administrator
 */
public class Doctor extends Persona {
    private int regDoctor;
    private String especialidad;
    private Secretaria secretaria;
    private AreaMedica area;
    private ArrayList<Receta> recetas;

    private ArrayList<Cita> citas;
    
    public void recetar(){}
    public void agregarPlanNut(){}
    public void ImprimirReceta(){}
    public void registrarSecretaria(){}
}
