package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<AbstractAnimal> animalArrayList = new ArrayList<>();

        animalArrayList.add(new Mammal("Panda",1869));
        animalArrayList.add(new Mammal("Zebra",1778));
        animalArrayList.add(new Mammal("Koala",1816));
        animalArrayList.add(new Mammal("Sloth",1804));
        animalArrayList.add(new Mammal("Armadillo",1758));
        animalArrayList.add(new Mammal("Raccoon",1758));
        animalArrayList.add(new Mammal("Bigfoot",2021));

        animalArrayList.add(new Bird("Peacock", 1821));
        animalArrayList.add(new Bird("Toucan", 1758));
        animalArrayList.add(new Bird("Parrot", 1824));
        animalArrayList.add(new Bird("Swan", 1758));

        animalArrayList.add(new Fish("Salmon", 1758));
        animalArrayList.add(new Fish("Catfish", 1817));
        animalArrayList.add(new Fish("Perch", 1758));

        System.out.println("Original List before sorting");
        animalArrayList.forEach( animal -> System.out.println(animal)); //print original list with Lambda

        System.out.println("\nList all the animals in descending order by year named");
        animalArrayList.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
        animalArrayList.forEach(System.out::println);//print list with method reference

        System.out.println("\nList all the animals alphabetically");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalArrayList.forEach(System.out::println);//print list with method reference

        System.out.println("\nList all the animals order by how they move");
        animalArrayList.sort((a1, a2) -> a1.getMove().compareToIgnoreCase(a2.getMove()));
        animalArrayList.forEach(System.out::println);//print list with method reference

        System.out.println("\nList only those animals that breathe with lungs");
        animalArrayList.forEach( animal ->
        {
            if (animal.getBreathe().equalsIgnoreCase("lungs"))
            System.out.println(animal);
        });

        System.out.println("\nList only those animals that breathe with lungs and were named in 1758");
        animalArrayList.forEach( animal ->
        {
            if (animal.getBreathe().equalsIgnoreCase("lungs") && animal.getYearNamed() == 1758)
                System.out.println(animal);
        });

        System.out.println("\nList only those animals that lay eggs and breathe with lungs");
        animalArrayList.forEach( animal ->
        {
            if (animal.getBreathe().equalsIgnoreCase("lungs") && animal.getReproduce().equalsIgnoreCase("eggs"))
                System.out.println(animal);
        });

        System.out.println("\nList alphabetically only those animals that were named in 1758");
        animalArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalArrayList.forEach( animal ->
        {
            if (animal.getYearNamed() == 1758)
                System.out.println(animal);
        });
    }
}
