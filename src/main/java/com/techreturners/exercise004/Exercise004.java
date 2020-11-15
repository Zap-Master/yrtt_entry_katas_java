package com.techreturners.exercise004;

public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        String res = "";
        String strPuncMarks = ",.!?() ";
        char[] strAsArray  = str.toCharArray();
        int firstLetterPos = 0;
        boolean isChanged = false;
        for (int i = 0; i < strAsArray.length; i ++){
            if (strPuncMarks.contains(Character.toString(strAsArray[i])) && isChanged == false) {

                for (int j = firstLetterPos + 1; j < i; j++){
                    res = res + strAsArray[j];
                }
                res = (res + strAsArray[firstLetterPos] + "ay" + strAsArray[i]).trim();
                isChanged = true;
            }
            if (Character.toString(strAsArray[i]).trim().length() == 0){

                firstLetterPos = i +  1;
                res = res + " ";
                isChanged = false;
            }
            if ((i == strAsArray.length -1) && !(strPuncMarks.contains(Character.toString(strAsArray[i])))){
                for (int k = firstLetterPos + 1; k <= i; k++){
                    res = res + strAsArray[k];
                }
                res = res + strAsArray[firstLetterPos] + "ay";

            }
        }
        return res;
    }
}
