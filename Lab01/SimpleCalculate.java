import javax.swing.JOptionPane;
public class SimpleCalculate {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String Answer = "";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Enter the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Enter the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double quot = num1 / num2;
        Answer += "Sum: " + sum + "\n" + "Difference: " + diff + "\n" + "Product: " + prod + "\n" + "Quotient: " + Math.ceil(quot*100)/100;
        JOptionPane.showMessageDialog(null, Answer, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
