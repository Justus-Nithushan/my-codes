public class GCD{
	public static void main(String args[]){


		int a=4403;
		int b=1003;
		
		
		if(a<b){
			int temp=0;
			temp=a;
			a=b;
			b=temp;
		}
		
		int r=a%b;
		int i=0;
		while(r!=0){
			
			a=b;
			b=r;
			r=a%b;
			
			
		i++;
		}

	
	System.out.print(b);
	
	


	}
}