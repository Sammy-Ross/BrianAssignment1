package EmployeesPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Serializable;

public class Payroll implements Serializable

{
    
    
    
    public static void main(String [] args) throws IOException
            //throws exception in case of error/exception
{
        Payroll myCrew = new Payroll();
        myCrew.SelectMenu();
}
    private OutputStream outStream;
    private InputStream inStream;
    
    Employee[] accounts = new Employee [3];
    
    static Scanner sc = new Scanner(System.in);
    
    public void SelectMenu() throws IOException
            
{
        
    int selection;
    boolean exit = false;
    while (!exit) //while the entry is not option 6(exit), perform the following:
{
            System.out.println("1) Populate employee");
            System.out.println("2) Select employee");
            System.out.println("3) Save employee");
            System.out.println("4) Load employee");
            System.out.println("5) Exit");
            System.out.print("Please select an option: ");
            selection = sc.nextInt();
            
            if (selection < 1 || selection > 5)
{
            System.out.println("Invalid choice. Try again: ");
}

  
        switch(selection)
{
                case 1 -> populate();
                case 2 -> select();
                case 3 -> save();
                case 4 -> load();
                case 5 -> exit = true;
        
}
}
}
    public void populate() // Populate method that has no return value
{
        int selected = 0;
        for(int i = 0; i<accounts.length; i++)
{
            if(accounts[i] == null)
{
                selected = i;
                break;
}
}
        
        int in; //declaring input  - char input to return single-character string.
        System.out.println("Please select employee type: Hourly(1) Salary(2) Comission(3) ");
        in = sc.nextInt(); //next() function returns the next token/word in the input as a string and charAt(0) function returns the first character in that string.
        
        switch (in)
{
            case '1':
            //case 'h':
                accounts[selected] = new HourlyEmployee();
                accounts[selected].computeGross();
                break;
            case '2':
            //case 's':
                accounts[selected] = new SalaryEmployee();
                accounts[selected].computeGross();
                break;
            case '3':
            //case 'c':
                accounts[selected] = new CommissionEmployee();
                accounts[selected].computeGross();
                break;
            default:
                break;
}
}
    
    public void select() throws IOException
{
        try
{
            System.out.println("Please slect an employee 0, 1, 2: ");
            int input = sc.nextInt();
            accounts[input].menu();
}
        
        catch(Exception ioe)
{
            System.out.println("Please select a different employee");
            System.out.println(" ");
            select();
}
            
}
    
    /**
     *
     * @throws java.io.IOException
     */
    public void save() throws IOException
    {
        
            {
            try (FileOutputStream fos = new FileOutputStream("file1.out")) {
                ObjectOutputStream oos = new ObjectOutputStream(outStream);
                oos.writeObject(accounts);
                oos.flush();
            }
            
            catch(Throwable e)
{
            System.err.println(e); }
        }            
//            File f = new File("/Untitled/Users/samross/Desktop/Test");
//            f.createNewFile();            
//            File f = new File("/Untitled/Users/samross/Desktop/Test");
//            f.createNewFile();

File myFile = new File(System.getProperty("user.home"), "file.txt");
            
File f = new File("/Users/samross/Desktop/Test");
        f.createNewFile();
        
    }
    public void load() throws IOException
{
        try
{
            FileInputStream istream = new FileInputStream("file1out.txt");
            ObjectInputStream oistream = new ObjectInputStream(inStream);
            accounts = (Employee[])oistream.readObject();
            oistream.close();
}
        catch(Exception ioe)
{
            System.out.println(ioe.getMessage());
}
}
        
}

    
    
        
        
        
       


