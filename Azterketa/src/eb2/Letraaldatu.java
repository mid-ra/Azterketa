package eb2;

import java.util.Scanner;

public class Letraaldatu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua= new Scanner(System.in);
		String izena; 
		String izenfinala = " ";
		char izenatxt[];
		int posizio;
		System.out.println("sartu izen bat");
		izena = teklatua.nextLine();
		izenatxt = new char [izena.length()];
		for (int i = 0; i < izena.length(); i++){
			   izenatxt[i] = izena.charAt(i);
				}
		System.out.println("sartu posisio bat");
		posizio = teklatua.nextInt();
		System.out.println("sartu letra berri bat");
		izenatxt[posizio] = teklatua.next().charAt(0);
		for (int kont = 0;kont < izena.length();kont++) {
			izenfinala = izenfinala + izenatxt[kont];
		}
		System.out.println("Emaitza:"+izenfinala);

	}

}
