public class DecryptApp {
    public static void main(String[] args) {
        String message = "-$''$<k<#\"?.k9*))\"?";
        String key = "%&";
        Decryptor decryptor = new Decryptor();
        System.out.println("Decrypted message: " + decryptor.decryptMessage(message, key));
    }
}
