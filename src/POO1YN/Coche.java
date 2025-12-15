/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO1YN;

/**
 *
 * @author yosue
 */
public class Coche extends Vehiculo {
    private String tipoCombustible;

    public Coche(String tipoCombustible, String marca, String color) {
        super(marca, color);
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String mostrarInfo() {
        return "=== Coche ===\n" + 
                "Marca:" + getMarca() + "\n" +
                "Molor: " + getColor() + "\n" +
                "Combustible: " + tipoCombustible + "\n" +
                "--> Mi primera modificación después de subirlo a GitHub";
    }
}