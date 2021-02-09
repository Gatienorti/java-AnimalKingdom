package animalApp;

public class Mammifere extends Animals{
    public Mammifere(String name, int yearNamed) {
        super(name, yearNamed);
    }

    @Override
    public String reproduce() {
        return "Live Births";
    }

    @Override
    public String move() {
        return "Lungs";
    }

    @Override
    public String breathe() {
        return "Walk";
    }
}
