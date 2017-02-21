/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    public Oficina trabaja;
    public String darDireccion(){
        return(this.trabaja.darDireccion());
    }
    public Persona (String nombre){
        this.nombre = nombre;
    }
}
