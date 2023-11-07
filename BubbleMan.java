
/**
 * Write a description of class SpiderMan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleMan extends Superhero
{
    // instance variables - replace the example below with your own
    private int numBubbles;
    public BubbleMan()
    {
        super();
        numBubbles = 0;
    }
    public BubbleMan(String initName, int initBubbles)
    {
        super(initName);
        numBubbles = initBubbles;
    }
    @Override
    public String getMotto()
    {
        return "Bubble Bubble!";
    }
    public void shootBubbles()
    {
        System.out.println("I am shooting a " + numBubbles + " bubbles");
    }
    public String toString()
    {
        return super.toString() + "I am a bubble man and can shoot " + numBubbles + " bubbles";
    }
}
