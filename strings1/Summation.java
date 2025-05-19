package others;

public class Summation {
	    public static int Summation(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum =sum + i;
	        }
	        return sum;
	    }
	    public static void main(String[] args) {	 
	        int result = Summation(6);
	        System.out.println("Factorial: " + result);
	    }
	}
