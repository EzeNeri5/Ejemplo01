/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona */

package guia3;

import guia3.Clases.Perro;
import guia3.Clases.Persona;
import guia3.Servicios.Perros;
import guia3.Servicios.Personas;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Personas p = new Personas();
        Perros per = new Perros();
        Persona pers = new Persona();
        Persona pers2 = new Persona();
        Perro perro = new Perro();
        Perro perro2 = new Perro();
        String op = "";
        
       pers = p.crearPersona();
       pers2 = p.crearPersona();
       System.out.println("Vamos a crear un perro");
       perro = per.crearPerro();
       System.out.println("Vamos a crear otro perro");
       perro2 = per.crearPerro();
       
        System.out.println("Desea asignar perro 1 a persona 1? (S/N)");
        op = leer.next();
        if (op.equalsIgnoreCase("s")) {
            pers.setPerro(perro);}
        System.out.println("Desea asignar perro 2 a persona 1? (S/N)");
        op = leer.next();
        if (op.equalsIgnoreCase("s")) {
            pers.setPerro(perro2);}
        System.out.println("Desea asignar perro 1 a persona 2? (S/N)");
        op = leer.next();
        if (op.equalsIgnoreCase("s")) {
            pers2.setPerro(perro);}
        System.out.println("Desea asignar perro 2 a persona 2? (S/N)");
        op = leer.next();
        if (op.equalsIgnoreCase("s")) {
            pers2.setPerro(perro2);}
       
        System.out.print(pers); 
        System.out.print(pers2);
        
}
}