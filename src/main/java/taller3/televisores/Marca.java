package taller3.televisores;

public class Marca {
    
    private String nombre;

    Marca(String marca){
        this.nombre = marca;
    }
    
    // cambiar  y ver nombre
    public void setNombre(String marca){
        this.nombre = marca;
    }

    public String getNombre(){
        return this.nombre;
    }

}
