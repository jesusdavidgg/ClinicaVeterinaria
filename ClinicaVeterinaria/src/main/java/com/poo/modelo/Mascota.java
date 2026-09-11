    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.modelo;

/**
 *
 * @author Jesus Gudiño
 */
public class Mascota extends Animal {
    
private Propietario propietario;
private String raza;

    public Mascota(int id, String nombre, String especie, int edad, String raza) {
    super(especie, nombre, edad, id); 
    this.raza = raza;
}

  
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public Propietario getPropietario() {  
        return propietario;
    }

    public void setPropietario(Propietario propietario) {  
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return getNombre() + " (" + getEspecie() + ", " + raza + ", " + getEdad() + " años)";
    }



    
}
