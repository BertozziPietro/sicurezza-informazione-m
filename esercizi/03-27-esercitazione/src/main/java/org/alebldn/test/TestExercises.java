package org.alebldn.test;

import org.alebldn.src.Exercises;
import org.alebldn.src.digests.MessageDigestWrapper;
import org.alebldn.src.Utils;
import org.junit.jupiter.api.*;

import java.nio.ByteBuffer;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercises {

    private byte firstResult;
    private int secondResult;

    @Test
    @Order(1)
    void firstExerciseTest() {

        try {

            this.firstResult = Exercises.firstExercise();
            System.out.println("The result you found in the first exercise is " + this.firstResult + ".");

            MessageDigestWrapper mdw = new MessageDigestWrapper("SHA-256");
            byte[] resultDigest = mdw.computeDigest(this.firstResult);
            String digestString = Utils.toHexString(resultDigest);

            assertEquals("3ebe1b59762a1c8020c1efe3747dd07f0e30617ed60b4e6a5bee16b6ea421dd0", digestString);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    @Order(2)
    void secondExerciseTest() {

        try {

            this.secondResult = Exercises.secondExercise(this.firstResult);
            System.out.println("The result you found in the second exercise is " + this.secondResult + ".");

            MessageDigestWrapper mdw = new MessageDigestWrapper("SHA-256");
            byte[] bytes = ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(this.secondResult).array();
            byte[] resultDigest = mdw.computeDigest(bytes);
            String digestString = Utils.toHexString(resultDigest);

            assertEquals("a20240e8117e72e2b29c48ae3005e7277116b87b09acd5ad967fa3ca465f1c2e", digestString);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    @Order(3)
    void thirdExerciseTest() {

        try {
            String result = Exercises.thirdExercise(this.firstResult, this.secondResult);
            System.out.println("The result you found in the third exercise is " + result + ".");

            MessageDigestWrapper mdw = new MessageDigestWrapper("SHA-256");
            byte[] bytes = result.getBytes();
            byte[] digestResult = mdw.computeDigest(bytes);
            String digestString = Utils.toHexString(digestResult);

            assertEquals("805435ac460586bf5c6fb74af6c04649c3502aeeac89617c152fe101eedfd75f", digestString);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
