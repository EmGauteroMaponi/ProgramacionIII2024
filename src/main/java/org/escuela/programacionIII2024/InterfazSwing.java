package org.escuela.programacionIII2024;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class InterfazSwing extends InterfazUsuario implements ActionListener {
    private JFrame frame;

    InterfazSwing(Primos primos){
        super(primos);
        frame=new JFrame();
    }

    public void run(){
        crearMenu();
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private void crearMenu(){
        crearBoton("Calcular números primos entre 0 y N", 100);
        crearBoton("Ingresar un número primo", 150);
        crearBoton("Eliminar un número primo", 200);
        crearBoton("Mostrar ordenados de mayor a menor", 250);
        crearBoton("Mostrar ordenados de menor a mayor", 300);
    }

    private void crearBoton(String texto, int posY){
        JButton boton=new JButton(texto);
        boton.setBounds(50,posY,400, 40);
        boton.addActionListener(this);
        frame.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText() == "Calcular números primos entre 0 y N") {
            String n = JOptionPane.showInputDialog("Ingresa el Valor De N");
            getPrimos().cargarPrimosHasta(Integer.parseInt(n));
        }
        if (button.getText().equals("Ingresar un número primo")){
            agregarPrimo();
        }

        if (button.getText().equals("Eliminar un número primo")){
            eliminarPrimo();
        }
        if (button.getText().equals("Mostrar ordenados de menor a mayor")){
            JOptionPane.showMessageDialog(null,obtenerListaString(getPrimos().obtenerPrimosDeMenorAMayor()));
        }
        if (button.getText().equals("Mostrar ordenados de mayor a menor")){

            JOptionPane.showMessageDialog(null,obtenerListaString(getPrimos().obtenerPrimosDeMayorAMenor()));
        }

    }

    private void agregarPrimo() {
        String primoS = JOptionPane.showInputDialog("Ingresa el Primo que quieres agregar");
        Integer primo = Integer.parseInt(primoS);
        while (!getPrimos().esPrimo(primo)
        || getPrimos().esPrimoRepetido(primo)){
            primo = Integer.parseInt(JOptionPane.showInputDialog("El número no es primo, o está repetido, por favor ingrese un número válido"));
        }
        getPrimos().agregarPrimo(primo);
        JOptionPane.showConfirmDialog(null, "El numero se guardó de forma Correcta");
    }

    private void eliminarPrimo() {
        String primoS = JOptionPane.showInputDialog("Ingresa el número que quieres eliminar");
        Integer primo = Integer.parseInt(primoS);
        while (!getPrimos().esPrimoRepetido(primo) ){
            primo = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado no está cargado en el sistema"));
        }
        getPrimos().eliminarPrimo(primo);
    }


    private String obtenerListaString(int[] primos){
        String primosS = "";
        for (int j = 0; j < primos.length; j++){
            primosS = primosS+ " "+primos[j];
        }
        return primosS;

    }
}
