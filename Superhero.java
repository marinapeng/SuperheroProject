public  class Superhero
   {
   private String name;
   
   public Superhero()
   {
       name = "";
   }
   public Superhero( String initialName )
      {
      name = initialName;   
      } // end one-arg constructor  
   public String getMotto()
      {
      return "I am Superhero!";    
      }
    public String toString()
    {
        return "My name is " +  name + ".\n";
    }
   } // end class Superhero 