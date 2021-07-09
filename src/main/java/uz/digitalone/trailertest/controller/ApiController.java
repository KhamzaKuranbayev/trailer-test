package uz.digitalone.trailertest.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.rest.response.Response;
import uz.digitalone.trailertest.service.TrailerService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/trailer_states")
public class ApiController {

    private final TrailerService trailerService;

    public ApiController(TrailerService trailerService) {
        this.trailerService = trailerService;
    }

    // Live data by id
    @GetMapping("/{id}")
    public HttpEntity<?> getByTrailerId(@PathVariable Long id) {
        final Trailer trailer = trailerService.findByTrailerId(id);
        return ResponseEntity.status(200).body(trailer);
    }


    @GetMapping("/all")
    public HttpEntity<?> getAll(@RequestParam Integer pageNumber, @RequestParam Integer size) {
        final List<Trailer> trailerList = trailerService.getAll(pageNumber, size);
        List<Object> list = new ArrayList<>(trailerList);
        return ResponseEntity.status(200).body(new Response(true, "trailers info", list));
    }

}
