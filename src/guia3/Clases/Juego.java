//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
//Jugadores) y Revolver

package guia3.Clases;

import java.util.List;

public class Juego {

    private List<Jugador> jugador;
    private RevolverAgua revolver;

    public Juego() {    }

    public Juego(List<Jugador> jugador, RevolverAgua revolver) {
        this.jugador = jugador;
        this.revolver = revolver;    }

    public List<Jugador> getJugador() {
        return jugador;    }

    public void setJugador(List<Jugador> jugador) {
        this.jugador = jugador;    }

    public RevolverAgua getRevolver() {
        return revolver;    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;    }
    
    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador + ", revolver=" + revolver + '}';    }
}
