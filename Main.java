import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // create a scanner for user input
Scanner input = new Scanner(System.in);

//integer if cannot be called
int integer = 0;
   //define a variable for the integer 
int number1 = 18;
   //define a variable for the  
int number2 = 15;
 //define a variable for the integer 
 int number3 = 7;

 if(number1 %3 == 0 && number1 %5 == 0){
  System.out.println("Fizzbuzz");
 } 
 else {
 if(number1 %3 == 0){
   System.out.println("Fizz");
 }
 else {
if(number1 %5 == 0)
   System.out.println("Buzz");
else 
   System.out.println("18");
      }       
      }     
 
 if(number2 %3 == 0 && number2 %5 == 0){
  System.out.println("Fizzbuzz");
 } 
 else {
 if(number2 %3 == 0)
   System.out.println("Fizz");
 else {
if(number2 %5 == 0)
   System.out.println("Buzz");
else 
   System.out.println("15");
 }       
 }    
  if(number3 %3 == 0 && number3 %5 == 0){
  System.out.println("Fizzbuzz");
 } 
 else {
 if(number3 %3 == 0)
   System.out.println("Fizz");
 else {
if(number3 %5 == 0)
   System.out.println("Buzz");
else 
   System.out.println("7");
      }       
      }    
  }  
 }
  

 