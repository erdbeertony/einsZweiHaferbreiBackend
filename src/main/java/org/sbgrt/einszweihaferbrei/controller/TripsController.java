package org.sbgrt.einszweihaferbrei.controller;

import org.sbgrt.einszweihaferbrei.model.Trip;
import org.sbgrt.einszweihaferbrei.persistence.TripJpaRepository;
import org.sbgrt.einszweihaferbrei.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
        List<Trip> trips = tripService.getAllTrips();
        Set<String> persistedTripNames = tripJpaRepository.findAll()
                .stream().map(t -> t.getName())
                .collect(Collectors.toSet());
        trips.forEach(t -> t.setBooked(persistedTripNames.contains(t.getName())));
        return trips;
    }

    @PostMapping
    public ResponseEntity save(@RequestBody String name) {
        Optional<Trip> foundTrip = tripJpaRepository.findById(name);
        if (foundTrip.isEmpty()) {
            Trip trip = tripService.getAllTrips().stream().filter(t -> t.getName().equals(name)).findFirst().get();
            tripJpaRepository.save(trip);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().body("Dieser Trip wurde schon gebucht!"); // 400
        }
    }

    @GetMapping("/getBooked")
    public List<Trip> getBookedTrips() {
        return tripJpaRepository.findAll();
    }

}
