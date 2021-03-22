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
    private float ladoA;
    /*
    Declaramos una variable para almacenar el lado 2 del triangulo
    */
    private float ladoB;
    /*
    Declaramos una variable para almacenar el lado 3 del triangulo
    */
    private float ladoC;
    /*
    Variable que almacena el resultado del area del triangulo
    */
    private float areaTriangulo;
    /*
    Variable que almacena el resultado del perimetro del triangulo
    */
    private float perimetroTriangulo;
    /*
    Variable que almacena el resultado del tipo de triangulo en base a los datos de los lados
    */
    private int tipo = 0;
    
    /*
    Metodo que mejoramos de la herencia donde calculamos el area del triangulo
    */
    @Override
    public void calcularArea(){
        
        System.out.println("Digite la medida del lado A del triangulo:");
        /*
        Asignamos el primer valor ingresado
        */
        ladoA = entrada.nextFloat();
        System.out.println("Digite la medida del lado B del triangulo:");
        /*
        Asignamos el segundo valor ingresado
        */
        ladoB = entrada.nextFloat();
        System.out.println("Digite la medida del lado C del triangulo:");
        /*
        Asignamos el tercer valor ingresado
        */
        ladoC = entrada.nextFloat();
        
        /*
        validamos que tipo de triangulo
        */
        if (ladoA == ladoB && ladoB == ladoC){
            tipo = 1;//Equilatero
        }else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            tipo = 2;//Isosceles
        }else if (ladoA != ladoB || ladoA != ladoC || ladoC != ladoB){
            tipo = 3;//Escaleno
        }
        
        /*
        Procedemos a calcular e imprimir su area si es equilatero
        */
        if (tipo == 1){ 
            System.out.println("Triangulo Equilatero");
            areaTriangulo = (float) ((1.73205/4)*(ladoA * ladoA));
            System.out.println("El area del triangulo es de: " + areaTriangulo);
        }
        /*
        Procedemos a calcular e imprimir su area si es isosceles
        */
        else if(tipo == 2){
            System.out.println("Triangulo Isosceles");
            //areaTriangulo = (float) ((ladoB* Math.sqrt((ladoA*ladoA)-((ladoB*ladoB)/4)))/2);
            float h = (float) Math.sqrt((ladoA * ladoA)- ((ladoB/2)*(ladoB/2)));
            areaTriangulo = ladoB*h/2;
            System.out.println("El area del triangulo es de: " + areaTriangulo);
        }
        /*
        Procedemos a calcular e imprimir su area si es escaleno
        */
        else if(tipo == 3){
            System.out.println("Triangulo Escaleno");
            float s = (ladoA+ladoB+ladoC)/2;
            areaTriangulo =  (float) Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
            System.out.println("El area del triangulo es de: " + areaTriangulo);
        }
    }
    
    /*
    Metodo que mejoramos de la herencia donde calculamos el area del triangulo
    calculamos su perimetro segun su clasificacion
    */
    @Override
    public void calcularPerimetro(){
        if (tipo == 1){
            perimetroTriangulo = 3 * ladoA;
            System.out.println("El perimetro del triangulo es de: " + perimetroTriangulo + "\n");
        }else if(tipo == 2){
            perimetroTriangulo = 2 * ladoA + ladoB;
            System.out.println("El perimetro del triangulo es de: " + perimetroTriangulo + "\n");
        }else{
            perimetroTriangulo = ladoA + ladoB + ladoC;
            System.out.println("El perimetro del triangulo es de: " + perimetroTriangulo + "\n");
        }
    }
}
