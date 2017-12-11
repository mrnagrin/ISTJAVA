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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Info {
	private String fName;
	private String lName;
	
	//Sets first name
	public void setfName(String firstName){
		this.fName = firstName;
	}
	
	//Sets last name
	public void setlName(String lastName){
		this.lName = lastName;
	}
	
	// gets first name
	public String getfName(){
		return fName;
	}
	
	// sets first name
	public String getlName(){
		return lName;
	}
	
	
	//Prints out current date.
	public void currentDate(){
		//Sets date format as MM/DD/YYYY
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}
	
	//Asks for First and Last Name.
	public void askForName()
	{
		Scanner nameEnter = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		//Sets First Name
		
		setfName(nameEnter.nextLine());
		System.out.println("Please enter your last name: ");
		
		//Sets Last Name
		setlName(nameEnter.nextLine());
		
		//Prints out name
		System.out.println("Your full name is: " + getfName() + " " + getlName());
	}
	
}