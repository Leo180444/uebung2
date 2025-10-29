package p3;

public class P3_main {
	public static void main(String[] args){
		  System.out.println("Hello World!");
		  int i = 1;
				  int j = 2;
				  int k = 3;
				  
				  for (i = 1; i < j; i++) {
					  System.out.println("A");
					  for (i = 1; i < k; i++) {
						  System.out.println("B");
						  for (j = 2; j < k; j++) {
							  System.out.println("C");  
						  }
					  }
				  }

	}
}
