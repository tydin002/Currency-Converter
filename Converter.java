import javax.swing.*;

public class Converter {
	
	
	public boolean checkValue(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >=0 || x < 0);
				return true;
			
			
		}catch(NumberFormatException e){
			return false;
		}
		

	}//end of checkValue()
	
	
	public void dollarToNok(double input) {
		double nok = input*0.2; 
		JOptionPane.showMessageDialog(null, "Nok: " + nok + " Krone");
				
	}
	
	public void dollarToJPY(double input) {
		double JPY = input * 112;
		JOptionPane.showMessageDialog(null, "JPY: " + JPY + " Yen");
	}
	
	public void dollarToEuro(double input) {
		double EUR = input * 0.93; 
		JOptionPane.showMessageDialog(null, "EUR: " + EUR + " Euro");
		
	}
	
	
	
		
	
		
	
}
