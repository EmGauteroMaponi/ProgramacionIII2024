package org.escuela.programacionIII2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEnteros extends ListaEnteros {
    List<Integer> enteros;

    public ListEnteros() {
        super();
        enteros = new ArrayList<>();
    }

    @Override
    public void agregarEntero(int entero) {
        enteros.add(entero);
    }

    @Override
    public boolean existeEntero(int entero) {
        return enteros.contains(entero);
    }

    @Override
    public void eliminarEntero(int entero) {
        enteros.remove(entero);
    }

    @Override
    public int[] ordenadoMenorMayor() {
        Collections.sort(enteros);
        return enteros.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public int [] ordenadoMayorMenor(){
        Collections.sort(enteros, Collections.reverseOrder());
        return enteros.stream().mapToInt(i->i).toArray();
    }

}
