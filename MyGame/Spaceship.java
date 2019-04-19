import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Check if the up key is being pressed
        if (Greenfoot.isKeyDown("up"))
        {
            // Make the spaceship face upwards
            setRotation(270);
            // Move the spaceship up
            setLocation(getX(), getY() - 2);

        }

        if (Greenfoot.isKeyDown("down"))
        {
            // Make the spaceship face upwards
            setRotation(270);
            // Move the spaceship up
            setLocation(getX(), getY() + 2);

        }

        if (Greenfoot.isKeyDown("left"))
        {
            // Make the spaceship face upwards
            setRotation(270);
            // Move the spaceship up
            setLocation(getX() - 2, getY());

        }

        if (Greenfoot.isKeyDown("right"))
        {
            // Make the spaceship face upwards
            setRotation(270);
            // Move the spaceship up
            setLocation(getX() + 2, getY());

        }
    }    
}
