/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist.pkg311.pkgfinal.project;

/**
 *
 * @author Zabeeh
 */
import java.util.Arrays;  
import java.util.List;  
import java.util.Scanner;  
import java.util.Collections;  

public class Quiz {
    String question; 
    String answer; 
    int correct=0;
    int number;
    int howMany;
    Quiz[] quizBank = new Quiz[15];  
    List<Quiz> quizList = Arrays.asList(quizBank); 
    
    public void bankList()  
    { 
        quizBank[0] = new Quiz();  
        quizBank[0].question = "Which is the Land of the Rising Sun: \nA)Australia \nB)China \nC)Japan"; 
        quizBank[0].answer = "C";  
         
        quizBank[1] = new Quiz();  
        quizBank[1].question = "The largest ocean in the world is: \nA)The Antarctic \nB)The Pacific \nC)The Alantic"; 
        quizBank[1].answer = "B";       
         
        quizBank[2] = new Quiz();  
        quizBank[2].question = "Kalahari Desert is in: \nA)Chile \nB)South Africa \nC)Saudi Arabia";  
        quizBank[2].answer = "B";  
         
        quizBank[3] = new Quiz();  
        quizBank[3].question = "Second world War began in:  \nA)1938 \nB)1931 \nC)1940";  
        quizBank[3].answer = "A"; 
         
        quizBank[4] = new Quiz();  
        quizBank[4].question = "The largest gland in the human body is:  \nA)Pituitary \nB)Adrenal \nC)Liver"; 
        quizBank[4].answer = "C";  
         
        quizBank[5] = new Quiz();  
        quizBank[5].question = "The chemical name of common salt is:  \nA)Sodium Choride \nB)Potassium Choride \nC)Calcium Carbonate"; 
        quizBank[5].answer = "A";  
         
        quizBank[6] = new Quiz();  
        quizBank[6].question = "Who are the guardians of Fundamental rights:  \nA)Supreme Cort & High Court \nB)The President \nC)The Prime Minister"; 
        quizBank[6].answer = "A";    
         
        quizBank[7] = new Quiz();  
        quizBank[7].question = "How many colors in a rainbow \nA)7 \nB)10 \nC)6";   
        quizBank[7].answer = "A";     
         
        quizBank[8] = new Quiz();  
        quizBank[8].question = "How many colors in the US flag \nA)2 \nB)3 \nC)18";  
        quizBank[8].answer = "B";  
         
        quizBank[9] = new Quiz(); 
        quizBank[9].question = "The longest mountain range in the world is \nA)The Alps \nB)The Rockie \nC)The Andes";  
        quizBank[9].answer = "C";   
        
        quizBank[10] = new Quiz();
        quizBank[10].question = "Which one of the following is an element: \nA)Sapphire \nB)Ruby \nC)Dimond  ";
        quizBank[10].answer= "C";
        
        quizBank[11] = new Quiz();
        quizBank[11].question = "The planet nearest to the sun is: \nA)Mercury \nB)Venus \nC)Earth ";
        quizBank[11].answer= "A";
        
        quizBank[12] = new Quiz();
        quizBank[12].question = "Which vitamin is abundant in citrus fruit: \nA)Vitamin A \nB)Vitamin B \nC)Vitamin C";
        quizBank[12].answer= "C";
        
        quizBank[13] = new Quiz();
        quizBank[13].question = "The most populous city in the world is: \nA)Tokyo \nB)London \nC)Paris";
        quizBank[13].answer= "A";
        
        quizBank[14] = new Quiz();
        quizBank[14].question = "Where is the Sea of Tranquility found at: \nA)The Moon \nB)Earth \nC)Mars";
        quizBank[14].answer= "A";
        
        
        Collections.shuffle(quizList);  
    } 
     
    
    public void askQuestion()
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("________________________________________");
        System.out.println(" Welcome to IST 311 Project Quiz Random Maker");
        System.out.println("________________________________________"); 
        System.out.println("How many question do you want to do(min 5, max 15): ");
        int howMany = input.nextInt();
        Scanner answ = new Scanner(System.in);
       
         
        for (number = 1;number<= howMany; number++)
        { 
            System.out.printf("%d. %s%n", number, quizBank[number].question);
            String entered = answ.nextLine().toUpperCase();
             
            if (entered.compareTo(quizBank[number].answer)==0)
            { 
                System.out.println("Correct Answer"); 
                correct = correct + 1;
            }
            else 
                System.out.println("Incorrect Answer");  
        }  
        double correctD = (double) correct;
        double numberD = (double) number - 1;
        double finalTotal = correctD / numberD * 100;
        System.out.println("_______________________________________");  
        System.out.printf("Your score is %d/%d%n", correct, number - 1);
        System.out.println("Your Percentage: " +finalTotal + "%");
        System.out.println("________________________________________");  
    } 

	

}