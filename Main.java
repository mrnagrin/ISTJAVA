import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/// Bringing in the list from IST311Project 
        Question test = new Question();
        Info info = new Info();  
        info.currentDate(); 
        info.askForName(); 
        test.bankList(); 

        
        Question Quest = new Question();  
        Quest.bankList();  
         
        
        
        Scanner input = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        String again;
    	/// Do while loop
        do {   
        System.out.println("________________________________________");
        System.out.println(" Welcome to IST 311 Project Quiz Random Maker");
        System.out.println("________________________________________"); 
        System.out.println("How many question do you want to do(min 5, max 15): ");
        test.getQuestion(input.nextInt());
       
         
        /// calculating int to doulbe for the percentage
        double correctD = (double) test.correct;
        double numberD = (double) test.number - 1;
        double finalTotal = correctD / numberD * 100;
        System.out.println("_______________________________________");  
        info.currentDate();
        System.out.println("Name: " + info.getfName() + " " + info.getlName());
        System.out.printf("Your score is %d/%d%n", test.correct, test.number - 1);
        System.out.printf("Your Percentage: %.2f ", finalTotal);
        System.out.print("%");
        System.out.println("\n________________________________________");
        System.out.println("Do you wish to try this quiz again?(Y or N)");
        again = reader.nextLine();
    	}while(again.equalsIgnoreCase("Y"));

		

	}


}