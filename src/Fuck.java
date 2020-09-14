/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shacojx
 */
public class Fuck {

    public String encode(String text, String key) {
        AES aes = new AES();
        Base64ED base64 = new Base64ED();
        MonoalphabeticED monoal = new MonoalphabeticED();
        String en_aes = aes.encrypt(text, key);
        String en_mo = monoal.doEncryption(en_aes);
        String out = base64.encode(en_mo);
        return out;
    }

    public String encode256(String text, String key) {
        AES aes = new AES();
        Base64ED base64 = new Base64ED();
        MonoalphabeticED monoal = new MonoalphabeticED();
        String en_aes = aes.encrypt256(text, key);
        String en_mo = monoal.doEncryption(en_aes);
        String out = base64.encode(en_mo);
        return out;
    }

    public String decode(String text, String key) {
        AES aes = new AES();
        Base64ED base64 = new Base64ED();
        MonoalphabeticED monoal = new MonoalphabeticED();
        String de_base64 = base64.decode(text);
        String de_mo = monoal.doDecryption(de_base64);
        String out = aes.decrypt(de_mo, key);
        return out;
    }

    public String decode256(String text, String key) {
        AES aes = new AES();
        Base64ED base64 = new Base64ED();
        MonoalphabeticED monoal = new MonoalphabeticED();
        String de_base64 = base64.decode(text);
        String de_mo = monoal.doDecryption(de_base64);
        String out = aes.decrypt256(de_mo, key);
        return out;
    }

}
