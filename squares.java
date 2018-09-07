	/* import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=0;
		int temp=n1;
		do
		{
			int x=temp%10;
			n2+=(x*x);
			temp=temp/10;
		}
		            while(temp>0);
			System.out.print( n1+" "+n2);
			
		
	

	}
}
