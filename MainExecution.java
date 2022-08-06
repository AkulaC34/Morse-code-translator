/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse.code.translator;

import javax.swing.JTextArea;
import static morse.code.translator.CodesAndLettersData.dotsAndDashesData;
import static morse.code.translator.CodesAndLettersData.lettersData;

/**
 *
 * @author Charitha Dasanayake
 */
public class MainExecution {

    JTextArea jTextArea1;
    JTextArea jTextArea2;

    public MainExecution(JTextArea textArea1, JTextArea textArea2) {

        this.jTextArea1 = textArea1;
        this.jTextArea2 = textArea2;

    }

    static String addDotsAndDashes(char keyChar) {

        String dotsAndDashes = "";

        switch (keyChar) {

            //Letters
            case 'A':
                dotsAndDashes = dotsAndDashesData(0);
                break;

            case 'B':
                dotsAndDashes = dotsAndDashesData(1);
                break;

            case 'C':
                dotsAndDashes = dotsAndDashesData(2);
                break;

            case 'D':
                dotsAndDashes = dotsAndDashesData(3);
                break;

            case 'E':
                dotsAndDashes = dotsAndDashesData(4);
                break;

            case 'F':
                dotsAndDashes = dotsAndDashesData(5);
                break;

            case 'G':
                dotsAndDashes = dotsAndDashesData(6);
                break;

            case 'H':
                dotsAndDashes = dotsAndDashesData(7);
                break;

            case 'I':
                dotsAndDashes = dotsAndDashesData(8);
                break;

            case 'J':
                dotsAndDashes = dotsAndDashesData(9);
                break;

            case 'K':
                dotsAndDashes = dotsAndDashesData(10);
                break;

            case 'L':
                dotsAndDashes = dotsAndDashesData(11);
                break;

            case 'M':
                dotsAndDashes = dotsAndDashesData(12);
                break;

            case 'N':
                dotsAndDashes = dotsAndDashesData(13);
                break;

            case 'O':
                dotsAndDashes = dotsAndDashesData(14);
                break;

            case 'P':
                dotsAndDashes = dotsAndDashesData(15);
                break;

            case 'Q':
                dotsAndDashes = dotsAndDashesData(16);
                break;

            case 'R':
                dotsAndDashes = dotsAndDashesData(17);
                break;

            case 'S':
                dotsAndDashes = dotsAndDashesData(18);
                break;

            case 'T':
                dotsAndDashes = dotsAndDashesData(19);
                break;

            case 'U':
                dotsAndDashes = dotsAndDashesData(20);
                break;

            case 'V':
                dotsAndDashes = dotsAndDashesData(21);
                break;

            case 'W':
                dotsAndDashes = dotsAndDashesData(22);
                break;

            case 'X':
                dotsAndDashes = dotsAndDashesData(23);
                break;

            case 'Y':
                dotsAndDashes = dotsAndDashesData(24);
                break;

            case 'Z':
                dotsAndDashes = dotsAndDashesData(25);
                break;

            //Digits
            case '0':
                dotsAndDashes = dotsAndDashesData(26);
                break;

            case '1':
                dotsAndDashes = dotsAndDashesData(27);
                break;

            case '2':
                dotsAndDashes = dotsAndDashesData(28);
                break;

            case '3':
                dotsAndDashes = dotsAndDashesData(29);
                break;

            case '4':
                dotsAndDashes = dotsAndDashesData(30);
                break;

            case '5':
                dotsAndDashes = dotsAndDashesData(31);
                break;

            case '6':
                dotsAndDashes = dotsAndDashesData(32);
                break;

            case '7':
                dotsAndDashes = dotsAndDashesData(33);
                break;

            case '8':
                dotsAndDashes = dotsAndDashesData(34);
                break;

            case '9':
                dotsAndDashes = dotsAndDashesData(35);
                break;

            //punctuation marks
            case '&':
                dotsAndDashes = dotsAndDashesData(36);
                break;

            case '\'':
                dotsAndDashes = dotsAndDashesData(37);
                break;

            case '@':
                dotsAndDashes = dotsAndDashesData(38);
                break;

            case ')':
                dotsAndDashes = dotsAndDashesData(39);
                break;

            case '(':
                dotsAndDashes = dotsAndDashesData(40);
                break;

            case ':':
                dotsAndDashes = dotsAndDashesData(41);
                break;

            case ',':
                dotsAndDashes = dotsAndDashesData(42);
                break;

            case '=':
                dotsAndDashes = dotsAndDashesData(43);
                break;

            case '!':
                dotsAndDashes = dotsAndDashesData(44);
                break;

            case '.':
                dotsAndDashes = dotsAndDashesData(45);
                break;

            case '-':
                dotsAndDashes = dotsAndDashesData(46);
                break;

            case '+':
                dotsAndDashes = dotsAndDashesData(47);
                break;

            case '"':
                dotsAndDashes = dotsAndDashesData(48);
                break;

            case '?':
                dotsAndDashes = dotsAndDashesData(49);
                break;

            case '/':
                dotsAndDashes = dotsAndDashesData(50);
                break;

            default:
                dotsAndDashes = String.valueOf(keyChar);
        }

        return dotsAndDashes;

    }

    void callMorseKeys() {
        jTextArea2.setText("");
        Boolean textAdd = false;
//        for (int i = 0; i <= 50; i++) {
//            jTextArea1.setText(jTextArea1.getText() + String.valueOf(lettersData(i)) + " ");
//        }
        String text = "";
        String textSet = "";
        for (int i = 0; i < jTextArea1.getText().length(); i++) {

            char c = jTextArea1.getText().toUpperCase().charAt(i);
            if (String.valueOf(c).equals(addDotsAndDashes(c))) {
                if (" ".equals(addDotsAndDashes(c)) || (int) c == 10) {
                    textSet = "/";
                } else {
                    /* show msg:
                        Error in input.Cannot translate the highlighted characters.
                        (highlight the characters)
                        use (" # ") as output text for the character */
                    textSet = "#";
                }

            } else {
                textSet = addDotsAndDashes(c);
            }
            text = text + " " + textSet;
            textAdd = true;

        }
        if (textAdd) {

            while (text.contains(" / /")) {
                text = text.replace(" / /", " /");
            }

            if (text.charAt(1) == '/') {
                text = text.substring(3);
            } else {
                text = text.substring(1);
            }
            if (text.charAt(text.length() - 1) == '/') {
                text = (String) text.subSequence(0, text.length() - 2);
            }
            jTextArea2.setText(text);
        }

    }

    void callLetters() {
        jTextArea2.setText("");

        Boolean space = false;
        String code = "", codeSet = "", noSeperate = "", jTextAreat1 = "";
        if (jTextArea1.getText().contains(String.valueOf((char) 10))) {
            jTextAreat1 = jTextArea1.getText().replaceAll(String.valueOf((char) 10), " ");
        } else {
            jTextAreat1 = jTextArea1.getText();
        }

        String seperate[] = jTextAreat1.split("/");
        if (jTextAreat1.contains("/")) {
            space = true;
            for (int i = 0; i <= (seperate.length - 1); i++) {
                if (seperate[i].length() > 1) {
                    while (seperate[i].contains("  ")) {
                        seperate[i] = seperate[i].replace("  ", " ");
                    }
                }
                if (seperate[i].length() >= 1 && seperate[i].charAt(0) == ' ') {
                    if (seperate[i].length() > 1) {
                        seperate[i] = seperate[i].substring(1);
                    } else {
                        seperate[i] = seperate[i].replace(" ", "");
                    }
                }
                if (seperate[i].length() > 1 && seperate[i].charAt(seperate[i].length() - 1) == ' ') {
                    seperate[i] = seperate[i].substring(0, seperate[i].length() - 1);
                }
            }
        } else {
            noSeperate = jTextAreat1;
            while (noSeperate.contains("  ")) {
                noSeperate = noSeperate.replace("  ", " ");
            }
            if (noSeperate.charAt(0) == ' ') {
                if (noSeperate.length() > 1) {
                    noSeperate = noSeperate.substring(1);
                } else {
                    noSeperate = noSeperate.replace(" ", "");
                }
            }
            if (noSeperate.charAt(noSeperate.length() - 1) == ' ') {
                noSeperate = noSeperate.substring(0, noSeperate.length() - 1);
            }

        }

        if (space) {
            for (String a : seperate) {
                if (!"".equals(a)) {
                    if (a.contains(" ")) {
                        codeSet = "";
                        String word[] = a.split(" ");
                        for (String b : word) {
                            Boolean in = false;
                            for (int i = 0; i < 51; i++) {
                                if (b.equals(dotsAndDashesData(i))) {
                                    in = true;
                                    codeSet = codeSet + lettersData(i);
                                    break;
                                }
                            }
                            if (in == false) {
                                codeSet = codeSet + "#";
                            }
                        }
                    } else {
                        Boolean in = false;
                        for (int i = 0; i < 51; i++) {
                            if (a.equals(dotsAndDashesData(i))) {
                                in = true;
                                codeSet = String.valueOf(lettersData(i));
                                break;
                            }
                        }
                        if (in == false) {
                            codeSet = "#";
                        }

                    }

                    code = code + " " + codeSet;
                }
            }
        } else {
            if (!"".equals(noSeperate)) {
                String word[] = noSeperate.split(" ");
                for (String b : word) {
                    Boolean in = false;
                    for (int i = 0; i < 51; i++) {
                        if (b.equals(dotsAndDashesData(i))) {
                            in = true;
                            codeSet = codeSet + lettersData(i);
                            break;
                        }
                    }
                    if (in == false) {
                        codeSet = codeSet + "#";
                    }
                }
                code = codeSet;
            }

        }

        if (code.charAt(0) == ' ') {
            code = code.substring(1);
        }
        jTextArea2.setText(code);

        /*
                   show msg:
                        if input tab has any wrong letter character or wrong dots and dash letter code
                        show this message,
                        "This is not valid Morse code, but it can be played anyway."
                        and use ("#") for unrecognized letter codes, and print it as output.
                        play every dots and dashes except letter characters.
                        one unit separate by a single space.(" .-- " or " abc ") 
         */
    }

}
