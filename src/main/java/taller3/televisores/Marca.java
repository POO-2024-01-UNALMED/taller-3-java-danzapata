package taller3.televisores;

public class Marca {
    
    private String nombre;

    public Marca(String marca){
        this.nombre = marca;
    }
    
    // cambiar  y ver nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

}
