package org.alebldn.src.ciphers;

import org.alebldn.src.prngs.SecureRandomWrapper;
import javax.crypto.spec.ChaCha20ParameterSpec;

public class ChaCha20CipherWrapper extends CipherWrapper {

    // This class extends the CipherWrapper class to implement methods that are specific for ChaCha20.
    // Methods are now public and can be called outside the class.

    /*
     * Initializes the superclass with correct algorithms.
     * Total suggested lines: 1.
     */
    public ChaCha20CipherWrapper(SecureRandomWrapper srw) throws Exception {
    	super("CHACHA20", "CHACHA20", srw);
    }

    /*
     * Generates the correct AlgorithmParameterSpec before calling the right superclass method to encrypt a plaintext.
     * Total suggested lines: 2/3.
     */
    public byte[] encrypt(String plaintext, byte[] iv, int counter) throws Exception {
    	ChaCha20ParameterSpec spec = new ChaCha20ParameterSpec(iv, counter);
    	return super.encrypt(plaintext, spec);
    }

    /*
     * Generates the correct AlgorithmParameterSpec before calling the right superclass method to decrypt a plaintext.
     * Total suggested lines: 2/3.
     */
    public String decrypt(byte[] ciphertext, byte[] iv, int counter) throws Exception {
    	ChaCha20ParameterSpec spec = new ChaCha20ParameterSpec(iv, counter);
    	return super.decrypt(ciphertext, spec);
    }

}
