

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ratingIssuesTest {
	
	
public static void main(String []args)
{
	
	int userInput = 0;
	String[]topics = {"BorderContols  ", "MoreRefuggees  ", "AirStrikes     ", "CappingWelfare ", "HigerNHSBudgets"};
    int[][]responses= new int[6][11];
   int response; // single response from each user
   int totalResponses = 0;
   int totalUser = 0; //total users ie response
   boolean notFinished = true; 
   int [] highestLowest = new int[5];
  
   Scanner input = new Scanner(System.in);
      while(notFinished)
      {	  
	   totalUser += 1;  // for each question we add one to the total users to calculate the averages later
    System.out.println("Please rate in a scale of 1-10 the magnitude of the following issues of concern in the UK:");
    for (int r= 0; r <5; r++)
    {
    System.out.print(topics[r].trim() + ": ");	  
    response = input.nextInt();
    responses[r][response - 1] += 1;  // adding response to our responses where r is the index of []topics and response is the value entered e.g 7 for a particular index r of topics 
    //which is used in this case to locate the  column to add 1. [r][c] r- row value, c- value entered which correspond to any no b/w 1-10 entered
    }
    
    System.out.print(" Do you want to receive input from another use? (Y/N)");
    if(input.next().equalsIgnoreCase("N"))
    notFinished = false;
    //System.out.print("\033[H\033[2J");
    //System.out.flush();
     
      }  

System.out.println("                1 2 3 4 5 6 7 8 9 10 AVG");
for(int r = 0; r < 5; r++)
{
	
System.out.print(topics[r] + " ");	
for (int c=0; c < 10; c++)
{
System.out.print(responses[r][c]+ " ");
totalResponses += responses[r][c] * (c + 1);
}
highestLowest[r] = totalResponses;// add the total points for each topic
System.out.printf( "%2d"  , totalResponses /totalUser);
System.out.println();
totalResponses = 0;// set total responses again to 0,to be able to  calculate the next topic average otherwise it will keep adding
}

int highest = highestLowest[0];
int lowest = highestLowest[0];
int tempHighest = 0;
int tempLowest = 0;
for(int i=1; i < 5; i++)
{
if(highestLowest[i] > highest)
{
highest = highestLowest[i];
tempHighest = i;
}	

if(highestLowest[i] < lowest)
{
	lowest = highestLowest[i];
    tempLowest = i;
}
 }	
System.out.println();
System.out.printf(" Topic with highsest point total is:  %s\n", topics[tempHighest] );
System.out.printf(" It received %s\n" ,highest + "points" );
System.out.println();
System.out.printf("Topic with lowest point total is :  %s\n", topics[tempLowest] );
System.out.printf("It received %s\n"  ,lowest + "points" );
 }

}





