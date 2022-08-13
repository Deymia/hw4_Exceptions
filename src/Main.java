import javax.naming.AuthenticationException;

public class Main {
    public static void main(String[] args)  {

    }

    public static boolean authentication(String login, String password, String confirmPassword)
            throws Exception {
        if (!login.matches("^\\w*$.{0,20}")) {
            throw new WrongLoginException();
        }
        if (!password.matches("^\\w*$.{0,19}")) {
            throw new WrongPasswordException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        else {
            return true;
        }
    }

    public static void checkAuthentication (String login, String password, String confirmPassword) throws Exception {
        authentication(login, password, confirmPassword);
        try {
            authentication(login, password, confirmPassword);
        }catch (WrongLoginException e){
            System.out.println("Login doesn`t match the input conditions");
        }catch (WrongPasswordException e){
            System.out.println("Password doesn`t match the input conditions or doesn`t equals with block 'confirm'");
        }finally {
            System.out.println("Authentication completed");
        }
    }
}