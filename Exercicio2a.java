import javax.swing.*;
public class Exercicio2a
{
   public static void main (String args[])
   {
      int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do dia de uma data"));
      int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do mes de uma data"));
      int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do ano de uma data"));
      String res = "Essa � a sua data" + " " + dia + "/" + mes + "/" + ano;
      JOptionPane.showMessageDialog(null,res);
      System.exit (0);
   }
}