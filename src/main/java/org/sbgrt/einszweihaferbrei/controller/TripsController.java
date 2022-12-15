package org.sbgrt.einszweihaferbrei.controller;

import org.sbgrt.einszweihaferbrei.model.Trip;
import org.sbgrt.einszweihaferbrei.persistence.TripJpaRepository;
import org.sbgrt.einszweihaferbrei.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
@CrossOrigin
//@CrossOrigin //(origins = "http://localhost:4200") // @CrossOrigin(origins = "http://example.com", maxAge = 3600) //
// @CrossOrigin(origins = {"http://localhost:8383", "http://anotherdomain:4200"})
public class TripsController {

    // https://www.baeldung.com/spring-boot-start

    @Autowired
    private TripService tripService;

    @Autowired
    private TripJpaRepository tripJpaRepository;

    @GetMapping
    public List<Trip> getAll() {
        return tripService.getAllTrips();
    }

    @PostMapping
    public void save(@RequestBody Trip trip) {
        tripJpaRepository.save(trip);
    }

    @GetMapping("/getBooked")
    public List<Trip> getBookedTrips() {
        return tripJpaRepository.findAll();
    }

}
