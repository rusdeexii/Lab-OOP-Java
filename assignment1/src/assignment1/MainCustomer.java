package assignment1;

public class MainCustomer {

    public static void main(String[] args) {
       
        Customer obj = new Customer();

      
        obj.setNewAge(21);

     
        System.out.println("Name: " + obj.getFullName());

        
        obj.setNewAge(21);
        System.out.println("Age: " + obj.getNewAge());

        
        System.out.println("Group Age: " + obj.setGroupAge());
    }
}

