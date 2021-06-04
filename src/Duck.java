public class Duck extends Bird {
    // Duck inherits from Bird
    // Duck inherits all public methods
    // lets override

    public void makeNoise(){
        System.out.println(this.getName() + " goes Quack Quack!");
    }


    //override move
    public void move(){
        System.out.println(this.getName() + " goes swimming");
    }
}
