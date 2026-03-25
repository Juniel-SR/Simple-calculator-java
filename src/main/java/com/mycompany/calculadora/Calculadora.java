/**
 *
 * @author juniel
 */
package com.mycompany.calculadora;
import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
     String[] algoritmo = {"Soma", "Subtração", "Multiplicação", "Divisão"};   
     int tipo = JOptionPane.showOptionDialog(
             null, "Escolha o tipo: ", "Calculadora",
             JOptionPane.DEFAULT_OPTION,
             JOptionPane.INFORMATION_MESSAGE,
             null, algoritmo, algoritmo[0]);
     
     if( tipo == -1){
      JOptionPane.showMessageDialog(null, "Encerrado");
      return;
     }
     
     Algoritmo x = new Algoritmo(algoritmo[tipo]);
     x.escolherTipo(tipo);
     
    }
}
