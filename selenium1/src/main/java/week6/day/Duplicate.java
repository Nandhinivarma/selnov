package week6.day;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter size");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("enter values");
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		int temp;
		/*for(int i=1;i<a.length;i++)
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
		}*/
		Set<Integer> d = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j = i+1; j<a.length; j++) {
				if (a[i]==a[j]) {
					d.add(a[i]);
				}
			}
		}
//			if(a[i]==a[i-1])
			System.out.println("duplicate " +  d);
		}
		
		
			
	}


