package org.escuela.programacionIII2024;

import java.util.Scanner;

public class InterfazUsuario {
    private Primos primos;
    private Scanner scanner;
    private int opcion;

    InterfazUsuario(Primos primos){
        this.primos = primos;
        scanner =  new Scanner(System.in);
        this.opcion = 0;
    }

    public void setPrimos(Primos primos) {
        this.primos = primos;
    }

    public Primos getPrimos() {
        return primos;
    }

    public void run(){
        System.out.println("Bienvenido al Sistema de Gestion de numeros primos");
        while (opcion != 6) {
            imprimirMenu();
            opcion = pedirOpcion();
            switch (opcion){
                case 1:
                    int n = pedirNumero("Ingrese el valor de N: ");
                    primos.cargarPrimosHasta(n);
                    break;
                case 2:
                    agregar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    System.out.println("Esta es la lista de numeros primos ordenada de Mayor a Menor: ");
                    imprimirPrimos(primos.obtenerPrimosDeMayorAMenor());
                    break;
                case 5:
                    System.out.println("Esta es la lista de numeros primos ordenada de Menor a Mayor: ");
                    imprimirPrimos(primos.obtenerPrimosDeMenorAMayor());
                    break;
                case 6:
                    System.out.println("El programa ha finalizado. Muchas Gracias.");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta.");
                    break;
            }
        }

    }

    private void agregar() {
        int primo = pedirNumero("Ingresa el primo que quieres agregar");
        boolean saved = false;
        while (!saved){
            if (!primos.esPrimo(primo)){
                System.out.println("No se puede agregar el numero porque no es primo");
                primo = pedirNumero("Ingresa un numero primo valido: ");
                break;
            }
            if(primos.esPrimoRepetido(primo)){
                System.out.println("No se puede agregar el numero porque ya esta cargado en la lista.");
                primo = pedirNumero("Ingresa un numero primo valido: ");
                break;
            }
            saved = true;
        }
        primos.agregarPrimo(primo);
        System.out.println("El numero "+ primo+ " se agrego de forma correcta.");
    }

    private void eliminar() {
        int eliminar = pedirNumero("Ingrese el numero que quiere eliminar: ");
        while (!primos.esPrimoRepetido(eliminar)){
            eliminar = pedirNumero("El numero ingresado no existe en la lista, ingresa un numero valido: ");
        }
        primos.eliminarPrimo(eliminar);
    }

    private void imprimirMenu(){
        System.out.println("Estas son las opciones que tenemos disponible para usted:");
        System.out.println("1 _ Calcular numeros primos entre 0 y N");
        System.out.println("2 _ Cargar nuevos numeros");
        System.out.println("3 _ Eliminar");
        System.out.println("4 _ Ordenar de Mayor a Menor");
        System.out.println("5 _ Ordenar de Menor a Mayor");
        System.out.println("6 _ Salir");
    }

    private int pedirNumero(String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    private int pedirOpcion(){
        System.out.println("Ingrese la opcion que desea realizar:");
        return scanner.nextInt();
    }

    protected void imprimirPrimos (int[] vector){
        for( int i : vector){
            System.out.println(" - "+ i);
        }
    }

}
