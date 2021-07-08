package uz.digitalone.trailertest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.digitalone.trailertest.rest.response.AuthResponse;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    AuthResponse authResponse;

    @GetMapping
    String getToken() {
        if (authResponse.getToken() != null) {
            return authResponse.getToken();
        } else {
            return "";
        }
    }

}
