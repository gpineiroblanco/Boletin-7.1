/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class Condicion {
    
    private double numero;
    
    public Condicion(){
        
    }
    public Condicion(double numero){
        this.numero=numero;
    }
    public double pedirNumero(){
        String respuesta = JOptionPane.showInputDialog("Introduce Número: ");
        double valor = Double.parseDouble(respuesta);
        return valor;
    }
    public void comparar(double num){
        numero=num;
        if(num >+ 0){
            JOptionPane.showMessageDialog(null, num+ " es positivo.");
        }else {
            JOptionPane.showMessageDialog(null, num+ " es negativo.");
        }
    }
}
