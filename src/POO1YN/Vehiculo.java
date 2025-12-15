/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO1YN;

/**
 *
 * @author yosue
 */
public class Vehiculo {
    private String marca;
    private String color;

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String mostrarInfo() {
        return "=== Vehiculo ===\n" + 
                "Marca:" + marca + "\n" +
                "Color: " + color + color;
    }
}