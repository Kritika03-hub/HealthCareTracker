import java.util.ArrayList;

public class RecordManager {

    //list to store all patients
    private ArrayList<Patient> records= new ArrayList<>();

    public void addRecord(Patient p){
        records.add(p);
    }

    public void showAll(){
        if (records.size()==0){
            System.out.println("No records yet!");
            return;
        }

        for(int i=0; i<records.size();i++){
            records.get(i).showInfo();
        }
    }

    public Patient findPatient(String name){

        //searching
        for(Patient p:records){
            if(p.getPname().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
       
    }
    
}
