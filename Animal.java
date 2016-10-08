/**
 * Animal OO Exmaple
 * ----------------------------------------- *
 * @author Zheyuan Hu
 * @version 9/12/2016
 */

public class Animal
{
    private String species;
    private String name;
    private String color;
    private String barkVoice;
    private String tricks;
    private int age;
    private String grammarC;
    private double size;
    // set up the data

    /**
     * There is a reason for me to not use numbers of dogs' legs, Because dogs all have 4 legs!!!!!!!!!
     * I don't think anyone would like to feed a 3 legs dog!!!!!!!
     */

    /////////////////////
    public void setSpecies(String newSpecies)
    {
      species = newSpecies;
    }

    public String getSpecies()
    {
      return species;
    }
    ////////////////////
    public void setName(String newName)
    {
      name = newName;
    }

    public String getName()
    {
      return name;
    }
    ////////////////
    public void setColor(String newColor)
    {
      color = newColor;
    }

    public String getColor()
    {
      return color;
    }
    //////////////
    public void setBarkVoice(String newBarkVoice)
    {
      barkVoice = newBarkVoice;
    }

    public String getBarkVoice()
    {
      return barkVoice;
    }
    ////////////
    public void setTricks(String newTricks)
    {
      tricks = newTricks;
    }

    public String getTricks()
    {
      return tricks;
    }
    /////////////
    public void setAge(int newAge)
    {
        if(newAge > 0)
        {
            age = newAge;
            
        }
        
        else
        {
            age = 1;
        }
    }

    public int getAge()
    {
      return age;
    }
    //////////
    public void setGrammarC(String newGrammarC)
    {
      grammarC = newGrammarC;
    }

    public String getGrammarC()
    {
      return grammarC;
    }
    /////////////
    public void setSize(double newSize)
    {
      size = newSize;
    }

    public double getSize()
    {
      return size;
    }
    
    /**
     * this is the code to get access to the private values!!!
     */

    

    public void grammarCheck()
    {
        if(age == 1)
        {
            grammarC = " year old";
        }

        else
        {
            grammarC = " years old";
        }//end of if
    }//end of method
    /**
     * proundly introduce, this is a grammar checker, corrects the case like 1 years old to 1 year old!!!!!!!!!
     * I am so happy now!!!!!
     */

    public void introduce()
    {
        System.out.println("This is my " + species + " " + name + ", " + "it is " + color + ", it is " + age + grammarC + ", it is " + size + " feet long." );
    }// introduce method

    public void doTrick()
    {
         System.out.println("It can " + tricks + " !");
    }// do trick method

    public void wag()
    {
         System.out.println("I don't know what the word wag means!");
    }// wag method

    public void vocalize()
    {
         System.out.println(barkVoice);
    }// vocalize method

}
