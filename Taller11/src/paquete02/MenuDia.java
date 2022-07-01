/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String n, double vaI, double vaP, double vB) {
        super(n, vaI);
        valorPostre = vaP;
        valorBebida = vB;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorIni + valorPostre + valorBebida  ;

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
