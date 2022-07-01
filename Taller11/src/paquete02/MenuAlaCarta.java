/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class MenuAlaCarta extends Menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double valorPorcentajeAdicionalServicio;

    public MenuAlaCarta(String n, double vaI, double vaPG, double vB, double vPA) {
        super(n, vaI);
        valorPorcionGuarnicion = vaPG;
        valorBebida = vB;
        valorPorcentajeAdicionalServicio = vPA;
        establecerValorPorcentajeAdicionalServicio();
        establecerValorMenu();

    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorIni + valorPorcionGuarnicion + valorBebida + valorPorcentajeAdicionalServicio;

    }

    public void establecerValorPorcionGuarnicion(double x) {
        valorPorcionGuarnicion = x;
    }

    public void establecerValorBebida(double x) {
        valorBebida = x;
    }

    public void establecerValorPorcentajeAdicionalServicio() {
        valorPorcentajeAdicionalServicio = (valorIni * valorPorcentajeAdicionalServicio)/100;
    }

    public double obtenerValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerValorPorcentajeAdicionalServicio() {
        return valorPorcentajeAdicionalServicio;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n ", super.toString());
        cadena = String.format("%s"
                + "Valor Porcion Guarnizicion: %.2f\n"
                + "Valor Bebida: %.2f\n"
                + "Porcentaje Adicional Del Servicion: %.2f\n"
                + "Valor Del Menu: %.2f\n",
                cadena,
                valorPorcionGuarnicion,
                valorBebida,
                valorPorcentajeAdicionalServicio,
                valorMenu);

        return cadena;

    }
}
