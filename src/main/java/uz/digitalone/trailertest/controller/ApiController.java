package uz.digitalone.trailertest.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.digitalone.trailertest.entity.Trailer;
import uz.digitalone.trailertest.repository.TrailerRepository;
import uz.digitalone.trailertest.rest.response.Response;
import uz.digitalone.trailertest.service.TrailerService;

import java.time.Instant;
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
    @ApiOperation(value = "Trailer Id bo'yicha olish", response = Trailer.class)
    @GetMapping("/{id}")
    public HttpEntity<?> getByTrailerId(@PathVariable Long id) {
        final Trailer trailer = trailerService.findByTrailerId(id);
        return ResponseEntity.status(200).body(trailer);
    }


    @ApiOperation(value = "Live holatida barcha Trailerlarni olish", response = Trailer[].class)
    @GetMapping("/all")
    public HttpEntity<?> getAll(@RequestParam Integer pageNumber, @RequestParam Integer size) {
        final List<Trailer> trailerList = trailerService.getAll(pageNumber, size);
        List<Object> list = new ArrayList<>(trailerList);
        return ResponseEntity.status(200).body(new Response(true, "trailers info", list));
    }

    @ApiOperation(value = "Filter")
    @GetMapping("/filter")
    public HttpEntity<?> getFilteredTrailers(@RequestParam(name = "vendor", defaultValue = "", required = false) String vendor,
                                             @RequestParam(name = "trailerNumber", defaultValue = "", required = false) String trailerName,
                                             @RequestParam(name = "lat", defaultValue = "", required = false) Double lat,
                                             @RequestParam(name = "lang", defaultValue = "", required = false) Double lang,
                                             @RequestParam(name = "lastUpdate", defaultValue = "", required = false) Instant lastUpdate,
                                             @RequestParam(name = "trailerType", defaultValue = "", required = false) String trailerType,
                                             @RequestParam(name = "motion", defaultValue = "", required = false) String motion) {

        Pageable pageable = PageRequest.of(0, 10);

        Page<Trailer> trailerPage = trailerService.findFiltered(vendor, trailerName, lat, lang, lastUpdate, trailerType, motion, pageable);

        return ResponseEntity.ok(trailerPage.toList());


    }

}
