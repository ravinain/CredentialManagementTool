import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.Random;

/**
 * Created by Ravi Nain on 11/4/2017.
 */
public class Test {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException,
            InvalidParameterSpecException, InvalidKeyException, NoSuchPaddingException, UnsupportedEncodingException,
            BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
        String password = "test";

//        byte[] salt = new byte[16];
//        Random random = new SecureRandom();
//        random.nextBytes(salt);
        byte[] salt = "[B@63947c6b".getBytes();

        System.out.println("Salt : " + salt);

        /* Derive the key, given password and salt. */
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 256);
        SecretKey tmp = factory.generateSecret(spec);
        SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

        /* Encrypt the message. */
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secret);
        AlgorithmParameters params = cipher.getParameters();
        byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
        byte[] ciphertext = cipher.doFinal("Hello, World!".getBytes("UTF-8"));
//        byte[] ciphertext = "[B@445b84c0".getBytes();
        System.out.println(ciphertext);

        /* Decrypt the message, given derived key and initialization vector. */
        Cipher cipher1 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher1.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(iv));
        String plaintext = new String(cipher1.doFinal(ciphertext), "UTF-8");
        System.out.println(plaintext);
    }
}
