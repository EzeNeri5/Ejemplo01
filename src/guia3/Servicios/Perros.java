package guia3.Servicios;
import guia3.Clases.Perro;
import java.util.Scanner;
public class Perros {

    public Perro crearPerro(){
    Scanner leer = new Scanner(System.in);
    Perro perro = new Perro();

        System.out.println("Nombre");
        perro.setNombre(leer.next());
        System.out.println("Edad");
        perro.setEdad(leer.nextInt());
        System.out.println("Raza");
        perro.setRaza(leer.next());
        System.out.println("Tamaño");
        perro.setTamaño(leer.next());
        
    return perro;    }
    }  
