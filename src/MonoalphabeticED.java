/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shacojx
 */
public class MonoalphabeticED {

    public static char p[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=',
        '{', '}', '[', ']', '|', '\\',
        ';', ':', '"', '\'', '<', '>', ',', '.', '/', '?', '~', '`',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
        'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
        'W', 'X', 'Y', 'Z'};
    public static char ch[] = {'G', 'W', 'E', 'K', 'Z', 'B', 'X', 'I', 'C',
        'P', 'M', 'J', 'F', 'D', 'Q', 'H', 'V', 'R', 'L', 'T', 'U', 'O',
        'S', 'Y', 'N', 'A', '5', '9', '0', '4', '7', '8', '1', '3', '2', '6',
        '<', '$', '#', '@', '|', '^', '/', '!', '\'', '~', '_', '?', ':', '>',
        '}', '{', ']', '[', '%', '"',
        '`', '+', '\\', '(', '*', '=', ',', '.', '&', '-', ')', ';',
        'e', 'r', 'b', 'w', 'a', 'm', 'o', 's', 'l',
        'j', 'v', 'i', 'f', 'n', 'g', 't', 'q', 'c', 'h', 'p', 'x', 'k',
        'd', 'u', 'z', 'y'};

    public static String doEncryption(String s) {
        char c[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 94; j++) {
                if (p[j] == s.charAt(i)) {
                    c[i] = ch[j];
                    break;
                }
            }
        }
        return (new String(c));
    }

    public static String doDecryption(String s) {
        char p1[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 94; j++) {
                if (ch[j] == s.charAt(i)) {
                    p1[i] = p[j];
                    break;
                }
            }
        }
        return (new String(p1));
    }

}
