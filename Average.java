import java.util.*;
public class Average
{
	public static void main(String args[])
	{
		int n;
		double res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbersto find average:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			try
			{
				if(a[i]<0)
				{
					throw new Exception("negative number not allowed \nEnter positive number??");
				}
				else
				{
					res+=a[i];
				}
			}
			catch(Exception N)
			{	
				N.printStackTrace();
				Scanner sc1=new Scanner(System.in);
				res=sc1.nextInt();
				res+=a[i];
			}
		}
		double avg=res/n;
		System.out.println("Average is:"+avg);
	}
}
