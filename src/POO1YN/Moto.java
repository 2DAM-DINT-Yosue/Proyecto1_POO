/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO1YN;

/**
 *
 * @author yosue
 */
public class Moto extends Vehiculo {
    private String cilindrada;

    public Moto(String cilindrada, String marca, String color) {
        super(marca, color);
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarInfo() {
        return "=== Moto ===\n" + 
                "Marca:" + getMarca() + "\n" +
                "Molor: " + getColor() + "\n" +
                "Cilindrada: " + cilindrada;
    }
}
