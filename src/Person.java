
//base class for common details
abstract class Person{
    
    protected String pname;
    protected int page;

    Person(String n, int a){
        pname=n;
        page=a;
    }

    //every person must show details
    public abstract void showInfo();
}