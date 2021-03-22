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
public class Circulo extends Figura {
    
    Scanner entrada = new Scanner(System.in);
    
    static final float pi = (float) 3.14159265359;
    private float radio;
    private float areaCirculo;
    private float perimetroCirculo;
    
    @Override
    public void calcularArea(){
        System.out.println("Digite la medida del radio del circulo:");
        radio = entrada.nextFloat();
        areaCirculo = pi * (radio * radio);
        System.out.println("El area del circulo es de: " + areaCirculo);
    }
    
    @Override
    public void calcularPerimetro(){
        perimetroCirculo = 2 * pi * radio;
        System.out.println("El perimetro del circulo es de: " + perimetroCirculo);
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
