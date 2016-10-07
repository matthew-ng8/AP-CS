
/**
 * Write a description of class Hopper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Image;
import java.awt.Graphics;

public class Hopper
{
    public static final int PIXELS_PER_INCH = 6;
    private Foot leftFoot, rightFoot;
    private int stepLength;
    private int stepsCount;

    public Hopper(int x, int y, Image leftPic, Image rightPic){
        leftFoot =  new Foot(x, y - PIXELS_PER_INCH * 4, leftPic);
        rightFoot = new Foot(x, y + PIXELS_PER_INCH * 4, rightPic);
        stepLength = PIXELS_PER_INCH * 12;
    }

    public Foot getLeftFoot()
    {
        return leftFoot;
    }

    // Returns the right foot
    public Foot getRightFoot()
    {
        return rightFoot;
    }

    // Makes first step, starting with the left foot
    public void firstStep()
    {
        leftFoot.moveForward(stepLength);
        rightFoot.moveForward(stepLength);
        stepsCount = 1;
    }

    // Makes next step
    public void nextStep()
    {
        leftFoot.moveForward(stepLength);
        rightFoot.moveForward(stepLength);
        
        stepsCount++;  // increment by 1
    }

    // Stops this walker (brings its feet together)
    public void stop()
    {
    }

    // Returns the distance walked
    public int distanceTraveled()
    {
        return stepsCount * stepLength;
    }

    // Draws this walker
    public void draw(Graphics g)
    {
        leftFoot.draw(g);
        rightFoot.draw(g);
    }
}
