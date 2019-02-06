package com.lambdaschool;

public class Mammal extends AbstractAnimal
{
    private String move = "walk";
    private String breathe = "lungs";
    private String reproduce = "live births";
    public Mammal(String name, int yearNamed)
    {
        super(name, yearNamed);
    }
}
