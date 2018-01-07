package java3.app.jms.responsehandlers;

import java3.app.common.JsonMapper;
import java3.core.api.jms.JMSResponse;
import java3.core.api.jms.SupportedCommandId;
import java3.core.api.jms.requests.checks.JMSRegisterCheckResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
class JMSRegisterUserResponseHandler {

    @Autowired
    private JsonMapper jsonMapper;

    @Override
    public String getSupportedCommandId() {
        return SupportedCommandId.REGISTER_USER;
    }

    @Override
    public ResponseEntity process(JMSResponse jmsResponse) {
        String payload = jmsResponse.getPayload();
        JMSRegisterCheckResponse response = jsonMapper.mapToObject(
                payload, JMSRegisterCheckResponse.class
        );
        return ResponseEntity.ok(response.getCheckDTO());
    }

}

/*@Component
+class JMSRegisterUserResponseHandler implements JMSResponseHandler {
+
+    @Autowired private JsonMapper jsonMapper;
+
+    @Override
+    public String getSupportedCommandId() {
+        return SupportedCommandId.REGISTER_USER;
+    }
+
+    @Override
+    public ResponseEntity process(JMSResponse jmsResponse) {
+        String payload = jmsResponse.getPayload();
+        JMSRegisterUserResponse response = jsonMapper.mapToObject(
+                payload, JMSRegisterUserResponse.class
+        );
+        return ResponseEntity.ok(response.getUserDTO());
+    }
+
+}*/