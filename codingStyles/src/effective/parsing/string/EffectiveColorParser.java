package effective.parsing.string;

import java.util.Arrays;

public class EffectiveColorParser {

    public static void main(String[] args) {
        String colorString = "27AB49"; //RGB Color Codes
        System.out.println(Arrays.toString(str2IntRGBWithSubString(colorString)));
        System.out.println(Arrays.toString(str2IntRGBWithBitshift(colorString)));
    }
    
    public static int[] str2IntRGBWithSubString(String rgbColorString) {
        int[] colorCodes = new int[3];
        String subString;
        for (int i = 0; i < 3; i++) {
           subString = rgbColorString.substring(i * 2, i * 2 + 2);
           colorCodes[i] = Integer.parseInt(subString, 16);
        }
        return colorCodes;
    }
    
    public static int[] str2IntRGBWithBitshift(String rgbColorString) {
        int[] colorCodes = new int[3]; 
        int totalCodes = Integer.parseInt(rgbColorString, 16); 
        //System.out.println(totalCodes);
        for (int i = 0; i<3; i++) {
            colorCodes[i] = subHexaInt(totalCodes, i);
        }
        return colorCodes;
    }
    /*
     * int r with subsequence posistion 0, g with subSeqPos 1 and b with subSeqPos 2 
     */
    private static int subHexaInt(int totalInt, int subSeqPos) {
        int sub;
        if (subSeqPos > 2 || subSeqPos < 0) {
            throw new IllegalStateException("argument exp not within range [0,2].");
        } else {
            int leadingBits = (3 - subSeqPos) * 8;
            int endingBits = (2 - subSeqPos) * 8;
            int leadingHexa = 1 << leadingBits; 
            sub = totalInt % leadingHexa;
            sub = sub >>> endingBits;
            return sub;
        }
    }

}
