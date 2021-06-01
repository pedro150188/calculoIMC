/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoimcjava;

import javax.swing.JOptionPane;

/**
 *
 * @author PEDRO
 */
public class CalculoIMCjava
{
    public static void main (String[] args)
    {
        String nome;
        float peso, altura;
        float imc;
        String calculo;
        
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        peso = Float.parseFloat (JOptionPane.showInputDialog("Informe seu Peso, utilize . (ponto) para casas decimais:"));
        altura = Float.parseFloat (JOptionPane.showInputDialog("Informe sua Altura, utilize . (ponto) para casas decimais"));
        
        imc = (float) (peso/Math.pow(altura, 2));
        if (imc <= 19)
            calculo = "Abaixo do peso";
        else
            if(imc <= 25)
                calculo = "Peso ideal";
        else
                if (imc <= 30)
                    calculo = "Acima do peso";
        else
                    if (imc <= 35)
                        calculo = "Obesidade Leve";
        else
                        calculo = "Obesidade, procure um especialista!";
        
        JOptionPane.showMessageDialog(null, "IMC = "+imc+" - "+calculo);
        
    }
    
}