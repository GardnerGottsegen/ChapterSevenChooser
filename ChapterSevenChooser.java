import java.util.Scanner;

public class ChapterSevenChooser
{

   //
   // Specifications for this method are described in
   // Litvin Chapter 7 Exercises #3
   //
   public void printProduct(int n, int m)
   {
      int product = 0;
      System.out.println("The product is " + product + ".");
   }

   //
   // Specifications for this method are described in
   // Litvin Chapter 7 Exercises #9
   //
   public void sumNumbers(int n)
   {
   
   }
   
   //
   // Specifications for this method are described in
   // Litvin Chapter 7 Exercises #21
   //
   public void printCheckerboard(int n)
   {
   
   }
   
   //
   // Specifications for this method are described in
   // Litvin Chapter 7 Exercises #25
   //
   public void coinCombinations(int n)
   {
   
   }
   
   public static void main(String[] args)
   {
      ChapterSevenChooser e = new ChapterSevenChooser();
      Scanner keyboard = new Scanner(System.in);
      int answer = 1;
      int a, b;
      while (answer > 0)
      {
         System.out.println("\nSelect an exercise to print, or 0 to exit:");
         System.out.println(" 1 = product of two integers, without using multiplication");
         System.out.println(" 2 = sum of all integers less than or equal to a given integer");
         System.out.println(" 3 = checkerboard of a given size");
         System.out.println(" 4 = all combinations of coins for a given amount of cents");
         answer = keyboard.nextInt();
         
         switch (answer)
         {
            case 1:
               System.out.println("What is the first integer?");
               a = keyboard.nextInt();
               System.out.println("What is the second integer?");
               b = keyboard.nextInt();
               e.printProduct(a, b);
               break;
            
            case 0:
               System.out.println("Goodbye!");
               break;
               
            default:
               System.out.println("That's not a valid number.");
               break;
         }
      }
   }
}