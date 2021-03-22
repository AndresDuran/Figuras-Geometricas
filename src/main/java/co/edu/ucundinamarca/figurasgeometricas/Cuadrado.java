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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
    Metodo que mejoramos de la herencia donde calculamos especificamente el perimetro del cuadrado
    */
    @Override
    public void calcularPerimetro(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        /*
        Impresion del resultado del area del cuadrado
        */
        //System.out.println("El area del cuadrado es de: " + areaCuadrado);
    }

    @Override
    public void calcularPerimetroCuadrado() {
        /*
        Calculamos directamente el perimetro en base al lado ingresado
        */
        this.perimetroCuadrado = 4 * lado;
        /*
        Impresion del resultado del perimetro del cuadrado
        */
        //System.out.println("El perimetro del cuadrado es de: " + perimetroCuadrado + "\n");
    }
    
    @Override
    public void imprimirInfoDetallada() {
        System.out.println("Area: " + areaCuadrado + "\n" +
                "Perimetro: "+ perimetroCuadrado + "\n");
    }
    
    @Override
    public void InfoTriangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void mensajeInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void resultados() {
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
