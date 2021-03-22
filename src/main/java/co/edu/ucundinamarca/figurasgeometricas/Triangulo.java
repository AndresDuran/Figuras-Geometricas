/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

import java.util.Scanner;

/**
 * Clase que se encarga de calcular area y perimetro del triangulo
 * @author Andres Duran
 * @version 1.0
 */
public class Triangulo extends Figura {
    
    //Declaramos para tomar ñectura por teclado
    Scanner entrada = new Scanner(System.in);
    
    /*
    Declaramos una variable para almacenar el lado 1 del triangulo
    */
    private float ladoA = 0;
    /*
    Declaramos una variable para almacenar el lado 2 del triangulo
    */
    private float ladoB = 0;
    /*
    Declaramos una variable para almacenar el lado 3 del triangulo
    */
    private float ladoC = 0;
    /*
    Variable que almacena el resultado del area del triangulo
    */
    private float areaTriangulo = 0;
    /*
    Variable que almacena el resultado del perimetro del triangulo
    */
    private float perimetroTriangulo = 0;
    /*
    Variable que almacena el resultado del tipo de triangulo en base a los datos de los lados
    */
    private int tipo = 0;
    
    String tipTri;
    
    /*
    Metodo que mejoramos de la herencia donde calculamos el area del triangulo
    */
    @Override
    public void calcularArea(){
        
        System.out.println("Digite la medida del lado A del triangulo:");
        /*
        Asignamos el primer valor ingresado
        */
        this.ladoA = entrada.nextFloat();
        System.out.println("Digite la medida del lado B del triangulo:");
        /*
        Asignamos el segundo valor ingresado
        */
        this.ladoB = entrada.nextFloat();
        System.out.println("Digite la medida del lado C del triangulo:");
        /*
        Asignamos el tercer valor ingresado
        */
        this.ladoC = entrada.nextFloat();
        
        /*
        validamos que tipo de triangulo
        */
        if (ladoA == ladoB && ladoB == ladoC){
            this.tipo = 1;//Equilatero
        }else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            this.tipo = 2;//Isosceles
        }else if (ladoA != ladoB || ladoA != ladoC || ladoC != ladoB){
            this.tipo = 3;//Escaleno
        }
        
        /*
        Procedemos a calcular e imprimir su area si es equilatero
        */
        if (tipo == 1){ 
            this.tipTri = "Triangulo Equilatero";
            this.areaTriangulo = (float) ((1.73205/4)*(ladoA * ladoA));
        }
        /*
        Procedemos a calcular e imprimir su area si es isosceles
        */
        else if(tipo == 2){
            this.tipTri = "Triangulo Isosceles";
            //areaTriangulo = (float) ((ladoB* Math.sqrt((ladoA*ladoA)-((ladoB*ladoB)/4)))/2);
            float h = (float) Math.sqrt((ladoA * ladoA)- ((ladoB/2)*(ladoB/2)));
            this.areaTriangulo = ladoB*h/2;
        }
        /*
        Procedemos a calcular e imprimir su area si es escaleno
        */
        else if(tipo == 3){
            this.tipTri = "Triangulo Escaleno";
            float s = (ladoA+ladoB+ladoC)/2;
            this.areaTriangulo =  (float) Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
        }
    }
    
    /*
    Metodo que mejoramos de la herencia donde calculamos el area del triangulo
    calculamos su perimetro segun su clasificacion
    */
    @Override
    public void calcularPerimetro(){
        /**
         * Por el tipo de clasificacion hecha, calculamos el perimetro de equilatero
         */
        if (tipo == 1){
            this.perimetroTriangulo = 3 * ladoA;
        }
        /**
         * Isosceles
         */
        else if(tipo == 2){
            this.perimetroTriangulo = 2 * ladoA + ladoB;
        }
        /**
         * Escaleno
         */
        else{
            this.perimetroTriangulo = ladoA + ladoB + ladoC;
        }
    }
    
    /**
     * Metodo void propio de la clase
     */
    public void metodoPropioTriangulo(){
        System.out.println("---Metodo propio de la clase Triangulo---");
    }
    /**
     * Metodo get para impresion del tipo de triangulo en la impresion final
     * @return 
     */
    public String getTipTri() {
        return tipTri;
    }
    /**
     *Metodo set para impresion del tipo de triangulo en la impresion final
     */
    public void setTipTri(String tipTri) {
        this.tipTri = tipTri;
    }
    
    /**
     * Metodo void de impresion detallada
     */
    @Override
    public void imprimirInfoDetallada() {
        System.out.println(tipTri + "\n" + "Area: " + areaTriangulo + "\n" +
                "Perimetro: " + perimetroTriangulo + "\n");
    }
    
    /**
     * Metodo void de informacion de interfaz del triangulo
     */
    @Override
    public void InfoTriangulo() {
        System.out.println("Mensaje desde ITriangulo");
    }
    
    /**
     * Metodo void de Mensaje de informacion
     */
    @Override
    public void mensajeInformacion() {
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
    
    /**
     * geters y seters
     */
    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }

    public float getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(float areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }

    public float getPerimetroTriangulo() {
        return perimetroTriangulo;
    }

    public void setPerimetroTriangulo(float perimetroTriangulo) {
        this.perimetroTriangulo = perimetroTriangulo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    

    

    

    
    
    
    
}
