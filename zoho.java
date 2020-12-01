import java.util.*;
public class zoho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=1;
for(int i=0;i<a;i++)
{
	for(int j=0;j<a;j++)
	{
		int k=a-1-i;
		if(j==k||j>k)
		{
			System.out.print(b);
			b++;
			System.out.print(" ");
		}
		else
		{
			System.out.print("  ");
		}
	}
	System.out.println();
}
	}

}
