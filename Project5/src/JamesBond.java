
public class JamesBond {
	public Boolean bondRegex(String input) {
		String pattern = ".*\\(.*007.*\\).*";
		if(input.matches(pattern)) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
}
