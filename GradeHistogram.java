import java.util.Scanner;
public class GradeHistogram{
	public static void main(String args[]){
	
	
		Scanner myscanner=new Scanner(System.in);
	
		System.out.println("Enter the total number of datas");		
		int total=myscanner.nextInt();
		int[] array=new int[10];
		int[] real=new int[10];
		int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		for(int i=0;i<total;i++){
			System.out.println("Data no."+(i+1)+": ");
			int data=myscanner.nextInt();
			if(data<10){
			c0++;			
			}
			else if(data<20){
				c1++;				
			}
			else if(data<30){
				c2++;				
			}else if(data<40){
				c3++;				
			}
			else if(data<50){
				c4++;				
			}
			else if(data<60){
				c5++;				
			}
			else if(data<70){
				c6++;				
			}
			else if(data<80){
				c7++;				
			}
			else if(data<90){
				c8++;				
			}
			else{
				c9++;
			}
			
			
		}
	
	
		array[0]=c0;
		real[0]=c0;
		array[1]=c1;
		real[1]=c1;
		array[2]=c2;
		real[2]=c2;
		array[3]=c3;
		real[3]=c3;
		array[4]=c4;
		real[4]=c4;
		array[5]=c5;
		real[5]=c5;
		array[6]=c6;
		real[6]=c6;
		array[7]=c7;
		real[7]=c7;
		array[8]=c8;
		real[8]=c8;
		array[9]=c9;
		real[9]=c9;
		
	
	
	int max=0;
	for(int i=0;i<array.length;i++){		
		for(int j=i+1;j<array.length;j++){
			
			if(array[i]>array[j]){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
			}
	
		}
	}	
	max=array[array.length-1];
	
	int[] space_arr=new int[array.length];
	
	
	for(int i=0;i<space_arr.length;i++){
		
		space_arr[i]=max-(real[i]);
		
		
	}
	
	
	
	 int max1=max;
	for(int i=0;i<max1;i++){
		for(int j=0;j<array.length;j++){
			
			
			if(space_arr[j]>0){
				System.out.print("  \t");
				
			}
			else{
				System.out.print("  *\t");
			}
				space_arr[j]-=1;
		}
	
		System.out.println();
		
	}
	
	 for(int i=0;i<10;i++){
		 
		System.out.print(i+""+0+"-"+i+""+9);
		 System.out.print("\t");
		 
	 }
	
	
	
	
	}
}