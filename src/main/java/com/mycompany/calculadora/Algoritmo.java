/**
 *
 * @author juniel
 */
package com.mycompany.calculadora;
import javax.swing.JOptionPane;
public class Algoritmo {
    String calculo;
    double adicao;
    double subtracao;
    double multiplicacao;
    double divisao;
    double a, b, c;
    
    public Algoritmo(String calculo){
    this.calculo = calculo;
}
    
    public void adicao(){
    System.out.println("Faça a soma de dois numeros.");
    a = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro digito: "));
    b = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo digito: "));
    c = a + b;
    System.out.println("O resultado é: " + c);
    } 
    public void subtracao(){
    System.out.println("Faça a subtração de dois numeros.");
    a = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro digito: "));
    b = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo digito: "));
    c = a - b;
    System.out.println("O resultado é: " + c);
    }
    public void multiplicacao(){
    System.out.println("Faça a multiplicação de dois numeros.");
    a = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro digito: "));
    b = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo digito: "));
    c = a * b;
    System.out.println("O resultado é: " + c);
    }
    public void divisao(){
    System.out.println("Faça a divisão de dois numeros.");
    a = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeiro digito: "));
    b = Double.parseDouble(JOptionPane.showInputDialog(null, "Segundo digito: "));
    c = a / b;
    System.out.println("O resultado é: " + c);
    }
    public void escolherTipo(int tipo){
    switch(tipo){
        case 0:
            adicao();
            break;
        case 1:
            subtracao();
            break;
        case 2:
            multiplicacao();
            break;
        case 3:
            divisao();
            break;
    }
    }
}
