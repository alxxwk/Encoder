package Encoder;

public class Encoder {
    //It is assumed the first letter of the input to be the offset character
    // all input will be converted to uppercase
    public String encode(String plainText) {

        String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
        String upper = plainText.toUpperCase();
        char offsetChar = upper.charAt(0);
        String encodedText = "";
        encodedText += offsetChar;
        int offsetNo = code.indexOf(offsetChar);
        boolean isCode;
        for (int i = 1; i < upper.length(); i++) {
            isCode = false;
            for (int j = 0; j < code.length(); j++) {
//                System.out.println("i is: " + i + " upperchar is: " + upper.charAt(i));
//                System.out.println("j is: " + i + " codechar is: " + code.charAt(j));
//                System.out.println(upper.charAt(i) == code.charAt(j));
                if (upper.charAt(i) == code.charAt(j)) {
                    isCode = true;
                }
            }
            int encodedIndex = code.indexOf(upper.charAt(i)) - offsetNo;
            if (!isCode) {
                encodedText += upper.charAt(i);
            } else if (encodedIndex < 0) {
                //encodeindex -1 as revcode index starts from 0;
                encodedText += code.charAt(44 + encodedIndex);
            } else {
                encodedText += code.charAt(encodedIndex);
            }
        }
        return encodedText;
    }
}
