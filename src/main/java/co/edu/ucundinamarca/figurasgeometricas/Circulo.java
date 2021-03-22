/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

import java.util.Scanner;

/**
 * Clase que se encarga de calcular area y perimetro del circulo
 * @author Andres Duran
 * @version 1.0
 */
public class Circulo extends Figura {
    
    //Declaramos para tomar ñectura por teclado
    Scanner entrada = new Scanner(System.in);
    
    /*
    Declaramos esta variable fija para que contenga el valor numerico de pi
    */
    static final float pi = (float) 3.14159265359;
    /*
    Variable que contendra el valor digitado del radio
    */
    private float radio = 0;
    /*
    Variable que almacena el resultado del area del circulo
    */
    private float areaCirculo = 0;
    /*
    Variable que almacena el resultado del perimetro del circulo
    */
    private float perimetroCirculo = 0;
    
    
    /*
    Metodo que mejoramos de la herencia donde calculamos el area del circulo
    */
    @Override
    public void calcularArea(){
        System.out.println("Digite la medida del radio del circulo:");
        /*
        Asignamos el valor digitado a la varible lado
        */
        this.radio = entrada.nextFloat();
        /*
        Calculamos el area del circulo
        */
        this.areaCirculo = pi * (radio * radio);
        /*
        Impresion del resultado del area del cuadrado
        */
        //System.out.println("El area del circulo es de: " + areaCirculo);
    }
    
    /*
    Metodo que mejoramos de la herencia donde calculamos el perimetro del circulo
    */
    @Override
    public void calcularPerimetro(){
        /*
        Calculamos directamente el perimetro en base al radio ingresado
        */
        this.perimetroCirculo = 2 * pi * radio;
        /*
        Impresion del resultado del perimetro del circulo
        */
        //System.out.println("El perimetro del circulo es de: " + perimetroCirculo + "\n");
    }
    
    public void metodoPropioCirculo(){
        System.out.println("---Metodo propio de la clase Circulo---");
    }
    
    @Override
    public void imprimirInfoDetallada() {
        System.out.println("Area: " + areaCirculo + "\n" + "Perimetro: " + perimetroCirculo + "\n");
    }
    
    @Override
    public void InfoTriangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void calcularAreaCuadrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularPerimetroCuadrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mensajeInformacion() {
        System.out.println("Mensaje desde la interfaz de ICirculo");
    }
    
    /*
    get y set
    */
    
    
    public static float getPi() {
        return pi;
    }
    
    
    
    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAreaCirculo() {
        return areaCirculo;
    }

    public void setAreaCirculo(float areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

    public float getPerimetroCirculo() {
        return perimetroCirculo;
    }

    public void setPerimetroCirculo(float perimetroCirculo) {
        this.perimetroCirculo = perimetroCirculo;
    }

    

    

    


    
    
    
    
    
}
