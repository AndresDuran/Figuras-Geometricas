/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.figurasgeometricas;

/**
 * Clase padre de la herencia que contiene los metodos de calcular area y perimetro
 * @author Andres Duran
 * @version 1.0
 */
public abstract class Figura implements ITriangulo, ICuadrado, IResultadosVector{
    
    //Padre
    
    /**
     * Metodo para el calculo de area de las figuras
     */
    public abstract void calcularArea();
    /*
    Metodo para el calculo de perimetro de las figuras
    */
    public abstract void calcularPerimetro();
    /*
    Metodo de impresion de informacion de los calculos
    */
    public abstract void imprimirInfoDetallada();
    
}
