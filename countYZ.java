import java.util.Scanner;
public class countYZ{
	public static void main(String args[]){

	Scanner myscanner=new Scanner(System.in);
	System.out.println("please enter a string");
	String str=myscanner.next();
	String alpha="YyZz";
	int count=0;
	for(int i=0;i<str.length();i++){
		
		if(str.substring(i,i+1).equals(" ")){
			
			if(alpha.indexOf(str.charAt(i-1))>=0){
				count++;
			}
			
		}
		
		
	}

	if(alpha.indexOf(str.charAt(str.length()-1))>=0){
		count++;
	}
	
System.out.println(count);



	}

}