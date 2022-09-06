package Encoder;

public class Decoder {
    public String Decode(String EncodedText){
        String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
        String upper = EncodedText.toUpperCase();
        char offsetChar = upper.charAt(0);
        String plainText = "";
        plainText += offsetChar;
        int offsetNo = code.indexOf(offsetChar);
        for (int i = 1; i < upper.length(); i++) {
            int encodedIndex = code.indexOf(upper.charAt(i)) + offsetNo;
            if(upper.charAt(i) == ' '){
                plainText += " ";

            } else if (encodedIndex > 43){
                //encodeindex -44 as it will be the index of the char exceeding the code string
                // no need for revcode as the direction of the index is forward
                plainText += code.charAt(encodedIndex -44);
            } else {
                plainText += code.charAt(encodedIndex);
            }
        }

        return plainText;
    }
}
