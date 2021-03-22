/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

import java.util.Scanner;

/**
 * Clase que se encarga de calcular area y perimetro del cuadrado
 * @author Andres Duran
 * @version 1.0
 */
public class Cuadrado extends Figura {
    
    //Declaramos para tomar ñectura por teclado
    Scanner entrada = new Scanner(System.in);
    /*
    Se declara la variable lado que recibe el valor del lado del cuadrado
    */
    private float lado = 0;
    /*
    Variable que almacena el resultado del area del cuadrado
    */
    private float areaCuadrado = 0;
    /*
    Variable que almavena el resultado del perimetro del cuadrado
    */
    private float perimetroCuadrado = 0;
    
    /*
    Metodo que mejoramos de la herencia donde calculamos especificamente el area del cuadrado
    */
    @Override
    public void calcularArea(){
        System.out.println("Digite la medida del lado del cuadrado:");
        /*
        Asignamos el valor digitado a la varible lado
        */
        lado = entrada.nextFloat();
        /*
        Calculamos el area del cuadrado
        */
        areaCuadrado = lado * lado;
        /*
        Impresion del resultado del area del cuadrado
        */
        System.out.println("El area del cuadrado es de: " + areaCuadrado);
    }
    
    /*
    Metodo que mejoramos de la herencia donde calculamos especificamente el perimetro del cuadrado
    */
    @Override
    public void calcularPerimetro(){
        /*
        Calculamos directamente el perimetro en base al lado ingresado
        */
        perimetroCuadrado = 4 * lado;
        /*
        Impresion del resultado del perimetro del cuadrado
        */
        System.out.println("El perimetro del cuadrado es de: " + perimetroCuadrado + "\n");
    }

    
    /*
    Get y set
    */
    
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
