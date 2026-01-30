import java.util.Scanner;
import java.util.Arrays;
class task6{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
				System.out.println("(" + arr[i] + "," + arr[j] + ")");
			}
		}
	}
}
