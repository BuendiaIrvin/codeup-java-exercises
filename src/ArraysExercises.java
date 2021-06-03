import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
    String[] Person = new String[3];
        Person[0] = "Greg";
        Person[1] = "Jim";
        Person[2] = "Geoff";
        System.out.println(Arrays.toString(Person));
        int n = Person.length;


        // need to make it a static method
        String[] morePersons = Arrays.copyOf(Person,  n + 1);
        int nl = morePersons.length - 1;
        morePersons[nl] = "Greg";
        System.out.println(Arrays.toString(morePersons));

    }
}
