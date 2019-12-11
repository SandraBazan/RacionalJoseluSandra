/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5git;

/**
 *
 * @author sandra
 */
public class Racional {
    // Creación de los atributos
    // Creamos el numerador
    private int a;
    // Crramos el denominador
    private int b;
    
    // Constructor por defecto que inicializa a ambos a 1
    public Racional(){
        this.a = 1;
        this.b = 1;
    }
    
    // Constructor parametrizado con control de denominador no sea 0
    // En tal caso se le asigna el valor 1 y se muestra por consola
    // indicando que no es valido y se asigna el valor 1.
    
    public Racional(int a, int b){
        this.a = a;
        
        if (b == 0){
            System.out.println("El valor no es válido y se le asigna el valor 1");
            this.b = 1;
        }else{
            this.b  = b;
        }
        
    }
    
    // Métodos Get de los atributos
    
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    // Métodos Set de los atributos

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        // Controlo la restricción del constructor parametrizado
        if (b == 0){
            System.out.println("El valor no es válido y se le asigna el valor 1");
            this.b = 1;
        }else{
            this.b  = b;
        }
    }
    
    // Método imprimirConsola()
    public void imprimirConsola(){
        System.out.println("Número racional "+a+"/"+b);
    }

    @Override
    public String toString() {
        return  a + "/" + b;
    }
    
    
    
}
