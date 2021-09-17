package EmployeesPackage;

import java.util.Scanner;

public class SalaryEmployee extends Employee {
    
//    @Override
//    public void computeGross()
//    {
//        Scanner sc = new Scanner(System.in);
//        int input;
//        System.out.println("Standard Employee (S) or Executive (E)? ");
//        input = sc.next().charAt(0);
//        if(input == 'S' || input == 's')
//            
//        {
//            gross = 50_000;
//                    
//        }
//        
//        else if(input == 'E' || input == 'e')
//                {
//                    gross = 100_000;
//                }
//    }
//}

@Override
    public void computeGross() {
         
        int loe; // Level of Employment(General Staff or Executive Staff) = loe
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select '1' for General Staff or '2' for Executive Staff: ");
        loe = sc.nextInt();
        
        switch (loe) {
            
            case 1 -> {
                gross = 50000;
                System.out.println("Your gross salary is $50,000.");
            }
            
            case 2 -> {
                gross = 100000;
                System.out.println("Your gross salary is $100,000.");
            }
            
            default -> System.out.println("Sorry! An error occurred, please try again!");
            
        }
    
            
    }
}