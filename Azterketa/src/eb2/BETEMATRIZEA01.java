package eb2;

import java.util.Scanner;

public class BETEMATRIZEA01 {

	public static void main(String[] args) {
		
		Scanner teklatua= new Scanner (System.in);
		int znbk;
		int fila=0;
		int columna=0;
		int n=0;
		int fila2;
		int columna2;
		System.out.println("Zenbat fila?");
		fila2=teklatua.nextInt();
		System.out.println("Zenbat zutabe?");
		columna2=teklatua.nextInt();
		int[][]matriz;
		matriz=new int [fila2][columna2];
		//deklarazioak egin ondoren, kodea egiten hasten gara
		for(fila=0;fila<matriz.length;fila++) {
			for(columna=0;columna<matriz[fila].length;columna++) {
				System.out.println("matriz["+fila+"]["+columna+"]= ");
				n=teklatua.nextInt();
				matriz[fila][columna]=n;
			
			}
		}
		for (fila=0;fila<matriz.length;fila++) {
			for(columna=0;columna<matriz[fila].length;columna++) {
				System.out.println(matriz[fila][columna]+" ");
				}
			System.out.println();
		}
				
	}
}


