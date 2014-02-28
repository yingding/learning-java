package ittec.learning.java.annotation;

import java.lang.reflect.Method;

/**
 * 
 * @author Yingding Wang
 *
 */
public class AnnotationTest {
	private final String[] ARGS;
	public AnnotationTest(String[] args) {
		this.ARGS = args;
		AnnotationTest01(this.ARGS);
	}
    
	private static void AnnotationTest01(String[] args) {
		// create the annotated object runner
	    AnnotatedObject runner = new AnnotatedObject();
	    // reflecting all the methods in annotated object
	    Method[] methods = runner.getClass().getMethods();
	        for (Method method : methods) {
	            Runnable annos = method.getAnnotation(Runnable.class);
	            if (annos != null) {
	                try {
	                    method.invoke(runner);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	}

}
