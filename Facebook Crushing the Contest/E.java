import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		for (long i = 0; i < t; i++) {
			long n = sc.nextLong();
			long array[] = new long[(int)n];
			for (long j = 0; j < n; j++) {
				array[(int)j] = sc.nextLong();
			}

			long indA = 0, indB = 0, tam = 0, diff = 0, indAMax = 0, indBMax=0, tamMax=0;
			if(array.length>1){
				diff = array[0] - array[1];
				indAMax = indA = 1;
				indBMax = indB = 2;
				tamMax = 1;
			
				for (long j = 1; j < array.length-1; j++) {
					long diffa = array[(int) j] - array[(int) (j+1)];

					if(diffa == diff){

						indB = j+2;
						System.out.println("incrementou tam");
						tam = tam + 1;
						
					}else{
						if(tamMax < tam){
							System.out.println("tam antigo"  + tamMax + "tam novo "+tam);
							tamMax = tam;
							indAMax = indA;
							indBMax = indB;
						}
						tam = 1;
						diff = diffa;
						indA = j+1;
						indB = j+2;
					}
				}
				System.out.println("tam antigo"  + tamMax + "tam novo "+tam);

				if(tamMax < tam-1){
					tamMax = tam;
					indAMax = indA;
					indBMax = indB;
				}
				System.out.println(indAMax+" "+indBMax);

			}else{
				System.out.println(1+" "+1);
			}
			
		}
		sc.close();
	}

}