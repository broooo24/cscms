import java.util.Scanner;
//You are given one String and one Integer. You need to print out every string at index
// that can be divisible by given int.
//ID29
public class EveryN {
    public static void main(String[] args) {
        String word = "Tutorism is Everywhere";
        String word2 = "VueJs is da best";
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result = everyN(word,number);
        System.out.println(result);
    }
    public static String everyN(String word,int num) {
        String result = "";
        for (int i = 0; i<word.length();i+=num){
            result +=word.charAt(i);
        }return result;
    }
}
