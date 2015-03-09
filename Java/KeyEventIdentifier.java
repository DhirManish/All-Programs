/*
 * KeyEventIdentifier.java
 * 
 * Copyright 2015 manishdhir <manishdhir@manishdhir-HP-d530-SFF-DG058A>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventIdentifier {
  public static void main(String[] argv) throws Exception {
    JTextField component = new JTextField();
    component.addKeyListener(new MyKeyListener());

    JFrame f = new JFrame();

    f.add(component);
    f.setSize(300, 300);
    f.setVisible(true);

  }
}

class MyKeyListener extends KeyAdapter {
  public void keyPressed(KeyEvent evt) {
	char c = evt.getKeyChar();
	for(int i = 1; i <= (int)c; i++){
    if (evt.getKeyChar() == '') {
		System.out.println("Check for key characters: " + evt.getKeyChar() + evt.getKeyCode());
    }}
    for(int i = 1; i <= 255; i++){
    if (evt.getKeyCode() == (char)i) {
      System.out.println("Check for key codes: " + evt.getKeyCode());
    }
    }
  }
}
