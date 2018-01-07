package java3.app.jms.responsehandlers;

import java3.app.common.JsonMapper;
import java3.app.jms.JMSResponseHandler;
import java3.core.api.jms.JMSResponse;
import java3.core.api.jms.SupportedCommandId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
class JMSGetUserResponseHandler implements JMSResponseHandler {

    @Autowired private JsonMapper jsonMapper;

    @Override
    public String getSupportedCommandID() {
        return SupportedCommandId.GET_USER;
    }

    @Override
    public ResponseEntity process(JMSResponse jmsResponse) {
        String payload = jmsResponse.getPayload();
        JMSGetUserResponse response = jsonMapper.mapToObject(
                payload, JMSGetUserResponse.class
        );
        return ResponseEntity.ok(response.getUserDTO)
        return null;
    }
}
/*@Component
+class JMSGetUserResponseHandler implements JMSResponseHandler {
+
+    @Autowired private JsonMapper jsonMapper;
+
+    @Override
+    public String getSupportedCommandId() {
+        return SupportedCommandId.GET_USER;
+    }
+
+    @Override
+    public ResponseEntity process(JMSResponse jmsResponse) {
+        String payload = jmsResponse.getPayload();
+        JMSGetUserResponse response = jsonMapper.mapToObject(
+                payload, JMSGetUserResponse.class
+        );
+        return ResponseEntity.ok(response.getUserDTO());
+    }
+
+}*/