/*
 Ett enkelt Hello World i java
 Skapat 2019-09-13
 Programmerare Magnus Silverdal
*/
import javax.swing.*;
import java.util.Scanner;

public class uppgift21 { 
	public static void main(String[] args) {
		// varibeldeklaration
		String namn;
		String telefonnummber;
		String adress;
		// tilldelning
	
		
		// dialogruta
		namn = JOptionPane.showInputDialog(null,"ditt namn?");
		telefonnummber = JOptionPane.showInputDialog(null,"telefonnummber?");
		adress = JOptionPane.showInputDialog(null,"adress?");
		
		JOptionPane.showMessageDialog(null, "namn"+\n "telefonnummber"+\n "adress");
		
		/* I terminalen
		System.out.println("Skriv ett meddelande");
		Scanner tgb = new Scanner(System.in);
		namn = tgb.nextLine();
		System.out.println(namn);	
		*/
	}
}
