/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.controlador;
import com.poo.modelo.Propietario;
import com.poo.modelo.Mascota;
import com.poo.modelo.Veterinario;
import com.poo.modelo.Consulta;
import com.poo.modelo.Medicamento;
import com.poo.vista.VeterinariaVista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus Gudiño
 */


public class ClinicaControlador {
    
    private VeterinariaVista vista;
    
    public ClinicaControlador() {
        this.vista = new VeterinariaVista();
    }
    public void iniciar(){
      Mascota firulais = new Mascota(1, "Firulais", "Perro", 3, "Labrador");
    Mascota michi = new Mascota(2, "Michi", "Gato", 2, "Siames");
    Mascota rocky = new Mascota(3, "Rocky", "Perro", 5, "Bulldog");


    
    
       Propietario juan = new Propietario("Juan Perez", 30012345);
        juan.agregarMascota(firulais);
        juan.agregarMascota(michi);

        Propietario maria = new Propietario("Maria Gomez", 30098765);
        maria.agregarMascota(rocky);

        List<Propietario> propietarios = new ArrayList<>();
        propietarios.add(juan);
        propietarios.add(maria);

        
        Veterinario drPerez = new Veterinario("Dr. Perez", "Medicina General");
        Veterinario draLopez = new Veterinario("Dra. Lopez", "Cirugía");

        
        Consulta consultaFirulais = new Consulta("10/09/2026", "Chequeo general", firulais);
        Consulta consultaRocky = new Consulta("11/09/2026", "Vacunacion", rocky);

        List<Consulta> consultas = new ArrayList<>();
        consultas.add(consultaFirulais);
        consultas.add(consultaRocky);

        
        Medicamento antibiotico = new Medicamento("Amoxicilina", "250mg cada 12h");
        Medicamento antiparasitario = new Medicamento("Ivermectina", "1 dosis unica");
        Medicamento vitaminas = new Medicamento("Vitamina B12", "1 dosis semanal");

        
        drPerez.recetar(consultaFirulais, antibiotico);
        drPerez.recetar(consultaFirulais, antiparasitario);
        draLopez.recetar(consultaRocky, vitaminas);

        
        vista.mostrarPropietariosConMascotas(propietarios);
        vista.mostrarConsultas(consultas);
        vista.mostrarMedicamentosRecetados(consultas);
    }
}
