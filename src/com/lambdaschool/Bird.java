package com.lambdaschool;

public class Bird extends AbstractAnimal
{
    private String move = "fly";
    private String breathe = "lungs";
    private String reproduce = "eggs";
    public Bird(String name, int yearNamed)
    {
        super(name, yearNamed);
    }
}
