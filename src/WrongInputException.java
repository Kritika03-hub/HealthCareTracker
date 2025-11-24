//my own exception for empty input

public class WrongInputException extends Exception {

    public WrongInputException(String msg){
        super(msg);
    }
}
