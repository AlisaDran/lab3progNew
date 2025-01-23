package Exceptions;

public class deadException extends RuntimeException {
    public deadException(String message) {
      super(message);
    }
    @Override
    public String getMessage(){
      return "Персонаж погиб от такого удара. Какая уж тут дальше история...";
    }

}
