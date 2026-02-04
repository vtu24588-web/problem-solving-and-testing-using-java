import java.util.Scanner;
class task3{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements in the sorted order:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int search=in.nextInt();

        int left=0;
        int right=n-1;
        boolean found=false;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==search){
                System.out.println("Element found at index: " + mid);
                found=true;
                break;
            }
            else if(arr[mid]>search){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        if(!found){
            System.out.println("Element not found in the array");
        }
    }
}
