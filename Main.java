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
public class Main {

	public static void main(String[] args) {
		
        Quiz bank = new Quiz();  
        Info info = new Info();  
        info.currentDate(); 
        info.askForName(); 
        bank.bankList(); 
        bank.askQuestion();

		

	}

}
