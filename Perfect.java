/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int c = 0;
        String x = "";
			for(int i = 1;i < n; i++){
				if(n%i==0){
				c = i + c;
				x = x + " + " + i;
				}if(i==1){
				 x = "1";
				}
			}		
					if(n==c){
						System.out.print(n + " is a prfect number since " + n + " = " + x);

					}else{
						System.out.print(n + " is not a prfect number.");

					}
	}
}
