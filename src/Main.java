import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        RecordManager rm= new RecordManager();

        int ch=0;

        while(true){
            System.out.println("\n=== Patient Health Record Menu ===");
            System.out.println("1. Add Patient");
            System.out.println("2. Show All");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");


            ch=sc.nextInt();
            sc.nextLine();


            try{

                switch(ch){

                    case 1: 
                    System.out.print("Enter name: ");
                    String nm=sc.nextLine();

                    System.out.print("Enter age: ");
                    int ag= sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter issue: ");
                    String iss= sc.nextLine();

                    if(nm.equals("") || iss.equals("")){
                        throw new WrongInputException("Fields can't be empty!");
                    }

                    Patient p= new Patient(nm, ag, iss);
                    rm.addRecord(p);

                    System.out.println("Patient added. \n");

                    break; 


                    case 2:
                        rm.showAll();
                        break;

                    case 3:
                        System.out.print("Enter name to search: ");
                        String search= sc.nextLine();

                        Patient pt= rm.findPatient(search);

                        if(pt == null){
                            System.out.print("No patient with that name.  ");

                        }else{
                            pt.showInfo();
                        }
                        break;

                    case 4:
                        System.out.print("Thanks . Bye! ");
                        System.exit(0);
                    
                    
                    default:
                        System.out.println("Invalid choice !");
                        break;
            

                }


            } catch(WrongInputException e){

                System.out.println("Error: "+ e.getMessage());
            }
        }
       
   
    }
    
}
