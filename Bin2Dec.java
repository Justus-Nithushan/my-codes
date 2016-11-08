import java.util.Scanner;
public class Bin2Dec{
	public static void main(String args[]){

	Scanner myscanner=new Scanner(System.in);
	
	System.out.println("please enter your binary number");
	String in=myscanner.next();
	int sum=0;
	
	for(int i=0;i<in.length();i++){
		
		String str=in.substring(i,i+1);
		int ex=Integer.parseInt(str);
		int power=1;
		for(int j=in.length()-1;j>i;j--){
			power=power*2;
			
		}
		
		sum=sum+(ex*power);

	}
	System.out.println(sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	







	}

}