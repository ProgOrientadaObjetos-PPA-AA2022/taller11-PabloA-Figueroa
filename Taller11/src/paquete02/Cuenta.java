/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Cuenta {
    private String nombreCl;
    private double Iva;
    private double valorCancelar;
     private double valorSubTotal;
    private ArrayList<Menu> lista = new ArrayList<>();
    
    public Cuenta(String n,double iva, ArrayList<Menu> listita) {
        nombreCl = n;
        lista = listita;
        Iva = iva; 
        
    }

    public void establecerNombre(String n) {
        nombreCl = n;
    }

    public void establecerArriendos(ArrayList<Menu> listita) {
        lista = listita;
    }

    public void establecerSubTotal() {
        for (int i = 0; i < obtenerArriendos().size(); i++) {
            valorSubTotal = valorSubTotal
                    + obtenerArriendos().get(i).valorMenu;
        }
    }

    public void establecerValoraCancelar() {
        valorCancelar = valorSubTotal + ((valorSubTotal * Iva)/100);
    }
    public String obtenerNombre() {
        return nombreCl;
    }

    public ArrayList<Menu> obtenerArriendos() {
        return lista;
    }
    public double obtenerValorSubTotal() {
        return valorSubTotal;
    }

    public double obtenerValorACancelar() {
        return valorCancelar;
    }


    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n", obtenerNombre());

        for (int i = 0; i < obtenerArriendos().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    obtenerArriendos().get(i));
        }

        cadena = String.format("\n%sValor Subtotal: %.1f\n"
                + "IVA: %.2f\n"
                + "Valor Total: %.3f\n",
                cadena,
                obtenerValorSubTotal(),
                Iva,
                obtenerValorACancelar());
        return cadena;
    }
}
