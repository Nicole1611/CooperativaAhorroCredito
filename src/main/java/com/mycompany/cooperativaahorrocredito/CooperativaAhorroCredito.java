package com.mycompany.cooperativaahorrocredito;

public class CooperativaAhorroCredito {

    public static void main(String[] args) {
        Persona titular1 = new Persona ("Carlos",34433, "Carlos@gmail.com");
        Persona titular2 = new Persona ("Jose",7898, "Jose@gmail.com");
        
        Cuenta objcuenta1 = new Cuenta ("123456", 33.4, titular1, TipoCuenta.CORRIENTE);
        Cuenta objcuenta2 = new Cuenta ("44", 56.4, titular2, TipoCuenta.AHORRO);
        titular1.imprimir();
        objcuenta1.imprimir();
        objcuenta1.depositar(200);
        objcuenta1.retirar(200);
        objcuenta1.transferir(objcuenta2, 20);
    }
}
