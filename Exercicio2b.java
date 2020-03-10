import javax.swing.*;
public class Exercicio2b
{
   public static void main (String args[])
   {
      double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso real"));
      String res = "Seu peso é:" + " " + peso + "Kg";
      JOptionPane.showMessageDialog(null,res);
      System.exit(0);
   }
}