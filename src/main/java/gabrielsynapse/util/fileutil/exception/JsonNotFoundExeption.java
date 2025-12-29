package gabrielsynapse.util.fileutil.exception;

public class JsonNotFoundExeption extends RuntimeException{
    public JsonNotFoundExeption(String message){
        super(message);
    }
    public JsonNotFoundExeption(String message,Throwable cause){
        super(message,cause);
    }
}