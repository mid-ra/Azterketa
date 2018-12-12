package eb2;

import java.util.Scanner;

public class Izenaban {
	public static void main(String[] args) {
		Scanner teklatua= new Scanner(System.in);
		String izena; 
		char izenatxt[];
		izenatxt = new char [300];
		System.out.println("sartu izen bat");
		izena = teklatua.nextLine();
	
		for (int i = 0; i < izena.length(); i++){
			izenatxt[i] = izena.charAt(i);
			}
		for (int kont = 0;kont < izena.length();kont++) {
			System.out.println(izenatxt[kont]);
			}
	}
}