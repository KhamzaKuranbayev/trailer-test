package uz.digitalone.trailertest.cron;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.digitalone.trailertest.entity.LandMark;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.model.Attributes;
import uz.digitalone.trailertest.model.Data;
import uz.digitalone.trailertest.model.Landmark;
import uz.digitalone.trailertest.model.Root;
import uz.digitalone.trailertest.repository.TrailerRepository;
import uz.digitalone.trailertest.rest.response.AuthResponse;
import uz.digitalone.trailertest.service.TrailerService;
import uz.digitalone.trailertest.utils.Constants;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CronTask {

    final AuthResponse refreshToken;

    final RestTemplate restTemplate;

    final TrailerRepository trailerRepository;

    public CronTask(AuthResponse refreshToken,
                    RestTemplate restTemplate,
                    TrailerRepository trailerRepository) {
        this.refreshToken = refreshToken;
        this.restTemplate = restTemplate;
        this.trailerRepository = trailerRepository;
    }

    @Scheduled(fixedDelay = 10000)
    public void scheduleTrailerData() {
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
                    Constants.ROAD_READY_TRAILER_STATES,
                    HttpMethod.GET,
                    requestEntity,
                    String.class);


            String body = responseEntity.getBody();
            Root root = objectMapper(body);

            if (root != null) {

                List<Data> data = root.getData();
                List<Trailer> trailerList = new ArrayList<>();

                for (Data datum : data) {
                    Attributes attributes = datum.getAttributes();

                    Trailer trailer = new Trailer(
                            datum.getId(),
                            datum.getType(),
                            attributes.getDistance(),
                            attributes.getLatitude(),
                            attributes.getPowerSource(),
                            attributes.getIdleTime(),
                            attributes.getSpeed(),
                            attributes.getLastPingDate(),
                            attributes.getBatteryState(),
                            attributes.isUseHeatIndex(),
                            attributes.getTrailerName(),
                            attributes.getLongitude(),
                            attributes.getMotionStatus(),
                            attributes.getLandmarkTrailerState(),
                            attributes.getLastEvent().getMessageDate(),
                            attributes.getBatteryPercentage(),
                            attributes.getLocation(),
                            attributes.getTrailerId(),
                            attributes.getTrailerState());

                    trailerList.add(trailer);
                }

                saveOrUpdate(trailerList);

            }
        }
    }

    private void saveOrUpdate(List<Trailer> trailerList) {
        for (Trailer trailer : trailerList) {

            Optional<Trailer> optionalTrailer = trailerRepository.findByTrailerId(trailer.getTrailerId());

            if(optionalTrailer.isPresent()) {
                Trailer trailer1 = optionalTrailer.get();
                trailer1 = trailer;



            }


        }
    }

    private Root objectMapper(String body) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            return objectMapper.reader().forType(Root.class).readValue(body);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

}
