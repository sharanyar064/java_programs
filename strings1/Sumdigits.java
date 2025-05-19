package others;
public class Sumdigits {
	public static int sums(int n)
	{
		int sum=0,r;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String []args)
	{
		System.out.println(sums(1235));
	}
}
