/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico.usuarios;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Persona {
    protected String usuario, clave, nombre, apellido, cedula, direccion;
    protected Date fechaNac;
    protected Administrador admi;
    
    public boolean logIn(){
    return true;
    }
    public boolean logOut(){
    return true;
    }
}
