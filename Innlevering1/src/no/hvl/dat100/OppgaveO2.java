package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO2 {
	
public static void main(String[] args) {
		
		int karakter = parseInt(showInputDialog("Skriv inn poeng"));
		
		if (karakter <= -1)
			showMessageDialog(null, "Ugyldig poeng");
		else if (karakter <= 39)
			showMessageDialog(null, "Karakter F");
		else if (karakter <= 49)
			showMessageDialog(null, "Karakter E");
		else if (karakter <= 59)
			showMessageDialog(null, "Karakter D");
		else if (karakter <= 79)
			showMessageDialog(null, "Karakter C");
		else if (karakter <= 89)
			showMessageDialog(null, "Karakter B");
		else if (karakter <= 100)
			showMessageDialog(null, "Karakter A");
		else if (karakter >= 101)
			showMessageDialog(null, "Ugyldig poeng");

}
}
