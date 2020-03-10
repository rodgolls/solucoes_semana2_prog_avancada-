import javax.swing.JOptionPane;
public class Exercicio1b
{
   public static void main (String [] args)
   {
      int n = Integer.parseInt(JOptionPane.showInputDialog("DIigite um numero"));
      String res = "Seu numero digitado foi o:" + " " + n;
      JOptionPane.showMessageDialog(null,res);
      System.exit (0);
   }
}