package May19;

import java.util.Scanner;
public class PigLatin {
   public static void main(String[] args) {
       String word;
       Scanner CC = new Scanner(System.in);
       word = CC.nextLine();
       String[] sWords = word.split("[\\s@&.?$+-]+");
       String[] tWords = translate(sWords);
       print(tWords);
   }
   public static String[] translate(String[] words) {
       int X, j, index = 0;
       for (X = 0; X < words.length; X++)

       {
           String translate = "";
           String rem;
           index = findFirstVowel(words[X]);
           if (index != -1) {

               if (index == 0) {
                   words[X] = words[X] + "ay";
               } else {
                   for (j = 0; j < index; j++) {
                       translate = translate + words[X].charAt(j);
                   }
                   rem = words[X].substring(index, words[X].length());
                   words[X] = rem + translate + "ay";
               }
           }
       }
       return words;
   }

   public static int findFirstVowel(String s) {

       int X;
       char ch;
       for (X = 0; X < s.length(); X++)

       {
           ch = s.charAt(X);
           if (isVowel(ch)) {
               return X;
           } else if (X > 0 && ch == 'y')
           {
               return X;
           }
       }
       return -1;
   }

   public static boolean isVowel(char c) {
       if (c == 'a' || c == 'e' || c == 'X' || c == 'o' || c == 'u')

       {
           return true;
       } else {
           return false;
       }
   }

   public static void print(String[] words) {
       int X;
       for (X = 0; X < words.length; X++) {
           System.out.println(words[X]);
       }
   }
}