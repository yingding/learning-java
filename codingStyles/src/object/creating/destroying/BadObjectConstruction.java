package object.creating.destroying;

public class BadObjectConstruction {

    public static void main(String[] args) {
        new BadObjectExample1(1,true);
        new BadObjectExample1(true,1);
    }
    
    public static class BadObjectExample1 {
        BadObjectExample1(int a, boolean b) {
            BadObjectExample1.init();
        }
        BadObjectExample1(boolean b, int a) {
            BadObjectExample1.init();
        }
        
        private static void init() {
            System.out.println(
                    "You have made two constructor with same params!" +
                    "\n" + 
                    "This is a very bad idea!");
        }
    }

}
