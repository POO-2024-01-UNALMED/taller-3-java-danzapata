package taller3.televisores;

public class Control{

    private TV tv;

    //enlazar
    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    //set y get tv
    public void setTv(TV tv){
        this.tv = tv;
    }

    public TV getTv(){
        return this.tv;
    }



    // volumen y canal
    public void setCanal(int canal){
        if (tv.getEstado()==true){
            if (canal>=1 && canal<=120){
                tv.setCanal(canal);
            }
        }
    }

    public void setVolumen(int volumen){
        if (tv.getEstado()==true){
            if (volumen>=0 && volumen<=7){
                tv.setVolumen(volumen);
            }
        }
    }

    // apagado encendido
    public void turnOn(){
        tv.turnOn();
    }

    public void turnOff(){
        tv.turnOff();
    }

    //incremento canales en 1, desde el control
    public void canalUp(){
        if (tv.getEstado()==true){
            if (tv.getCanal()<=119 && tv.getCanal()>=1){ 
                tv.canalUp();
            }
        }
    }

    public void canalDown(){
        if (tv.getEstado()==true){
            if (tv.getCanal()<=120 && tv.getCanal()>=2){ 
                tv.canalDown();
            }
        }
    }

    public void volumenUp(){
        if (tv.getEstado()==true){
            if (tv.getVolumen()<=6 && tv.getVolumen()>=0){ 
                tv.volumenUp();
            }
        }
    }

    public void volumenDown(){
        if (tv.getEstado()==true){
            if (tv.getVolumen()<=7 && tv.getVolumen()>=1){ 
                tv.volumenDown();
            }
        }
    }


}