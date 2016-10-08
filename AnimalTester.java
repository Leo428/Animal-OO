/**
 * It is a dog tester
 *
 * @author Zheyuan Hu
 * @version 9/14/2016
 */

import java.util.Scanner;
public class AnimalTester
{
    public static void tester()
    {
        String startWords1;
        String endWords1;
        Scanner typeInput = new Scanner(System.in);
        do
        {
            System.out.println("Enter \"cat1 or dog2\" to start the test.");
            startWords1 = typeInput.nextLine();
            if (startWords1.equalsIgnoreCase("cat1"))
            {
                Cat1 catOne = new Cat1();
                catOne.cat1();

            }
            else if (startWords1.equalsIgnoreCase("dog2"))
            {
                Dog2 dogTwo = new Dog2();
                dogTwo.dog2();
            }
            //end of if
            System.out.println("Enter \"quit\" to go back to the menu, if you want to continue, please press enter!");
            endWords1 = typeInput.nextLine();
        } while(!endWords1.equalsIgnoreCase("quit"));
        //do while ends
    }
    
    


    public static void main(String[] args)
    {
        String chooseWords;
        String startWords1;
        String endWords2;
        String startWords3;
        String endWords3;
        Scanner typeInput = new Scanner(System.in);
        do
        {
            System.out.println("This is a Animal Tester.");
            System.out.println("Choose if you want to create an animal or test the defult animals.");
            System.out.println("1. Create");
            System.out.println("2. Test");
            chooseWords = typeInput.nextLine();
            if(chooseWords.equalsIgnoreCase("1"))
            {
                Create create1 = new Create(); 
                create1.createAnimal();
            }
            
            else if(chooseWords.equalsIgnoreCase("create"))
            {
                Create create1 = new Create(); 
                create1.createAnimal();
            }
            
            else if(chooseWords.equalsIgnoreCase("test"))
            {
              tester();
            }

            else if(chooseWords.equalsIgnoreCase("2"))
            {
              tester();
            }// end of if

            System.out.println("Enter \"end\" to end the test, if you want to continue, please press enter!");
            endWords3 = typeInput.nextLine();
        } while(!endWords3.equalsIgnoreCase("end"));
    }
}
