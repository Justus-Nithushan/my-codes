public class Armstrong{
	public static void main(String args[]){
	
	
		
		
		String[] arr=new String[3];
	for(int j=100;j<1000;j++){
		
		String str=j+"";
		
		for(int i=0;i<arr.length;i++){
			
			arr[i]=str.substring(i,i+1);
		}
	
		int[] arr_cu=new int[3];
	
		for(int i=0;i<arr.length;i++){
			
			arr_cu[i]=Integer.parseInt(str.substring(i,i+1))*Integer.parseInt(str.substring(i,i+1))*Integer.parseInt(str.substring(i,i+1));
			//System.out.println(arr_cu[i]);
		}
	int real_nu=Integer.parseInt(str);
	int sum=0;
	for(int k=0;k<arr_cu.length;k++){
		
		sum+=arr_cu[k];
	}
	
	
	if(sum==real_nu){
		
		
		System.out.println(j);
		
		
	}
	
	
	}
	
	
	}


}