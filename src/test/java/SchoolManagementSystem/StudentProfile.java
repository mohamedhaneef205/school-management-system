package school_ms;
public class StudentProfile {
    private String studentId;
    private String studentName;
    private String studentBirthDate;
    private String studentAddress;
    private String achievements;
    private String behaviour;
    private double averageMarks;
    
    //Teacher sets properties
    
    public void setStudentId(String studentId){
        this.studentId=studentId;
    }
    
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setStudentBirthDate(String studentBirthDate){
        this.studentBirthDate=studentBirthDate;
    }
    public void setStudentAddress(String studentAddress){
        this.studentAddress=studentAddress;
    }
    
    public void setAchievements(String achievements){
        this.achievements=achievements;
    }
    
    public void setBehaviour(String behaviour){
        this.behaviour=behaviour;
    }
    
    public void setAverageMarks(double averageMarks){
        this.averageMarks=averageMarks;
    }
    
    //getters
    public String getStudentId(){
        return studentId;
    }
    
    public String getStudentName(){
        return studentName;
    }
    public String getStudentBirthDate(){
        return studentBirthDate;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    
    public String getAchievements(){
        return achievements;
    }
    
    public String getBehaviour(){
        return behaviour;
    }
    
    public double getAverageMarks(){
        return averageMarks;
    }
    

}