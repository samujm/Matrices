package domain;

public class Persona {
    //Atributo
    private String nombre;
    
    //Constructor
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Metodo get
    public String getNombre(){
        return nombre;
    }
    
    //Metodo set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Metodo toString
    @Override
    public String toString(){
        return "Persona{" + "nombre= " + nombre + "}" + super.toString(); //super.toString() IMPRIME LA DIRECCION DE MEMORIA
    }
    
}
