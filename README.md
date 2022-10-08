# U2-POO-CONSTRUCTORES
Ejemplo básico de Constructor en JAVA con GET y SET

```java
Persona p2=new Persona();                   
        p2.setNombre("YOU");
        p2.setEdad(100);           
        System.out.println("objeto p2: \n");
        System.out.println(p2.getNombre());
        System.out.println(p2.getEdad());   
```
![goooooooooool](https://user-images.githubusercontent.com/80227002/194679000-1b271af2-629c-4d92-873a-b3d087bb5ce4.png)

```java
class Persona {
    private String nombre;
    private int edad;
    public Persona(){}  
    public Persona(String nom, int ed){                                  
    this.nombre=nom;                                     
    this.edad=ed;}            
     
      public String getNombre(){
      return nombre;}  
      public int getEdad(){
      return edad;}

      public void setNombre(String nom){
      this.nombre=nom;}  
      public void setEdad(int ed){
      this.edad=ed;}
     }
```
