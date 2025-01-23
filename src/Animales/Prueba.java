/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

public class Prueba {
    public static void main(String[] args){
        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Leon();
        animales[2] = new Perro();
        animales[3] = new Lobo();
        
        for (int i = 0; i < animales.length; i++){
            System.out.println(animales[i].getNombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentacion: " + animales[i].getAlimentacion());
            System.out.println("Habitat: " + animales[i].getHabitat());
            System.out.println();
        }
    }
}
