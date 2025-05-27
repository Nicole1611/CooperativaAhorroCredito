
package com.mycompany.cooperativaahorrocredito;


public class Persona {
    public String nombre;
    public int identificacion;
    public String correo;

    public Persona(String nombre, int identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }
    
    public void agregarCuenta (Cuenta cuenta){
        
    }
    
    public void cerrarCuenta (Cuenta cuenta){
        
    }
    
    public void imprimir (){
        System.out.println("---------DATOS DE "+nombre+"---------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Identificacion: "+identificacion);
        System.out.println("Correo: "+ correo);
        System.out.println("--------------------------------------");
    }
}
