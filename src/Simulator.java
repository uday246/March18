//Abstract class that must be extended not instantiated

abstract class Plant {

// Two instance variables that every type of plant would use Age and Height

     private int age = 0;

     private int height = 0;

     public void setHeight(int height) {

         this.height = height;

     }

     public int getAge() {

         return age;

     }

     public int getHeight() {

         return height;

     }

     public void addYearToAge() {

         age++;

     }

/** Each abstract method represents the actions that a plant must take during the specified season. These actions are specific to the type of plant, therefore cannot be generalized*/

// Any class extends the Plant class must implement these abstract methods.

     abstract public void doSpring();

     abstract public void doSummer();

     abstract public void doFall();

     abstract public void doWinter();} // End of Plant class

/**

* A tree grows upwards a certain number of feet a year. A tree does not die down to ground level during the winter

*/

class MapleTree extends Plant {

     private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 2;

     private void grow() {

         int currentHeight = getHeight();

         setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);

     }

     @Override

     public void doSpring() {

         grow();

         addYearToAge();

         System.out.println("Spring: The maple tree is starting to grow leaves and new branches");

         System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());

     }

     @Override

     public void doSummer() {

         grow();

         System.out.println("Summer: The maple tree is continuing to grow");

         System.out.println("\tCurrentAge: " + getAge() + " " + "Current Height: " + getHeight());

     }

     @Override

     public void doFall() {

         System.out.println("Fall:   The maple tree has stopped growing and is losing its leaves");

         System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());

     }

     @Override

     public void doWinter() {

         System.out.println("Winter: The maple tree is dormant");

         System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());

     }

} // end of MapleTree class

/**

* A tulip grows each year to the same height. During the winter they die down to ground level

*/

 class Tulip extends Plant {

     private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;

     private void grow() {

         int currentHeight = getHeight();

         setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);

     }

     private void dieDownForWinter() {

         setHeight(0);

     }

     @Override

     public void doSpring() {

         grow();

         addYearToAge();

         System.out.println("Spring: The tulip is starting to grow up from the ground");

         System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());

     }

     @Override

     public void doSummer() {

         System.out.println("Summer: The tulip has stopped to growing and is flowering");

         System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());

     }

     @Override

     public void doFall() {

         System.out.println("Fall:   The tulip begins to wilt");

         System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());

     }

     @Override

     public void doWinter() {

         dieDownForWinter();

         System.out.println("Winter: The tulip is dormant underground");

         System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());

     }

}// end of Tulip class



public class Simulator {

   public static void main(String[] args) {

       System.out.println("Creating a maple tree tulip...");

       MapleTree mapleTree = new MapleTree();

       Tulip tulip = new Tulip();

       Rose rose = new Rose();// added rose object as per question
       System.out.println("Entering a loop to simulate 3 years");

       for (int i = 0; i < 3; i++) {

           mapleTree.doSpring();
           tulip.doSpring();
           rose.doSpring();//added now

           mapleTree.doSummer();
           tulip.doSummer();
           rose.doSummer();//added now

           mapleTree.doFall();
           tulip.doFall();
           rose.doFall();//added now

           mapleTree.doWinter();
           tulip.doWinter();
           rose.doWinter();//added now


       }

   }
}

class Rose extends Plant {
   private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;

   private void grow() {

       //getting height of rose
       int currentHeight = getHeight();

       setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);

   }

   @Override
   public void doSpring() {//Spring activity
       grow();

addYearToAge();

System.out.println("Spring: The rose tree is starting to grow leaves and new branches");

System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());

   }

   @Override
   public void doSummer() {//Summer activity
       grow();

System.out.println("Summer: The rose tree is continuing to grow");

System.out.println("\tCurrentAge: " + getAge() + " " + "Current Height: " + getHeight());
   }

   @Override
   public void doFall() {//Fall activity

      
       System.out.println("Fall: The rose tree has stopped growing and is losing its leaves");

System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());

   }

   @Override
   public void doWinter() {//winter activity
       System.out.println("Winter: The rose tree is dormant");

System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
   }

}