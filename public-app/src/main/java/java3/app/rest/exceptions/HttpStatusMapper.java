package java3.app.rest.exceptions;

import java3.core.api.common.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import static java3.core.api.common.ResponseStatus.*;

public interface HttpStatusMapper {
    HttpStatus map(ResponseStatus responseStatus);
}

@Component
class HttpStatusMapperImpl implements HttpStatusMapper {

    @Override
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
/*
* +public interface HttpStatusMapper {
+    HttpStatus map(ResponseStatus responseStatus);
+}
+
 @Component
 @Component
-class HttpStatusMapper {
+class HttpStatusMapperImpl implements HttpStatusMapper {


+    @Override
     public HttpStatus map(ResponseStatus responseStatus) {
     public HttpStatus map(ResponseStatus responseStatus) {
         if (ResponseStatus.SUCCESS == responseStatus) {
         if (ResponseStatus.SUCCESS == responseStatus) {
             return HttpStatus.OK;
             return HttpStatus.OK;
         } else if (ResponseStatus.BAD_REQUEST == responseStatus) {
         } else if (ResponseStatus.BAD_REQUEST == responseStatus) {
             return HttpStatus.BAD_REQUEST;
             return HttpStatus.BAD_REQUEST;
         } else if (ResponseStatus.FORBIDDEN == responseStatus) {
         } else if (ResponseStatus.FORBIDDEN == responseStatus) {
             return HttpStatus.FORBIDDEN;
             return HttpStatus.FORBIDDEN;
         } else if (ResponseStatus.NOT_FOUND == responseStatus) {
         } else if (ResponseStatus.NOT_FOUND == responseStatus) {
             return HttpStatus.NOT_FOUND;
             return HttpStatus.NOT_FOUND;
         } else if (ResponseStatus.INTERNAL_SERVER_ERROR == responseStatus) {
         } else if (ResponseStatus.INTERNAL_SERVER_ERROR == responseStatus) {
             return HttpStatus.INTERNAL_SERVER_ERROR;
             return HttpStatus.INTERNAL_SERVER_ERROR;
         }
         }
         throw new IllegalStateException("Can not map Response status to Http code");
         throw new IllegalStateException("Can not map Response status to Http code");
     }
     }


 }
}*/