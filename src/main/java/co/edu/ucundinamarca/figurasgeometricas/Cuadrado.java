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
public class Cuadrado extends Figura {
    
    Scanner entrada = new Scanner(System.in);
    
    private float lado;
    private float areaCuadrado;
    private float perimetroCuadrado;
    
    @Override
    public void calcularArea(){
        System.out.println("Digite la medida del lado del cuadrado:");
        lado = entrada.nextFloat();
        areaCuadrado = lado * lado;
        System.out.println("El area del cuadrado es de: " + areaCuadrado);
    }
    
    @Override
    public void calcularPerimetro(){
        perimetroCuadrado = 4 * lado;
        System.out.println("El perimetro del cuadrado es de: " + perimetroCuadrado);
    }

    
    
    
    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setAreaCuadrado(float areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }

    public float getPerimetroCuadrado() {
        return perimetroCuadrado;
    }

    public void setPerimetroCuadrado(float perimetroCuadrado) {
        this.perimetroCuadrado = perimetroCuadrado;
    }
    
}
