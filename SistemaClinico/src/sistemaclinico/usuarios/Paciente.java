/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.usuarios;

import java.util.ArrayList;
import sistemaclinico.historiaclinica.Cita;
import sistemaclinico.historiaclinica.HistoriaClinica;
import sistemaclinico.receta.Receta;

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
