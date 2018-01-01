package MathENTD;
/**********************
Name: Michael Winder

Program Name: MathOP2

Date: 10/23/2017

Purpose: Inherit from MathOP class and add multiply and divide 
         Functionality to program
         
***********************/
// Ok lets make this an abstract class
abstract class MathOP2 {

   public double MathAdd(double firstVar, double secondVar) {
      return firstVar + secondVar;
   }
   public double MathSub(double firstVar, double secondVar){
      return firstVar - secondVar;
   }
   // Multiply method
   public double MathMultiply(double firstVar, double secondVar) {
      return firstVar * secondVar;
   }
   //Divide method
   public double MathDivide(double firstVar, double secondVar) {
      return firstVar/secondVar;
   }
}
