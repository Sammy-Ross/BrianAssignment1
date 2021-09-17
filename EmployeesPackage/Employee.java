package EmployeesPackage;

import java.io.Serializable;
import java.util.Scanner;


public class Employee implements Serializable
  
{
   
    float rate = 30.0f;
    float taxrate = .2f;
    int hours = 45;
    float gross = 0.0f;
    float tax = 0.0f;
    float net = 0.0f;
    float net_percent = 0.0f;
   

public Employee() //employee method
{

}

public void menu() //menu inherited by all employees

{

    Scanner sc = new Scanner(System.in);
    
    int selection;
    
    boolean exit = false; //boolean to test if false
    while(!exit)          //while not exiting, perform the following:
{
        System.out.println("1) Calculate Gross Pay");
        System.out.println("2) Calculate Tax");
        System.out.println("3) Calculate Net Pay");
        System.out.println("4) Calculate Net Percent");
        System.out.println("5) Display All");
        System.out.println("6) Exit");
        System.out.println("Please select an option");
        selection = sc.nextInt();
        if (selection < 1 || selection > 6) //if statement for anything aside 1-6
{
            System.out.println("Invalid choice.  Please try again: ");
}
        switch(selection) //initializing switch statement
{
            case 1 -> computeGross();
            case 2 -> computeTax();
            case 3 -> computeNet();
            case 4 -> computeNetperc();
            case 5 -> displayAll();
            case 6 -> exit = true;
                
        
}
}
    
}

// methods to execute wage calculations
public void computeGross()

{
gross = rate*hours;
      
}

protected void computeTax()

{
tax = gross*taxrate;
}

protected void computeNet()
{
    net = gross-tax;
}

protected void computeNetperc()
 
{
    net_percent = (net/gross)*100;
}


    protected void displayAll() //displaying all calculations for employee
        
{
    computeGross();
    computeTax();
    computeNet();
    computeNetperc();


    System.out.println("Hours: " + hours);
    System.out.println("Rate: " + rate);
    System.out.println("Gross: " + gross);
    System.out.println("Net: " + net);
    System.out.println("Net%: " + net_percent + "%");
}

    void writeSerializedArray() 
{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

    void writeAcct() 
{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
        
}

