package guia3.Servicios;
import guia3.Clases.Persona;
import java.util.List;
import java.util.Scanner;

public class Personas {

    public Persona crearPersona(){
    Scanner leer = new Scanner(System.in);
    Persona pers = new Persona();
    Perros perro = new Perros();
    String op = "";

        System.out.println("Nombre");
        pers.setNombre(leer.next());
        System.out.println("Apellido");
        pers.setApellido(leer.next());
        System.out.println("Edad");
        pers.setEdad(leer.nextInt());
        System.out.println("DNI");
        pers.setDni(leer.nextInt());
        
//        System.out.println("Desea agreagar un perro??");
//            op = leer.next();
//        while (op.equalsIgnoreCase("s")){
//            pers.setPerro(perro.crearPerro());   
//            System.out.println("Desea agreagar un perro??");
//            op = leer.next();}
        
    return pers;
    } }
