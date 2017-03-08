/**
 * Exception thrown when something went wrong during compilation.
 *
 * Created by maurice_2 on 7-3-2017.
 */
public class CompileException extends RuntimeException {

    public CompileException(){
        super();
    }

    public CompileException(String message){
        super(message);
    }

}
