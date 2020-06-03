
package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    
    public static void main(String[] args){
        
        //Ask how many students to be added
        System.out.print("Enter the number of new students : ");
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        Student[] students = new Student[numOfStudents];
        
        //Create students
        for(int i = 0;i < numOfStudents;i++){
           students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            students[i].showStatus();
        }
    }
    
}
