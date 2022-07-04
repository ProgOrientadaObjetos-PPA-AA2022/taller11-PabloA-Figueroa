/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Cuenta;
import paquete02.Menu;
import paquete02.MenuAlaCarta;
import paquete02.MenuDia;
import paquete02.MenuEconomico;
import paquete02.MenuNinios;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        for (int i = 0; i < datos001.length; i++) {
            String nP = datos001[i][0];
            double vI = Double.parseDouble(datos001[i][1]);
            double vH = Double.parseDouble(datos001[i][2]);
            double vP = Double.parseDouble(datos001[i][3]);
            MenuNinios me2 = new MenuNinios(nP, vI, vH, vP);
            lista.add(me2);
        }
        for (int i = 0; i < datos002.length; i++) {
            String nP = datos002[i][0];
            double vI = Double.parseDouble(datos002[i][1]);
            double vD = Double.parseDouble(datos002[i][2]);
            MenuEconomico mE1 = new MenuEconomico(nP, vI, vD);
            lista.add(mE1);
        }
        for (int i = 0; i < datos003.length; i++) {
            String nP = datos003[i][0];
            double vI = Double.parseDouble(datos003[i][1]);
            double vB = Double.parseDouble(datos003[i][2]);
            double vP = Double.parseDouble(datos003[i][3]);
            MenuDia mD1 = new MenuDia(nP, vI, vB, vP);
            lista.add(mD1);
        }
        for (int i = 0; i < datos004.length; i++) {
            String nP = datos004[i][0];
            double vI = Double.parseDouble(datos004[i][1]);
            double vG = Double.parseDouble(datos004[i][2]);
            double vB = Double.parseDouble(datos004[i][3]);
            double pA = Double.parseDouble(datos004[i][4]);
            MenuAlaCarta maC1 = new MenuAlaCarta(nP, vI, vG, vB, pA);
            lista.add(maC1);
        }

        // Fin de solución
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", 10, lista);
        miCuenta.establecerSubTotal();
        miCuenta.establecerValoraCancelar();
        System.out.printf("%s\n", miCuenta);

    }
}
