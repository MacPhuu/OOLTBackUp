import javax.swing.JOptionPane;
public class RealRootEquation {
    public static void main(String[] args) {   
    String Choose;
    Choose = JOptionPane.showInputDialog(null, "Please choose type of equation: \n  1. First-degree, one variable. \n  2.First-degree, two variable. \n  3.Second-degree, onevariable.", "Equation type", JOptionPane.INFORMATION_MESSAGE);
    int choose = Integer.parseInt(Choose);
    if(choose == 1){
        String strA, strB;
        strA = JOptionPane.showInputDialog(null, "a = " ,"ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        strB = JOptionPane.showInputDialog(null, "b = ",  a+ "x + b = ", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(strB);
        if(a == 0 && b == 0){
            JOptionPane.showMessageDialog(null, "Infinite Roots","Solved",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(a == 0 && b != 0){
            JOptionPane.showMessageDialog(null, "No Root","Solved",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            double Root = -b/a;
            JOptionPane.showMessageDialog(null, "Root: " +Root , a + "x + " + b +" = 0", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    if(choose == 2){
        String strA11, strA12, strA1, strA21, strA22, strA2;
        strA11 = JOptionPane.showInputDialog(null, "a11 = ", "a11x + a12y = a1 ; a21x + a22y = a2", JOptionPane.INFORMATION_MESSAGE);
        double a11 = Double.parseDouble(strA11);
        strA12 = JOptionPane.showInputDialog(null, "a12 = ", a11 + "x + a12y = a1 ; a21x + a22y = a2", JOptionPane.INFORMATION_MESSAGE);
        Double a12 = Double.parseDouble(strA12);
        strA1 = JOptionPane.showInputDialog(null, "a1 = ", a11 + "x +" + a12 +" + y = a1 ; a21x + a22y = a2", JOptionPane.INFORMATION_MESSAGE);
        double a1 =Double.parseDouble(strA1);
        strA21 = JOptionPane.showInputDialog(null, "a1 = ", a11 + "x +" + a12 +" + y = "+ a1 + " ; a21x + a22y = a2", JOptionPane.INFORMATION_MESSAGE);
        double a21 = Double.parseDouble(strA21);
        strA22 = JOptionPane.showInputDialog(null, "a1 = ", a11 + "x +" + a12 +" + y = "+ a1 + " ; " + a21+"x + a22y = a2", JOptionPane.INFORMATION_MESSAGE);
        Double a22 = Double.parseDouble(strA22);
        strA2 = JOptionPane.showInputDialog(null, "a1 = ", a11 + "x +" + a12 +" + y = "+ a1 + " ; " + a21 + "x + " + a22 + "y = a2", JOptionPane.INFORMATION_MESSAGE);
        double a2 =Double.parseDouble(strA2);
        if(a11/a12 == a21/a22 && a11/a21 == a1/a2){
            JOptionPane.showMessageDialog(null, "Infinite Roots","Solved",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(a11/a12 == a21/a22 && a11/a21 != a1/a2){
            JOptionPane.showMessageDialog(null, "No Root","Solved",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            double y = (a21 * a1 - a11 * a2)/(a21 * a12 - a11 * a22);
            double x = (a1 - y*a12)/a11;
            JOptionPane.showMessageDialog(null, "x = " + x +"\ny = " + y, a11 + "x +" + a12 +" + y = "+ a1 + " ; " + a21 + "x + " + a22 + "y = "+ a2, JOptionPane.INFORMATION_MESSAGE);
        }
    
    }
    if(choose == 3){
        String strA, strB, strC;
        strA = JOptionPane.showInputDialog(null, "a =","ax^2 + bx + c = 0",JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        strB = JOptionPane.showInputDialog(null, "b =",a + "x^2 + bx + c = 0",JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(strB);
        strC = JOptionPane.showInputDialog(null, "c =",a + "x^2 + " + b + "x + c = 0",JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(strC);
        double Delta = Math.pow(b, 2) - 4*a*c;
        if(Delta < 0.0){
            JOptionPane.showMessageDialog(null, "No Root",a + "x^2 + " + b + "x + " + c + " = 0",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (Delta == 0.0){
            JOptionPane.showMessageDialog(null, "x = " + (-b/(2*a)),a + "x^2 + " + b + "x + " + c + " = 0",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "x1 = " + ((-b + Math.sqrt(Delta))/(2*a)) +"\n" + "x1 = " + ((-b - Math.sqrt(Delta))/(2*a)),a + "x^2 + " + b + "x + " + c + " = 0",JOptionPane.INFORMATION_MESSAGE);
        }
    }   
}
}
