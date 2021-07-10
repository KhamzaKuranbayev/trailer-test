package uz.digitalone.trailertest.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.model.Attributes;
import uz.digitalone.trailertest.model.Data;
import uz.digitalone.trailertest.model.Root;
import uz.digitalone.trailertest.repository.TrailerRepository;
import uz.digitalone.trailertest.rest.response.AuthResponse;
import uz.digitalone.trailertest.utils.Constants;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class TrailerServiceImpl implements TrailerService {

    final TrailerRepository trailerRepository;

    public TrailerServiceImpl(TrailerRepository trailerRepository) {
        this.trailerRepository = trailerRepository;
    }

    @Override
    public List<Trailer> getAll(Integer pageNum, Integer size) {
        //final Pageable page = PageRequest.of(pageNum, size);
        return new ArrayList<>();
    }

    @Override
    public Trailer getById(Integer id) {
        return null;
    }

    @Override
    public Trailer getByLocation(String location) {
        return null;
    }

    @Override
    public Trailer findByTrailerId(Long id) {
        return new Trailer();
    }


}
