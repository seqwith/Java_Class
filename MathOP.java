package MathENTD;
/************************
Name: Michael Winder

Program Name: MathOP.java

Date: 10/20/2017

Purpose: Create a class that handles the addition and subtraction
         of two numbers.
         
************************/
// Let's make this an interface
interface MathOP {
   // compute the addition method
   // Compiler will see this as abstract
   abstract double MathAdd(double firstVar, double secondVar);
   //compute the subtraction method
   //Compiler will see this as abstract
   abstract double MathSub(double firstvar, double secondVar);
   // Multiply method
   //Compiler will see this as an abstract
   abstract double MathMultiply(double firsVar, double secondVar);
   //Divide method
   //Compiler will see this as an abstract
   abstract double MathDivide(double firstVar, double secondVar);
}