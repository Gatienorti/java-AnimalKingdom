package animalApp;
import java.util.*;

public class Main {
    public static void main(String[]args){


        List<Animals> animalList = new ArrayList<>();

        // Mammal
        animalList.add(new Mammifere("Zebra",1778));
        animalList.add(new Mammifere("Koala", 1816));
        animalList.add(new Mammifere("Panda", 1869));
        animalList.add(new Mammifere("Sloth", 1804));
        animalList.add(new Mammifere("Bigfoot", 2021));
        animalList.add(new Mammifere("Armadillo", 1758));

        // Fish
        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Perch", 1758));
        animalList.add(new Fish("Catfish", 1817));
        
        // Bird
        animalList.add(new Bird("Pigeon", 1837));
        animalList.add(new Bird("Swan", 1785));
        animalList.add(new Bird("Toucan", 1758)); 
        animalList.add(new Bird("Peacock", 1821));
        
        // For each, sorting and printing result
        
        System.out.println(animalList);
        //set animal list by age younger to older
        animalList.sort((a1, a2)-> (a1.getYearNamed()<a2.getYearNamed())? 1 :-1);
        System.out.println(animalList);
        
        //set By Alphabetic order 
        animalList.sort((a1,a2) -> a1.getName().compareTo(a2.getName()));
        System.out.println(animalList);

        //set by moovementstyle
        animalList.sort((a1,a2)->  a1.move().compareTo(a2.move()));
        System.out.println(animalList);
    }
}