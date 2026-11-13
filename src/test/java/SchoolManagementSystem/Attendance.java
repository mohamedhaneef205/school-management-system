package school_ms;
public class Attendance{
   
    public String studentId;
    public static String date;
    public static String className;
    public static int count;
    public String time;
    
    
    public static void setDate(String date){
        date=date;
    }
    
    public static void setClass(String className){
        className=className;
    }
    
     public static void setCount(int count){
        count=count;
    }
    
    
    
    Attendance(String studentId,String time){
        this.studentId=studentId;
        this.time=time;
        
        }
    
    public static void configureAttendance(String newDate, String newClassName) {
        Attendance.date = newDate;
        Attendance.className = newClassName;
    }

    public static void resetCount() {
        Attendance.count = 0;
    }

    public static void incrementCount() {
        Attendance.count++;
    }

    public String getStudentId() { return studentId; }
    public String getTime() { return time; }

    
}
