/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposdevariables.cuentabancaria;

/**
 *
 * @author CUTT 5
 */
public class CuentaBancaria {

    /*VARIABLES LOCALES*/
    private String titular;
    private double saldo;

    //VARIABLE GLOBAL ESTATICA
    private static int totalCuentas = 0;

    //Este es un constructor el cual lleva parametros de entrada
    public CuentaBancaria(String titular, double saldo) {

        this.titular = titular;
        this.saldo = saldo;
        totalCuentas++;

    }

    public void depositar(double cantidad) {

        //VARIABLE LOCAL
        double nuevoSaldo = saldo + cantidad;

        saldo = nuevoSaldo;

        System.out.println("Deposito realizado: ");
        System.out.println("Saldo actual:  $ " + saldo);

    }

    public void retirar(double cantidad) {

        double saldoRestante = saldo - cantidad;

        if (saldoRestante >= 0) {

            saldo = saldoRestante;
            System.out.println("Retiro exitoso: ");

        } else {

            System.out.println("Sin saldo suficiente: ");

        }

    }

    public void mostrarInformacion() {

        System.out.println("----------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo " + saldo);

    }
    
    public static void mostrarCuentas(){
    
        System.out.println("Total de cuentas bancarias: " + totalCuentas);
        
    }
}
