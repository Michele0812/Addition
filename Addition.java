/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addition;
// Programa de adição que utiliza JOptionPane para entrada e saída.
import javax.swing.JOptionPane; // programa utiliza JOptionPane

public class Addition
{
public static void main( String[] args)
{
// obtém a entrada de usuário a partir dos diálogos de entrada JOptionPane
String firstNumber =
JOptionPane.showInputDialog( "Enter first integer" );
String secondNumber =
JOptionPane.showInputDialog( "Enter second integer" );

// converte Sring em valores int para utilização em um cálculo
int number1 = Integer.parseInt( firstNumber );
int number2 = Integer.parseInt( secondNumber );

int sum = number1 + number2; // soma os números

// exibe o resultado em um diálogo de mensagem JOptionPane
JOptionPane.showMessageDialog( null, "The sum is " + sum,
"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
} // fim do método main
} // fim da classe Addition
;
