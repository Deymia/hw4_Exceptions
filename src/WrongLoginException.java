public class WrongLoginException extends Exception{

    public WrongLoginException(Throwable e){
        super(e);
    }

    public WrongLoginException (){
        super();
    }
}
