package java3.core.api.exceptions;

public class InternalServerException extends ApplicationException {

    public InternalServerException() {
        super(ResponseStatus.INTERNAL_SERVER_ERROR);
    }
}
