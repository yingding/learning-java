package ittec.learning.java.testing;
/**
 * 
 * @author Yingding Wang
 *
 */
public class ParamTest {
	private final String[] ARGS;
	public ParamTest(String[] args) {
		this.ARGS = args;
		paramTest01(this.ARGS);
	}
	
	/*
	 * Running the paramTest01 you will get
	 * Listing: 1;2;3;
	 * Listing: 1;2;
	 * Listing: 0;2;
	 * Listing: 0;
	 * Listing: 
	 */
	private static void paramTest01(String[] args) {
		String[] numStrings = {"1","2","3"};
		char seperator = ';';
		pl(foo(seperator, numStrings));
		pl(foo(seperator,"1","2"));
		pl(foo(seperator,null,"2"));
		// if giving the optional param "null" instead of (String)null, you will get an NullPointerException
		pl(foo(seperator,(String)null));
		pl(foo(seperator));
	}
	// optional params with the same data type string (Use Object ... objects for optional params with different data types)
	private static String foo(char seperator, String ... strings) {
	    StringBuffer buffer = new StringBuffer();
	    buffer.append("Listing: ");
	    for (int i = 0; i < strings.length; i++) {
	    	// elimination of null
	    	strings[i] = (strings[i] != null ? strings[i]:"0");
	    	buffer.append(strings[i]);
	    	buffer.append(seperator);
	    }
		return buffer.toString();
	}
    /*
     * doing the same as system.out.println((String)Object);
     */
	public static void pl(String in) {
		System.out.println(in);
	}

}
