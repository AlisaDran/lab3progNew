package Exceptions;

public class goodmoodException extends RuntimeException {
    public goodmoodException(String message) {

        super(message);
    }
    @Override
    public String getMessage(){
        return "Полицейские оказались в хорошем настроении и никакой истории не произошло.";
    }

}
