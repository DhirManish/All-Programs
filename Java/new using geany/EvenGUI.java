import javax.swing.JOptionPane;

public class EvenGUI {
public static void main(String[] args) {
int a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the value","0"));
if(a%2==0)
JOptionPane.showMessageDialog(null, "number " + a + " is " + "even" + JOptionPane.PLAIN_MESSAGE);
else
JOptionPane.showMessageDialog(null, "number " + a + " is " + "odd" + JOptionPane.PLAIN_MESSAGE);
for(int i=2; i<a; i++){
if(a%i!=0)
JOptionPane.showMessageDialog(null, "number " + a + " is  prime" + JOptionPane.PLAIN_MESSAGE);
else
JOptionPane.showMessageDialog(null, "number " + a + " is  not prime" + JOptionPane.PLAIN_MESSAGE);
}
}
}
