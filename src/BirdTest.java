public class BirdTest {
    public static void main(String[] args) {
//        Bird cardinal = new Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();


        Duck mallard = new Duck();
        mallard.setName("Mallard");
        mallard.makeNoise();
        mallard.move();

        Finch lesserGoldFinch = new Finch();
        lesserGoldFinch.setName("Lesser GoldFinch");
        lesserGoldFinch.makeNoise();
        lesserGoldFinch.move();

    }
}
