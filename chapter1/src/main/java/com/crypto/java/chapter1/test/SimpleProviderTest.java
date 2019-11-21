package com.crypto.java.chapter1.test;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;

/**
 * @author tola on 11/20/19
 **/
public class SimpleProviderTest {

    public static void main(String[] args)
    {
        Security.addProvider(new BouncyCastleProvider());

        String providerName = "BC";

        if (Security.getProvider(providerName) == null)
        {
            System.out.println(providerName + " provider not installed");
        }
        else
        {
            System.out.println(providerName + " is installed.");
        }
    }


}
