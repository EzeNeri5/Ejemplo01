package guia3.Clases;

import guia3.Servicios.Maso;

public class Carta {

    private Integer num;
    private Maso palo; 

    public Carta() {    }

    public Carta(Integer num, Maso palo) {
        this.num = num;
        this.palo = palo;    }

    public Integer getNum() {
        return num;    }

    public void setNum(Integer num) {
        this.num = num;    }

    public Maso getPalo() {
        return palo;    }

    public void setPalo(Maso palo) {
        this.palo = palo;    }
    
    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';    }
}
