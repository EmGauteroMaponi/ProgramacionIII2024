package org.escuela.programacionIII2024;
public class ListaEnteros {
    private int[] enteros;

    public ListaEnteros() {
        this.enteros = new int[0];
    }


    public void agregarEntero(int entero){
        if (enteros == null){
            enteros = new int[1];
            enteros[0] = entero;
        }else{
            int tam= enteros.length + 1;
            int[] nuevoEnteros = new int [tam];
            enteros = llenarVector(nuevoEnteros, enteros);
            enteros [tam-1] = entero;
        }
    }

    public boolean existeEntero(int entero){
        for (int num : enteros){
            if (num == entero){
                return true;
            }
        }
        return false;
    }

    public void eliminarEntero(int entero){
        int[] vectorAuxiliar =  new int[enteros.length -1];
        int cont = 0;
        boolean encontrado = false;
        for(int i=0; i < enteros.length;i++){
            if(enteros[i] != entero){
                vectorAuxiliar[cont] = enteros[i];
                cont++;
            }else {
                encontrado = true;
            }
        }
        if (encontrado){
            enteros =  vectorAuxiliar;
        }
    }

    public int [] ordenadoMenorMayor(){
        for (int i=0; i<enteros.length; i++){
            int menor = enteros[i];
            int indice = i;

            for (int j=i+1; j<enteros.length; j++){
                if (menor > enteros[j]){
                    menor = enteros[j];
                    indice = j;
                }
            }

            int dato = enteros[i];
            enteros[i] = menor;
            enteros[indice] = dato;
        }
        return enteros;
    }

    public int [] ordenadoMayorMenor(){
        for (int i=0; i<enteros.length; i++){
            int mayor = enteros[i];
            int indice = i;

            for (int j=i+1; j<enteros.length; j++){
                if (mayor < enteros[j]){
                    mayor = enteros[j];
                    indice = j;
                }
            }

            int dato = enteros[i];
            enteros[i] = mayor;
            enteros[indice] = dato;
        }
        return enteros;
    }

    private static int[] llenarVector(int[] vector, int[] valores){
        for (int i = 0; i< valores.length; i++){
            vector[i]= valores[i];
        }
        return vector;
    }
}
