import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T-- > 0){
		    String s=in.next();
		    int n=s.length();
		    String s1=s.substring(0,n/2);
		    String s2=s.substring((n+1)/2);
		    char[] arr1=s1.toCharArray();
		    char[] arr2=s2.toCharArray();
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    if(Arrays.equals(arr1,arr2)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		
	}
}
