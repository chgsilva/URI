import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int array[] = new int[n];
			List<Integer> l = new ArrayList<Integer>();

			for (int j = 0; j < n; j++) {
				array[j] = sc.nextInt();
				l.add(array[j]);
			}
			Arrays.sort(array);

			System.out.println(max(l));
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