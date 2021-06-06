package KitchenApp;

import java.util.Scanner;

public class Refrigerator extends Appliance implements StoreFood {

    private boolean hasShelves;

    public boolean isHasShelves(){
        return hasShelves;
    }


    public void setHasShelves(boolean hasShelves){
        this.hasShelves = hasShelves;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public Refrigerator (String type, String brandName, boolean hasShelves) {
        super(type, brandName);
        this.hasShelves = hasShelves;
    }

    public void keepFresh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("would you like to put something in the fridge (Y/N)");
        String userChoice = sc.nextLine();
        while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
            System.out.println("What would you like to put in the fridge?");
            String item = sc.nextLine();
            System.out.printf("sounds good! Ill keep your %s cold for you\n", item);
            System.out.println("would you like to put anything else in the firdge? (Y/N)");
            userChoice = sc.nextLine();

        }
        System.out.println("okay stay cool!");
    }

}
