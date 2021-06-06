

import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    private static String[] adj = {"brave", "calm", "eager", "gentle", "happy", "kind", "obedient", "polite", "proud", "silly", "witty"};
    private static String[] noun = {"dog", "nose", "coffee", "music", "radio", "taxi", "egg", "car", "voice", "heart", "book"};

    private static String randomElement(String[] strings) {
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }

    public static String makeServerName (String[] arr1, String[] arr2) {
        String adj = randomElement(arr1);
        String noun = randomElement(arr2);
        return adj + "-" + noun;
    }




    public static void main(String[] args){
        System.out.println("Your new server name is:");
        System.out.println(makeServerName(adj,noun));






//        String[] Adjectives = new String[11];
//        Adjectives[0] = "brave";
//        Adjectives[1] = "calm";
//        Adjectives[2] = "eager";
//        Adjectives[3] = "gentle";
//        Adjectives[4] = "happy";
//        Adjectives[5] = "kind";
//        Adjectives[6] = "obedient";
//        Adjectives[7] = "polite";
//        Adjectives[8] = "proud";
//        Adjectives[9] = "silly";
//        Adjectives[10] = "witty";
//
//
//        System.out.println(Arrays.toString(Adjectives));
//
//        String[] Nouns = new String[11];
//        Nouns[0] = "dog";
//        Nouns[1] = "nose";
//        Nouns[2] = "coffee";
//        Nouns[3] = "music";
//        Nouns[4] = "radio";
//        Nouns[5] = "taxi";
//        Nouns[6] = "egg";
//        Nouns[7] = "car";
//        Nouns[8] = "voice";
//        Nouns[9] = "heart";
//        Nouns[10] = "book";
//
//
//        System.out.println(Arrays.toString(Nouns));
//
//        Random n = new Random();
//        int randomNoun = n.nextInt(Nouns.length);
//        System.out.println(Nouns[randomNoun]);
//
//        Random a = new Random();
//        int randomAdj = a.nextInt(Adjectives.length);
//        System.out.println(Adjectives[randomAdj]);
//
//        System.out.println(Nouns[randomNoun] + "-" + Adjectives[randomAdj]);
        }
    }

