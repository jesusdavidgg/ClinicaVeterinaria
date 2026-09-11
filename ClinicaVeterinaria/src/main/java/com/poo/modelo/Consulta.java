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
public class Consulta {
    private String fecha;
    private String motivo;
    private Mascota mascota;
    private List<Medicamento> medicamentos;

    public Consulta(String fecha, String motivo, Mascota mascota) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento medicamento){
        this.medicamentos.add(medicamento);
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
   

    
    
    
    
}
