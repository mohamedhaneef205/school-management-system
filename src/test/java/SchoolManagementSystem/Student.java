package school_ms;

public class Student {
            
    public String studentName;
    private String studentId;
    public String address;
    public String birthday;
    private String parentName;
    private String parentContactNo;
    
    
    
    
    
     public Student(String studentName,String address,String birthday){
        this.studentName = studentName;
        this.address = address;
        this.birthday = birthday;
        }
    
     public void getStudentId(String studentId){
         this.studentId=studentId;
     }
     
     public void getParentName(String parentName){
         this.parentName=parentName;
     }
     
     public void getParentContactNo(String parentContactNo){
         this.parentContactNo=parentContactNo;
     }
    
    
    
    // Additional getters for file storage; original methods are retained.
    public String getStudentId() { return studentId; }
    public String getParentName() { return parentName; }
    public String getParentContactNo() { return parentContactNo; }

        


}
