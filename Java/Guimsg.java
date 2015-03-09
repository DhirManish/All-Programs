import javax.swing.JOptionPane;
public class Guimsg{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null,"enter the price of product");
		int a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the price of product",100));
		int inc=a+1;
		JOptionPane.showMessageDialog(null,"increment value of "+ a +" is " + inc);
	}
}

