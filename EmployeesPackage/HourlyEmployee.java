package EmployeesPackage;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
    
@Override
    public void computeGross() {
        
        float hoursWorked;
        float hourlyPay;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type in the amount of hours worked: ");
        hoursWorked = sc.nextFloat();
        System.out.println("Type in your hourly wage: ");
        hourlyPay = sc.nextFloat();
        
        if(40.0 >= hoursWorked){
            
        gross = hoursWorked*hourlyPay;  
        
        }else{
            
        gross = (40*hourlyPay) + ((hoursWorked-40)*hourlyPay);
        
        }
        
    }
    }
        
//        @Override
//        public void computeGross()
//        {
//            Scanner sc = new Scanner(System.in);
//            float overtime;
//            
//            System.out.println("How many hours were worked? ");
//            hours = sc.nextInt();
//            
//            System.out.println("Wage per hour?: ");
//            rate = sc.nextInt();
//            
//            //double overtime = 0;
////            if (hours > 40)
////                overtime = (hours - 8) * 1.5;
////            double totalPay = overtime == 0? hours * rate : (overtime + 8) * rate;
////            if(hours > 40)
////            {
////                overtime = hours - 40;
////                overtime = (float)((40 * rate) + (hours - 40)*(rate *1.5));
////                gross = (float) (overtime * rate * 1.5f);
////               
////            }
////
////            else 
////            {
////                overtime = 0;
////                gross = rate * hours;
//
//if(40.0 >= hoursWorked){
//            
//        gross = hoursWorked*hourlyPay;  
//        
//        }else{
//            
//        gross = (40*hourlyPay) + ((hoursWorked-40)*hourlyPay);
//        
//        }
//                
//            }
//    }
//    
//    }
    

