package scrambler;
import java.util.List;
import java.util.ArrayList;



public class Scrambler {
    public static String scrambleWord(String word)
    {
        for(int i = 1; i < word.length(); i++)
        {
            if(word.substring(i-1,i).equals("A") && !word.substring(i,i+1).equals("A"))
            {
                word = word.substring(0, i-1) + word.substring(i, i+1) + word.substring(i-1, i)+ word.substring(i+1);
                i++;
            }
        }
        return word;
    }

    /********************** Test *********************/
    public static void main(String[] args)
    {
        System.out.println("\nTesting Part (a):\n");

        String[] words = {"TAN", "ABRACADABRA", "WHOA",
                "AARDVARK", "EGGS", "A", ""};
        for (String word : words)
            System.out.println(word + " becomes " + scrambleWord(word));
    }
}
