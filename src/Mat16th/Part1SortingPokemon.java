package Mat16th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Part1SortingPokemon {
   static Pokemon pokemon[] = new Pokemon[800];
  
  


   public static void main(String[] args) {
       readPokemonCSV();
       quickSort();
       // method 1
       /*
       //converting it to list
       List<Pokemon> solution = Arrays.asList(pokemon);
       //shuffling the list
       Collections.shuffle(solution);
       //converting it back to array
       solution=solution.toArray();
       
       */
       
       // method 2
       
       Random rgen = new Random();  // Random number generator			
       
		for (int i=0; i<pokemon.length; i++) {
		    int randomPosition = rgen.nextInt(pokemon.length);
		    Pokemon temp = pokemon[i];
		    pokemon[i] = pokemon[randomPosition];
		    pokemon[randomPosition] = temp;
		}
       shellSort();
       //quickSort();


      
   }

   static void quickSort() {
       Pokemon[] quickSortArray = pokemon;

       System.out.println("Unsorted: ");
       System.out.println(Arrays.toString(pokemon));


       PokemonSortAlgorithms.quickSort(quickSortArray, 0, quickSortArray.length-1); // Don't know if the issue lies here or in my quickSort method

       System.out.println("Sorted: ");
       System.out.println(Arrays.toString(pokemon));


      
   }


   static void shellSort() {

       Pokemon[] shellSort = pokemon;
       final long shellSortStart = System.nanoTime();

       System.out.println("Unsorted: ");
       System.out.println(Arrays.toString(shellSort));

       PokemonSortAlgorithms.shellSort(shellSort);

       System.out.println("Sorted: ");
       System.out.println(Arrays.toString(shellSort));
       final long shellSortDuration = System.nanoTime() - shellSortStart;
       System.out.println("The Shell sort took " + shellSortDuration + " nanoseconds or " + shellSortDuration/1e9 + " seconds." );
   }

   static void readPokemonCSV() {
       BufferedReader br = null;
       int pokemonCount = 0;
       try
       {
           //Reading the csv file
           br = new BufferedReader(new FileReader("pokemon.csv"));

           //Create List for holding Pokemon objects
           //List<Pokemon> pokemonList = new ArrayList<Pokemon>();

           String line = "";
           //Read to skip the header
           br.readLine();
           //Reading from the second line
           while ((line = br.readLine()) != null)
           {
               String[] pokemonDetails = line.split(",");
               // When the string is split, it will result in an array with the following information in the corresponding index
               // 0 - #
               // 1 - Name
               // 2 - Type1
               // 3 - Type2
               // 4 - Total
               // 5 - HP
               // 6 - Attack
               // 7 - Defense
               // 8 - Sp. Atk
               // 9 - Sp. Def
               // 10 - Speed
               // 11 - Generation
               // 12 - Legendary
               // *Note that pokemonDetails is an array of strings, so it must be cast to the appropriate data type when used in your program

               if(pokemonDetails.length > 0 )
               {
                   //Create a temporary pokemon
                   Pokemon tempPokemon = new Pokemon();

                   tempPokemon.setName(pokemonDetails[1]);
                   tempPokemon.setSpeed(Integer.valueOf(pokemonDetails[10]));
                   tempPokemon.setTotal(Integer.valueOf(pokemonDetails[4]));

                   pokemon[pokemonCount++] = tempPokemon;
                   //pokemon2[pokemonCount++] = tempPokemon;
                   System.out.println(tempPokemon);

               }
           }
       }
       catch(Exception ee)
       {
           ee.printStackTrace();
       }
       finally
       {
           try
           {
               br.close();
           }
           catch(IOException ie)
           {
               System.out.println("Error occured while closing the BufferedReader");
               ie.printStackTrace();
           }
       }

   }
}