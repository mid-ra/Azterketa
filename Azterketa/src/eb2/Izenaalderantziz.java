package eb2;

import java.util.Scanner;

public class Izenaalderantziz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua= new Scanner(System.in);
		String izena; 
		String izenfinala = " ";
		char izenatxt[];
		izenatxt = new char [50];
		System.out.println("sartu izen bat");
		izena = teklatua.nextLine();
		for (int i = 0; i < izena.length(); i++){
			   izenatxt[i] = izena.charAt(i);
				}
		for (int kont = izena.length();kont!=-1;kont--) {
			izenfinala = izenfinala + izenatxt[kont];
		}
		System.out.println("Alderantziz:"+izenfinala);
	}
}
