package perfecthashing;

import javax.swing.JOptionPane;

class PerfectHashedStructure 
{   
    Listing data[];
    int size;
    int minKey;
    
    public PerfectHashedStructure(String minKey, String sMaxKey) 
    {
        
        this.minKey = Integer.parseInt(minKey);
        int maxKey = Integer.parseInt(sMaxKey);
        size = maxKey - this.minKey + 1;
        data = new Listing[size];
        System.out.println(this.minKey + " " + size);
    }
    
    private int preprocess(String key)
    {
        int iKey = Integer.parseInt(key);
        int pk = iKey - minKey;
        return pk;
    }
    
    private int directHashing(int pk)
    {
       int ip = pk;
       return ip;
    }
    
    public boolean insert(Listing aListing)
    {
        int pk = preprocess(aListing.getKey());
        int ip = directHashing(pk);
        Listing cloneListing = aListing.deepCopy();
        if(data[ip] != null) // note with that key already in the structure
        {
            return false;
        }
        data[ip] = cloneListing;
        return true;
    }        

    public Listing fetch(String key)
    {        
        int pk = preprocess(key);
        int ip = directHashing(pk);

        if(data[ip] == null) // node not in the structure
        {
            return null;
        }
        else
        {
            return data[ip].deepCopy();
        }
    }    
}


public class PerfectHashing 
{
    public static void main(String[] args) 
    { // Item number is the key field
        Listing l = new Listing("-9", "Textbook COM 101"); // ss number, name
        System.out.println(l);
        
        // declare the data structure object, ds
    String low = JOptionPane.showInputDialog("Enter min key");
    String high = JOptionPane.showInputDialog("Enter max key");
    PerfectHashedStructure ds = new PerfectHashedStructure(low, high);
  
        Listing aListing = new Listing("-32", "first avenue 1234");
        ds.insert(aListing);
        System.out.println(ds.fetch("-32"));
        System.out.println(ds.fetch("-2"));
        System.out.println(ds.insert(aListing));
  
    }
}

class Listing
{ 
  private String number;  // key field
  private String name;
  
  public Listing(String num, String n )
  {  
        number = num;
      name = n;
  }
  
  public String toString( )
   {   
       return("Item number is " + number +
              "\nName is " + name + "\n");
   }
  
  public Listing deepCopy( )
   {  
      Listing clone = new Listing(number, name);
      return clone;
   }
  
  public String getKey()
   {   
       return number;
   }
 }// end of class Listing