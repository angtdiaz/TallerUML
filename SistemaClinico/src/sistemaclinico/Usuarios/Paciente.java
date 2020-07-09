/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.Usuarios;

import java.util.ArrayList;
import sistemaclinico.HistoriaClinica.Cita;
import sistemaclinico.HistoriaClinica.HistoriaClinica;
import sistemaclinico.Receta.Receta;

/**
 *
 * @author Administrator
 */
public class Paciente {
    private String email;
    private ArrayList<Receta> receta;
    private HistoriaClinica historiaClinica;
    private Cita cita;
    
    public boolean solicitarCita(){
    return true;
    };
}
