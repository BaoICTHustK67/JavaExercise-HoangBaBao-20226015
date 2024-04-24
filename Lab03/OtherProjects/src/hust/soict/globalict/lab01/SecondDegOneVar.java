import javax.swing.JOptionPane;
import java.lang.Math;

public class SecondDegOneVar {
    public static void main(String[] args) {
        String ans;
        double a,b,c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of c:"));

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    JOptionPane.showMessageDialog(null, "The equation has infinite solutions",
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "The equation has no solution",
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            else {
                if (c == 0) {
                    ans = "The equation has a solution is: " + 0;
                    JOptionPane.showMessageDialog(null, ans,
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                }

                else {
                    ans = "The equation has a solution is: " + (-c/b);
                    JOptionPane.showMessageDialog(null, ans,
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        else {
            double delta = b*b - 4*a*c;
            if (delta < 0) {
                ans = "The equation has no solution";
                JOptionPane.showMessageDialog(null, ans,
                "Result", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                if (delta == 0) {
                    ans = "The equation has unique solution" + ((-b + Math.sqrt(delta)) / 2*a);
                    JOptionPane.showMessageDialog(null, ans,
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    ans = "The equation has two solutions" + " x1 = " + ((-b + Math.sqrt(delta)) / 2*a)
                    + "\n x2 = " + ((-b - Math.sqrt(delta)) / 2*a);
                    JOptionPane.showMessageDialog(null, ans,
                    "Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }
}