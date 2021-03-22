/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

/**
 *
 * @author polux
 */
public class Principal {
    
    public Principal() {
        iniciar();
    }
    
    public void iniciar(){
        Cuadrado cuadrado = new Cuadrado();
        
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
    
}
