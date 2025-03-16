/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondepacientes;

public class ListaPacientes {
    private Paciente cabeza;

    public ListaPacientes() {
        this.cabeza = null;
    }

    // Agregar un nuevo paciente
    public void agregarPaciente(int id, String nombre, int edad, String clinica) {
        Paciente nuevo = new Paciente(id, nombre, edad, clinica);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Paciente actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        System.out.println("Paciente agregado correctamente.");
    }

    // Buscar un paciente por ID
    public Paciente buscarPaciente(int id) {
        Paciente actual = cabeza;
        while (actual != null) {
            if (actual.id == id) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Eliminar un paciente por ID
    public void eliminarPaciente(int id) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        if (cabeza.id == id) {
            cabeza = cabeza.siguiente;
            System.out.println("Paciente eliminado.");
            return;
        }
        Paciente actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.id != id) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("Paciente eliminado.");
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    // Mostrar todos los pacientes
    public void mostrarPacientes() {
        if (cabeza == null) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        Paciente actual = cabeza;
        while (actual != null) {
            actual.mostrarPaciente();
            actual = actual.siguiente;
        }
    }
}
