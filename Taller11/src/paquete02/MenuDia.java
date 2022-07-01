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
        establecerValorMenu();
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorIni + valorPostre + valorBebida;

    }

    public void establecerValorPostre(double x) {
        valorPostre = x;
    }

    public void establecerValorBebida(double x) {
        valorBebida = x;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n ", super.toString());
        cadena = String.format("%s"
                + "Valor del Postre: %.2f\n"
                + "Valor Bebida: %.2f\n"
                + "Valor Del Menu: %.2f\n",
                cadena,
                valorPostre,
                valorBebida,
                valorMenu);

        return cadena;

    }
}
