package animalApp;

public class Fish extends Animals{
    public Fish(String name, int yearNamed){
        super (name,yearNamed);
    }
    @Override
    public String reproduce(){
        return"Eggs";
    }
    @Override
    public String breathe() {
        return "Gills";
    }
    @Override
    public String move() {
        return "Swim";
    }
}
