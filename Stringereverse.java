package arraystringreverse;

public class Stringereverse {

	public static void main(String[] args) {

		String str = "WOW";

		        char[] characters = str.toCharArray();
		
		        char[] reverseChars = new char[characters.length];
		
		        for( int i = 0 ; i < characters.length  ; i++){
		
		            reverseChars[i] = characters[(characters.length-1)-i]; 
		
		        }
		
		        String reverse = new String(reverseChars);
		
		        System.out.println("Normal String Array  is : " + str + " \nReverse String Array is : "+reverse);
	
		        for( int i = 0 ; i < characters.length/2  ; i++){
	
		            char t = characters[i];
		
		            characters[i] = characters[(characters.length-1)-i];
		
		            characters[(characters.length-1)-i] = t;
		
		        }
		
		    }


	}


