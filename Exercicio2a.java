import javax.swing.*;
public class Exercicio2a
{
   public static void main (String args[])
   {
      int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do dia de uma data"));
      int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mes de uma data"));
      int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do ano de uma data"));
      String res = "Essa é a sua data" + " " + dia + "/" + mes + "/" + ano;
      JOptionPane.showMessageDialog(null,res);
      System.exit (0);
   }
}