import java.util.Scanner;
public class BinToDec{
	public static void main(String args[]){
	
	Scanner myscanner=new Scanner(System.in);
	System.out.println("Please enter the binary number:");
	
	String str=myscanner.next();
	int length=str.length();
	String[] arr=new String[length];
	
	for(int i=0;i<arr.length;i++){
		arr[i]=str.substring(i,i+1);
		
	}
	int dec_point=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i].equals(".")){
			dec_point=i;
		}
		
	}
	int sum1=0;
	for(int i=0;i<dec_point;i++){
		
		int x=Integer.parseInt(str.substring(i,i+1));
		
		int power=1;
		for(int j=0;j<dec_point-i-1;j++){
			power*=2;
			
		}
		
		sum1=sum1+(x*power);
		
		
	}
	//System.out.println(sum1);
	
	double sum2=0.0;
	
	for(int i=0;i<arr.length-dec_point-1;i++){
		
		double x1=(double)Integer.parseInt(str.substring(dec_point+i+1,dec_point+i+2));
			double power1=1.0;
		for(int j=0;j<i+1;j++){
			power1*=0.5;
			
		}
		
		sum2=sum2+(x1*power1);
		
		
		
		
	}
	
	//System.out.println(sum2);
	System.out.println("The corresponding decimal value is:");
	System.out.println((double)sum1+sum2);
	
	
	
	
	}
}