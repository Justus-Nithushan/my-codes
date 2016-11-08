public class Dec2Bin{
	public static void main(String args[]){

	int num=10;
	int i=0;
	int r=0;
	String x="";
	while(num!=0){
		
		
		r=num%2;
		num=num/2;
		x+=r;
	
		i++;
	}
	

	//System.out.print(x);

	for(int j=x.length()-1;j>=0;j--){
		
		System.out.print(x.charAt(j));
		
	}












	}
}