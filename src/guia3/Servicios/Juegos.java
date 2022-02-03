/*• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
package guia3.Servicios;

import guia3.Clases.Juego;
import guia3.Clases.Jugador;
import guia3.Clases.RevolverAgua;
import java.util.List;

public class Juegos {

    public Juego llenarJuego(Jugador j, RevolverAgua r){
        Juego game = new Juego();
        game.setJugador(j   );
        game.setRevolver(r); 
    
    return game;}
    
    public void ronda(){
        
    
    
    
    }    
}
