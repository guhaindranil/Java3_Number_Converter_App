/*
 * Prompt User to input Decimal Integer for conversion in the pop up window
 * Convert Decimal to Binary and Hexadecimal number
 * 
 */
package arg.guhai.app;

import javax.swing.*;

public class Decimal { 
private int decimal;
	
	      
/*
 * Prompt user to input Decimal number and create object from input
 */
	public Decimal() {
		this.decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Decimal value"));
		
	}
	
	/*
	 * Convert Decimal to Binary	
	 */
	
	public void convertToBinary() {
		String bstr = "";
		int binary[] = new int[32];
		
	    int index = 0;
	    int quotient = decimal;
	     while(quotient > 0){
	       binary[index++] = quotient%2;
	       quotient = quotient/2;
	     }
	     
	     for(int i = index-1; i >= 0; i--){
	    	 bstr = bstr + Integer.toString(binary[i]); 
	    	 
	     }
		
	     JOptionPane.showMessageDialog( null, bstr);
		
		
	
	}

	/*
	 * Convert Decimal to Hexadecimal	
	 */
    public void convertToHexadecimal() {
    	
		String hstr = "";
		char hexadecimal[] = new char[32];
		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
                'b', 'c', 'd', 'e', 'f' };
	    int index = 0;
	    int quotient = decimal;
	     while(quotient > 0){
	       hexadecimal[index++] = hex[quotient%16];
	       quotient = quotient/16;
	     }
	    
	     for(int i = index-1; i >= 0; i--){
	    	 hstr = hstr + hexadecimal[i]; 
	    	 
	     }
		
		JOptionPane.showMessageDialog( null, hstr);
    }
      	
    

}
