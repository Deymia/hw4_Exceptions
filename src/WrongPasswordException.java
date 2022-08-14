public class WrongPasswordException extends Exception{

    public WrongPasswordException (Throwable passwordExc){
        super(passwordExc);
    }

    public WrongPasswordException(String message){
        super(message);
    }
}
