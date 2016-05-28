
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);


//        String text = "I have nothing but my honour.";
//
//        String key = "uwotmate";
//
//        System.out.println("XOR:------------------------------");
//
//        XOR xOR = new XOR();
//
//        byte[] encrypted = xOR.encrypt(text, key);
//
//        System.out.println(Arrays.toString(encrypted));
//
//        String decrypted = xOR.decrypt(encrypted, key);
//
//        System.out.println(decrypted);
//
//        System.out.println(Character.BYTES);
//
//        xOR.vernam();


//        System.out.println("RSA:--------------------------------");
//
//        RSA rsa = new RSA();
//
//        DataInputStream in = new DataInputStream(System.in);
//
//        String teststring;
//
//        System.out.println("Enter the plain text:");
//
//        teststring = in.readLine();
//
//        System.out.println("Encrypting String: " + teststring);
//
//        System.out.println("String in Bytes: "
//
//                + rsa.bytesToString(teststring.getBytes()));
//
//        // encrypt
//
//        byte[] encrypted = rsa.encrypt(teststring.getBytes());
//
//        // decrypt
//
//        byte[] decrypted = rsa.decrypt(encrypted);
//
//        System.out.println("Decrypting Bytes: " + rsa.bytesToString(decrypted));
//
//        System.out.println("Decrypted String: " + new String(decrypted));

        System.out.println("Transposition:---------------------------");

        Transposition transposition = new Transposition();

        String line = System.getProperty("line.separator");
        scan.useDelimiter(line);


        String text = "attackatdawn";
        String key = "cat";

        String encrypted = transposition.encryptCT(key, text).toUpperCase();
        System.out.println("encrypted text = " + encrypted);

        String decrypted = transposition.decryptCT(key, encrypted);
        System.out.println("decrypted text = " + decrypted);


    }
}
