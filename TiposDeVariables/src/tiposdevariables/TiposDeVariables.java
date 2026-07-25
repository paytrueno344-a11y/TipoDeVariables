/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposdevariables;

import tiposdevariables.cuentabancaria.CuentaBancaria;

/**
 *
 * @author CUTT 5
 */
public class TiposDeVariables {

    public static void main(String[] args) {
        
        CuentaBancaria luis = new CuentaBancaria("Luis" , 5000);
        CuentaBancaria pedrito = new CuentaBancaria("pedrito" , 5000);
        CuentaBancaria laura = new CuentaBancaria("laura" , 5000);
        CuentaBancaria moises = new CuentaBancaria("moises" , 5000);
        CuentaBancaria hector = new CuentaBancaria("hector" , 5000);
        
        luis.depositar(2000);
        pedrito.retirar(2300);
        laura.depositar(3000);
        moises.retirar(3230);
        hector.retirar(300);
        luis.mostrarInformacion();
        pedrito.mostrarInformacion();
        laura.mostrarInformacion();
        moises.mostrarInformacion();
        hector.mostrarInformacion();
        
        CuentaBancaria.mostrarCuentas();
        
    }
    
}
