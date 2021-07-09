package uz.digitalone.trailertest.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.digitalone.trailertest.service.TrailerService;

@RestController
@RequestMapping("/api/trailer_states")
public class ApiController {

    private final TrailerService trailerService;

    public ApiController(TrailerService trailerService) {
        this.trailerService = trailerService;
    }

    @GetMapping
    public HttpEntity<?> get() {
        return ResponseEntity.ok(trailerService.get());
    }

    // Live data by id
    @GetMapping("/{id}")
    public HttpEntity<?> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(trailerService.getById(id));
    }


}
