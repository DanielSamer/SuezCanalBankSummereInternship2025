package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Warren Buffet", 120));
        people.add(new Person("Jeff Bezos", 150));
        people.add(new Person("Bill Gates", 100));
        people.add(new Person("Mark Zuckerburg", 50));

        //Filter out who have hundred + billion dollars 
        List<Person> hundredClub = new ArrayList<>();
        for (Person p : people) {
            if (p.billions >= 100) {
                hundredClub.add(p);
            }
        }
        hundredClub.forEach(p -> System.out.println(p.name + " has " + p.billions + " billion dollars."));
        
        System.out.println("*********Using Streams*********");

        //Using Streams to filter out who have hundred + billion dollars
        List<Person> hundredClub1 = people.stream()
                .sorted(Comparator.comparing(person ->person.name))
                .filter(p -> p.billions >= 100)
                .toList();        
        hundredClub1.forEach(p -> System.out.println(p.name + " has " + p.billions + " billion dollars."));
    }
}

class Person {
    String name;
    int billions;

    public Person(String name, int billions) {
        this.name = name;
        this.billions = billions;
    }

}
