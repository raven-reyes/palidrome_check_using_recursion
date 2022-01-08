
public class Palidrome_Check_Using_Recursion {
   public static boolean isPalidrome(String s, int start, int end) {
	   // if the string has only one character return true since one character reads the same forward and backward
	   if(start == end) {
		   return true;
	   }
	   
	   // if the string is empty , then return true since an empty string is also palidrome
	   if(s == "") { 
		   return true;
	   }
	   // if the first character does not  match the last character , return false
	   if(s.charAt(start) != s.charAt(end)){
		   return false;
	   }
	   // else , return a recursive call on the remaining characters
	   return isPalidrome(s, start+1, end -1);
   }
   // driver code
	public static void main(String[] args) {
		String s = "";
		 if(isPalidrome(s, 0, s.length()-1)) {
			 System.out.println(s + " is a palindrome");
		 }else {
		      System.out.println(s + " is not a palindrome");
		    }

	}

}
