import java.util.Scanner;
public class ScrabbleValidater {
    //Julian Matthews 10/25/2021. Create a method to find out if random letters make up a word.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi, please give me a word.");
        String wrd = in.nextLine();
        System.out.println("Now give me some letters");
        String letters = in.nextLine();
        boolean V = canSpell(wrd, letters);
        if (V) {System.out.println("those characters are in your word");}
        else {System.out.println("Either not all of the characters are in your word, or they are. However, the" +
                " repeated characters are not accounted for.");}
    }

    public static boolean canSpell (String word, String letter) {
        letter = letter.toUpperCase();
        word = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            char X = word.charAt(i);
            int Y = letter.indexOf(X);
            if (Y == -1) {return false;}
            else { letter = letter.replaceFirst(String.valueOf(X), "");}
        }
        return true;
    }
}



