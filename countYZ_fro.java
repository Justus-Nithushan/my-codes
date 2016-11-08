public class countYZ_fro{
	public static void main(String args[]){
	
	String str="yellow zebra";
	String alpha="YyZz";
	int count=0;
	for(int i=0;i<str.length();i++){
		
		if(str.substring(i,i+1).equals(" ")){
			
			if(alpha.indexOf(str.charAt(i+1))>=0){
				count++;
			}
			
		}
		
		
	}

	if(alpha.indexOf(str.charAt(0))>=0){
		count++;
	}
	
System.out.println(count);


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
