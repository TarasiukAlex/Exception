import java.security.Provider;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
public class DecoderBytes extends Provider {
    /**
     * Constructs a provider with the specified name, version number,
     * and information.
     *
     * @param name    the provider name.
     * @param version the provider version number.
     * @param info    a description of the provider and its services.
     */
    protected DecoderBytes(String name, double version, String info) {
        super(name, version, info);
    }
    public static void main(String[] args) throws Exception {
      // Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        Security.addProvider(new DecoderBytes("UTF-8",1,"ECB") );
        byte[] password = "Tarasyuk12345600".getBytes("UTF-8");
        byte[] pkey = "keykeyke12345670".getBytes("UTF-8");
        SecretKeySpec secretKey = new SecretKeySpec(pkey, "AES");
        Cipher c = Cipher.getInstance("AES/ECB/NoPadding");
        System.out.println("User password(plaintext) : " + new String(password));
        // encrypt password
        byte[] cText = new byte[password.length];
        c.init(Cipher.ENCRYPT_MODE, secretKey);
        int ctLen = c.update(password, 0, password.length, cText, 0);
        ctLen += c.doFinal(cText, ctLen);
        System.out.println("Password encrypted: " + cText.toString().getBytes("UTF-8").toString() + " bytes: " + ctLen);
        // decrypt password
        byte[] plainText = new byte[ctLen];
        c.init(Cipher.DECRYPT_MODE, secretKey);
        int plen = c.update(cText, 0, ctLen, plainText, 0);
        plen += c.doFinal(plainText, plen);
        System.out.println("User password(plaintext) : " + new String(plainText) + " bytes: " + plen);
    }
}
