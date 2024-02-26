package taller3.televisores;

public class Control{

    public TV tv;

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
        if (tv.estado==true){
            if (canal>=1 && canal<=120){
                tv.canal = canal;
            }
        }
    }

    public void setVolumen(int volumen){
        if (tv.estado==true){
            if (volumen>=0 && volumen<=7){
                tv.volumen = volumen;
            }
        }
    }

    // apagado encendido
    public void turnOn(){
        tv.estado = true;
    }

    public void turnOff(){
        tv.estado = false;
    }

    //incremento canales en 1, desde el control
    public void canalUp(){
        if (tv.estado==true){
            if (tv.canal<=119 && tv.canal>=1){ 
                tv.canal =tv.canal + 1;
            }
        }
    }

    public void canalDown(){
        if (tv.estado==true){
            if (tv.canal<=120 && tv.canal>=2){ 
                tv.canal =tv.canal - 1;
            }
        }
    }

    public void volumenUp(){
        if (tv.estado==true){
            if (tv.volumen<=6 && tv.volumen>=0){ 
                tv.volumen = tv.volumen + 1;
            }
        }
    }

    public void volumenDown(){
        if (tv.estado==true){
            if (tv.volumen<=7 && tv.volumen>=1){ 
            tv.volumen =tv.volumen - 1;
            }
        }
    }


}