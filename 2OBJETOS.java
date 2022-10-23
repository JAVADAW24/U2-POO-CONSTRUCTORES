//main

Persona nueva2=new Persona();                // crear nuevo objetoA
nueva2.setVariable("hola soy uno");                  // del objetoA.pideMetodoSet (y resetea lo suyo)

Persona nueva3=new Persona();                     // crear otro nuevo objetoB
nueva3.setVariable("hola soy otro");                   // del otro objetoB.pideMismoMetodoSet (resetea lo suyo)

System.out.println(nueva2.getVariable()); 
System.out.println(nueva3.getVariable());         // saca: de cada objeto.pidiendoSuGet // fin.

//clase, atributo y constructor
  
public class Persona {
    public String variable;
   
    public  void setVariable(String vari) {      // sus set vacio ha de (enviar tipo de algo)
    this.variable=vari;                            // ESTE atributo = tiene el valor.
    }
  
    public String getVariable(){       // sus get retornan la variable a la plantilla en main. cargara los datos 
    return variable;     
    }
 
}
