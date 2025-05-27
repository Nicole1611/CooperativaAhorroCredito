
package com.mycompany.cooperativaahorrocredito;

public class Cuenta {
    public String numeroCuenta;
    public double saldo;
    public Persona titular;
    public TipoCuenta tipocuenta;

    public Cuenta(String numeroCuenta, double saldo, Persona titular, TipoCuenta tipocuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.tipocuenta = tipocuenta;
    }
    //Depositar
    public void depositar (double monto){
    if (monto>0){
        saldo=saldo+monto;
        System.out.println("Deposito exitoso. Su saldo actual es de: "+ saldo);
    }
    else{
        System.out.println("El monto debe ser mayor a cero para realizar el deposito");
    }
    }
    //Retirar
    public void retirar (double monto){
        if (monto>0){
            if (saldo>0){
                saldo = saldo - monto;
                System.out.println("Retiro exitoso. Su saldo actual es de: "+ saldo);
            }else{
                System.out.println("Saldo insuficiente");
                }
            }
        else{
            System.out.println("El monto debe ser mayor a cero para realizar el deposito");
            }
            }
    
    public void transferir (Cuenta destino, double monto){
        if (monto>0){
            if (saldo>=monto) {
                this.saldo = this.saldo - monto;
                destino.saldo= destino.saldo + monto;
                System.out.println("Transferencia exitosa. Saldo actual: "+ saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
            } else{
                System.out.println("El monto debe ser mayor a cero para realizar el deposito");
                  }
        
    }
    
    public void imprimir (){
        System.out.println("El nuemro de cuenta es: "+numeroCuenta);
        System.out.println("Su saldo es de: "+ saldo);
        System.out.println("Titular: "+ titular);
        System.out.println("Tipo de cuenta: "+ tipocuenta);
    }
}
