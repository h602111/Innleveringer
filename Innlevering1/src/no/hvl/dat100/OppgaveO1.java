package no.hvl.dat100;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO1 {
	
public static void main(String[] args) {
		
		double brutto = Double.parseDouble(showInputDialog("Skriv Inn Bruttol�nn"));
		
		if (brutto <= 184800)
			showMessageDialog(null, "Ingen trinnskatt");
		else if (brutto <= 260100)
			showMessageDialog(null, "1.7% i trinnskatt som blir "+(brutto*0.017)+" kr");
		else if (brutto <= 651250)
			showMessageDialog(null, "4.0% i trinnskatt som blir "+(brutto*0.04)+" kr");
		else if (brutto <= 1021550)
			showMessageDialog(null, "13.2% i trinnskatt som blir "+(brutto*0.132)+" kr");
		else if (brutto >= 1021550)
			showMessageDialog(null, "16.2% i trinnskatt som blir "+(brutto*0.162)+" kr");

}
}
