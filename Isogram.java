//Determine if a word or phrase is an isogram.
//
//An isogram (also known as a "nonpattern word") is a word or phrase
// without a repeating letter, however spaces and hyphensare allowed to appear
// multiple times.

public class Isogram {
    public static void main(String[] args) {
        String word = "help";
        String word2 = "help me";

        System.out.println(isogram(word2));
    }
    public static String isogram(String word) {
        String modifiedWord = word.toLowerCase();
        String result="";
        boolean isIsogram = true;

        for (int i = 0; i<modifiedWord.length();i++){
            if (result.contains(String.valueOf(modifiedWord.charAt(i)))){
                isIsogram = false;
            }

            result += modifiedWord.charAt(i);
        }if (isIsogram){
            return word + " is an Isogram";
        }else {
            return word + " is not an Isogram";
        }

    }
}
