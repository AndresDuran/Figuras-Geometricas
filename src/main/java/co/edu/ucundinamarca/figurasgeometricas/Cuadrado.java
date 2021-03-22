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
public class Cuadrado extends Figura{
    
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
        this.lado = entrada.nextFloat();
        /*
        Calculamos el area del cuadrado
        */
        this.areaCuadrado = lado * lado;
    }
    
    /*
    Metodo que mejoramos de la herencia donde calculamos especificamente el perimetro del cuadrado
    */
    @Override
    public void calcularPerimetro(){
        /*
        Calculamos directamente el perimetro en base al lado ingresado
        */
        this.perimetroCuadrado = 4 * lado;
    }

    
    @Override
    public void calcularAreaCuadrado() {
        System.out.println("Digite la medida del lado del cuadrado:");
        /*
        Asignamos el valor digitado a la varible lado
        */
        this.lado = entrada.nextFloat();
        /*
        Calculamos el area del cuadrado
        */
        this.areaCuadrado = lado * lado;
    }

    @Override
    public void calcularPerimetroCuadrado() {
        /*
        Calculamos directamente el perimetro en base al lado ingresado
        */
        this.perimetroCuadrado = 4 * lado;
    }
    
     /**
     * Metodo void propio de la clase
     */
    public void metodoPropioCuadrado(){
        System.out.println("---Metodo propio de la clase Cuadrado---");
    }
     /**
     * Metodo void de impresion de informacion detallada
     */
    @Override
    public void imprimirInfoDetallada() {
        System.out.println("Area: " + areaCuadrado + "\n" +
                "Perimetro: "+ perimetroCuadrado + "\n");
    }
     /**
     * Metodo void de informacion
     */
    @Override
    public void InfoTriangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void mensajeInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
