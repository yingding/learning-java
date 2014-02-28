package ittec.learning.java.annotation;

import java.lang.reflect.Method;

/**
 * 
 * @author Yingding Wang
 *
 */
public class AnnotatedObject {
    public void method1() {
        System.out.println("method1 done");
    }

    @Runnable
    public void method2() {
        System.out.println("method2 done");
    }

    @Runnable
    public void method3() {
        System.out.println("method3 done");
    }

    public void method4() {
        System.out.println("method4 done");
    }
    
    @Runnable
    public void method5() {
        System.out.println("method5 done");
    }

}
