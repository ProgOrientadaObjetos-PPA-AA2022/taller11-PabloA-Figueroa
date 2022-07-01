/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class MenuEconomico extends Menu{
    private double valorDescuento;

    public MenuEconomico(String n, double vaI, double vDes) {
        super(n, vaI);
        valorDescuento = vDes;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorIni - ((valorIni * valorDescuento)/100);
    }

    public void establecerValorDescuento(double x) {
        valorDescuento = x;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }
    @Override
    public String toString() {
        String cadena = String.format("%s\n ", super.toString());
        cadena = String.format("%s\nMenu Economico\n"
                + "Valor del Menu: %.2f\n"
                + "Valor Final Del Menu: %.2f\n",
                cadena,
                valorMenu);

        return cadena;

    }
}
