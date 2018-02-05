package java3.app.rest.controllers;

import java3.app.jms.JMSRequestProcessor;
import java3.core.api.jms.requests.checks.JMSGetCheckRequest;
import java3.core.api.jms.requests.checks.JMSRegisterCheckRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;
import java3.common.dtos.CheckDTO;


@RestController
@RequestMapping(/api)
public class CheckControllerImpl {

    @Autowired private JMSRequestProcessor jmsRequestProcessor;

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public DeferredResult<ResponseEntity> register(@RequestBody CheckDTO checkDTO) {
        JMSRegisterCheckRequest jmsRequest = new JMSRegisterCheckRequest();

        jmsRequest.setCheckDTO(checkDTO);
        return jmsRequestProcessor.process(jmsRequest);
    }

    @RequestMapping(value = "/users/{login}", method = RequestMethod.GET)
    public DeferredResult<ResponseEntity> get(@PathVariable("login") String login) {
        JMSGetCheckRequest jmsRequest = new JMSGetCheckRequest();
        jmsRequest.setCheckID(checkID);
        return jmsRequestProcessor.process(jmsRequest);
    }


}
/*
* +@RestController
+@RequestMapping("/api")
+public class UserControllerImpl {
+
+    @Autowired private JMSRequestProcessor jmsRequestProcessor;
+
+    @RequestMapping(value = "/users", method = RequestMethod.POST)
+    public DeferredResult<ResponseEntity> register(@RequestBody UserDTO userDTO) {
+        JMSRegisterUserRequest jmsRequest = new JMSRegisterUserRequest();
+        jmsRequest.setUserDTO(userDTO);
+        return jmsRequestProcessor.process(jmsRequest);
+    }
+
+    @RequestMapping(value = "/users/{login}", method = RequestMethod.GET)
+    public DeferredResult<ResponseEntity> get(@PathVariable("login") String login) {
+        JMSGetUserRequest jmsRequest = new JMSGetUserRequest();
+        jmsRequest.setUserLogin(login);
+        return jmsRequestProcessor.process(jmsRequest);
+    }
+
+}*/