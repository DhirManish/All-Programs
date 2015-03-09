import javax.swing.JOptionPane;

public class Principal {
public static void main(String[] args) {
int P=Integer.parseInt(JOptionPane.showInputDialog(null,"enter amount value","0 rs."));
int r=Integer.parseInt(JOptionPane.showInputDialog(null,"enter rate value","0 %"));
int t=Integer.parseInt(JOptionPane.showInputDialog(null,"enter time value","0 years"));
JOptionPane.showMessageDialog(null, "Interest on " + P + " is " + (P*r*t/100) + JOptionPane.PLAIN_MESSAGE);
}
}
