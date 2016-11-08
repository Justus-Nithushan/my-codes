public class Fibanacci{
	public static void main(String args[]){
	
	int t1=1;
	int t2=1;
	
	int n=10;
	System.out.println(t1);
		System.out.println(t2);
	for(int i=0;i<n;i++){
		
		int t=0;
		
		t=t1+t2;
		t1=t2;
		t2=t;
		
		System.out.println(t);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}