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
public class Oficina {
    private String direccion;
    public Oficina(String direccion){
        this.direccion = direccion;
    }
    public String darDireccion(){
        return this.direccion;
    }
}
