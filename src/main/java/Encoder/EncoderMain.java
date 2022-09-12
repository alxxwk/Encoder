package Encoder;

public class EncoderMain {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        String testString = "#hell# world";
        System.out.println(encoder.encode(testString));
        String encodedText = encoder.encode(testString);
        System.out.println(decoder.Decode(encodedText));
//         for testing
//        String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
//        for (int i = 0; i < code.length(); i++) {
//            String testtext= "/,A2";
//            String test = "";
//            test += code.charAt(i);
//            test += testtext;
//            System.out.println("test is " + test);
//            testtext = encoder.Encode(test);
//
//            System.out.println("encoded text is: " + testtext);
//
//            System.out.println("plaintext is: " + decoder.Decode(testtext));
//        }
    }



}
