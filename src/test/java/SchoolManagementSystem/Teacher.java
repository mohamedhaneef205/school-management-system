package school_ms;
public class Teacher {

    private String teacherId;
    public String teacherName;
    private String  nic;
    public String address;
    

    public Teacher(String teacherName,String address){
        this.teacherName = teacherName;
        this.address = address;
    }
    
    public void getTeacherId(String teacherId){
        this.teacherId=teacherId;
    }
    
    public void getNic(String nic){
        this.nic=nic;
    }
    
    
    

}
