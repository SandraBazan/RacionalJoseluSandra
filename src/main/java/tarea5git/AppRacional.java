/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5git;

/**
 *
 * @author joselu
 */
public class AppRacional {

    // Creación del método main
    public static void main(String[] args) {
        // Creación de los dos racionales con valores
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);

        // Creación del número racional aleatorio
        Racional aleatorio = Racional.aleatorio();

        // Imprimimos por pantalla los tres racionales
        System.out.println(z);
        System.out.println(k);
        System.out.println(aleatorio);

        // Operaciones
        // Igualdad
        System.out.println("¿El racional z y el racional k son iguales? " + Racional.igualdad(z, k));

        // Suma
        z.suma(k);
        System.out.println("La suma de z+k es : " + z.getA() + "/" + z.getB());

        // División
        System.out.println("La división de z entre k es: " + Racional.division(z, k));

        // Producto
        z.producto(k);
        System.out.println("El producto de z por k es: " + z.getA() + "/" + z.getB());

    }

}
