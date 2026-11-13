package school_ms;
public class PhysicalProperties {
    String propertyId;
    String propertyName;
    static int propertyCount;
    
    PhysicalProperties(String propertyId,String propertyName){
        this.propertyId=propertyId;
        this.propertyName=propertyName;
        
        propertyCount++;
    
    }
    
    
}
