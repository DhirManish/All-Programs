import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CircPanel extends JPanel {
	private int radius = 5;
	
	public void enlarge() {
		radius += 10;
		repaint();
	}
	
	public void shrink() {
		radius -= 10;
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 2 * radius, 2 * radius);
	}
}

public class AnimCirc extends JFrame implements ActionListener {
	private JPanel pnlButtons;
	private CircPanel pnlCirc;
	private JButton btnShrink;
	private JButton btnLarge;
	private Timer timer;
	
	public AnimCirc() {
		pnlButtons = new JPanel(new FlowLayout());
		pnlCirc = new CircPanel();
		btnShrink = new JButton("Shrink");
		btnLarge = new JButton("Large");
		
		pnlButtons.add(btnShrink);
		pnlButtons.add(btnLarge);
		
		btnShrink.addActionListener(this);
		btnLarge.addActionListener(this);
		
		timer = new Timer(1000, this);
			
		setLayout(new BorderLayout());
		add(pnlButtons, "South");
		add(pnlCirc, "Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnShrink)
			pnlCirc.shrink();
		else if (e.getSource() == btnLarge) {
			pnlCirc.enlarge();
			timer.start();
		} 
	}
	
	public static void main(String args[]) {
		new AnimCirc();
	}
}
