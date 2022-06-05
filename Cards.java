import java.nio.charset.StandardCharsets;
public class Cards{
	public static void main(String[] args){
		System.out.println("\uD83C\uDCA0");//Has to have two 4 digit hexadecimal values in 16 bit to print I think
		// Example of stuff I am working with:
		
		byte[] e = "🂠".getBytes(StandardCharsets.UTF_8); // Gets bytes from String and puts them into a byte array
		// Prints out bytes:
		for(byte s : e){
			System.out.println(s);
		}
		String newStr = new String(e, StandardCharsets.UTF_8); // Turns the bytes into a String
		System.out.println("--------------");
		System.out.println(newStr); // Prints out the String
		
		
		// I want to modify the last byte of the byte array to "go up" a character
		// Because the values a character datatype can hold just 
		//arent't high enough for me to do a simple for loop that 
		//starts at a certain number and ends at a certain number 
		//and converts that number into a character because the 
		//number would be too high for the character datatype
		
		// The concept in action:
		for(int i=0; i<63; i++){
			e[3]++;
			String card = new String(e, StandardCharsets.UTF_8);
			System.out.println(card);
		}
	}
}
