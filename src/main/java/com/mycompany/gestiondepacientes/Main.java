/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondepacientes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaPacientes lista = new ListaPacientes();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("\n=== Sistema de Gestión de Pacientes ===");
                System.out.println("1. Agregar Paciente");
                System.out.println("2. Buscar Paciente");
                System.out.println("3. Eliminar Paciente");
                System.out.println("4. Mostrar Pacientes");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Edad: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Clínica: ");
                        String clinica = scanner.nextLine();
                        lista.agregarPaciente(id, nombre, edad, clinica);
                    }
                        
                    case 2 -> {
                        System.out.print("Ingrese ID del paciente a buscar: ");
                        int idBuscar = scanner.nextInt();
                        Paciente encontrado = lista.buscarPaciente(idBuscar);
                        if (encontrado != null) {
                            encontrado.mostrarPaciente();
                        } else {
                            System.out.println("Paciente no encontrado.");
                        }
                    }
                        
                    case 3 -> {
                        System.out.print("Ingrese ID del paciente a eliminar: ");
                        int idEliminar = scanner.nextInt();
                        lista.eliminarPaciente(idEliminar);
                    }
                        
                    case 4 -> lista.mostrarPacientes();
                        
                    case 5 -> System.out.println("Saliendo del sistema...");
                        
                    default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
                }
            } while (opcion != 5);
        }
    }
}
