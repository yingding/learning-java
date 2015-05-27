package effective.parsing.string;

//import org.junit.Assert;
import java.util.Arrays;
import org.junit.Test;

public class performanceTestColorParser {

    @Test
    public void testSubstringImpl() {        
        String colorString = "27AB49";//RGB Color Codes
        int upperBound = 1000;
        for (int i = 0; i < upperBound; i++) {
            System.out.println(
                Arrays.toString(EffectiveColorParser.str2IntRGBWithSubString(colorString)));
        }
    }
    
    @Test
    public void testShiftImpl() {
        String colorString = "27AB49"; //RGB Color Codes
        int upperBound = 1000;
        for (int i = 0; i < upperBound; i++) {
            System.out.println(
                Arrays.toString(EffectiveColorParser.str2IntRGBWithBitshift(colorString)));
        }
    }
}