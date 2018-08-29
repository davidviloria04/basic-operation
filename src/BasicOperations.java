import javax.swing.JOptionPane;

public class BasicOperations
{
    public static void main(String[] args)
    {


        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number"));

        int suma=number1 +number2;

        int resta = number1 - number2;

        int division=number1 / number2;

        int multiplicacion=number1 * number2;

        JOptionPane.showMessageDialog(null, "La suma es: "+suma
                + "\nLa resta es :"+resta + "\nLa división es :"+division + "\nLa Multiplicación es :"+multiplicacion);
    }
}