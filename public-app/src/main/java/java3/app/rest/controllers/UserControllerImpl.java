package java3.app.rest.controllers;

import java3.app.jms.JMSRequestProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
@RequestMapping
public class UserControllerImpl {

    @Autowired private JMSRequestProcessor jmsRequestProcessor;

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public DeferredResult<ResponseEntity> register(@RequestBody UserDTO userDTO) {
        JMSRegisterUserRequest jmsRequest = new JMSRegisterUserRequest();

        jmsRequest.setUserDTO(userDTO);
        return jmsRequestProcessor.process(jmsRequest);
    }

    @RequestMapping(value = "/users/{login}", method = RequestMethod.GET)
    public DeferredResult<ResponseEntity> get(@PathVariable("login") String login) {
        JMSGetUserRequest jmsRequest = new JMSGetUserRequest();
        jmsRequest.setUserLogin(login);
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