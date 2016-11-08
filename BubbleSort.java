public class BubbleSort{
	public static void main(String args[]){
		
		int[] arr={1,4,3,75,24,37,43};
		int temp=0;boolean sorted=false;
		for(int i=0;i<arr.length-i;i++){
			for(int j=0;j<arr.length-1;j++){
				
				if(arr[j]>arr[j+1]){
				
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
				sorted=true
			}
			
			
		}
		
		}
		
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
	}
}