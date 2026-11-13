
package school_ms;
public class AssignmentMarks extends Marks{
    public String assiId;
    public String date;
    
    
    
    AssignmentMarks(String studentId,String studentName,String assiId,String date,int marks){
        super(studentId,studentName,marks);
        this.assiId=assiId;
        this.date=date;
        
        
    }
    
    
}
