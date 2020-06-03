
package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    
    private String firstName;
    private String lastName;
    private int classYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int courseCost = 600; 
    private static int id = 1000;
    //Constructor - takes name and year as input
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student first name : ");
        this.firstName = input.nextLine();
        System.out.print("Enter student last name : ");
        this.lastName = input.nextLine();
        System.out.println("1 - Freshman,\n2 - Sophomore,\n3 - Junior,\n4 - Senior\nEnter student class level :");
        this.classYear = input.nextInt();
        
        setStudentID();
       
    }
    
    //Generate id - Grade level + ID
    private void setStudentID(){
        id++;
        this.studentID = classYear + "" + id;
    }
    
    //Enroll in courses
    public void enroll(){
        //Loop until user enters 0
        do{  
            System.out.print("enter course to enroll ( Q to quit ) : ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + courseCost;
            }
            else{
                break;
            }
        }while(1!=0);
    }
    
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is : $" + tuitionBalance);
    }
    
    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter the payment : $");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    
    //Show student status
    public void showStatus(){
        System.out.println("Name : " +firstName+ " " + lastName 
                            + "\nGrade level : " +classYear
                            + "\nStudent ID : " +studentID
                            + "\nCourses enrolled : " +courses
                            + "\nBalance : $" +tuitionBalance);
        
    }
}
