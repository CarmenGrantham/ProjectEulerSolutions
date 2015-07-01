package projecteuler.problems.numbers;

import java.util.stream.IntStream;

/**
 * Problem 17: If the numbers 1 to 5 are written out in words: one, two, three, four, five, 
 *              then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *              
 *              If all the numbers from 1 to 1000 (one thousand) inclusive were written out 
 *              in words, how many letters would be used?
 *              
 *              NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and 
 *              forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 
 *              20 letters. The use of "and" when writing out numbers is in compliance with 
 *              British usage.
 *              
 * @author Carmen Grantham
 *
 */
public class NumberLetterCounts {

    public static void main(String[] args) {
        NumberLetterCounts counter = new NumberLetterCounts();
        int firstNumber = 1;
        int lastNumber = 1000;
        int total = IntStream.rangeClosed(firstNumber, lastNumber).map(number -> counter.getCountOfCharactersInSpeltOutNumber(number)).sum();
        System.out.printf("The number of letters between %d and %d is %d", firstNumber, lastNumber, total);

    }
    
    /**
     * Get the number of letters in the spelt out version of the number. 
     * Eg. "one" returns 3, "ten" returns 3, "sixteen" returns 7
     * 
     * @param number The number to use
     * @return The number of letters in the spelt out version of the number
     */
    public int getCountOfCharactersInSpeltOutNumber(int number) {
        String text = convertNumberToText(number);
        text = removeSpacesHyphens(text);
        return text.length();
    }
    
    /**
     * Remove spaces and hyphens from the supplied value.
     * 
     * @param text The text to use
     * @return Text with spaces and hyphens removed
     */
    private String removeSpacesHyphens(String text) {
        text = text.replaceAll(" ", "");
        text = text.replaceAll("-", "");
        return text;
    }
    
    /**
     * Convert the supplied number to text.
     * Eg 3 returns "three"
     * 
     * @param number The number to convert
     * @return Supplied number as text representation
     */
    private String convertNumberToText(int number) {
        StringBuilder text = new StringBuilder("");
        
        if (number == 0) {
            return "zero";
        }
        
        if (number > 1000) {
            // Ignore numbers larger than 1000
            return "";
        }
        
        if (number < 0) {
            text.append("minus ");
            number = Math.abs(number);
        }
                
        if (number == 1000) {
            return text.append("one thousand").toString();
        }
                
        int hundreds = number / 100;
        
        if (hundreds > 0) {
            text.append(convertNumberToText(hundreds));
            
            number = number % 100;
            text.append(" hundred");
            if (number > 0){
                text.append(" and ");
            }
        }      
        
        // Convert number to the number of 10's Eg if the number is 90 then tens will be 9
        int tens = number / 10;
        
        // process numbers 20 and larger
        if (tens > 1) {
            text.append(getTensInText(tens));
            
            number = number % 10;
            if (number > 0) {
                text.append(" ");
            }
        }
        
        // process remaining numbers that are 19 or less
        text.append(getUnderTwentyValueInText(number));
        
        return text.toString();
    }
    
    /**
     * Convert the tens of value to text.
     * Eg if tens = 2 return "twenty".
     * 
     * @param tens The value to use
     * @return Text representation of number
     */
    public String getTensInText(int tens) {
        switch (tens) {
        case 2:
            return "twenty";
        case 3:
            return "thirty";
        case 4:
            return "forty";
        case 5:
            return "fifty";
        case 6:
            return "sixty";
        case 7:
            return "seventy";
        case 8:
            return "eighty";
        case 9:
            return "ninety";
        }
        return "";
    }

    /**
     * Get the value under twenty into text representation
     * 
     * @param value The value to use
     * @return The text representation of the number
     */
    public String getUnderTwentyValueInText(int value) {
        switch (value) {
        case 1:
            return "one";
        case 2:
            return "two";
        case 3:
            return "three";
        case 4:
            return "four";
        case 5:
            return "five";
        case 6:
            return "six";
        case 7:
            return "seven";
        case 8:
            return "eight";
        case 9:
            return "nine";
        case 10:
            return "ten";
        case 11:
            return "eleven";
        case 12:
            return "twelve";
        case 13:
            return "thirteen";
        case 14:
            return "fourteen";
        case 15:
            return "fifteen";
        case 16:
            return "sixteen";
        case 17:
            return "seventeen";
        case 18:
            return "eighteen";
        case 19:
            return "nineteen";
        }
        return "";
    }
}
