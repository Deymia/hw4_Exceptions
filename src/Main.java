import javax.naming.AuthenticationException;

public class Main {
    public static void main(String[] args)  {
    }

    public static boolean authentication(String login, String password, String confirmPassword)
            throws Exception {
        try {
            if (!login.matches("\\w.{0,20}")) {
                throw new WrongLoginException("Login doesn`t match the input conditions");
            }
            if (!password.matches("\\w.{0,19}")) {
                throw new WrongPasswordException("Password doesn`t match the input conditions or doesn`t equals with block 'confirm'");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password doesn`t match the input conditions or doesn`t equals with block 'confirm'");
            }
        }catch (WrongLoginException loginException){
            System.out.println(loginException.getMessage());
            return false;
        }catch (WrongPasswordException passwordException){
            System.out.println(passwordException.getMessage());
            return false;
        }
        return true;
    }

}