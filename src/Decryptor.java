public class Decryptor {
    public String decryptMessage(String message, String key) {
            StringBuilder decryptedMessage = new StringBuilder();
            int keyIndex = 0;
            for (int i = 0; i < message.length(); i++) {
                char encryptedChar = message.charAt(i);
                char keyChar = key.charAt(keyIndex);
                char decryptedChar = (char) (encryptedChar ^ keyChar);
                decryptedMessage.append(decryptedChar);
                keyIndex = (keyIndex + 1) % key.length();
            }
            return decryptedMessage.toString();
    }
}
