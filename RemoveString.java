//ID 2
// You are given two strings str1, and str2. If the shorter string appears in the longer string, please remove the shorter string that appear in the longer string. (case sensitive)
//
//*str1 and str2 will not has the equals length.

public class RemoveString {
    public static void main(String[] args) {
        String word="boypluzplustutorplus";
        String word2 = "plus";

        String result = word.replace(word2,"");

    }
}
