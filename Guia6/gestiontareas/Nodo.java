/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiontareas;

/**
 *
 * @author david
 */
public class Nodo {
    String descripcion;
    boolean completada;
    Nodo siguiente;

    public Nodo(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
        this.siguiente = null;
    }
}