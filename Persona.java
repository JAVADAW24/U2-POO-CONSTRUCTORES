/**
 * @author Daw120
 */
class Persona {
    
   //atributos de clase Persona:
    private String nombre;
    private int edad;
  
    public Persona() // constructor sin param, 
    {
    }
    
    public Persona(String nom, int ed) // constructor con param: atributos de la clase: 
      {                                //con this se ASIGNA valor AL atributo nombre:
      this.nombre=nom;                 // (se iguala al parametro del constructor).                    
      this.edad=ed;  // idem: LO QUE CONTENGA ed --> se almacena en el atributo (this.edad)
      }              // con este constructor con pareamteros SE DAN valores sin GET NI SET.
      
    
     // metodos get retorna: asi que public y hacen falta dos: el de String y el de int.
     public String getNombre()
        {
        return nombre;
        }
    
     public int getEdad()
        {
        return edad;
        }
    
     //metodos sets, no retornan: meten los datos  
     public void setNombre(String nom)
        {
        this.nombre=nom;  //dice que el atributo nom --> se almacena en el primero: nombre.
        }
     
     public void setEdad(int ed)
       {
       this.edad=ed;
       }
      
}
