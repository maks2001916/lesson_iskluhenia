import java.util.regex.Pattern;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;

    public  boolean containsAllowedSymbols(String login) {
        for (int i = 0; i < login.length() - 1; i++) {
            char symbol = login.charAt(i);
            boolean isCharValid = (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z') || (symbol >= '0' && symbol <= '9') || symbol == '_';
        }
        return true;
    }

    public boolean conclusion(String login) throws WrongLoginException {
        if(login.length() == 0 || login.length() > 20 || !containsAllowedSymbols(login)){
            throw new WrongLoginException("ведён некорректный логин");
        }
        return false;
    }

    public String getLogin() {
        return login;
    }

    public void print() throws WrongLoginException, WrongPasswordException {
        if (containsAllowedSymbols(login) == true) {
            System.out.println("введён некорректный логин");
        } else {
            System.out.println("введён корректный логин");
        }
        if (conclusionPassword(password) == true)
            System.out.println("введён некорректный пароль");
    }

    public static boolean containsAllowedSymbolsPassword(String password) {
        for (int i = 0; i < password.length() - 1; i++) {
            char symbol = password.charAt(i);
            boolean isCharValid = (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z') || (symbol >= '0' && symbol <= '9') || symbol == '_';
        }
        return true;
    }

    public boolean conclusionPassword(String password) throws  WrongPasswordException {
        if(password.length() == 0 || password.length() > 20 || !containsAllowedSymbols(password)){
            throw new WrongPasswordException("ведён некорректный пароль");
        }
        return false;
    }

}