package org.escuela.programacionIII2024;

/**
 * @author Emanuel Gautero
 */
public class ProgramacionIII2024 {

    public static void main(String[] args) {
//        ListaEnteros listaEnteros = new ListaEnteros();  //Este es el objeto que hace una lista de enteros mediante un array
        ListaEnteros listaEnteros = new EnterosConList(); //Este es el objeto que trabaja con una lista de entero mediante java.util.List
        Primos primos =  new Primos(listaEnteros);
//        InterfazUsuario interfazUsuario = new InterfazUsuario(primos); //Este es el objeto que presenta y pide los datos por Consola
        InterfazUsuario interfazUsuario = new InterfazSwing(primos); //Este objeto presenta y pide los datos por medio de Java Swing
        interfazUsuario.run();

    }
}




