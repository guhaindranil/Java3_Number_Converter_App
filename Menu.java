/*
 * Create Number Conversion Menu App using Swing
 */
package arg.guhai.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton binToHex = new JButton("binToHex");
	JButton binToDec = new JButton("binToDec");
	JButton hexToBin = new JButton("hexToBin");
	JButton hexToDec = new JButton("hexToDec");
	JButton decToBin = new JButton("dectoBin");
	JButton decToHex = new JButton("dectoHex");
	private Binary binary;
	private Decimal decimal;
	private Hexadecimal hexadecimal;
	
	
	public Menu(Binary bin, Hexadecimal hex, Decimal dec) {
		this.binary = bin;
		this.hexadecimal = hex;
		this.decimal = dec;
		
	}	
	
    
    public void show() {
    	frame.setVisible(true);
    	frame.add(panel);
    	panel.add(binToHex);
    	panel.add(binToDec);
    	panel.add(hexToBin);
    	panel.add(hexToDec);
    	panel.add(decToBin);
    	panel.add(decToHex);
    	binToHex.setText("binToHex");
    	frame.pack();
    	binToHex.addActionListener(this);
    	binToDec.addActionListener(this);
    	hexToBin.addActionListener(this);
    	hexToDec.addActionListener(this);
    	decToBin.addActionListener(this);
    	decToHex.addActionListener(this);
    	
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == binToHex) {
    		binary.convertToHexadecimal();
    	}
    	else if (e.getSource() == binToDec) {
    		binary.convertToDecimal();
    	}
    	else if (e.getSource() == hexToBin) {
    		hexadecimal.convertToBinary();
    	}
    	else if (e.getSource() == hexToDec) {
        	hexadecimal.convertToDecimal();
    	}
    	else if (e.getSource() == decToBin) {
    		decimal.convertToBinary();
    	}
    	else if (e.getSource() == decToHex) {
    		decimal.convertToHexadecimal();
    	}
    
    }
    
}
