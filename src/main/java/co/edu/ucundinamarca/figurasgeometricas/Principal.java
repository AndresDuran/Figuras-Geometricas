/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author polux
 */
public class Principal {
    
    public Principal() {
        iniciar();
    }
    
    public void iniciar(){
        
        System.out.println("Digite 1 para cuadrado");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
    
        if (opcion == 1){
            Cuadrado cuadrado = new Cuadrado();
            
            cuadrado.calcularArea();
            cuadrado.calcularPerimetro();
        }
        else if  (opcion == 2){
            Circulo circulo = new Circulo();
            
            circulo.calcularArea();
            circulo.calcularPerimetro();
        }
        else{
            System.out.println("No valida");
        }
        
        
        
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
    }
    
}
