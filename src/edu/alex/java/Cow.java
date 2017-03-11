package edu.alex.java;

/**
 * Created by Alex on 08-Mar-17.
 */
public class Cow extends Animal
{
    public Cow(String name)
    {
        super(Food.fromInt(3), name);

    }
    public void makeSound()
    {
        System.out.println(getName() + " sounds " + "Moo");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", sounds '" + "Moo" + '\'' +
                '}';
    }
}
