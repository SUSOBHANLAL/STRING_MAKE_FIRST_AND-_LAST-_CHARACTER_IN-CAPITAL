
public class susobhan {
	public static void main(String args[]) {
		String s ="susobhan";
		int n = s.length();
		char last = s.charAt(n-1);
		  String finalLast = (String.valueOf(last)).toUpperCase();
	      System.out.println("Updated string: "+finalLast);
		
		char first = s.charAt(0);
		 String finalFirst = (String.valueOf(first)).toUpperCase();
		 
	      System.out.println("Updated string: "+finalFirst);
		 
		 String middle="";
	      for(int i=1; i<n-1; i++){
	         String str = String.valueOf(s.charAt(i));
	         middle=middle+str;
	      }
	      String result = finalFirst+middle+finalLast;
	      
	      System.out.println("Updated string: "+result);
	}

}
