/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.vista;

import com.poo.modelo.Propietario;
import com.poo.modelo.Mascota;
import com.poo.modelo.Consulta;
import com.poo.modelo.Medicamento;
import java.util.List;

/**
 *
 * @author Jesus Gudiño
 */
public class VeterinariaVista {
    
    public void mostrarPropietariosConMascotas(List<Propietario> propietarios) {
        System.out.println("===== PROPIETARIOS Y SUS MASCOTAS =====");
        for (Propietario p : propietarios) {
            System.out.println("Propietario: " + p.getNombre());
            for (Mascota m : p.getMascotas()) {
                System.out.println("   - Mascota: " + m.getNombre() 
                    + " | Especie: " + m.getEspecie() 
                    + " | Raza: " + m.getRaza());
            }
            System.out.println("----------------------------------------");
        }
    }

    public void mostrarConsultas(List<Consulta> consultas) {
        System.out.println("===== CONSULTAS REALIZADAS =====");
        for (Consulta c : consultas) {
            System.out.println("Fecha: " + c.getFecha());
            System.out.println("Motivo: " + c.getMotivo());
            System.out.println("Mascota atendida: " + c.getMascota().getNombre());
            System.out.println("----------------------------------------");
        }
    }

    public void mostrarMedicamentosRecetados(List<Consulta> consultas) {
        System.out.println("===== MEDICAMENTOS RECETADOS =====");
        for (Consulta c : consultas) {
            System.out.println("Consulta de " + c.getMascota().getNombre() + ":");
            for (Medicamento med : c.getMedicamentos()) {
                System.out.println("   - " + med);
            }
            System.out.println("----------------------------------------");
        }
    }
}