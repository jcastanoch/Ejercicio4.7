/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

public abstract class Animal {
    protected String sonido;
    protected String alimentacion;
    protected String habitat; 
    protected String nombreCientifico; 
    
    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimentacion();
    public abstract String getHabitat();
    
}
