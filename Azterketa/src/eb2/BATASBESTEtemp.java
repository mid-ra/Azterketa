package eb2;

import java.util.Scanner;

public class BATASBESTEtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua= new Scanner (System.in);
		int tenperatura;
		double array[];
		array= new double[10];
		double batasbeste=0;
		double zenbakia;
		double maxtenp;
		double maxloc;
		double mintenp;
		double minloc;
		double suma=0;
		int kont=0;
		double konparazioa=0;
		//Deklarazioak egin ondoren programatzen hasiko gara
		
		while(kont<10 ) {//Zenbakia eskatu->zenbakia jaso->arraian gorde hau da while honetan egindako prozesua
			System.out.println("Sartu  tenperatura bat");
			array[kont]=teklatua.nextDouble();
			kont++;
		}
		//komando honetan tenperatura minimoa kalkulatzen da
		mintenp=array[0];
		minloc=1;
		for(int i=0; i<10; i++) {
			if(array[i]<mintenp) {
				mintenp=array[i];
				minloc=i+1;
			}
			
		}
		/*System.out.println("tenperatuera baxuena "+mintenp+"ºkoa da");
		//Hemen tenperatura altuena kalkulatu dugu
		maxtenp=array[0];
		maxloc=1;
		for(int i=0; i<10;i++) {
			if(array[i]>maxtenp) {
				maxtenp=array[i];
				maxloc=i+1;
			}
		}
		System.out.println("tenperatura altuena "+maxtenp+"ºkoa da");*/
		//Hemen tenperaturen batasbestekoa kalkulatu dugu
		kont=0;
		while(kont<=9) {
			suma=suma+array[kont];
			kont++;
			
		}
		batasbeste=suma/10;	
		System.out.println("tenperaturen batasbestekoa "+batasbeste+"ºkoa da");
		konparazioa=batasbeste+10;
		kont=0;
		while(kont<10) {
			if(array[kont]>batasbeste) {
				System.out.println("tenperatura hau batasbestekoa baino handiagoa da "+array[kont]);
			}
			else if(array[kont]<batasbeste) {
				System.out.println("tenperatura hau batasbestekoa baino txikiagoa da "+array[kont]);
			}
			else {
				System.out.println("Tenmperatura hau batasbestekoaren berdina da "+array[kont]);
			}
			kont++;
		}
		kont=0;
		while(kont<10) {
			if(array[kont]>batasbeste+10) {
				System.out.println("Tenperatura hauek hamar graduko diferentzia daukate batazbestekoarekiko "+array[kont]);
			}
			else if(array[kont]<batasbeste-10) {
				System.out.println("Tenperatura hauek hamar graduko diferentzia daukate batazbestekoarekiko "+array[kont]);
			}
		}
		kont=0;
		while(kont<10) {
			if(array[kont]>batasbeste+10) {
				
			}
		}
	}

}
