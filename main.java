package com.solomongo.principal;
public class Principal {
    public static void main(String[] args) {
        
        Persona p2=new Persona(); // sin paramts p2.() llegaran del SET:::                  
        p2.setNombre("solomongolo");
        p2.setEdad(99);
           
        System.out.println("\nObjeto p2: \n");
        System.out.println(p2.getNombre()); // llama al objeto que contiene el valor! (string..)
        System.out.println(p2.getEdad());   
    }
}
