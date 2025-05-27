package com.mycompany.cooperativaahorrocredito;

public class CooperativaAhorroCredito {

    public static void main(String[] args) {
        Persona Persona1 = new Persona ("Carlos",34433, "Carlos@gmail.com");
        Persona Persona2 = new Persona ("Jose",7898, "Jose@gmail.com");
        
        Cuenta objcuenta1 = new Cuenta ("123456", 33.4, "Carlos", TipoCuenta.CORRIENTE);
        Cuenta objcuenta2 = new Cuenta ("44", 56.4, "Jose", TipoCuenta.AHORRO);
        
        //Persona 1
        Persona1.imprimir();  
        objcuenta1.imprimir();    
        //Persona 2
        Persona2.imprimir();
        objcuenta2.imprimir();
        
        //Actividades de persona 1
        objcuenta1.depositar(200);
        objcuenta1.retirar(200);
        objcuenta1.transferir(objcuenta2, 20);
        
        //Persona 1 
        objcuenta1.imprimir();    
        //Persona 2
        objcuenta2.imprimir();
    }
}
