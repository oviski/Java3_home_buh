package java3.app.jms;

import java3.app.common.JsonMapper;
import java3.core.api.jms.JMSRequest;
import java3.core.api.jms.requests.JMSAPIRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface JMSRequestBuilder {

    JMSRequest build(JMSAPIRequest command);
}

@Component
class JMSRequestBuilderImpl implements JMSRequestBuilder{

    @Autowired private JMSRequestCorrelationIdGenerator JMSRequestCorrelationIdGenerator;
    @Autowired private JsonMapper jsonMapper;

    @Override
    public JMSRequest build(JMSAPIRequest command) {
        JMSRequest jmsRequest = new JMSRequest();
        jmsRequest.setCommandId(command.getCommandId());
        jmsRequest.setCorrelationId(JMSRequestCorrelationIdGenerator.generate());
        jmsRequest.setPayload(jsonMapper.mapToString(command));
        return jmsRequest;
    }
}

/*
+public interface JMSRequestBuilder {
+
+    JMSRequest build(JMSAPIRequest command);
+
+}
+
+@Component
+class JMSRequestBuilderImpl implements JMSRequestBuilder {
+
+    @Autowired private JMSRequestCorrelationIdGenerator JMSRequestCorrelationIdGenerator;
+    @Autowired private JsonMapper jsonMapper;
+
+    @Override
+    public JMSRequest build(JMSAPIRequest command) {
+        JMSRequest jmsRequest = new JMSRequest();
+        jmsRequest.setCommandId(command.getCommandId());
+        jmsRequest.setCorrelationId(JMSRequestCorrelationIdGenerator.generate());
+        jmsRequest.setPayload(jsonMapper.mapToString(command));
+        return jmsRequest;
+    }
+
+}
 */