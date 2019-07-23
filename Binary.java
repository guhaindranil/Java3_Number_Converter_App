/*
 * Prompt User to input Binary string for conversion in the pop up window
 * Convert Binary to Decimal and Hexadecimal number
 * 
 */
package arg.guhai.app;

import javax.swing.*;

public class Binary {
	private String binary;  
	
	      
	/*
	 * Prompt user to input Binary number and create object from input
	 */
	
	public Binary() {
		this.binary = JOptionPane.showInputDialog(null, "Enter Binary String");
		
	}
	/*
	 * Convert Binary to Hexadecimal	
	 */
    public void convertToHexadecimal() {
    	String hstr = "";
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
                'b', 'c', 'd', 'e', 'f' };
        	
        if (binary != null && !binary.isEmpty()) {
        	double j = 0;
    		for (int i = 0; i <binary.length(); i++) {
    			if(binary.charAt(i) == '1') {
    				j = j+ Math.pow(2,binary.length()-1-i);
    			}
    		}
    		int dec = (int) j;
            while (dec > 0) {
                hstr = hex[dec % 16] + hstr;
                dec /= 16;
            }
            
        }
        JOptionPane.showMessageDialog( null, hstr );
    }
    /*
     * Convert Binary to Decimal
     */
    public void convertToDecimal() {
		double j = 0;
		for (int i = 0; i <binary.length(); i++) {
			if(binary.charAt(i) == '1') {
				j = j+ Math.pow(2,binary.length()-1-i);
			}
		}
		
		JOptionPane.showMessageDialog( null, (int) j );
	
	}
      	
    
}
