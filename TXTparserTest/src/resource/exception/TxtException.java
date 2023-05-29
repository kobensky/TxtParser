package resource.exception;

public class TxtException extends RuntimeException{

    private static final String EX_MESSAGE = "Can't read file, Error:";

    public TxtException(String message, Throwable cause) {
        super(EX_MESSAGE + message, cause);
    }
}
