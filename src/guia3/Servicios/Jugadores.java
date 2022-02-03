/* disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
package guia3.Servicios;

import guia3.Clases.Jugador;
import guia3.Clases.RevolverAgua;
import java.util.Scanner;

public class Jugadores {
    public Jugador CargaJugadores(){
        Scanner leer = new Scanner(System.in);
        Jugador j = new Jugador();
        
        System.out.println("ID (0 a 6)");
        j.setId(leer.nextInt());
        System.out.println("Nombre");
        j.setNombre(leer.next()+ j.getId());
        
        return j; }
    
    public Jugador disparo (RevolverAgua r, Jugadores j){
    
    RevolverDeAgua rev = new RevolverDeAgua();
    Jugador jug = new Jugador();
    
    jug.setMojado(rev.mojar(r));
    rev.siguienteChorro(r);
    return jug;    } 
}
