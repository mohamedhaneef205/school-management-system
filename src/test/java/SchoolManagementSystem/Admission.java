package school_ms;
import java.util.Scanner;
public class Admission {
    public String admissionId;
    public int assignYear=2025;
    public int currentYear;
    public static int totalSeats;
    public int marks=0;
    public double distance;
    public boolean parentInSchool;
    public boolean siblingInSchool;
    public boolean parentTeaPrin;
    public boolean parentOfficer;
    public boolean parentAbroad;
    
    static void totalSeats(int totalSeats){
        totalSeats=totalSeats;
    }
    
    public void CheckForGrade1(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter birthdate : ");
        currentYear=input.nextInt();
        
        if((assignYear-currentYear)>=5){
            System.out.print("Enter distance from school to home : ");
            distance=input.nextInt();
            
            System.out.print("Enter true,if parent is a old student of school :");
            parentInSchool=input.nextBoolean();
            
            System.out.print("Enter true,if a sibling of the student is studing the school :");
            siblingInSchool=input.nextBoolean();
            
            System.out.print("Enter true,if a parent of the student is teacher,principal :");
            parentTeaPrin=input.nextBoolean();
            
            System.out.print("Enter true,if a parent of the student is Army,Navy,Airforce officer :");
            parentOfficer=input.nextBoolean();
            
            System.out.print("Enter true,if a parent of the student is working on abroad :");
            parentAbroad=input.nextBoolean();
            
            
            
            
                
            if (distance<=7){
                    marks=marks+50;
                }
                
            if(parentInSchool==true){
                marks=marks+25;
            }
            
            if(siblingInSchool==true){
                marks=marks+15;
            }
            if(parentTeaPrin==true){
                marks=marks+5;
            }
            if(parentOfficer==true){
                marks=marks+4;
            }
            if(parentAbroad==true){
                marks=marks+1;
            }
            
            
            
        }else{
            System.out.println("School ca't assign the student");
        }   
        
        
                      
    } 
    
    public void marksCheck(){
            System.out.println("Your marks : "+marks);
        }
}