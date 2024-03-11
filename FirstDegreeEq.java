import javax.swing.JOptionPane;

public class FirstDegreeEq {
    public static void main(String[] args) {
        String a_str,b_str;
        String ans;

        a_str = JOptionPane.showInputDialog(null,
         "Please input the a value: ", "Input the a value",
         JOptionPane.INFORMATION_MESSAGE);

        b_str = JOptionPane.showInputDialog(null,
         "Please input the b value: ", "Input the b value",
         JOptionPane.INFORMATION_MESSAGE);

        Double a,b;
        a = Double.parseDouble(a_str);
        b = Double.parseDouble(b_str);

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinite solutions",
                "Result", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "The equation has no solution",
                "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        else {
            if (b == 0) {
                ans = "The equation has a solution is: " + 0;
                JOptionPane.showMessageDialog(null, ans,
                "Result", JOptionPane.INFORMATION_MESSAGE);
            }

            else {
                ans = "The equation has a solution is: " + (-b/a);
                JOptionPane.showMessageDialog(null, ans,
                "Result", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
    }
}