Sistema de Gestión de Pacientes

Descripción del Proyecto

Este proyecto es un sistema de software desarrollado en Java con NetBeans, diseñado para administrar la información de pacientes atendidos en distintas clínicas de la ciudad. Utiliza una lista enlazada simple para optimizar la inserción y eliminación de registros sin la necesidad de reestructurar bases de datos.

Objetivo

El sistema permite el registro, consulta, modificación y eliminación de pacientes de manera eficiente, facilitando la gestión y recuperación de información de forma rápida y ordenada.

Características del Sistema

Registro de Pacientes: Cada paciente cuenta con un identificador único (ID), nombre, edad y clínica donde recibe atención.

Gestión de Pacientes:

Agregar nuevos pacientes.

Buscar pacientes por su ID.

Eliminar pacientes registrados.

Mostrar la lista completa de pacientes.

Estructura de Datos: Implementación de una lista enlazada simple para almacenar y gestionar los datos.

Requisitos

Java JDK 8 o superior

NetBeans IDE

Conocimientos básicos de Java

Instalación y Ejecución

Clonar el repositorio

git clone https://github.com/usuario/gestion-pacientes.git

Abrir en NetBeans

Abrir NetBeans.

Seleccionar "File" → "Open Project".

Buscar la carpeta del proyecto y abrirlo.

Ejecutar el proyecto

Ir a "Run" → "Run Main Project" o presionar Shift + F6.

Uso del Sistema

Al ejecutar el sistema, aparecerá un menú con las siguientes opciones:

=== Sistema de Gestión de Pacientes ===
1. Agregar Paciente
2. Buscar Paciente
3. Eliminar Paciente
4. Mostrar Pacientes
5. Salir

Agregar Paciente: Se solicitarán el ID, nombre, edad y clínica del paciente.

Buscar Paciente: Ingresar el ID para consultar la información del paciente.

Eliminar Paciente: Ingresar el ID para eliminarlo del sistema.

Mostrar Pacientes: Lista completa de pacientes registrados.

Salir: Termina la ejecución del programa.

Estructura del Código

Paciente.java: Clase que define la estructura de un paciente.

ListaPacientes.java: Implementación de la lista enlazada simple con las funciones de gestión.

Main.java: Punto de entrada de la aplicación, con interacción mediante consola.

Mejoras Futuras

Implementación de una interfaz gráfica con Swing.

Almacenamiento en una base de datos MySQL.

Funcionalidad para modificar datos de los pacientes.

Autor

Desarrollado por [Tu Nombre]
