package Mat18th;

//c++ code to reverse a stack using recursion

import java.util.Stack;

public class StackReverse
{
  static Stack st = new Stack();
   
  static void pushAtBottom(int x){

      if(st.isEmpty())
          st.push(x);

      else{
          int a = (Integer)st.peek();
          st.pop();
          pushAtBottom(x);
          st.push(a);
      }
  }
   
  static void  reverse()
  {
      if(st.size()>0)
      {
          int x = (int)st.peek();
          st.pop();
          reverse();
          pushAtBottom(x);
      }
  }

   
  // Driver method
  public static void main(String[] args) 
  {
       //push elements into the stack
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
       
      System.out.println("Original Stack");
       
      System.out.println(st);
       
      //function to reverse the stack
      reverse();
       
      System.out.println("Reversed Stack");
       
      System.out.println(st);
  }
}