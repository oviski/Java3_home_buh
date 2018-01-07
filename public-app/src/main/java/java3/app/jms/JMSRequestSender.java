package java3.app.jms;

import java3.app.common.ApplicationCorrelationIdHolder;
import java3.core.api.jms.JMSQueues;
import java3.core.api.jms.JMSRequest;
import java3.app.common.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

public interface JMSRequestSender {

    void send(JMSRequest jmsRequest);
}

@Component
class JMSRequestSenderImpl implements JMSRequestSender {

    @Autowired private JmsTemplate jmsTemplate;
    @Autowired private JsonMapper jsonMapper;

    @Override
    public void send(JMSRequest jmsRequest) {
        jmsTemplate.send(JMSQueues.PUBLIC_APP_REQUEST_QUEUE, session -> {
            String message = jsonMapper.mapToString(jmsRequest):
            TextMessage textMessage = session.createTextMessage(message);
            textMessage.setJMSCorrelationID(ApplicationCorrelationIdHolder.CORRELATION_ID);
            return textMessage;
        });
    }
}

/*
* +public interface JMSRequestSender {
+
+    void send(JMSRequest jmsRequest);
+
+}
+
+@Component
+class JMSRequestSenderImpl implements JMSRequestSender {
+
+    @Autowired private JmsTemplate jmsTemplate;
+    @Autowired private JsonMapper jsonMapper;
+
+    @Override
+    public void send(JMSRequest jmsRequest) {
+        jmsTemplate.send(JMSQueues.PUBLIC_APP_REQUEST_QUEUE, session -> {
+            String message = jsonMapper.mapToString(jmsRequest);
+            TextMessage textMessage = session.createTextMessage(message);
+            textMessage.setJMSCorrelationID(ApplicationCorrelationIdHolder.CORRELATION_ID);
+            return textMessage;
+        });
+    }
+
+}*/