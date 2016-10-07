
/**
 * Write a description of class Bystander here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Image;
import java.awt.Graphics;
public class Bystander extends Walker
{
  public static final int PIXELS_PER_INCH = 6;
  private Foot leftFoot, rightFoot;
  private int stepLength;
  private int stepsCount;
  
  // Constructor
  public void Walker(int x, int y, Image leftPic, Image rightPic)
  {
    leftFoot =  new Foot(x, y - PIXELS_PER_INCH * 4, leftPic);
    rightFoot = new Foot(x, y + PIXELS_PER_INCH * 4, rightPic);
    stepLength = PIXELS_PER_INCH * 12;
  }  

  // Returns the left foot
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
    
  }

  // Makes next step
  public void nextStep()
  {
    if (stepsCount % 2 == 0)  // if stepsCount is even
      leftFoot.turn(45);
    else  
      leftFoot.turn(-45);

    stepsCount++;  // increment by 1
  }

  // Stops this walker (brings its feet together)
  public void stop()
  {
    if (stepsCount % 2 == 0)  // if stepsCount is even
      leftFoot.turn(45);
    else  
      leftFoot.turn(-45);

  }

  // Returns the distance walked
  public int distanceTraveled()
  {
    return 0;
  }

  // Draws this walker
  public void draw(Graphics g)
  {
    leftFoot.draw(g);
    rightFoot.draw(g);
  }
}
