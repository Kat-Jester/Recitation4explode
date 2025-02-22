public class Recitation4 {

    /**
     * Returns a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character.
     *
     * @param word a string that is to be exploded
     * @return a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character
     */
    public static String explode(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length();i++){
            char ch = word.charAt(i);

            if (Character.isLetter(ch)){
                for(int m = 0; m <= i ; m++){
                    sb.append(ch);
                }
            }else if(Character.isDigit(ch)){
                int num = Character.getNumericValue(ch);
                for (int s = 0; s < num; s++ )
                    sb.append(ch);
            }else {
                sb.append(word.substring(0,i));
            }
        }

        return sb.toString();
    }
}
/*
Step 1: Get word length
Step 2: Find position for letter in the string
Step 3: If letter is non-alphanumeric add full string to empty string
Step 4:If is digit append string for amount digit
Step 5: If is letter append empty string by current letter position
Step 6: go back to step 2


*/
