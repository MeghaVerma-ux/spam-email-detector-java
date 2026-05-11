import java.util.*;

public class SpamDetector {

    private Set<String> spamWords;

    public SpamDetector() {

        spamWords = new HashSet<>();

        String[] words = {
                "free",
                "win",
                "money",
                "offer",
                "click",
                "lottery",
                "urgent",
                "bonus",
                "prize",
                "limited"
        };

        spamWords.addAll(Arrays.asList(words));
    }


    public boolean isSpam(String emailText) {

        emailText = emailText.toLowerCase();

        String[] words = emailText.split("\\s+");

        int count = 0;

        for(String word : words) {

            if(spamWords.contains(word)) {

                count++;
            }
        }

        return count >= 2;
    }
}