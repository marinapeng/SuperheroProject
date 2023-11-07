import java.util.ArrayList;

public class SuperheroDriver
   {
   public static void main( String[] args )
      {
      Superhero hero = new Superhero( "Heroman" ); 
      // add objects of superhero subclasses
      BubbleMan bob = new BubbleMan("Bob",100);
      SnakeWoman sally = new SnakeWoman("Sally", 15);
      SyrupMan waldo = new SyrupMan("Waldo", true);
      
      System.out.println( hero.getMotto() );
      // print mottoes and other methods.
      System.out.println(bob.getMotto());
      System.out.println(bob);
      System.out.println(sally.getMotto());
      System.out.println(sally);
      System.out.println(waldo.getMotto());
      System.out.println(waldo);
      
      ArrayList<Superhero> heroes = new ArrayList<Superhero>();
      heroes.add(hero);
      heroes.add(bob);
      heroes.add(sally);
      heroes.add(waldo);
      //add other objects polymorphically
      
      // use a for or for each loop to run all methods.
      for (int i=0; i<heroes.size(); i++)
      {
          System.out.println(heroes.get(i).getMotto());
          System.out.println(heroes.get(i));
      }
      } // end method main
   } // end SuperheroDriver