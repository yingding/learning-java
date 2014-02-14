package ittec.learning.java.testing;
import java.util.Scanner;
/**
 * 
 * @author Yingding Wang
 *
 */
public class CaseTest {
	private final String[] ARGS;
    private static Scanner scanner = new Scanner (System.in);
    private static String input = "";
	/*
	 * Beginning Case Test
	 */
	public CaseTest(String[] args) {
		this.ARGS = args;
		caseTest01(this.ARGS);
	}
	/*
	 * After the first case match in switch, all the subsequence will be executed, regardless the 
	 * subcase sequence. In this example with the input "1", the both pl() for 1 and 2 will be executed
	 * till the break statement. string equals are implemented in switch Methode
	 */
	private static void caseTest01(String[] args) {
		pl("This is a switch syntax tests");

		while (!input.equals(new String("q"))) {
		// the string equals are needed, otherwise the input != "q" is always true.
		    input = scanner.nextLine();
		    
			switch(input) {
			case "1" :
				pl("case 1: detected \"" + input +"\"");
			case "2" :
				pl("case 2: detected \"" + input +"\"");
				break;
			default:
				pl("default detected \"" + input + "\"");
			    break;
			}
		}
		pl("User end this program with input q");
	}
	
    /*
     * doing the same as system.out.println((String)Object);
     */
	public static void pl(String in) {
		System.out.println(in);
	}
}
