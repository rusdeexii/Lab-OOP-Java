package assignment1;

public class Customer {
    private int custId;
    private String custFname;
    private String custLname;
    private int custAge;
    
    
    public Customer() {
        this.custId = 123;
        this.custFname = "Thayakorn";
        this.custLname = "Muadrod";
        this.custAge = 0;
    }
    
 
    public String getFullName() {
        return custFname + " " + custLname;
    }
    
  
    public void setNewAge(int custAge) {
        this.custAge = custAge;
    }
    
   
    public int getNewAge() {
        return custAge;
    }
    
    
    public String setGroupAge() {
        return (custAge > 50) ? "Senior" : "Not Senior";
    }
}
