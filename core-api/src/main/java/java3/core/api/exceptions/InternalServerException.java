package java3.core.api.exceptions;

import java3.core.api.common.ResponseStatus;

public class InternalServerException extends ApplicationException {

    public InternalServerException() {
        super(ResponseStatus.INTERNAL_SERVER_ERROR);
    }
}
