package eb2;

import java.util.Scanner;

public class KARAKNAGUSIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua= new Scanner(System.in);
		String palabra;
		String mayomin;
		System.out.println("sartu frase bat");
		palabra = teklatua.next();
		System.out.println("sartu may mayukulak sartzeko eta min minuskulak ateratzeko");
		mayomin = teklatua.next();
		switch (mayomin) {
		case "may":
			System.out.println(palabra.toUpperCase());
			break;
		case "min":
			System.out.println(palabra.toLowerCase());
			break;
		default:
			System.out.println("Agur ez didazu sartu ezer");
		

		}
	}
}
