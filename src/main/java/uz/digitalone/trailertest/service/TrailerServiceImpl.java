package uz.digitalone.trailertest.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.model.Attributes;
import uz.digitalone.trailertest.model.Data;
import uz.digitalone.trailertest.model.Root;
import uz.digitalone.trailertest.rest.response.AuthResponse;
import uz.digitalone.trailertest.utils.Constants;

import java.util.*;

@Service
public class TrailerServiceImpl implements TrailerService {

    final AuthResponse refreshToken;

    final RestTemplate restTemplate;

    public TrailerServiceImpl(AuthResponse refreshToken,
                              RestTemplate restTemplate) {
        this.refreshToken = refreshToken;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Trailer> get() {
        return new ArrayList<>();
    }

    @Override
    public Trailer getById(Integer id) {
        String token = "";
        if (refreshToken.getToken() != null) {
            token = refreshToken.getToken();
        }

        if (!"".equals(token)) {
            token = "x-auth-token=" + token;

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("Cookie", token);
            httpHeaders.add("Accept", "application/vnd.api+json");
            httpHeaders.add("Content-Type", "application/vnd.api+json");
            httpHeaders.add("charset", "UTF-8");

            HttpEntity<String> requestEntity = new HttpEntity<>(httpHeaders);

            ResponseEntity<String> responseEntity = restTemplate.exchange(
                    Constants.ROAD_READY_TRAILER_STATES + id,
                    HttpMethod.GET,
                    requestEntity,
                    String.class);


            String body = responseEntity.getBody();
            return objectMapper(body);
        }

        return new Trailer();
    }

    private Trailer objectMapper(String body) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {

            Root root = objectMapper.readValue(body, Root.class);


            Map<String, Object> map = objectMapper.readValue(body, new TypeReference<>() {
            });

            Set<Map.Entry<String, Object>> entries = map.entrySet();
            for (Map.Entry<String, Object> entry : entries) {
                String key = entry.getKey();

                if (key.equals("data")) {

                    Object value =  entry.getValue();


                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        return new Trailer();
    }

}