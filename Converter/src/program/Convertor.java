package program;

import java.util.Scanner;

public final class Convertor {
	
	Convertor(){
		menu();
	}
	
Scanner reader = new Scanner(System.in);	
	
	public void menu() {
		String s;
		System.out.println("DECIMAL - BINARY");
		System.out.print("Número: ");
		int n1 = reader.nextInt();
		do {
		System.out.print("Visualizar Conta? ");
		
		s = reader.next();
		} while( !(s.equalsIgnoreCase("true")|s.equalsIgnoreCase("false")) );
		boolean v = Boolean.parseBoolean(s);
		System.out.println("\n" + div(n1,v));
		
	}
	public String div(int n1, boolean v) {
	
		int tot;
		String b = "";
		
		do {
			tot = (int) n1/2;
			int rest = n1 % 2;
			b += rest;
			
			if(v == true) {
				System.out.println("\n" + n1 + "/2 = " + tot
					+ "\nR: ( " + rest + " )");
			}
			
			
			n1 = tot;
		} while(n1 != 0);
		
		return inverse(b);
	}
	
	
	
	public String inverse(String s) {
		
		String b = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			b += s.charAt(i);
		}
		
		return b;
	}
	
}
