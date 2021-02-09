package animalApp;

public abstract class Animals {
    protected int id;
    protected static int maxId =0;
    protected String name;
    protected int yearNamed;
    abstract String move();
    abstract String breathe();
    abstract String reproduce();
    
    public Animals(String name, int yearNamed){
        maxId++;
        id = maxId;
        this.name = name;
        this.yearNamed = yearNamed;
    }

    public String getName(){
        return name;
    }
    public int getYearNamed(){
        return yearNamed;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setYearNamed(int yearNamed){
        this.yearNamed = yearNamed;
    }


    @Override
    public String toString(){
        return "Id :"+ id +" Name: "+ name +" Year Named: "+ yearNamed+ "\n";
    }
}

