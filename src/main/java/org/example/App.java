package org.example;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        /* P1
        Create a String with your first name as content . Print out the String object to the console*/
//        System.out.println( "Mattias" );

        /* P2
        Create two Strings. One with your first name and the other with your
        last name . Print out both Strings to the console with a ” ” separating them*/
/*        String first ="Mattias";
        String last ="Andersson";
            System.out.println(first+" "+last);
*/
        /* P3
        Create two variables with decimal values . Create a third decimal
        variable called result . Assign the sum of the two first variables to result
         */
/*        double num1 = 1.1;
        double num2 = 2.2;
        double result = num1+num2;
            System.out.println(result);
*/
        /* P4
        Create a class called Car. The class should contain the following
        information. Car brand, registration number , max speed and owner name.
        Instantiate an Object of the class and assign values to the object.
         */
/*        Car MB = new Car();                     //Get class add new input to Car class
                MB.brand = "Mercedes Benz";
                MB.maxSpeed = "100 mph";
                MB.regNr = "ABC123";
                MB.ownerName ="Nisse Hult";
        System.out.println(MB.getInfo());       //Print added information via Car class

        Car bmw = new Car();
                bmw.brand = "BMW";
                bmw.maxSpeed = "150 mph";
                bmw.regNr = "CBA321";
                bmw.ownerName = "Marcus Persson";
        System.out.println(bmw.getInfo());
*/
        /* P5
        Make an integer called score and assign a value to it. Create an if
        else statement that should print out you passed ” if the score is
        above or equals to 65. If score is below 65 it should print ” you did not pass”.
         */
/*        Scanner objScore = new Scanner(System.in);    //Scanner object
            System.out.println("Score:");               //Ask for score
                int score = objScore.nextInt();         //Read input and Save score in an integer
        if (score >= 65) {
            System.out.println("You passed");
        } else {
            System.out.println("You did not pass");
        }
*/
        /* P6
        Being a developer you need to learn how to search for information on
        the Internet. Open up a web browser and search for ”java input from user

        Use your new knowledge to take a String as input from the user and store it in
        a String object
         */
        Scanner objString = new Scanner(System.in);
            System.out.println("Name");
                String name = objString.nextLine();
            System.out.println("Nice to meet you "+name+"!");


    }
}
