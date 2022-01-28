import java.util.regex.Pattern;
public class Validationemail {

	public static void main(String[] args) {
	 	String email1 = "athi123@gmail.com";
	 	String email2 = "infoinfy.com";
	 	String email3 = "pathi01@gmail.com";
	 	String email4 = "arun.bob.com";

	    
	    
	    System.out.println("email1 = "+ Validateemail(email1));
	    System.out.println("email2 = "+ Validateemail(email2));
	    System.out.println("email3 = "+ Validateemail(email3));
	    System.out.println("email4 = "+ Validateemail(email4));
	    
	    
	}
	public static String Validateemail(String email){
	    if(email == null || email.isEmpty())
	    {
	        return "Invalid";
	    }
	    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
	                            "[a-zA-Z0-9_+&*-]+)*@" +
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
	                            "A-Z]{2,7}$";
	    
	    
	    Pattern Pattern = java.util.regex.Pattern.compile(emailRegex);
	    if(Pattern.matcher(email).matches())
	    {
	        return "Valid";
	    }
	    else{
	        return "Invalid";
	    }  

	}

}
