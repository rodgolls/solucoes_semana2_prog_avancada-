import javax.swing.JOptionPane;
public class Exercicio1a
{
   public static void main (String [] args)
   {
      String a = JOptionPane.showInputDialog("Digite a primeira palavra");
      String b = JOptionPane.showInputDialog("Digite a segunda palavra");
      String c = JOptionPane.showInputDialog("Digite a terceira palavra");
      String resultado = c + " " + b + " " + a;
      JOptionPane.showMessageDialog(null,resultado);
      System.exit (0);
   
   }


}