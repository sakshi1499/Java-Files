package MyPackage;

public class Second
{
    public void secondsub()
    {
       System.out.println("Hi from Second");
    }
    public void secondsub2() 
   {      
      String name = "Sakshi from second trying to run First";
      First sakshi = new First();
      sakshi.getNames(name);
   }
}
