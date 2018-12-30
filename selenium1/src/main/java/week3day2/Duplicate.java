package week3day2;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int size,temp;
		System.out.println("enter size");
		size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter values");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=1;i<a.length;i++)
		{
		  for(int j=i;j>0;j--)

		  {
			if(a[j]>a[j-1])
			{
			temp=a[j];
			a[j]=a[j-1];
			a[j-1]=temp;
			}
		}
		
		}
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				System.out.println("duplicate" + a[i]);
			}
		}

}

}