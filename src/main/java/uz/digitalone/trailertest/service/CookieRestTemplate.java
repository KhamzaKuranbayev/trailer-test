/*
package uz.digitalone.trailertest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.digitalone.trailertest.rest.response.AuthResponse;

import java.io.IOException;
import java.net.URI;

@Service
public class CookieRestTemplate extends RestTemplate {

    @Autowired
    AuthResponse authResponse;

    @Override
    protected ClientHttpRequest createRequest(URI url, HttpMethod method) throws IOException {
        ClientHttpRequest request = super.createRequest(url, method);

        String token = "x-auth-token=" + authResponse.getToken();

        request.getHeaders().add("Cookie", token);
        return request;
    }
}
*/
