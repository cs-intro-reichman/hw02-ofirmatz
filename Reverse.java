/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
    String s = args[0];
    String sOut = "";
    int i = 0;
    int x = 1;
        while(i<s.length()){
        	char c = s.charAt(s.length()-x);
        	sOut = sOut+c;
        	i = i + 1;
        	x++;
        }
    System.out.println(sOut); 
    System.out.print("the middle character is " + sOut.charAt(sOut.length()/2)); 
	}
}
