
package school_ms;
public class SubjectMarks extends Marks{
    public String subId;
    public String subName;
    
    SubjectMarks(String studentId,String studentName,String subId,String subName,int marks){
        super(studentId,studentName,marks);
        this.subId=subId;
        this.subName=subName;
    }
    
    
}
