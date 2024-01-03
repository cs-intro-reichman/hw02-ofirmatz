/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = 1;
	    while(x>=y){
            if(x%y==0){
            	System.out.println(y);
            }
         y = y + 1;

	    }
    }
}
