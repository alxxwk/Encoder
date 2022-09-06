package Encoder;

public class Encoder {
    //It is assumed the first letter of the input to be the offset character
    // all input will be converted to uppercase
    public String Encode(String plainText){

        String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
        String upper = plainText.toUpperCase();
        char offsetChar = upper.charAt(0);
        String encodedText = "";
        encodedText += offsetChar;
        int offsetNo = code.indexOf(offsetChar);
        for (int i = 1; i < upper.length(); i++) {
            int encodedIndex = code.indexOf(upper.charAt(i)) - offsetNo;
            if(upper.charAt(i) == ' '){
                encodedText += " ";
            } else if (encodedIndex < 0){
                //encodeindex -1 as revcode index starts from 0;
                encodedText += code.charAt(44 + encodedIndex);
            } else {
                encodedText += code.charAt(encodedIndex);
            }
        }
        return encodedText;
    }
}
