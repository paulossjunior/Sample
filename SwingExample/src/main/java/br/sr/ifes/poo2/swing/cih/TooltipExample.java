/**
 * Fonte do exemplo:http://zetcode.com/tutorials/javaswingtutorial/firstprograms/  
 * */
package br.sr.ifes.poo2.swing.cih;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TooltipExample extends JFrame {

	public TooltipExample()
	{
		initUI();
	}
	
	private void initUI()
	{
		JPanel panel = new JPanel();
	    getContentPane().add(panel);

	    panel.setLayout(null);
	    panel.setToolTipText("A Panel container");

	    JButton btn = new JButton("Button");
	    btn.setBounds(100, 60, 100, 30);
	    btn.setToolTipText("A Button component");
	    panel.add(btn);
	    
	    setTitle("Tooltip");
	    setSize(300, 200);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
