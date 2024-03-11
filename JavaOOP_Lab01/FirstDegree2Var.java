import javax.swing.JOptionPane;

public class SolveSystem {

    public static void main(String[] args) {
        double a1, b1, c1, a2, b2, c2, x1, x2, det, det1, det2;
        a1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a1:"));
        b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b1:"));
        c1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of c1:"));
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a2:"));
        b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b2:"));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of c2:"));

        det = a1 * b2 - b1 * a2;

        if (det == 0) {
            if (a1/a2 == b1/b2 && a1/a2 == c1/c2) {
                JOptionPane.showMessageDialog(null, "The system has infinite solution."); 
            }
            else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            det1 = c1 * b2 - b1 * c2;

            det2 = a1 * c2 - c1 * a2;

            x1 = det1 / det;
            x2 = det2 / det;

            JOptionPane.showMessageDialog(null, "The solution is x1 = " + x1 + " and x2 = " + x2 + ".");
        }
    }
}
