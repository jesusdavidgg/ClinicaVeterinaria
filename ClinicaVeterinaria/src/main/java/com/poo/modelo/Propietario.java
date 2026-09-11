/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus Gudiño
 */
public class Propietario {
    
    private String nombre;
    private int telefono;
    private List<Mascota>mascotas;

    public Propietario(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mascotas = new ArrayList<>();
    }
    
     public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
        mascota.setPropietario(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

       public List<Mascota> getMascotas() {
       return mascotas;
   }
    
     @Override
    public String toString() {
        return nombre + " (Tel: " + telefono + ")";
    }
}
