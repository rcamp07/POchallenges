package WordTwist;


public class WordTwist {

    /*
    *
    In Text Twist, players try to score points by forming words using the letters from a 6-letter scrambled word. They win the round if they can successfully unscramble the 6-letter word.

    Create a function that takes in an array of already-guessed words, the unscrambled 6-letter word and returns the total number of points the player scored in a particular round using the following rubric:

    3-letter words are 1 pt
    4-letter words are 2 pts
    5-letter words are 3 pts
    6-letter words are 4 pts + 50 pt bonus (for unscrambling the word)
    Remember that invalid words (words that cannot be formed from the 6-letter unscrambled words) count as 0 pts.

    Examples
    totalPoints(["cat", "create", "sat"], "caster") ➞ 2
    // Since "create" is an invalid word.

    totalPoints(["trance", "recant"], "recant") ➞ 108
    // Since "trance" and "recant" score 54 pts each.

    totalPoints(["dote", "dotes", "toes", "set", "dot", "dots", "sted"], "tossed") ➞ 13
    // Since 2 + 3 + 2 + 1 + 1 + 2 + 2 = 13

    Notes:
    If a 6-letter word has multiple anagrams, count each 6-letter unscramble as an additional 54 pts. For example, if the word is arches, and the player guessed arches and chaser, add 108 pts for both words.
* */

    public static void main(String[] args){

        String[] game1 = {"cat", "create", "sat"};
        String[] game2 = {"trance", "recant"};
        String[] game3 = {"dote", "dotes", "toes", "set", "dot", "dots", "sted"};
        System.out.println(results(game1, "caster"));
        System.out.println(results(game2, "recant"));
        System.out.println(results(game3, "tossed"));
    }

    public static int results(String[] in, String word){
        int score = 0;

        for (String a : in){
            int count = 0;
            if (a.length() < 3 || a.length() > 6){
                continue;
            }
            char[] letters = a.toCharArray();
            StringBuilder w = new StringBuilder(word);

            for (char c : letters){
                    int charVal = w.indexOf(String.valueOf(c));

                    if (charVal != -1){
                        w.deleteCharAt(charVal);
                        count++;
                    } else {
                        count =0;
                        break;
                    }
            }
            if (count == 0) {
                continue;
            }
            if (a.length() == 6){
                score += 54;
            }
            switch (count){
                case 3:
                    score += 1;
                    break;
                case 4:
                    score += 2;
                    break;
                case 5:
                    score += 3;
                    break;
            }
        }

        return score;
    }

}
