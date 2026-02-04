import java.util.Scanner;
class task2{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter ther size of the array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
