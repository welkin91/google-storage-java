package models;

public class ErrorDescriptor {
    private int errorCode;
    private String message;

    public ErrorDescriptor(int errorCode, String message){
        this.errorCode = errorCode;
        this.message = message;
    }

    public ErrorDescriptor(){}

    public int getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
