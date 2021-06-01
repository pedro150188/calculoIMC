/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoimcjava;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

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
        if (imc <= 17)
            calculo = "Muito abaixo do peso";
        else
            if(imc >= 17 && imc <=18.49)
                calculo = "Abaixo do Peso";
        else
                if (imc >=18.50 && imc <= 24.99)
                    calculo = "Peso normal";
        else
                    if (imc >= 25 && imc <=29.99)
                        calculo = "Obesidade I";
        else
                    if (imc >= 30 && imc <=34.99)
                        calculo = "Obesidade II";
        else
                        calculo = "Obesidade móbida, procure um especialista!";
        DecimalFormat df = new DecimalFormat("##.##");        
        JOptionPane.showMessageDialog(null,"Olá, "+nome+" seu IMC é ="+df.format(imc)+" - "+calculo);
                
    }
    
}
