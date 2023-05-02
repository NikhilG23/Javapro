import java.util.*;
class FindLS
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		f1(arr,5,5,n);
	}
	public static void f1(int arr[], int l,int s, int n)
	{
			l=1;s=arr[0];
			Scanner sc=new Scanner(System.in);
			for (int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			for (int i=0;i<arr.length;i++)
			{
				if (arr[i]>l)
				{
					l=arr[i];
				}
				else if (arr[i]<arr[0])
				{
						s=arr[i];	
				}
			}
		System.out.println("Largest:-"+l);
		System.out.println("Smallest:-" +s);
	}
}