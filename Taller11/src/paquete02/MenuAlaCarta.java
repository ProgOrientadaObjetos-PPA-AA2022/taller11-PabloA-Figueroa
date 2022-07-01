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

    public void establecerValorPorcentajeAdicionalServicio(double x) {
        valorPorcentajeAdicionalServicio = x;
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

}
