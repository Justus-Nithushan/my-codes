import java.util.Scanner;
public class Double_Array{
	public static void main(String args[]){
	
	Scanner myscanner=new Scanner(System.in);
		int[][] array=new int[2][2];
	
		for(int i=0;i<array.length;i++){
					
			
			array[i][0]=Integer.parseInt(myscanner.next());
			array[i][1]=Integer.parseInt(myscanner.next());
			
				
	
			}
	
	
	for(int i=0;i<array.length;i++){
		for(int j=0;j<array.length;j++){
		
		System.out.println(array[i][j]);
		
		
		}
	
	}
	
	
	
	
	
	
	
	
	}
}