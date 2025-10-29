package h2;

public class H2_main {
	public static void main(String[] args){
		int i = -10;
		int j = 10;
		int k = 5;
		int min = Math.min(i, Math.min(j, k));
		int max = Math.max(i, Math.max(j,k)); 
		
		System.out.println("Das Minimum beträgt: " +min);
		System.out.println("Das Maximum beträgt: " +max);
}}
