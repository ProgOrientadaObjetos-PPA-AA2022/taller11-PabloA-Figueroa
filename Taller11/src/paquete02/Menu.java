/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public abstract class Menu {

    protected String nombreP;
    protected double valorMenu;
    protected double valorIni;

    public Menu(String n, double vaI) {
        nombreP = n;
        valorIni = vaI;
    }

    public void establecerNombrePlato(String x) {
        nombreP = x;
    }

    public abstract void establecerValorMenu();

    public void establecerInicialMenu(double x) {
        valorIni = x;
    }

    public String obtenerNombrePlato() {
        return nombreP;
    }

    public double obtenerValorInicial() {
        return valorIni;
    }
}
