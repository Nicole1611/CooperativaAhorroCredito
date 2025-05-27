
package com.mycompany.cooperativaahorrocredito;

public class Cuenta {
    public String numeroCuenta;
    public double saldo;
    public String titular;
    public TipoCuenta tipocuenta;

    public Cuenta(String numeroCuenta, double saldo, String titular, TipoCuenta tipocuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.tipocuenta = tipocuenta;
    }
    //Depositar
    public void depositar (double monto){
        System.out.println("----------DEPOSITAR----------");
    if (monto>0){
        saldo=saldo+monto;
        System.out.println("Deposito exitoso.");
        System.out.println("Saldo actual: "+ saldo);
    }
    else{
        System.out.println("El monto debe ser mayor a cero");
    }
        System.out.println(" ");
    }
    //Retirar
    public void retirar (double monto){
        System.out.println("----------RETIRAR----------");
        if (monto>0){
            if (saldo>0){
                saldo = saldo - monto;
                System.out.println("Retiro exitoso. ");
                System.out.println("Saldo actual: "+ saldo);
            }else{
                System.out.println("Saldo insuficiente");
                }
            }
        else{
            System.out.println("El monto debe ser mayor a cero ");
            }
        System.out.println(" ");
            }
    //Transferir
    public void transferir (Cuenta destino, double monto){
        System.out.println("----------TRANSFERIR----------");
        if (monto>0){
            if (saldo>=monto) {
                this.saldo = this.saldo - monto;
                destino.saldo= destino.saldo + monto;
                System.out.println("Transferencia exitosa." );
                System.out.println("Saldo actual: "+ saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
            } else{
                System.out.println("El monto debe ser mayor a cero");
                  }
        System.out.println(" ");
    }
    
    public void imprimir (){
        System.out.println("--------DATOS DE "+titular+"--------");
        System.out.println("El nuemro de cuenta es: "+numeroCuenta);
        System.out.println("Su saldo es de: "+ saldo);
        System.out.println("Titular: "+ titular);
        System.out.println("Tipo de cuenta: "+ tipocuenta);
        System.out.println("------------------------------------");
    }
}
