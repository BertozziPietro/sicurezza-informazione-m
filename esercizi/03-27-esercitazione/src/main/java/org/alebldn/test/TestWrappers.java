package org.alebldn.test;

import org.alebldn.src.ciphers.AESECBCipherWrapper;
import org.alebldn.src.ciphers.AESGCMCipherWrapper;
import org.alebldn.src.ciphers.ChaCha20CipherWrapper;
import org.alebldn.src.digests.MessageDigestWrapper;
import org.alebldn.src.prngs.SecureRandomWrapper;
import org.alebldn.src.Utils;
import org.junit.jupiter.api.*;

import java.util.HexFormat;

import static org.junit.jupiter.api.Assertions.*;

public class TestWrappers {

    private final String TEST = "Sicurezza dell'informazione";
    private final String TESTAEAD = "Professoressa: Rebecca Montanari";

    @Test
    void computeDigestTest() {
        try {

            MessageDigestWrapper mdw = new MessageDigestWrapper("SHA-256");
            byte[] byteArray = Utils.toByteArray(TEST);
            byte[] digest = mdw.computeDigest(byteArray);
            String actual = HexFormat.of().formatHex(digest);
            assertEquals("add4b4c68d5febb2cce9675b19e17c7aa9a4897ce9e73f32665e47abc6260642", actual);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void getRandomIntTest() {
        try {

            int result;
            SecureRandomWrapper srw = new SecureRandomWrapper("SHA1PRNG");

            srw.changeSeed(31337);
            result = srw.getRandomInt();
            assertEquals(-548606946, result);
            srw.changeSeed(1337);
            result = srw.getRandomInt();
            assertEquals(68561509, result);

            srw = new SecureRandomWrapper("DRBG");

            srw.changeSeed(31337);
            result = srw.getRandomInt();
            assertEquals(-1095615748, result);
            srw.changeSeed(1337);
            result = srw.getRandomInt();
            assertEquals(-197071089, result);

            srw = new SecureRandomWrapper("SHA1PRNG");
            srw.changeSeed(31337);
            byte[] input = new byte[12];
            srw.fillByteArray(input);
            assertArrayEquals(new byte[]{-33, 76, -20, 30, 125, -58, 103, 108, -96, 115, -88, -80}, input);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void ciphersTest() {
        try {

            SecureRandomWrapper ecbSrw = new SecureRandomWrapper("SHA1PRNG");
            ecbSrw.changeSeed(1337);
            AESECBCipherWrapper ecbWrapper = new AESECBCipherWrapper(ecbSrw);

            byte[] ecbCiphertext = ecbWrapper.encrypt(TEST);
            String ecbCiphertextString = Utils.toHexString(ecbCiphertext);
            assertEquals("753d67dd8340ddb80146fec3a37f513b6c04b299149794334914a590809299f6", ecbCiphertextString);
            String ecbPlaintext = ecbWrapper.decrypt(ecbCiphertext);
            assertEquals(TEST, ecbPlaintext);


            SecureRandomWrapper chachaSrw = new SecureRandomWrapper("SHA1PRNG");
            chachaSrw.changeSeed(1337);
            byte[] chachaIv = new byte[12];
            chachaSrw.fillByteArray(chachaIv);
            int counter = chachaSrw.getRandomInt();
            ChaCha20CipherWrapper chachaWrapper = new ChaCha20CipherWrapper(chachaSrw);

            byte[] chachaCiphertext = chachaWrapper.encrypt(TEST, chachaIv, counter);
            String chachaCiphertextString = Utils.toHexString(chachaCiphertext);
            assertEquals("4580e2ecc921a638caf49e3041b3f9b3d9904a2cb7ef282fc83dcd", chachaCiphertextString);
            String chachaPlaintext = chachaWrapper.decrypt(chachaCiphertext, chachaIv, counter);
            assertEquals(TEST, chachaPlaintext);


            SecureRandomWrapper gcmSrw = new SecureRandomWrapper("SHA1PRNG");
            gcmSrw.changeSeed(1337);
            byte[] gcmIv = new byte[16];
            gcmSrw.fillByteArray(gcmIv);
            AESGCMCipherWrapper gcmWrapper = new AESGCMCipherWrapper(gcmSrw);

            byte[] gcmCiphertext = gcmWrapper.encrypt(TEST, TESTAEAD, gcmIv);
            String gcmCiphertextString = Utils.toHexString(gcmCiphertext);
            assertEquals("76acb7a0de15f47e42f23f53dcb5b9b37daceca12c40176960cb21a8442374957f04d2d54255b49d3a150f", gcmCiphertextString);
            String gcmPlaintext = gcmWrapper.decrypt(gcmCiphertext, TESTAEAD, gcmIv);
            assertEquals(TEST, gcmPlaintext);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
