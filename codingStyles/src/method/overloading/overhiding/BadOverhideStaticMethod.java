package method.overloading.overhiding;

public class BadOverhideStaticMethod {
    /**
     * output should be
     * original
     * new
     * original // Method call is bind in compile time;
     * overridden original 
     * overridden extended // Method call is overridden in runtime;
     * @param args
     */
    public static void main(String[] args) {
        Utility uObject = new Utility();
        uObject.myStaticMethod();
        UtilityExtended uObjExtended = new UtilityExtended();
        uObjExtended.myStaticMethod();
        // the static method call will be choosen in compile time.
        // this kind of manipulation is called method hiding
        // not overriding, overriding is carried out in run time
        Utility castedUObject = new UtilityExtended();
        castedUObject.myStaticMethod();
        
        // Overridding example
        OverridingClass oClass = new OverridingClass();
        oClass.overriddenMethod();
        oClass = new OverridingClassExtended();
        oClass.overriddenMethod();
    }
    
    public static class Utility {
        public static void myStaticMethod() {
            System.out.println("original");
        }
    }
    
    public static class UtilityExtended extends Utility {
        public static void myStaticMethod() {
            System.out.println("new");
        };
    }
    
    public static class OverridingClass {
        public void overriddenMethod() {
            System.out.println("overridden original");
        }
    }
    
    public static class OverridingClassExtended 
    extends OverridingClass {
        @Override
        public void overriddenMethod() {
            System.out.println("overridden extended");
        }
    }

}
