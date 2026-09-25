/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontareas;

/**
 *
 * @author david
 */
public class ListaTareas {

    Nodo cabeza;

    public ListaTareas() {
        this.cabeza = null;
    }

    public void agregarAlPrincipio(String descripcion) {
        Nodo nuevoNodo = new Nodo(descripcion);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    public void eliminarTarea(String descripcion) {
        if (cabeza == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }

        if (cabeza.descripcion.equalsIgnoreCase(descripcion)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo anterior = null;
        Nodo actual = cabeza;

        while (actual != null && !actual.descripcion.equalsIgnoreCase(descripcion)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("La tarea especificada no se encuentra en la lista.");
            return;
        }

        anterior.siguiente = actual.siguiente;
    }

    public void marcarComoCompletada(String descripcion) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.descripcion.equalsIgnoreCase(descripcion)) {
                actual.completada = true;
                System.out.println("Tarea marcada como completada.");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("La tarea especificada no se encuentra en la lista.");
    }

    public void eliminarCompletadas() {
        // Elimina si los primeros nodos están completados
        while (cabeza != null && cabeza.completada) {
            cabeza = cabeza.siguiente;
        }

        Nodo actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            if (actual.siguiente.completada) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                actual = actual.siguiente;
            }
        }
    }

    public void imprimirLista() {
        if (cabeza == null) {
            System.out.println("No hay tareas en la lista.");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            String estado = actual.completada ? "[Completada]" : "[Pendiente]";
            System.out.println("- " + actual.descripcion + " " + estado);
            actual = actual.siguiente;
        }
    }
}
