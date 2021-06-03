import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] Adjectives = new String[11];
        Adjectives[0] = "brave";
        Adjectives[1] = "calm";
        Adjectives[2] = "eager";
        Adjectives[3] = "gentle";
        Adjectives[4] = "happy";
        Adjectives[5] = "kind";
        Adjectives[6] = "obedient";
        Adjectives[7] = "polite";
        Adjectives[8] = "proud";
        Adjectives[9] = "silly";
        Adjectives[10] = "witty";


        System.out.println(Arrays.toString(Adjectives));

        String[] Nouns = new String[11];
        Nouns[0] = "dog";
        Nouns[1] = "nose";
        Nouns[2] = "coffee";
        Nouns[3] = "music";
        Nouns[4] = "radio";
        Nouns[5] = "taxi";
        Nouns[6] = "egg";
        Nouns[7] = "car";
        Nouns[8] = "voice";
        Nouns[9] = "heart";
        Nouns[10] = "book";


        System.out.println(Arrays.toString(Nouns));

        Random n = new Random();
        int randomNoun = n.nextInt(Nouns.length);
        System.out.println(Nouns[randomNoun]);

        Random a = new Random();
        int randomAdj = a.nextInt(Adjectives.length);
        System.out.println(Adjectives[randomAdj]);

        System.out.println(Nouns[randomNoun] + "-" + Adjectives[randomAdj]);
        }
    }

