import java.util.Scanner;
import java.util.Arrays;
class task5{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the kth element:");
		int k=in.nextInt();
	
		if(k>0 && k<=n){
			System.out.println("The " + k + "th smallest element is: " + arr[k-1]);
		}
		else{
			System.out.println("Invalid kth value ");
		}
	}
}
