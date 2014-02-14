package ittec.learning.java.testing;
/**
 * 
 * @author Yingding Wang
 * 
 * 
 *
 */

public class ReflectionTest {
	private final String[] ARGS;
	
	@MyAnotation("/home/yingding")
	String[] files1 = {"a","b"};
	
	
	public ReflectionTest(String[] args) {
		this.ARGS = args;
		pl(reflectionTest01(files1));
	}
	
	private String reflectionTest01(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Listing: ");
		for (int i = 0; i < args.length; i++) {
			buffer.append(args[i]);
			buffer.append(';');
		}
		return buffer.toString();
	}
	
	public @interface MyAnotation
	{
		String value();
	}
	
    /*
     * doing the same as system.out.println((String)Object);
     */
	public static void pl(String in) {
		System.out.println(in);
	}

}
