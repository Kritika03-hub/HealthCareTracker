//patient inherits from person 

public class Patient extends Person{

    private String healthIssue;

    public Patient(String n, int a, String issue){
        super(n,a);
        this.healthIssue=issue;
    }

    //overriding parent method

    public void showInfo(){
        System.out.println("Patient Name:  "+pname);
        System.out.println("Age:  "+page);
        System.out.println("Problem:  "+healthIssue);
        System.out.println("--------------------------");

        
    }

    public String getPname(){
        return pname;
    }

    
}
