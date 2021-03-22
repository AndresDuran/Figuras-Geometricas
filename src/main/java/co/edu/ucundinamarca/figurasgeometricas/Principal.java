/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

import java.util.Scanner;

/**
 * Clase de ejecucion de los metodos
 * @author Andres Duran
 * @version 1.0
 */
public class Principal {
    /*
    Metodo que invoca clase de inicio
    */
    public Principal() {
        Inicio inicio = new Inicio();
        inicio.iniciar();
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
    
}
