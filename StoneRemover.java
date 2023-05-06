/**
 * Author - Debag101
 * Purpose - Stone Removing simulation
 * Date - 6 - 5 - 2023
 */

 //Importing the Random class to get random number of stones within the fixed bound
import java.util.Random;

public class StoneRemover 
{
    //Generating Random obj
    static Random rand = new Random();
    //Player1 and Player2 names for ease of code
    static String Player1;
    static String Player2;

    //The simulation method
    //inputtting number of stones and checking whether it is odd or not
    public static void Simulation(int stones,boolean isEven) throws InterruptedException
    {
        //Threshold limit to check how close we are to the end of the pile
        int threshold = (int)(stones  * 0.9);
        //Loser string to hold name of loser
        String loser = "";
        //Looping over number of stones to create an IRL experience
        for(int i=1; i <= stones; i++)
        {   
            //If i == threshold it means we are close to the end
            if(i == threshold)
                System.out.println(">> Almost at the end of the pile!!!!!!!!!!!!\n ");
                //Sleep function to add realism
                Thread.sleep(3000);
            
            //If we are at the end of pile
            if(i==stones)
            {
                //if number of stones is even then whoever went first loses
                if(isEven)
                    loser = Player2;
                //Else whoever went first wins
                else
                    loser = Player1; 
                //Informing user about end of game  
                System.out.println("Oh no!! No more rocks left !");
                //Printing who lost
                System.out.printf("%s Loses the game! Hard luck !\n",loser);
            }
            //If we are not at end of pile we continue with simulation
            else{
                if(i % 2 != 0)
                    System.out.printf("%s Picks up the rock !\n Time for %s\n",Player1,Player2);
                else
                     System.out.printf("%s Picks up the rock !\n Time for %s\n",Player2,Player1);
                //Again sleep to add realism
                Thread.sleep(500);
            }

        }
        //Printing how many rocks there were actually
        System.out.printf("(-)There were a total of %d rocks",stones);
    }
    public static void main(String[] args)throws InterruptedException {
        //Creating random number of stones from 5 to 60
        int stones = rand.nextInt(5,61);
        //Choosing who goes first
        int choice = rand.nextInt(1,3);

        //Setting strings to names
        System.out.println("(-)Stones have been added to the pile ");
        if(choice == 1){
            Player1 = "Bob";
            Player2 = "Alice";
        }
        else{
            Player1 = "Alice";
            Player2 = "Bob";
        }
        //Announcing who goes first
        System.out.printf("%s goes first\n!",Player1);
        //Starts simulation
        Simulation(stones,stones % 2 == 0);
        //End of code
    }    
}
