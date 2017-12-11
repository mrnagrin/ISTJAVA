import java.util.Arrays;  
import java.util.List;
import java.util.Scanner;
import java.util.Collections;  

public class Question 
{ 
    String question; 
    String answer; 
    Question[] quizQuest = new Question[15];  
    List<Question> quizList = Arrays.asList(quizQuest); 
    int correct=0;
    int number;
    
    //list for question and added the question and answer
	public void bankList()  
    { 	
    	quizQuest[0] = new Question();  
    	quizQuest[0].question = "Which is the Land of the Rising Sun: \nA)Australia \nB)China \nC)Japan"; 
    	quizQuest[0].answer = "C";  
         
    	quizQuest[1] = new Question();  
    	quizQuest[1].question = "The largest ocean in the world is: \nA)The Antarctic \nB)The Pacific \nC)The Alantic"; 
        quizQuest[1].answer = "B";       
         
        quizQuest[2] = new Question();  
        quizQuest[2].question = "Kalahari Desert is in: \nA)Chile \nB)South Africa \nC)Saudi Arabia";  
        quizQuest[2].answer = "B";  
         
        quizQuest[3] = new Question();  
        quizQuest[3].question = "Second world War began in:  \nA)1938 \nB)1931 \nC)1940";  
        quizQuest[3].answer = "A"; 
         
        quizQuest[4] = new Question();  
        quizQuest[4].question = "The largest gland in the human body is:  \nA)Pituitary \nB)Adrenal \nC)Liver"; 
        quizQuest[4].answer = "C";  
         
        quizQuest[5] = new Question();  
        quizQuest[5].question = "The chemical name of common salt is:  \nA)Sodium Choride \nB)Potassium Choride \nC)Calcium Carbonate"; 
        quizQuest[5].answer = "A";  
         
        quizQuest[6] = new Question();  
        quizQuest[6].question = "Who are the guardians of Fundamental rights:  \nA)Supreme Cort & High Court \nB)The President \nC)The Prime Minister"; 
        quizQuest[6].answer = "A";    
         
        quizQuest[7] = new Question();  
        quizQuest[7].question = "How many colors in a rainbow \nA)7 \nB)10 \nC)6";   
        quizQuest[7].answer = "A";     
         
        quizQuest[8] = new Question();  
        quizQuest[8].question = "How many colors in the US flag \nA)2 \nB)3 \nC)18";  
        quizQuest[8].answer = "B";  
         
        quizQuest[9] = new Question(); 
        quizQuest[9].question = "The longest mountain range in the world is \nA)The Alps \nB)The Rockie \nC)The Andes";  
        quizQuest[9].answer = "C";   
        
        quizQuest[10] = new Question();
        quizQuest[10].question = "Which one of the following is an element: \nA)Sapphire \nB)Ruby \nC)Dimond  ";
        quizQuest[10].answer= "C";
        
        quizQuest[11] = new Question();
        quizQuest[11].question = "The planet nearest to the sun is: \nA)Mercury \nB)Venus \nC)Earth ";
        quizQuest[11].answer= "A";
        
        quizQuest[12] = new Question();
        quizQuest[12].question = "Which vitamin is abundant in citrus fruit: \nA)Vitamin A \nB)Vitamin B \nC)Vitamin C";
        quizQuest[12].answer= "C";
        
        quizQuest[13] = new Question();
        quizQuest[13].question = "The most populous city in the world is: \nA)Tokyo \nB)London \nC)Paris";
        quizQuest[13].answer= "A";
        
        quizQuest[14] = new Question();
        quizQuest[14].question = "Where is the Sea of Tranquility found at: \nA)The Moon \nB)Earth \nC)Mars";
        quizQuest[14].answer= "A";
        
        /// took the collection of question and shuffled it to make it random
        Collections.shuffle(quizList);  
    }
	
	/// Method of how many question you want on the quiz and added scoring system.
	public void getQuestion(int howMany){
        Scanner answ = new Scanner(System.in);

        for (number = 1;number<= howMany; number++)
        { 
            System.out.printf("%d. %s%n", number,quizQuest[number].question);
            String entered = answ.nextLine().toUpperCase();
             
            if (entered.compareTo(quizQuest[number].answer)==0)
            { 
                System.out.println("Correct Answer"); 
                correct = correct + 1;
            }
            else 
                System.out.println("Incorrect Answer");  
        }  

}
}