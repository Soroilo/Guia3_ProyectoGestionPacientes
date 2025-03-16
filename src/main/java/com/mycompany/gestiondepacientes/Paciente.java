/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondepacientes;

public class Paciente {
    int id;
    String nombre;
    int edad;
    String clinica;
    Paciente siguiente;

    public Paciente(int id, String nombre, int edad, String clinica) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.clinica = clinica;
        this.siguiente = null;
    }

    public void mostrarPaciente() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " | Clínica: " + clinica);
    }
}
