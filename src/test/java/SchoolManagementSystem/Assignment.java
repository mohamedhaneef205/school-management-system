package school_ms;
public class Assignment {
    public String assiId;
    public String subName;
    public String date;
    
    public Assignment(String assiId,String subName, String date){
        this.assiId = assiId;
        this.subName = subName;
        this.date = date;

     }
    
   
    
    public String getAssiId(){
        return assiId;
    }
    public String getDate(){
        return date;
    }


}
