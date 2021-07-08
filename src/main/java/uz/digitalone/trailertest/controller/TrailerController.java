package uz.digitalone.trailertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.service.TrailerService;

import java.util.List;

@RestController
@RequestMapping("/api/trailer")
public class TrailerController {

    private final TrailerService trailerService;

    public TrailerController(TrailerService trailerService) {
        this.trailerService = trailerService;
    }

    @GetMapping
    public List<Trailer> get() {
        return trailerService.get();
    }

    @GetMapping("/{id}")
    public Trailer getById(@PathVariable Integer id) {
        return trailerService.getById(id);
    }
}
