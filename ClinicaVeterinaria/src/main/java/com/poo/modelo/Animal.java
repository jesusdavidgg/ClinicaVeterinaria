/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.modelo;

/**
 *
 * @author Jesus gudiño
 */
public class Animal {
    
    private String especie;
    private String nombre;
    private int edad;
    private int id;

    public Animal(String especie, String nombre, int edad, int id) {
 
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return nombre + " (" + especie + ", " + edad + " años)";
    }
    
    
    
}
