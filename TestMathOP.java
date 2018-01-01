package MathENTD;
/****************************
Name: Michael Winder

Program Name: TestMathOP.java

Date: 10/20/2017

Purpose: Get user input and call MathOP.java to handle the 
         addition and subtraction.
         
*****************************/
import java.util.*;
import java.io.*;

public class TestMathOP extends MathOP2 implements MathOP {
   public static void main(String[] args){
     
      // Lets use the class
      TestMathOP math = new TestMathOP();
      
      //need somewhere to store the answers
      double add;
      double sub;
      double multi;
      double divide;
      
      //Declare some variables
      double x = 0;
      double y = 0;
      String s = "";
      
      //Welcome everyone to the program   
      System.out.println("Welcome to the Test Math Program\n");

      //Scanner class for taking input
      Scanner scan = null;
      int finish = 0;
          
         //Let's loop until the user decides they are done
         while (finish == 0) {
            try {
               scan = new Scanner(System.in);
               //Let's get the Users input for first variable
               System.out.println("Enter the First Number >> ");
               x = scan.nextDouble();
               //Get users second variable
               System.out.println("Enter the Second Number >> ");
               y = scan.nextDouble();
               //Now we need the operator to use
               System.out.println("Enter Operator (+,-,*,/) >> ");
               s = scan.next();
               //Perform the proper equation
               if (s.equals("+")) {
                  add = math.MathAdd(x,y);
                  System.out.println("The answer is >> " + add);
               }
               else if (s.equals("-")) {
                  sub = math.MathSub(x,y);
                  System.out.println("The answer is >> " + sub);
               }
               else if (s.equals("*")) {
                  multi = math.MathMultiply(x,y);
                  System.out.println("The answer is >> " + multi);
               }
               else if (s.equals("/")) {
                  if (y == 0) {
                     System.out.println("Can not divide by Zero, please try again");
                     finish = 0;
                  } else {
                     divide = math.MathDivide(x,y);
                     System.out.println("The answer is >> " + divide);
                  }
               }
             }// End try
             catch (Exception e) {
               System.out.println("Error: " + e.getMessage());
               //make sure we look for another input first
               scan.next();
             }
             finally {  
             //Do we want to run again???
               System.out.println("Do you want to exit? (Y=1/N=0)");
               finish = scan.nextInt(); //Get the input
               if (finish == 1) {
                  System.out.println("Thanks for using our system");
                  break;
               }
               else {
                  System.out.println("Running again");
               }
             }//End finally
         } //End while statment
         scan.close();
   }//End void main
}

