package com.crypto.java.chapter1.test;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import java.security.Security;

/**
 * @author tola on 11/20/19
 **/
public class PrecedenceTest {

    public static void main(String[] args) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        Cipher cipher = Cipher.getInstance("Blowfish/ECB/NoPadding");
        //Cipher cipher = Cipher.getInstance("Blowfish/ECB/NoPadding", "BC");
        System.out.println(cipher.getProvider());
        cipher = Cipher.getInstance("Blowfish/ECB/NoPadding", "BC");
        System.out.println(cipher.getProvider());
    }
}
