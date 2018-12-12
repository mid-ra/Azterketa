package eb2;

import java.util.Scanner;

public class PASAHITZA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua=new Scanner (System.in);
		String[][] erabiltzaile_pasahitza;
		erabiltzaile_pasahitza=new String[10] [2];
		int itxi=3;
		boolean aurkitu=false;
		int kont=0;
		String erabiltzailea;
		String pasahitza;
		erabiltzaile_pasahitza[0][0]="Asier";
		erabiltzaile_pasahitza[1][0]="Kepa";
		erabiltzaile_pasahitza[2][0]="Benat";
		erabiltzaile_pasahitza[3][0]="David";
		erabiltzaile_pasahitza[4][0]="Lisette";
		erabiltzaile_pasahitza[5][0]="Irune";
		erabiltzaile_pasahitza[6][0]="Ander";
		erabiltzaile_pasahitza[7][0]="Lucia";
		erabiltzaile_pasahitza[8][0]="Jaime";
		erabiltzaile_pasahitza[9][0]="George";
		
		erabiltzaile_pasahitza[0][1]="Asier";
		erabiltzaile_pasahitza[1][1]="Kepa";
		erabiltzaile_pasahitza[2][1]="Benat";
		erabiltzaile_pasahitza[3][1]="David";
		erabiltzaile_pasahitza[4][1]="Lisette";
		erabiltzaile_pasahitza[5][1]="Irune";
		erabiltzaile_pasahitza[6][1]="Ander";
		erabiltzaile_pasahitza[7][1]="Lucia";
		erabiltzaile_pasahitza[8][1]="Jaime";
		erabiltzaile_pasahitza[9][1]="George";
		do {
			kont=0;
			System.out.println("sartu erabiltzailea");
			erabiltzailea=teklatua.nextLine();
			System.out.println("sartu pasahitza");
			pasahitza=teklatua.nextLine();
			while(kont<10 && !aurkitu) {
				if(erabiltzaile_pasahitza[kont] [0].equals(erabiltzailea) && erabiltzaile_pasahitza[kont][1].equals(pasahitza)) {
					aurkitu=true;
				}
				kont++;
			}
			if(aurkitu==true) {
				System.out.println("Ongi etorri "+erabiltzailea);
			}
			else {
				System.out.println("Ez dago honelako akonturik saiatu berriro. "+itxi+" saiakera gelditzen zaizkizu");
			}
			
			
			itxi--;
		} while (itxi>=0 && aurkitu==false);
		teklatua.close();
	}
		

}