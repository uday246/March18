package mat25;

class HomePets
{
   private String ownerName;
   private Pet dog;
   private Pet cat;
  
   public HomePets(String homeName, Pet homeDog, Pet homeCat)
   {
       this.ownerName = homeName;
       this.dog = homeDog;
       this.cat = homeCat;
   }
  
   public String toString()
   {
       String output = " ";
       output += this.ownerName;
       output += this.dog;
       output += this.cat;
       return output;  
   }
  
   public double totalPrice()
   {
      return dog.getPrice()+cat.getPrice();
   }
  
   public double totalWeight()
   {
      return dog.getWeight()+cat.getWeight();
   }

}
class Pet
{
   private   String name;
   private double price;
   private int weight;
  
   //constructor
   public Pet(String petName, double petPrice, int petWeight)
   {
       this.name = petName;
       this.price = petPrice;
       this.weight = petWeight;
   }
   public String toString()
   {
       String output = " ";
       output += this.name + " \t";
       output += this.price + " dollars \t";
       output += this.weight + " pounds \t";
       return output;
   }
  
   public double getPrice()
   {
       return price;
   }
  
   public int getWeight()
   {
       return weight;
   }

   public void changePrice (double amount)
   {
       if (amount < 0)
           this.price = getPrice() + amount;
       else
           this.price = getPrice() + amount;
      
   }
  
}


public class HomePetsDriver
{
   public static void main (String [] args)
   {
       Pet myDog = new Pet("Carter", 1000 , 30);
       Pet myCat = new Pet("Hunter", 500 , 50);
       HomePets myPets = new HomePets("Long: ", myDog, myCat);   //myPets object
       System.out.println();
      
       //testing toString
       System.out.println(myDog.toString());
       System.out.println(myCat.toString() +"\n");
       System.out.println(myPets.toString()); //myPets toString
       System.out.println();
      
       //using changePrice
       myDog.changePrice(20.00);
       myCat.changePrice(-10.00);
  
       System.out.println(myDog);
       System.out.println(myCat);
   }
}
