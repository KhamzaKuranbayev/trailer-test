package uz.digitalone.trailertest.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.repository.TrailerRepository;
import uz.digitalone.trailertest.rest.response.AuthResponse;
import uz.digitalone.trailertest.utils.Constants;

import java.util.*;

@Service
public class TrailerServiceImpl implements TrailerService {

    final TrailerRepository trailerRepository;

    final AuthResponse refreshToken;

    final CookieRestTemplate cookieRestTemplate;

    public TrailerServiceImpl(TrailerRepository trailerRepository,
                              AuthResponse refreshToken,
                              CookieRestTemplate cookieRestTemplate) {
        this.trailerRepository = trailerRepository;
        this.refreshToken = refreshToken;
        this.cookieRestTemplate = cookieRestTemplate;
    }

    @Override
    public List<Trailer> get() {
        return trailerRepository.findAll();
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
            httpHeaders.add("Cookie", token);

            HttpEntity<Trailer> trailerHttpEntity = new HttpEntity<>( httpHeaders);

            ResponseEntity<?> responseEntity = cookieRestTemplate.exchange(
                    Constants.ROAD_READY_TRAILER_STATES + id,
                    HttpMethod.GET,
                    trailerHttpEntity,
                    Trailer.class
            );

            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                System.out.println("Success");
                return new Trailer();
            }
        }

        return new Trailer();
    }
}
