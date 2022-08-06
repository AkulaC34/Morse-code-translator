/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse.code.translator;

/**
 *
 * @author Charitha Dasanayake
 */
public class CodesAndLettersData {
    
    static String dotsAndDashesData(int input){
        
        String dotsAndDashesArray[] = new String[51];
        
        //Letters
        dotsAndDashesArray[0] = ".-";
        dotsAndDashesArray[1] = "-...";
        dotsAndDashesArray[2] = "-.-.";
        dotsAndDashesArray[3] = "-..";
        dotsAndDashesArray[4] = ".";
        dotsAndDashesArray[5] = "..-.";
        dotsAndDashesArray[6] = "--.";
        dotsAndDashesArray[7] = "....";
        dotsAndDashesArray[8] = "..";
        dotsAndDashesArray[9] = ".---";
        dotsAndDashesArray[10] = "-.-";
        dotsAndDashesArray[11] = ".-..";
        dotsAndDashesArray[12] = "--";
        dotsAndDashesArray[13] = "-.";
        dotsAndDashesArray[14] = "---";
        dotsAndDashesArray[15] = ".--.";
        dotsAndDashesArray[16] = "--.-";
        dotsAndDashesArray[17] = ".-.";
        dotsAndDashesArray[18] = "...";
        dotsAndDashesArray[19] = "-";
        dotsAndDashesArray[20] = "..-";
        dotsAndDashesArray[21] = "...-";
        dotsAndDashesArray[22] = ".--";
        dotsAndDashesArray[23] = "-..-";
        dotsAndDashesArray[24] = "-.--";
        dotsAndDashesArray[25] = "--..";

        //Digits
        dotsAndDashesArray[26] = "-----";
        dotsAndDashesArray[27] = ".----";
        dotsAndDashesArray[28] = "..---";
        dotsAndDashesArray[29] = "...--";
        dotsAndDashesArray[30] = "....-";
        dotsAndDashesArray[31] = ".....";
        dotsAndDashesArray[32] = "-....";
        dotsAndDashesArray[33] = "--...";
        dotsAndDashesArray[34] = "---..";
        dotsAndDashesArray[35] = "----.";

        //punctuation marks
        dotsAndDashesArray[36] = ".-...";
        dotsAndDashesArray[37] = ".----.";
        dotsAndDashesArray[38] = ".--.-.";
        dotsAndDashesArray[39] = "-.--.-";
        dotsAndDashesArray[40] = "-.--.";
        dotsAndDashesArray[41] = "---...";
        dotsAndDashesArray[42] = "--..--";
        dotsAndDashesArray[43] = "-...-";
        dotsAndDashesArray[44] = "-.-.--";
        dotsAndDashesArray[45] = ".-.-.-";
        dotsAndDashesArray[46] = "-....-";
        dotsAndDashesArray[47] = ".-.-.";
        dotsAndDashesArray[48] = ".-..-.";
        dotsAndDashesArray[49] = "..--..";
        dotsAndDashesArray[50] = "-..-.";
        
        return dotsAndDashesArray[input];
    }
    
    static char lettersData(int input){
    
        char LettersArray[] = new char[51];
        
        //Letters
        LettersArray[0] = 'A';
        LettersArray[1] = 'B';
        LettersArray[2] = 'C';
        LettersArray[3] = 'D';
        LettersArray[4] = 'E';
        LettersArray[5] = 'F';
        LettersArray[6] = 'G';
        LettersArray[7] = 'H';
        LettersArray[8] = 'I';
        LettersArray[9] = 'J';
        LettersArray[10] = 'K';
        LettersArray[11] = 'L';
        LettersArray[12] = 'M';
        LettersArray[13] = 'N';
        LettersArray[14] = 'O';
        LettersArray[15] = 'P';
        LettersArray[16] = 'Q';
        LettersArray[17] = 'R';
        LettersArray[18] = 'S';
        LettersArray[19] = 'T';
        LettersArray[20] = 'U';
        LettersArray[21] = 'V';
        LettersArray[22] = 'W';
        LettersArray[23] = 'X';
        LettersArray[24] = 'Y';
        LettersArray[25] = 'Z';
        
        //Digits
        LettersArray[26] = '0';
        LettersArray[27] = '1';
        LettersArray[28] = '2';
        LettersArray[29] = '3';
        LettersArray[30] = '4';
        LettersArray[31] = '5';
        LettersArray[32] = '6';
        LettersArray[33] = '7';
        LettersArray[34] = '8';
        LettersArray[35] = '9';
        
        //punctuation marks
        LettersArray[36] = '&';
        LettersArray[37] = '\'';
        LettersArray[38] = '@';
        LettersArray[39] = ')';
        LettersArray[40] = '(';
        LettersArray[41] = ':';
        LettersArray[42] = ',';
        LettersArray[43] = '=';
        LettersArray[44] = '!';
        LettersArray[45] = '.';
        LettersArray[46] = '-';
        LettersArray[47] = '+';
        LettersArray[48] = '"';
        LettersArray[49] = '?';
        LettersArray[50] = '/';
        
        return LettersArray[input];
    }
    
    

}
