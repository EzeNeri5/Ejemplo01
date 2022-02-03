/*Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)*/

package guia3.Servicios;
import guia3.Clases.Jugador;
import guia3.Clases.RevolverAgua;

public class RevolverDeAgua {

    public RevolverAgua llenarRevolver(){
        RevolverAgua r = new RevolverAgua();
        r.setPosicionTambor((int) (Math.random()*6));
        r.setPosocionAgua((int) (Math.random()*6));  
       
    return r;}
        
    public boolean mojar(RevolverAgua r){
        boolean op;
            if (r.getPosicionTambor() == r.getPosocionAgua()) {
            op = true; }
        else op = false; 
    
    return op;}

    public RevolverAgua siguienteChorro (RevolverAgua r){
            r.setPosicionTambor(r.getPosicionTambor()+1);
        
    return r; }
    
    public void mostrar (RevolverAgua r){
        System.out.println(r.toString()); }
    }
