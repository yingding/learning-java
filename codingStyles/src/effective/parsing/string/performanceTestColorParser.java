package effective.parsing.string;

//import org.junit.Assert;
import java.util.Arrays;
import org.junit.Test;

public class performanceTestColorParser {
    /**
     * running time 0.007 s, this one has a less optimal performance
     * due to the string copy
     */
    @Test
    public void testSubstringImpl() {        
        String colorString = "27AB49";//RGB Color Codes
        int upperBound = 1000;
        for (int i = 0; i < upperBound; i++) {
            //System.out.println(Arrays.toString(
                    EffectiveColorParser.str2IntRGBWithSubString(colorString);
            //        ));
        }      
    }
    /**
     * running time 0.002 s
     * this one has a better performance due to the bitshift and mod operation
     */
    @Test
    public void testShiftImpl() {
        String colorString = "27AB49"; //RGB Color Codes
        int upperBound = 1000;
        for (int i = 0; i < upperBound; i++) {
            //System.out.println(Arrays.toString(
                EffectiveColorParser.str2IntRGBWithBitshift(colorString);
            //    ));
        }
    }
}