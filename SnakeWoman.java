
/**
 * Write a description of class Batman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnakeWoman extends Superhero
{
    // instance variables - replace the example below with your own
    private int length;
    public SnakeWoman()
    {
        super();
        length = 0;
    }
    public SnakeWoman(String initName, int initLength)
    {
        super(initName);
        length = initLength;
    }
    @Override
    public String getMotto()
    {
        return "Slither!";
    }
    public void getLength()
    {
        System.out.println("I am " + length + " feet long");
    }
    public String toString()
    {
        return super.toString() + "I am a snake that is " + length + " feet long";
    }
}