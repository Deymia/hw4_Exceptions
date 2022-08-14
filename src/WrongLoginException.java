public class WrongLoginException extends Exception{

    public WrongLoginException(Throwable loginExc){
        super(loginExc);
    }

    public WrongLoginException (String message){
        super(message);
    }

}
