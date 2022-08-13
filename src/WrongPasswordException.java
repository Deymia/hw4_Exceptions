public class WrongPasswordException extends Exception{

    public WrongPasswordException (Throwable e){
        super(e);
    }

    public WrongPasswordException(){
        super();
    }
}
