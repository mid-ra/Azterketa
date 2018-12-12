package eb2;
import java.util.Scanner;
public class ZENBATZNBK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teklatua= new Scanner (System.in);
		int zenbakia;
		int array[];
		array=new int[5];
		array[0]=0;
		array[1]=0;
		array[2]=0;
		array[3]=0;
		array[4]=0;
		int minposizioa=0;
		int minbalioa=0;
		int maxposizioa=0;
		int maxbalioa=0;
		System.out.println("Sartu zenbaki bat");
		zenbakia=teklatua.nextInt();
		while(zenbakia!=0) {
			array[zenbakia-1]++;
			System.out.println("Sartu zenbaki bat");
			zenbakia=teklatua.nextInt();			
		}
		for (int i=0; i<5;i++) {
			System.out.println(i+1 + " : " + array[i]);
		}
		//A partir de aqui estamos calculando cual es el numero que menos veces hemos metido.
		minbalioa=array[0];
		minposizioa=1;
		for (int i=1; i<5; i++) {
			if(array[i]<minbalioa) {
				minbalioa=array[i];
				minposizioa=i+1;
			}
		}
		//Este comando es exactamente igual al anterior salvo que es para calcular el maximo.
		System.out.println("gutxien sartu duzun zenbakia "+minposizioa+" da. "+minbalioa+" aldiz sartu duzu");
		
		maxbalioa=array[0];
		maxposizioa=1;
		for(int i=1;i<5;i++) {
			if(array[i]>maxbalioa) {
				maxbalioa=array[i];
				maxposizioa=i+1;
			}
		}
		System.out.println("Gehien sartu duzun zenbakia "+maxposizioa+ " da. "+maxbalioa+" aldiz sartu duzu");
		teklatua.close();
			
	}

}
