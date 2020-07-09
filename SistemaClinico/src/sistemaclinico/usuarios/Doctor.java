/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.usuarios;

import sistemaclinico.areamedica.AreaMedica;

/**
 *
 * @author Administrator
 */
public class Doctor extends Persona {
    private int regDoctor;
    private String especialidad;
    private Secretaria secretaria;
    private AreaMedica area;
    
    public void recetar(){}
    public void agregarPlanNut(){}
    public void ImprimirReceta(){}
    public void registrarSecretaria(){}
}
