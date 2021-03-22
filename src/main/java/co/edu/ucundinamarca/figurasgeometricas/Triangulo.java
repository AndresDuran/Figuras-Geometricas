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
public class Triangulo extends Figura {
    
    Scanner entrada = new Scanner(System.in);
    
    private float ladoA;
    private float ladoB;
    private float ladoC;
    private float areaTriangulo;
    private float perimetroTriangulo;
    private int tipo = 0;
    
    private void definirTriangulo(){
        
        System.out.println("Digite la medida del lado A del triangulo:");
        ladoA = entrada.nextFloat();
        System.out.println("Digite la medida del lado B del triangulo:");
        ladoB = entrada.nextFloat();
        System.out.println("Digite la medida del lado C del triangulo:");
        ladoC = entrada.nextFloat();
        
        if (ladoA == ladoB && ladoA == ladoC){
            tipo = 1;
        }else if (ladoA == ladoB && ladoA != ladoC){
            tipo = 2;
        }else{
            tipo = 3;
        }
    }
    
    
    
    @Override
    public void calcularArea(){
        
        System.out.println("Digite la medida del lado A del triangulo:");
        ladoA = entrada.nextFloat();
        System.out.println("Digite la medida del lado B del triangulo:");
        ladoB = entrada.nextFloat();
        System.out.println("Digite la medida del lado C del triangulo:");
        ladoC = entrada.nextFloat();
        
        if (ladoA == ladoB && ladoB == ladoC){
            tipo = 1;//Equilatero
        }else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            tipo = 2;//Isoceles
        }else if (ladoA != ladoB || ladoA != ladoC || ladoC != ladoB){
            tipo = 3;
        }
        
         
        if (tipo == 1){ 
            System.out.println("Triangulo Equilatero");
            areaTriangulo = (float) ((1.73205/4)*(ladoA * ladoA));
            System.out.println("El area del triangulo es de: " + areaTriangulo);
        }else if(tipo == 2){
            System.out.println("Triangulo Isosceles");
            //areaTriangulo = (float) ((ladoB* Math.sqrt((ladoA*ladoA)-((ladoB*ladoB)/4)))/2);
            float h = (float) Math.sqrt((ladoA * ladoA)- ((ladoB/2)*(ladoB/2)));
            areaTriangulo = ladoB*h/2;
            System.out.println("El area del triangulo es de: " + areaTriangulo);
        }else if(tipo == 3){
            System.out.println("Triangulo Escaleno");
            float s = (ladoA+ladoB+ladoC)/2;
            areaTriangulo =  (float) Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
            System.out.println("El area del triangulo es de: " + areaTriangulo);
        }
    }
    
    
    @Override
    public void calcularPerimetro(){
        if (tipo == 1){
            perimetroTriangulo = 3 * ladoA;
            System.out.println("El perimetro del triangulo es de: " + perimetroTriangulo);
        }else if(tipo == 2){
            perimetroTriangulo = 2 * ladoA + ladoB;
            System.out.println("El perimetro del triangulo es de: " + perimetroTriangulo);
        }else{
            perimetroTriangulo = ladoA + ladoB + ladoC;
            System.out.println("El perimetro del triangulo es de: " + perimetroTriangulo);
        }
    }

    
    
    
}
