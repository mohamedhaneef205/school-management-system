package school_ms;
public class TeacherAssignment extends Assignment{
    private String link;
    
    public TeacherAssignment(String assiId,String subName, String date){
        super(assiId,subName,date);
    }
    public void setLink(String link){
        this.link=link;
    }
    
     
    public String getAssignmentLink(){
           return link;
    }
        
}
