/**
 * Write a description of class Create here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner; 

public class Create extends Animal 
{
    public void createAnimal()
    {
        String createSpecies;
        String createName;
        int createAge;
        String createColor;
        double createSize;
        String createTricks;
        String createVoice; 
        
        
        Scanner typeInput = new Scanner(System.in);
        
        System.out.println("What species would you like?");
        createSpecies = typeInput.nextLine();
        setSpecies(createSpecies);
        
        System.out.println("What name would you like?");
        createName = typeInput.nextLine();
        setName(createName);
        
        System.out.println("How old would you like?");
        createAge = typeInput.nextInt();
        setAge(createAge);
        
        System.out.println("What color would you like?");
        createColor = typeInput.nextLine();
        setColor(createColor);
        
        typeInput.nextLine();
        
        System.out.println("What size would you like? Please type in numbers.");
        createSize = typeInput.nextDouble();
        setSize(createSize);
        
        typeInput.nextLine();
        
        System.out.println("What tricks do you want it to do?");
        createTricks = typeInput.nextLine();
        setTricks(createTricks);
        
        System.out.println("How do you like it to vocalize?");
        createVoice = typeInput.nextLine();
        setBarkVoice(createVoice);
        
        grammarCheck();
        introduce();
        doTrick();
        wag();
        vocalize();
    }
}
