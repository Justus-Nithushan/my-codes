public class gHappy{
	public static void main(String args[]){

	String str="abcdggxxgggyy";
	int length=str.length();
	boolean bool=false;
	for(int i=0;i<length;i++){
		
		if(str.substring(i,i+1).equals("g")){
			if(str.substring(i+1,i+2).equals("g")){
				bool=true;
			}
			else if(str.substring(i-1,i).equals("g")){
				bool=true;
			}
			else{
				bool=false;
			}
		}
		

	}
	System.out.println(bool);




	}

}