package eb2;

import java.util.Scanner;

public class BIDERMAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrai1[][]= new int[4] [3];
		 int arrai2[][]= new int[3] [3];
		 int arraitotala[][]= new int[4] [3];
		 int znbk;
		 int kont ;
		 int kont2;
		 int lerro;
		 int zutabe;
		 Scanner teklatua = new Scanner(System.in);
		 
		 for(int i=0; i<4; i++) {
				kont=0;
				do {
					System.out.printf("Sartu zenbaki bat %d eta %d posizioan: \n", i+1, kont+1);
					znbk = teklatua.nextInt();
					arrai1[i][kont] = znbk;
					kont++;
				}while(kont<3);
		 }
		 for(int i=0; i<3; i++) {
				kont=0;
				do {
					System.out.printf("Sartu zenbaki bat %d eta %d posizioan: \n", i+1, kont+1);
					znbk = teklatua.nextInt();
					arrai2[i][kont] = znbk;
					kont++;
				}while(kont<3);
		 }
		


		 for(int k=0; k<4; k++) {
			 System.out.println(""); 
			 kont2=0;
			 do { 
			System.out.printf("%d    ", arrai1[k][kont2]); 
			 kont2++;
			 
			 }while(kont2<3);
			 }
		 for(int k=0; k<3; k++) {
			 System.out.println(""); 
			 kont2=0;
			 do { 
			System.out.printf("%d    ", arrai2[k][kont2]); 
			 kont2++;
			 
			 }while(kont2<3);
			 }

	}

}
