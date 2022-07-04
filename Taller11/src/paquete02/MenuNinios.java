/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class MenuNinios extends Menu{
    private double valorHelado;
    private double valorPastel;

    public MenuNinios(String n, double vaI, double vaHela, double vaPas) {
        super(n, vaI);
        valorHelado = vaHela;
        valorPastel = vaPas;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorIni + valorHelado + valorPastel;

    }

    public void establecerValorPastel(double x) {
        valorIni = x;
    }

    public void establecerValorHelado(double x) {
        valorHelado = x;
    }

    public double obtenerValorPastel() {
        return valorIni;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }
    @Override
    public String toString() {
        String cadena = String.format("%s\n", super.toString());
        cadena = String.format("%s"
                + "Valor del Helado: %.2f\n"
                + "Valor del Pastel: %.2f\n"
                + "Valor Del Menu: %.2f\n",
                cadena,
                valorHelado,
                valorPastel,
                valorMenu);

        return cadena;

    }
}
