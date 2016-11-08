public class beg_end{
	public static void main(String args[]){

	String str="abcxyzcba" ;
	int count=0;boolean bool=false;
	for(int i=0;i<str.length();i++){
		
		for(int j=str.length()-1;j>=0;j--){
			
			
			if(!str.substring(i,i+1).equals(str.substring(j,j+1))){
				count=i;
				
			}
		}
		
		
		
	}

	System.out.print(count);













	}
}