
package school_ms;

public class School_MS {

    public static void main(String[] args) {
        
        //admin
        //admin assign teachers
        Teacher t1 = new Teacher("wasana","kandyjgtrt");
        t1.getTeacherId("ST44854");
        t1.getNic("231516652");
        
        //admin assign student
        Student s1 = new Student("ead","s01","2006/08/09");
        s1.getStudentId("dvjhhscnsin");
        s1.getParentName("shudffb");
        s1.getParentContactNo("hubdv");
        
        //admin set grade of students
        Grade g1=new Grade();
        g1.getStudentId("jhdbvj");
        g1.getGrade("sdhuyf");
        
        //Teacher set details for StudentProfile
        StudentProfile sp1=new StudentProfile();
        sp1.setStudentId("jnsdmmn");
        sp1.setStudentName("amila");
        sp1.setStudentBirthDate("202052mmn");
        sp1.setStudentAddress("117 a");
        sp1.setAchievements("good");
        sp1.setBehaviour("jgood");
        sp1.setAverageMarks(51.50);
        
        //admin creates property object and update
        PhysicalProperties pro1=new PhysicalProperties("55616","chair");
        
         //teacher upload assignment
        TeacherAssignment a1 = new TeacherAssignment("a01","stat","2026/09/05");
        a1.setLink("hbkdvhjkdafg");
        
        //admin can download student's assignment
        System.out.println("Dear admin,you can download the assignment");
        System.out.println(a1.getAssiId());
        System.out.println(a1.getAssignmentLink());
        System.out.println(a1.getDate()+"\n");
        
        //teacher upload marks
        Marks m1 = new AssignmentMarks("515","amaya","stat","Statiti",78);//polymoprism
        Marks m2 = new SubjectMarks("studentId","studentName","subId","subName",202);//polymoprism
        
        
        //admin gets stuents marks for subjects
        System.out.println("Student's marks");
        System.out.println(m2.getStudentId());
        System.out.println(m2.studentName);
        System.out.println(m2.marks);
        
        //admin gets details from studentProfile
        System.out.println(sp1.getStudentId());
        System.out.println(sp1.getStudentName());
        System.out.println(sp1.getStudentBirthDate());
        System.out.println(sp1.getStudentAddress());
        System.out.println(sp1.getAchievements());
        System.out.println(sp1.getBehaviour());
        System.out.println(sp1.getAverageMarks());
        
        
        //teacher set classname and date for mark attendance
        Attendance.setClass("10");
        Attendance.setDate("5116");
        Attendance.setCount(0);
        
         //attendance object and assign details using finger print
        Attendance att1=new Attendance("jdnshnf","52.20");  
        
        
        
        
        
        
        
        
        
        Admission ad1=new Admission();
       
        
        
        
      
       
        
            
       
            
        
        
        
          
        
           
            
        
            //admin check a student
        ad1.CheckForGrade1();
            //admin set total seats for school
        Admission.totalSeats(100);
            //marks
        ad1.marksCheck();
        
        
            
            
    }
    
}
