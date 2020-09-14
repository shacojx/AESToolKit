/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shacojx
 */
import java.util.*;

public class Base64ED {

    public String encode(String text) {
        String BasicBase64format = Base64.getEncoder().encodeToString(text.getBytes());
        return BasicBase64format;
    }

    public String decode(String text) {
        byte[] actualByte = Base64.getDecoder().decode(text);
        String actualString = new String(actualByte);
        return actualString;
    }

}
