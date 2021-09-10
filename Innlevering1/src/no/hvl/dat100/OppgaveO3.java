package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO3 {
	
	public static void main(String[] args) {
		
		long i, fact = 1;
		
		long n = parseInt(showInputDialog("Tast inn et tall"));
		for(i=1;i<=n;i++){    
		      fact=fact*i; 
		}
		
		showMessageDialog(null, fact);
				
	}
}
