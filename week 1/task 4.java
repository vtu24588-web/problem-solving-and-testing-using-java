import java.util.Scanner;
class task4{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(max + "is the greatest element");
	}
}
			
						
