package java3.integrations.rest;


import java3.core.api.exceptions.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static java3.core.api.exceptions.ResponseStatus.*;

@Component
class HttpStatusMapper {

    public HttpStatus map(ResponseStatus responseStatus) {
        if (SUCCESS == responseStatus) {
            return HttpStatus.OK;
        } else if (BAD_REQUEST == responseStatus) {
            return HttpStatus.BAD_REQUEST;
        } else if (FORBIDDEN == responseStatus) {
            return HttpStatus.FORBIDDEN;
        } else if (NOT_FOUND == responseStatus) {
            return HttpStatus.NOT_FOUND;
        } else if (INTERNAL_SERVER_ERROR == responseStatus) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        throw new IllegalStateException("Can not map Response status to Http code");
    }

}
