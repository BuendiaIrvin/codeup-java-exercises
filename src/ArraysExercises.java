import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }


    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));




        Person[] people = new Person[3];
        people[0] = new Person("Greg");
        people[1] = new Person("Jim");
        people[2] = new Person("Geoff");
        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("__________________");
        Person sophia = new Person("Sophia");
        people = addPerson(people, sophia);
        for (Person person : people) {
            System.out.println(person.getName());
        }


//    String[] Person = new String[3];
//        Person[0] = "Greg";
//        Person[1] = "Jim";
//        Person[2] = "Geoff";
//        System.out.println(Arrays.toString(Person));
//        int n = Person.length;
//
//
//        // need to make it a static method
//        String[] morePersons = Arrays.copyOf(Person,  n + 1);
//        int nl = morePersons.length - 1;
//        morePersons[nl] = "Greg";
//        System.out.println(Arrays.toString(morePersons));

    }
}
