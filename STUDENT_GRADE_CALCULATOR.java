
import java.util.Scanner;

public class STUDENT_GRADE_CALCULATOR {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects you have!?");
        int numofsubjects = scanner.nextInt();
        int marks[] = new int[numofsubjects];//initializing  array to store values //way..
        int totalmarks = 0;
        for(int i = 0; i< numofsubjects; i++)
        {
        System.out.println("enter the marks for the subject "+(i+1)+" out of 100" );
        marks[i] = scanner.nextInt();
        if(marks[i] < 0 || marks[i] >100)
        {
            System.out.println("inavlid marks are entered please enter value between 1 to 100!!");
            i--;
            //This ensures the current subject's marks (at index i) are asked again, 
            // instead of moving to the next subject.
            continue;
        }
        totalmarks += marks[i];
        }
        double avgpercentage = (double)totalmarks/ numofsubjects;//(double) used for typecasting
        
        char grade;
        if(avgpercentage>90)
        {
            grade = 'A';
        }
        else if(avgpercentage >80)
        {
            grade = 'B';
        }
        else if(avgpercentage > 70)
        {
            grade = 'C';
        }
        else{
            grade = 'F';
        }
        System.out.println("---RESULT---");
        System.out.println("TOTAL MARKS = "+totalmarks);
        System.out.println("AVERAGE PERCENTAGE = "+avgpercentage+"%");
        System.out.println("GRADE =" +grade);
        scanner.close();
    }
}
