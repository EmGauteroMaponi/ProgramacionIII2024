package org.escuela.programacionIII2024;

/**
 * @author Emanuel Gautero
 */
public class ProgramacionIII2024 {

    public static void main(String[] args) {
//        ListaEnteros listaEnteros = new ListaEnteros();
        ListaEnteros listaEnteros = new ListEnteros();
        Primos primos =  new Primos(listaEnteros);
//        InterfazUsuario interfazUsuario = new InterfazUsuario(primos);
        InterfazUsuario interfazUsuario = new InterfazSwing(primos);
        interfazUsuario.run();

    }
}




