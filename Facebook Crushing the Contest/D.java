import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String horario = sc.next();
			int minutos = sc.nextInt();
			
			String[] x = horario.split(":");
			
			int minutosRestantes = minutos%60;
			int horasMais = minutos/60;
			
			int hora = Integer.parseInt(x[0]);
			int min = Integer.parseInt(x[1]);
			
			
			int minutosMais=0, minutosMenos=0;
			
			minutosMais = (min + minutosRestantes);
			int newHoraMais = hora + horasMais;
			if(minutosMais>=60){
				newHoraMais++;
				minutosMais = minutosMais%60;
			}
			newHoraMais = newHoraMais%24;
			
			int newHoraMenos = hora - horasMais;
			minutosMenos = min - minutosRestantes;
			if((min - minutosRestantes)<0){
				newHoraMenos--;
				minutosMenos = 60 + minutosMenos;
			}
			if (newHoraMenos < 0) {
				newHoraMenos = 24 + newHoraMenos;
			}			
			
			System.out.println(String.format("%02d", newHoraMenos)+":"+String.format("%02d", minutosMenos)+" "+String.format("%02d", newHoraMais)+":"+String.format("%02d", minutosMais));
		}
		sc.close();
	}

	
	public static int max(List<Integer> inputs){
        int energia = 480;

        int max = 0;

        Set<Integer> sums = new HashSet<>();
        sums.add(max);

        for (Integer input : inputs) {
            Set<Integer> newSums = new HashSet<>();
            
            for (Integer sum : sums) {
                int newSum = sum + input;
                if (newSum <= energia) {
                    newSums.add(newSum);
                    if (newSum > max) {
                        max = newSum;
                    }
                }
            }
            sums.addAll(newSums);
        }
		return max;
	}

}