package com.nt.restController;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //IT INTERNALLY CONTAIN CONTROLLER ANS RESPONSE BODY 
@RequestMapping("/aj")
public class Demo {

    @GetMapping("/time") 
    public ResponseEntity<String> time() {
        //HERE I AM GETT CURRENT TIME 
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour(); // //HERE I AMA GETTING THE HOUR

        String msg;

        //HERE I AM CHECKING TIME
        if (hour >= 5 && hour < 12) {
            msg = "Good Morning!";
        } else if (hour >= 12 && hour < 17) {
            msg = "Good Afternoon!";
        } else if (hour >= 17 && hour < 21) {
            msg = "Good Evening!";
        } else {
            msg = "Good Night!";
        }

        // SEND THE RESPONE THRPW RESPONSE ENTITY WITH HTTP CODE
        return ResponseEntity.ok("Current Time: " + now + ", Message: " + msg);
    }
}
