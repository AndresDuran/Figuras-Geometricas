/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

import java.util.Scanner;

/**
 * Clase de inicio del programa
 * @author Andres Duran
 * @version 1.0
 */
public class Inicio {
    /*
    Metodo que contiene todo el menu de ejecucion del programa
    */
    public void iniciar(){
            //Declaramos para tomar lectura por teclado
            Scanner entrada = new Scanner(System.in);
            /*
            Variable de control del menu
            */
            int opcion = 1;
           
            IResultadosVector[] vector = new IResultadosVector[3];
            /*
            HAce el ciclo mientras el valor de la variable opcion cambia
            */
            while (opcion < 2){
                /*
                Mesajes del menu
                */
                System.out.println("---Area y Perimetro---");
                System.out.println("Digite 1 para Cuadrado");
                System.out.println("Digite 2 para Circulo");
                System.out.println("Digite 3 para Triangulo");
                System.out.println("Digite 4 para Mostrar Lista");
                System.out.println("Digite 5 para Salir...");
                int menu = entrada.nextInt();
                
                /*
                Ejecuta la clase cuadrado
                */
                if (menu == 1){
                    
                    IResultadosVector cua = new Cuadrado();
                    cua.calcularArea();
                    cua.calcularPerimetro();
                    cua.imprimirInfoDetallada();
                    
                    vector[0] = cua;
                }
                /*
                Ejecuta la clase circulo
                */
                else if  (menu == 2){
                    IResultadosVector cir = new Circulo();
                    cir.calcularArea();
                    cir.calcularPerimetro();
                    cir.imprimirInfoDetallada();
                    
                    vector[1] = cir;
                    }
                /*
                Ejecuta la clase triangulo
                */
                else if  (menu == 3){
                    IResultadosVector tri = new Triangulo();
                    tri.calcularArea();
                    tri.calcularPerimetro();
                    tri.imprimirInfoDetallada();
                    
                    vector[2] = tri;
                }
                /*
                Cambia el valor de la variable y finaliza
                */
                else if (menu == 4){
                    
                    for (IResultadosVector i : vector) {
                        i.calcularArea();
                        i.calcularPerimetro();
                        i.imprimirInfoDetallada();
                    }
                    
                }
                else if (menu == 5){
                    opcion = 2;
                }
                /*
                Si el numero del menu no esta en el rango inicia el menu
                */
                else if (menu >5){
                    opcion = 1;
                }
            }
    }
}
