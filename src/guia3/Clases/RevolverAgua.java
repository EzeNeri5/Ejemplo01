/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.*/

package guia3.Clases;

public class RevolverAgua {

    private int posicionTambor;
    private int posocionAgua;

    public RevolverAgua() {    }

    public RevolverAgua(int posicionTambor, int posocionAgua) {
        this.posicionTambor = posicionTambor;
        this.posocionAgua = posocionAgua;    }

    public int getPosicionTambor() {
        return posicionTambor;    }
    
    public void setPosicionTambor(int posicionTambor) {
        this.posicionTambor = posicionTambor;    }

    public int getPosocionAgua() {
        return posocionAgua;    }

    public void setPosocionAgua(int posocionAgua) {
        this.posocionAgua = posocionAgua;    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionTambor=" + posicionTambor + ", posocionAgua=" + posocionAgua + '}';    }
    
}
