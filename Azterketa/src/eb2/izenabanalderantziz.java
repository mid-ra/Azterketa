package eb2;

import java.util.Scanner;

public class izenabanalderantziz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua= new Scanner(System.in);
		String izena; 
		char izenatxt[];
		int zenba = 0;
		izenatxt = new char [50];
		System.out.println("sartu izen bat");
		izena = teklatua.nextLine();
		
		for (int i = 0; i < izena.length(); i++){
		   izenatxt[i] = izena.charAt(i);
			}
		int kont = izena.length();
		while (kont!=-1) {
			System.out.println(izenatxt[kont]);
			kont--;
		}

	}

}
