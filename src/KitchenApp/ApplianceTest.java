package KitchenApp;

// Abstract class
// Can serve as a superclass, but we cant directly instantiate an abrstract class

public class ApplianceTest {
    public static void main(String[] args) {
        // will get an error by trying to directly instantiate an abstract class.
//        Appliance app1 = new Appliance();
//        Appliance app1 = new Refrigerator("two door", "LG", true);


        Refrigerator app1 = new Refrigerator("two door", "LG", true);

        System.out.println(app1.brandName);
        System.out.println(app1.type);
//        System.out.println(app1.isHasShelves());
        app1.keepFresh();


    }
}
