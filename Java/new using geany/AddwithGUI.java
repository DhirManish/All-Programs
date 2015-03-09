import javax.swing.JOptionPane;

public class AddwithGUI {
public static void main(String[] args) {
int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the first value",'0'));
int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the second value",'0'));
JOptionPane.showMessageDialog(null, "sum of value " + num1 + " and " + num2 + " is " + (num1 + num2) + JOptionPane.PLAIN_MESSAGE);
}
}
