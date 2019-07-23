/*
 * Prompt User to input Hexadecimal value for conversion in the pop up window
 * Convert Hexadecimal to Binary and decimal number
 * 
 */
package arg.guhai.app;

import javax.swing.*;

public class Hexadecimal {
private String hexadecimal;  
	
	      
/*
 * Prompt user to input Hexadecimal and create object from input
 */
	public Hexadecimal() {
		this.hexadecimal = JOptionPane.showInputDialog(null, "Enter Hex Decimal Value");
		
	}
	/*
	 * Convert HexaDecimal to Binary	
	 */
	public void convertToBinary() {
		String digits = "0123456789abcdef";
		int j = 0;
    	for (int i = 0; i <hexadecimal.length(); i++) {
	            char c = hexadecimal.charAt(i);
	            int d = digits.indexOf(c);
	            j = 16*j + d;
			
		}
    	
    	String bstr = "";
		int binary[] = new int[32];
		
	    int index = 0;
	    int quotient = j;
	     while(quotient > 0){
	       binary[index++] = quotient%2;
	       quotient = quotient/2;
	     }
	     
	     for(int k = index-1; k >= 0; k--){
	    	 bstr = bstr + Integer.toString(binary[k]); 
	    	 
	     }
		
		JOptionPane.showMessageDialog( null, bstr );
	
	}

	/*
	 * Convert HexaDecimal to Decimal	
	 */
	
    public void convertToDecimal() {
    	String digits = "0123456789abcdef";
		int j = 0;
    	for (int i = 0; i <hexadecimal.length(); i++) {
	            char c = hexadecimal.charAt(i);
	            int d = digits.indexOf(c);
	            j = 16*j + d;
			
		}
		
		JOptionPane.showMessageDialog( null, j );
	
    }
      	
    

}
