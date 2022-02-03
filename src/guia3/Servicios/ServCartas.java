/*Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.*/

package guia3.Servicios;
import guia3.Clases.Baraja;
import guia3.Clases.Carta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ServCartas {
    
    private List<Carta> ba = new ArrayList();
    
    public List<Carta> llenarmaso(){  
        
        List<Carta> aux = new ArrayList();
        
        for (int i = 0; i < 8; i++) { 
           Carta carta = new Carta();
           carta.setNum(i+1);
           carta.setPalo(Maso.ORO);
           aux.add(carta);}
           


//        for (int i = 10; i < 13; i++) {
//           Carta carta = new Carta();
//           carta.setNum(i);
//           carta.setPalo(Maso.ORO);
//           aux.add(carta);}}
         return aux;
  }
    public void mostrarCarta(List<Carta> ba){
        for (int i = 0; i < 8; i++) {
            System.out.println(ba);  }
    
    
    }
    
    
    
    
}
