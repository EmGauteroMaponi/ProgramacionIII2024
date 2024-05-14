package org.escuela.programacionIII2024;

public class Primos {
    private ListaEnteros listaEnteros;

    Primos(ListaEnteros listaEnteros){
        this.listaEnteros =  listaEnteros;
    }


    public boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean esPrimoRepetido(int primo){
        return esPrimo(primo) && listaEnteros.existeEntero(primo);
    }

    public void eliminarPrimo(int primo){
        listaEnteros.eliminarEntero(primo);
    }

    public int[] obtenerPrimosDeMayorAMenor(){
        return listaEnteros.ordenadoMayorMenor();
    }
    public int[] obtenerPrimosDeMenorAMayor(){
        return listaEnteros.ordenadoMenorMayor();
    }

    public void agregarPrimo(int primo){
        listaEnteros.agregarEntero(primo);
    }

    public void cargarPrimosHasta(int n) {
        for (int num = 2; num <= n; num++) {
            if (esPrimo(num)) {
                listaEnteros.agregarEntero(num);
            }
        }
    }

}
