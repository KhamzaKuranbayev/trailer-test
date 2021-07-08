package uz.digitalone.trailertest.config.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import uz.digitalone.trailertest.rest.response.AuthResponse;
import uz.digitalone.trailertest.utils.Constants;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class SecurityConfiguration {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    AuthResponse refreshToken() {
        Map<String, String> map = new HashMap<>();
        map.put("login", Constants.ROAD_READY_LOGIN);
        map.put("passwd", Constants.ROAD_READY_PASSWORD);

        ResponseEntity<AuthResponse> responseEntity = restTemplate.postForEntity(Constants.ROAD_READY_AUTH_URL, map, AuthResponse.class);

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            return responseEntity.getBody();
        } else {
            return new AuthResponse();
        }

    }


    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
