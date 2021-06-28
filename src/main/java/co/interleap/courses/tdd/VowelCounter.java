package co.interleap.courses.tdd;



public class VowelCounter {

    //char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
    String vowels = "aeiouAEIOU";
    public boolean isVowel(char ch){
        return vowels.indexOf(ch) != -1;
    }

    public int countVowels(String text){

        return getVowelCount(text);
    }


    private int getVowelCount(String text) {
        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++){
                if (isVowel(text.charAt(i))){vowelCount++;}
        }
        return vowelCount;
    }

}
