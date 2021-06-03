public class Bird {
    //can a bird fly?
    private boolean canFly;

    private boolean isCanFly(){
        return canFly;
    }
    public void setCanFLy(boolean canFly){
        this.canFly = canFly;
    }


    //what kind of bird?
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Tweet tweet");
    }

    public void move(){
        System.out.println("flap flap");
    }






}
