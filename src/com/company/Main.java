package com.company;

import static com.company.HillCipher.*;

public class Main {

    public static void main(String[] args) {
        
        String plainText = "We have a meeting at nine oclock";
        String key = "xiwgmbxzy";

        if (isKeyValid(plainText, key)) {
            System.out.println("Plain Text: " + plainText);
            System.out.println("Hill Cipher Encryption Starts...");
            System.out.println("Encrypted Text: " + encrypt(plainText, key));
            System.out.println("Hill Cipher Decryption Starts...");
            System.out.println("Decrypted Text: " + decrypt(multiplyMatrices(convertTextStringToMatrix(plainText, key), convertKeyStringToMatrix(key)), key));
        } else {
            System.out.println("Your key is not valid, please try another one...");
        }


    }
}
