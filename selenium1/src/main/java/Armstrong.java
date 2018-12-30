
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,temp=0;
		
		for(int i=100;i<=1000;i++)
		{
			a=i;
			while(a!=0)
			{
			
			b=a%10;
			a=a/10;
			temp=temp+(b*b*b);
		}
		
		if(temp==i)
		{System.out.println(i );
		
	}
	
  temp=0;
		}
}
}