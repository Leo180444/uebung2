package h3;

public class H3_main {
	public static void main(String[] args){
		int i = 140;
		int j = 150;
		int k = -10;
		
		boolean a1 = i>j;
		boolean a2 = i>200;
		boolean a3 = j>100;
		
			if (a1 && !a2 && !a3) {
			k=1; 
			System.out.println(k);
			
			
		}
			
			if (a1 && a2 && !a3) {
				k=2;
				System.out.println(k);
			}
			
			if (a1 && a2 && a3) {
				k=3;
				System.out.println(k);
			}
			
			if (!a1 && !a2 && !a3) {
				k=4;
				System.out.println(k);
			}
			
			System.out.println(k);
			
}}
