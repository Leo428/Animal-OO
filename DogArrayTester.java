import java.util.Scanner; 
/**
 * Array Dog Tester
 * 
 * @author Zheyuan Hu 
 * @version 10/5/2016
 */
public class DogArrayTester 
{
    public static void main(String[] args)
    {
        int dNumber; 
        String[] names = {"Mike","Jack","Tom","Kevin","Peter"};
        
        String[] colors = {"Green", "Red", "Yellow", "Pink", "White", "Black"}; 
        
        int[] ages = {1,2,3,4,5};
        
        int[] sizes = {5,6,7,3,2}; 
        
        String endWords; 
        
        Scanner typeInput = new Scanner(System.in);
        do
        {         
            dNumber = 5; 
            Animal dArray[] = new Animal[dNumber]; 
            for(int i = 0; i < dArray.length; ++i)
            {
                dArray[i] = new Animal(); 
                dArray[i].setName(names[i]); 
                dArray[i].setBarkVoice("汪");
                dArray[i].setSpecies("dog");
                dArray[i].setColor(colors[i]);
                dArray[i].setTricks("shake your paws and lick your face");
                dArray[i].setAge(ages[i]);
                dArray[i].setSize(sizes[i]);
                dArray[i].grammarCheck();
                dArray[i].introduce();
                dArray[i].doTrick();
                dArray[i].wag();
                dArray[i].vocalize();
            }
            System.out.println("Enter end to quit or press enter to continue!");
            endWords = typeInput.nextLine(); 
        }while(!endWords.equalsIgnoreCase("end")); 
    }
}
