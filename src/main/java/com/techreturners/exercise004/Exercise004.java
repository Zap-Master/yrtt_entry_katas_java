package com.techreturners.exercise004;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        String res = "";
        String strPuncMarks = ",.!?() "; //string with punctuation marks
        char[] strAsArray  = str.toCharArray(); // array of chars from str
        int firstLetterPos = 0; //position for first letter in a word
        boolean isChanged = false; //
        for (int i = 0; i < strAsArray.length; i ++){
            if (strPuncMarks.contains(Character.toString(strAsArray[i])) && isChanged == false) {
                // if strAsArray[i] is punctuation mark then add "ay" before it
                for (int j = firstLetterPos + 1; j < i; j++){ //scan array of chars for building string res
                    res = res + strAsArray[j];
                }
                res = (res + strAsArray[firstLetterPos] + "ay" + strAsArray[i]).trim();
                isChanged = true;
            }
            if (Character.toString(strAsArray[i]).trim().length() == 0){
                // if strAsArray[i] is space then add space to string res
                firstLetterPos = i +  1;
                res = res + " ";
                isChanged = false;
            }
            if ((i == strAsArray.length -1) && !(strPuncMarks.contains(Character.toString(strAsArray[i])))){
                // if strAsArray[i] is not punctuation mark then add "ay" to the end
                for (int k = firstLetterPos + 1; k <= i; k++){
                    res = res + strAsArray[k];
                }
                res = res + strAsArray[firstLetterPos] + "ay";

            }
        }
        return res;
    }
}
