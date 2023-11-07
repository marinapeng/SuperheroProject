
/**
 * Write a description of class SyrupMan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SyrupMan extends Superhero
{
    // instance variables - replace the example below with your own
    private boolean isSticky;
    public SyrupMan()
    {
        super();
        isSticky = false;
    }
    public SyrupMan(String initName, boolean initSticky)
    {
        super(initName);
        isSticky = initSticky;
    }
    @Override
    public String getMotto()
    {
        return "I want your pancakes!";
    }
    public void becomeSticky()
    {
        isSticky = true;
        System.out.println("I am sticky now!");
    }
    public String toString()
    {
        return super.toString() + "I am a bottle of syrup that is sticky: " + isSticky;
    }
}
