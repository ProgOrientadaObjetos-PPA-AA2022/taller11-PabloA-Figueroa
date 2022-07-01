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
    private double porcentaje;

    public MenuEconomico(String n, double vaI, double vDes) {
        super(n, vaI);
        porcentaje = vDes;
        establecerValorDescuento();
        establecerValorMenu();
       
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorIni - valorDescuento;
    }

    public void establecerValorDescuento() {
        valorDescuento = (valorIni * porcentaje)/100 ;
        //valorDescuento = valorDescuento / 100;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }
    @Override
    public String toString() {
        String cadena = String.format("%s\n ", super.toString());
        cadena = String.format("%s"
                + "Valor del Descuento: %.2f\n"
                + "Valor Final Del Menu: %.2f\n",
                cadena,
                porcentaje,
                valorMenu);

        return cadena;

    }
}
