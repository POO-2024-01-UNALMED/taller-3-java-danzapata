package taller3.televisores;

public class TV{

    public Marca marca;
    public int canal = 1;
    public int precio = 500;
    public boolean estado;
    public int volumen = 1;
    public Control control;
    public static int numTV;

    TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        TV.numTV = TV.numTV+1;
    }

    // sets y gets
    // marca
    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Marca getMarca(){
        return this.marca;
    }

    //canal
    public void setCanal(int canal){
        if (this.estado==true){
            if (canal>=1 && canal<=120){
                this.canal = canal;
            }
        }
    }

    public int getCanal(){
        return this.canal;
    }

    //precio
    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getPrecio(){
        return this.precio;
    }

    //Volumen 
    public void setVolumen(int volumen){
        if (this.estado==true){
            if (volumen>=0 && volumen<=7){
                this.volumen = volumen;
            }
        }
    }

    public int getVolumen(){
        return this.volumen;
    }

    // set y get de control
    public void setControl(Control control){
        this.control = control;
    }

    public Control getControl(){
        return this.control;
    }

    // número televisores
    public static int getNumTV(){
        return numTV;
    }

    public static void setNumTV(int numTV){
        TV.numTV = numTV;
    }

    // encendido y apagado
    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    // canal y volumen aumentados en 1 
    public void canalUp(){
        if (this.estado==true){
            if (this.canal<=119 && this.canal>=1){ 
                this.canal =this.canal + 1;
            }
        }
    }

    public void canalDown(){
        if (this.estado==true){
            if (this.canal<=120 && this.canal>=2){ 
                this.canal =this.canal - 1;
            }
        }
    }

    public void volumenUp(){
        if (this.estado==true){
            if (this.volumen<=6 && this.volumen>=0){ 
                this.volumen = this.volumen + 1;
            }
        }
    }

    public void volumenDown(){
        if (this.estado==true){
            if (this.volumen<=7 && this.volumen>=1){ 
            this.volumen =this.volumen - 1;
            }
        }
    }



}