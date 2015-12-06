import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			map.clear();
		
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				String carac = sc.next();
				String str = sc.next();

				map.put(carac, str);
			}
			
			String slinha = "";
			for (int j = 0; j < s.length()-1; j++) {
				if(s.charAt(j) == '*' && map.containsKey(Character.toString(s.charAt(j+1)))){
					slinha += map.get(Character.toString(s.charAt(j+1)));
					j++;
				}else{
					slinha += s.charAt(j);
				}
			}

			if(s.charAt(s.length()-2)!='*'){
				slinha += s.charAt(s.length()-1);
			}else if(s.charAt(s.length()-1)=='*'){
				slinha += s.charAt(s.length()-1);
			}else if(!map.containsKey(Character.toString(s.charAt(s.length()-1)))){
				slinha += s.charAt(s.length()-1);
			}
			
			System.out.println(slinha);
		}
		sc.close();
	}
	
}