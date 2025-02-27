package main;
 
import javax.swing.*;
 
public class MiVentana {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Ventana");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
 
        JButton boton = new JButton("Pulsa aquí");
        boton.setBounds(120, 100, 140, 50);  
 
        frame.add(boton);
 
        frame.setVisible(true);
    }
}